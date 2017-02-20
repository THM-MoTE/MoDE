package de.thm.mni.mote.mode.uiactor.statemachine.elements;

import de.thm.mni.mote.mode.config.Settings;
import de.thm.mni.mote.mode.modelica.MoConnection;
import de.thm.mni.mote.mode.modelica.graphics.MoLine;
import de.thm.mni.mote.mode.parser.ParserException;
import de.thm.mni.mote.mode.uiactor.control.modelica.MoDiagramGroup;
import de.thm.mni.mote.mode.uiactor.control.modelica.MoGroup;
import de.thm.mni.mote.mode.uiactor.shape.InvisibleLine;
import de.thm.mni.mote.mode.uiactor.statemachine.StateMachine;
import de.thm.mni.mote.mode.uiactor.statemachine.interfaces.Actionable;
import de.thm.mni.mote.mode.uiactor.statemachine.interfaces.Deletable;
import de.thm.mni.mote.mode.uiactor.statemachine.interfaces.Moveable;
import javafx.collections.ObservableList;
import javafx.geometry.Point2D;
import javafx.scene.Cursor;
import javafx.scene.input.InputEvent;
import javafx.scene.input.MouseEvent;
import lombok.NonNull;

import java.util.List;

/**
 * Created by hobbypunk on 16.02.17.
 */
public class ModifyableLine extends InvisibleLine implements Actionable, Deletable, Moveable {
  
  private enum STATUS {
    NOTHING,
    POINT,
    LINE
  }
  
  private Settings settings = Settings.load();
  
  private Boolean isMoving = false;
  
  private STATUS status = STATUS.NOTHING;
  private Point2D startMousePos = null;
  private Integer firstPointPos = null;
  private Integer secondPointPos = null;
  private Point2D firstPoint = null;
  private Point2D secondPoint = null;
  
  public ModifyableLine(@NonNull MoGroup parent, @NonNull MoLine data) {
    super(parent, data);
  }
  
  
  @Override
  public Boolean action(StateMachine sm, InputEvent inputEvent) {
    MouseEvent event = (MouseEvent) inputEvent;
    
    Point2D mousePos = ((MoDiagramGroup) getMoParent()).convertScenePointToDiagramPoint(new Point2D(event.getSceneX(), event.getSceneY()));
    
    Integer[] poses = findNearLinePos(mousePos, true);
    if (poses != null) {
      this.getData().getPoints().add(poses[1], mousePos);
    }
    
    return true;
  }
  
  @Override
  public Boolean delete(InputEvent event) {
    MouseEvent mouseEvent = (MouseEvent) event;
    Point2D mousePos = ((MoDiagramGroup) getMoParent()).convertScenePointToDiagramPoint(new Point2D(mouseEvent.getSceneX(), mouseEvent.getSceneY()));
    
    Integer pos = findNearPointPos(mousePos);
    if (pos != null) {
      this.getData().getPoints().remove(pos.intValue());
      return true;
    } else {
      Integer[] poses = findNearLinePos(mousePos, true);
      if (poses != null) {
        try {
          List<MoConnection> connections = getMoParent().getMoClass().getConnections();
          for (MoConnection conn : connections) {
            if (conn.getMoGraphics().contains(this.getData())) {
              getMoParent().getMoClass().removeConnection(conn);
              break;
            }
          }
          return true;
        } catch (ParserException e) {
          e.printStackTrace();
        }
      }
    }
    
    return false;
  }
  
  public Boolean move(StateMachine sm, InputEvent inputEvent) {
    MouseEvent event = (MouseEvent) inputEvent;
    if (event.getEventType().equals(MouseEvent.MOUSE_PRESSED) || event.getEventType().equals(MouseEvent.MOUSE_DRAGGED)) {
      if (!isMoving) {
        isMoving = true;
        sm.freeze();
        this.moveStart(event);
      } else {
        if (settings.getMainwindow().getEditor().getDefaultSnap() ^ event.isShiftDown()) this.moveSnap(event); //^ == XOR Operator
        else this.move(event);
      }
      return true;
    } else if (event.getEventType().equals(MouseEvent.MOUSE_RELEASED)) {
      isMoving = false;
      sm.unfreeze();
      return true;
    }
    return false;
  }
  
  private void moveStart(MouseEvent event) {
    getMoParent().getScene().setCursor(Cursor.MOVE);
    startMousePos = ((MoDiagramGroup) getMoParent()).convertScenePointToDiagramPoint(new Point2D(event.getSceneX(), event.getSceneY()));
    Integer pos = findNearPointPos(startMousePos);
    if (pos != null) {
      firstPointPos = pos;
      firstPoint = this.getData().getPoints().get(firstPointPos);
      status = STATUS.POINT;
      return;
    }
    
    Integer[] poses = findNearLinePos(startMousePos);
    if (poses != null) {
      firstPointPos = poses[0];
      secondPointPos = poses[1];
      firstPoint = this.getData().getPoints().get(firstPointPos);
      secondPoint = this.getData().getPoints().get(secondPointPos);
      status = STATUS.LINE;
    }
  }
  
  private void moveSnap(MouseEvent event) {
    Point2D mousePos = ((MoDiagramGroup) getMoParent()).convertScenePointToDiagramPoint(new Point2D(event.getSceneX(), event.getSceneY()));
    Point2D delta = mousePos.subtract(startMousePos);
    Double snapRadius = settings.getMainwindow().getEditor().getSnapRadius();
  
    if (status == STATUS.POINT) {
      Point2D newPoint = calcSnapInPoint(getData().getPoints().get(firstPointPos - 1), firstPoint.add(delta), snapRadius);
      newPoint = calcSnapInPoint(getData().getPoints().get(firstPointPos + 1), newPoint, snapRadius);
      
      this.getData().getPoints().set(firstPointPos, newPoint);
    }
  
    if (status == STATUS.LINE) {
      Point2D deltaFirstPoint = firstPoint.add(delta);
      Point2D deltaSecondPoint = secondPoint.add(delta);
    
      Point2D newP1 = calcSnapInPoint(getData().getPoints().get(firstPointPos - 1), deltaFirstPoint, snapRadius);
      Point2D newP2 = calcSnapInPoint(getData().getPoints().get(secondPointPos + 1), deltaSecondPoint, snapRadius);
    
      if (!newP1.equals(deltaFirstPoint)) newP2 = newP1.subtract(firstPoint).add(secondPoint);
      else if (!newP2.equals(deltaSecondPoint)) newP1 = newP2.subtract(secondPoint).add(firstPoint);
      else {
        newP1 = firstPoint.add(delta);
        newP2 = secondPoint.add(delta);
      }
    
      this.getData().getPoints().set(firstPointPos, newP1);
      this.getData().getPoints().set(secondPointPos, newP2);
    }
  }
  
  private void move(MouseEvent event) {
    Point2D mousePos = ((MoDiagramGroup) getMoParent()).convertScenePointToDiagramPoint(new Point2D(event.getSceneX(), event.getSceneY()));
    Point2D delta = mousePos.subtract(startMousePos);
    if (status != STATUS.NOTHING) {
      this.getData().getPoints().set(firstPointPos, firstPoint.add(delta));
    }
    if (status == STATUS.LINE) {
      this.getData().getPoints().set(secondPointPos, secondPoint.add(delta));
    }
  }
  
  private Integer findNearPointPos(Point2D point) {
    ObservableList<Point2D> points = this.getData().getPoints();
    for (int i = 1, size = points.size() - 1; i < size; i++) {       //first and last point is not moveable, it's bound to the connector!
      Point2D p = points.get(i);
      if (p.distance(point) < 5) {
        return i;
      }
    }
    return null;
  }
  
  private Integer[] findNearLinePos(Point2D point) {
    return findNearLinePos(point, false);
  }
  
  private Integer[] findNearLinePos(Point2D point, Boolean withBeginAndEnd) {
    ObservableList<Point2D> points = this.getData().getPoints();
    for (int i = (withBeginAndEnd) ? 0 : 1, j = (withBeginAndEnd) ? 1 : 2, size = points.size() - ((withBeginAndEnd) ? 0 : 1); j < size; i++, j++) {       //first and last source is not moveable, it's bound to the connector!
      Point2D p1 = points.get(i);
      Point2D p2 = points.get(j);
      if (Math.abs((p1.distance(point) + p2.distance(point)) - p1.distance(p2)) < 5) return new Integer[]{i, j};
    }
    return null;
  }
  
  
  private Point2D calcSnapInPoint(Point2D snapInCheck, Point2D basisPoint, Double snapRadius) {
    Point2D newPoint = basisPoint;
    
    Point2D help0Degree = new Point2D(snapInCheck.getX(), basisPoint.getY());
    Point2D help90Degree = new Point2D(basisPoint.getX(), snapInCheck.getY());
    
    if (Math.abs(help0Degree.distance(basisPoint)) < snapRadius) newPoint = new Point2D(snapInCheck.getX(), newPoint.getY());
    if (Math.abs(help90Degree.distance(basisPoint)) < snapRadius) newPoint = new Point2D(newPoint.getX(), snapInCheck.getY());
    if (!basisPoint.equals(newPoint)) return newPoint;
    
    Point2D help45Degree = snapInCheck.subtract(snapInCheck.getX() - basisPoint.getX(), snapInCheck.getX() - basisPoint.getX());
    Point2D help135Degree = snapInCheck.subtract(snapInCheck.getX() - basisPoint.getX(), 0).add(0, snapInCheck.getX() - basisPoint.getX());
    
    if (Math.abs(help45Degree.distance(basisPoint)) < snapRadius) return help45Degree;
    if (Math.abs(help135Degree.distance(basisPoint)) < snapRadius) return help135Degree;
    
    return basisPoint;
  }
  
}

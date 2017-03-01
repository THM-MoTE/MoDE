package de.thm.mni.mote.mode.uiactor.editor.statemachine.elements;

import de.thm.mni.mote.mode.modelica.MoConnection;
import de.thm.mni.mote.mode.modelica.MoContainer;
import de.thm.mni.mote.mode.modelica.MoVariable;
import de.thm.mni.mote.mode.modelica.graphics.MoTransformation;
import de.thm.mni.mote.mode.uiactor.control.modelica.MoDiagramGroup;
import de.thm.mni.mote.mode.uiactor.control.modelica.MoVariableIconGroup;
import de.thm.mni.mote.mode.uiactor.editor.actionmanager.commands.Command;
import de.thm.mni.mote.mode.uiactor.editor.actionmanager.elements.ModifyableMoVariable;
import de.thm.mni.mote.mode.uiactor.editor.statemachine.StateMachine;
import de.thm.mni.mote.mode.uiactor.editor.statemachine.interfaces.Actionable;
import de.thm.mni.mote.mode.uiactor.editor.statemachine.interfaces.Deletable;
import de.thm.mni.mote.mode.uiactor.editor.statemachine.interfaces.Moveable;
import de.thm.mni.mote.mode.uiactor.handlers.LibraryHandler;
import javafx.geometry.Point2D;
import javafx.scene.Parent;
import javafx.scene.control.TabPane;
import javafx.scene.input.InputEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by hobbypunk on 16.02.17.
 */

public class ModifyableMoVariableIconGroup extends MoVariableIconGroup implements Actionable, Deletable, Moveable {
  
  private MoTransformation transformation = null;
  
  private Point2D startSceneMousePos = null;
  private Point2D startMousePos = null;
  private Point2D startOrigin = null;
  private final Map<MoConnection, List<Point2D>> startConnectionPoints = new HashMap<>();
  private final Map<MoConnection, List<Integer>> startConnectionPointPoses = new HashMap<>();
  
  //ROTATE
  private Point2D startCenter = null;
  private Double startAngle = null;
  private Double startRotation = null;
  
  //RESIZE
  private Double startWidth = null;
  private Double startHeight = null;
  private Point2D startOffset = null;
  private Double startScaleX = null;
  private Double startScaleY = null;
  
  protected ModifyableMoVariableIconGroup(MoDiagramGroup diagramParent, MoContainer parent, MoVariable variable) {
    super(diagramParent, parent, variable);
  }
  
  @Override
  public Command action(StateMachine sm, InputEvent event) {
    if (this.getThat().getElement().hasDiagram()) {
      TabPane tb = findTabPane(this);
      if (tb == null) return null;
  
      LibraryHandler.getInstance().handleMenu(tb, this.getThat(), "open_as_diagram");
    }
    return Command.IGNORE;
  }
  
  @Override
  public Command delete(InputEvent event) {
    return this.getMoDiagram().getModifyableMoClass().delete(this.getVariable());
  }
  
  @Override
  public Command move(StateMachine sm, InputEvent inputEvent) {
    if (!(inputEvent instanceof MouseEvent)) return null;
    MouseEvent event = (MouseEvent) inputEvent;
    if (event.getEventType().equals(MouseEvent.MOUSE_PRESSED)) {
      sm.freeze();
      moveStart(event);
      return Command.IGNORE;
    } else if (event.getEventType().equals(MouseEvent.MOUSE_DRAGGED)) {
      this.moveDrag(event);
      return Command.IGNORE;
    } else if (event.getEventType().equals(MouseEvent.MOUSE_RELEASED)) {
      this.setOpacity(1);
      sm.unfreeze();
    
      Command c = Command.IGNORE;
      if (!startOrigin.equals(new Point2D(this.getOrigin().getX(), this.getOrigin().getY())))
        c = new ModifyableMoVariable(getVariable()).createMove(startOrigin, startConnectionPointPoses, startConnectionPoints);
      clearVariables();
      return c;
    }
    return null;
  }
  
  private void moveStart(MouseEvent event) {
    transformation = getVariable().getPlacement().getIconTransformation();
    if (transformation == null) transformation = getVariable().getPlacement().getDiagramTransformation();
    
    this.toFront();
    this.setOpacity(0.8);
  
    startMousePos = this.getMoDiagram().convertTo(new Point2D(event.getSceneX(), event.getSceneY()));
    startOrigin = transformation.getOrigin().get();
    this.getVariable().getConnections().forEach(moConn -> {
      Boolean to = moConn.toContains(this.getVariable());
      Boolean from = moConn.fromContains(this.getVariable());
      if (!startConnectionPointPoses.containsKey(moConn)) {
        startConnectionPointPoses.put(moConn, new ArrayList<>());
        startConnectionPoints.put(moConn, new ArrayList<>());
      }
      if (from && to) { // self connection: move all points
        for (int i = 0, size = moConn.getLine().getPoints().size(); 0 < size; i++)
          startConnectionPointPoses.get(moConn).add(i);
      } else if (from)    // from is always the first point in a connection
        startConnectionPointPoses.get(moConn).add(0);
      else if (to)        // to is always the last point in a connection
        startConnectionPointPoses.get(moConn).add(moConn.getLine().getPoints().size() - 1);
      
      for (Integer pos : startConnectionPointPoses.get(moConn))
        startConnectionPoints.get(moConn).add(moConn.getLine().getPoints().get(pos));
    });
  }
  
  private void moveDrag(MouseEvent event) {
    if (this.transformation == null) return;
    Point2D mousePos = getMoDiagram().convertTo(new Point2D(event.getSceneX(), event.getSceneY()));
    Point2D delta = mousePos.subtract(startMousePos);
    updateConnections(delta);
    
    transformation.getOrigin().set(startOrigin.add(delta));
  }
  
  private void updateConnections(Point2D delta) {
    startConnectionPointPoses.keySet().forEach(moConn -> {
      for (int i = 0, size = startConnectionPointPoses.get(moConn).size(); i < size; i++) {
        Integer pos = startConnectionPointPoses.get(moConn).get(i);
        Point2D point = startConnectionPoints.get(moConn).get(i);
        moConn.getLine().getPoints().set(pos, point.add(delta));
      }
    });
  }
  
  private TabPane findTabPane(Parent parent) {
    if (parent instanceof TabPane) return (TabPane) parent;
    if (parent.getParent() == null) return null;
    return findTabPane(parent.getParent());
  }
  
  Command rotate(StateMachine sm, InputEvent inputEvent) {
    if (!(inputEvent instanceof MouseEvent) || this.transformation == null) return null;
    
    MouseEvent event = (MouseEvent) inputEvent;
    if (event.getEventType().equals(MouseEvent.MOUSE_PRESSED)) {
      sm.freeze();
      startCenter = new Point2D(0, 0);
      this.getChildren().add(new Circle(startCenter.getX(), startCenter.getY(), 3, Color.GREEN));
      startSceneMousePos = new Point2D(event.getSceneX(), event.getSceneY());
      Point2D pos = this.convertTo(startSceneMousePos);
      startAngle = (double) Math.round(Math.toDegrees(Math.atan2(pos.getX() - startCenter.getX(), startCenter.getY() - pos.getY())));
      startRotation = transformation.getRotation().get();
      return Command.IGNORE;
    } else if (event.getEventType().equals(MouseEvent.MOUSE_DRAGGED) && startAngle != null) {
      Point2D pos = this.convertTo(new Point2D(event.getSceneX(), event.getSceneY()));
      Double angle = (double) Math.round(Math.toDegrees(Math.atan2(pos.getX() - startCenter.getX(), startCenter.getY() - pos.getY())));
      Double newRotation = (startRotation - (startAngle - angle)) % 360;
      transformation.getRotation().set((newRotation < 0) ? 360 + newRotation : newRotation);
      pos = this.convertTo(startSceneMousePos);
      startAngle = (double) Math.round(Math.toDegrees(Math.atan2(pos.getX() - startCenter.getX(), startCenter.getY() - pos.getY())));
      return Command.IGNORE;
    } else if (event.getEventType().equals(MouseEvent.MOUSE_RELEASED)) {
      Command c = new ModifyableMoVariable(getVariable()).createRotation(startRotation);
      clearVariables();
      sm.unfreeze();
      return c;
    }
    
    return null;
  }
  
  Command resize(StateMachine sm, InputEvent inputEvent, Integer combination) {
    if (!(inputEvent instanceof MouseEvent) || this.transformation == null) return null;
    MouseEvent event = (MouseEvent) inputEvent;
    if (event.getEventType().equals(MouseEvent.MOUSE_PRESSED)) {
      sm.freeze();
      startWidth = transformation.getExtent().getWidth();
      startHeight = transformation.getExtent().getHeight();
      startOffset = this.transformation.getExtent().getOffsetProperty().get();
      startScaleX = transformation.getExtent().getScaleXProperty().get();
      startScaleY = transformation.getExtent().getScaleYProperty().get();
      startSceneMousePos = new Point2D(event.getSceneX(), event.getSceneY());
      startMousePos = this.convertTo(startSceneMousePos);
      return Command.IGNORE;
    } else if (event.getEventType().equals(MouseEvent.MOUSE_DRAGGED) && startMousePos != null) {
      this.resizeDrag(event, combination);
      return Command.IGNORE;
    } else if (event.getEventType().equals(MouseEvent.MOUSE_RELEASED)) {
      Command c = new ModifyableMoVariable(getVariable()).createResize(startOffset, startScaleX, startScaleY);
      clearVariables();
      sm.unfreeze();
      return c;
    }
    return null;
  }
  
  private void resizeDrag(MouseEvent event, Integer modifyOffset) {
    if (this.transformation == null) return;
    Point2D mousePos = this.convertTo(new Point2D(event.getSceneX(), event.getSceneY()));
    Point2D delta = mousePos.subtract(startMousePos);
    
    Double scaleX = (startWidth + delta.getX()) / this.transformation.getExtent().getInitialWidth();
    Double scaleY = (startHeight + delta.getY()) / this.transformation.getExtent().getInitialHeight();
    System.out.print("Delta: " + delta);
    System.out.println(" ScaleX: " + scaleX);
    if (scaleX > 0) {
      if (modifyOffset != ModifyableCircle.MODIFY_NO_OFFSET) {
//      System.out.println("Update X Offset: " + offset);
        //  this.transformation.getExtent().getOffsetProperty().set(startOffset.add(delta));
      }
      this.transformation.getExtent().getScaleXProperty().set(scaleX);
      this.transformation.getExtent().getScaleYProperty().set(scaleX);
  
      startMousePos = this.convertTo(startSceneMousePos);
    }
  }
  
  private void clearVariables() {
    startWidth = null;
    startAngle = null;
    startHeight = null;
    startOrigin = null;
    startCenter = null;
    startOffset = null;
    startMousePos = null;
    startRotation = null;
    startConnectionPoints.clear();
    startConnectionPointPoses.clear();
  }
}

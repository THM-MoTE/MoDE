package de.thm.mni.mhpp11.control.icon.handlers;

import de.thm.mni.mhpp11.control.icon.MoDiagramGroup;
import de.thm.mni.mhpp11.shape.Line;
import javafx.collections.ObservableList;
import javafx.event.EventHandler;
import javafx.geometry.Point2D;
import javafx.scene.Cursor;
import javafx.scene.input.MouseEvent;
import lombok.Value;
import lombok.experimental.NonFinal;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by hobbypunk on 10.11.16.
 */
@Value
public class ModifyLineHandler implements EventHandler<MouseEvent> {
  static private Map<MoDiagramGroup, ModifyLineHandler> INSTANCES = new HashMap<>();

  private enum STATUS {
    NOTHING,
    POINT,
    LINE
  }
  
  @NonFinal MoDiagramGroup parent;
  @NonFinal Line source;
  @NonFinal STATUS status = STATUS.NOTHING;
  @NonFinal Point2D startMousePos = null;
  @NonFinal Integer firstPointPos = null;
  @NonFinal Integer secondPointPos = null;
  @NonFinal Point2D firstPoint = null;
  @NonFinal Point2D secondPoint = null;
  
  
  public static ModifyLineHandler getInstance(MoDiagramGroup parent) {
    if (!INSTANCES.containsKey(parent)) {
      INSTANCES.put(parent, new ModifyLineHandler(parent));
    }
    return INSTANCES.get(parent);
  }
  
  
  private ModifyLineHandler(MoDiagramGroup parent) {
    this.parent = parent;
  }
  
  @Override
  public void handle(MouseEvent event) {
    Boolean eventHandled = false;
    Line src = (Line) event.getSource();
  
    if (source != null && src != source) return;
    
    if (event.getEventType().equals(MouseEvent.MOUSE_PRESSED) || event.getEventType().equals(MouseEvent.MOUSE_CLICKED)) {
      source = src;
      FocusHandler.getInstance().handle(event);
    }
    
    if (event.getEventType().equals(MouseEvent.MOUSE_PRESSED)) {
      handlePressed(event);
      eventHandled = true;
    } else if (event.getEventType().equals(MouseEvent.MOUSE_DRAGGED)) {
      handleMove(event);
      eventHandled = true;
    } else if (event.getEventType().equals(MouseEvent.MOUSE_RELEASED)) {
      handleRelease(event);
      eventHandled = true;
    } else if (event.getEventType().equals(MouseEvent.MOUSE_CLICKED)) {
      handleClick(event);
      eventHandled = true;
    }
  
    if (event.getEventType().equals(MouseEvent.MOUSE_RELEASED) || event.getEventType().equals(MouseEvent.MOUSE_CLICKED)) {
      source = null;
    }
  
    if (eventHandled) event.consume();
  }
  
  private void handleClick(MouseEvent event) {
    Point2D mousePos = parent.convertScenePointToDiagramPoint(event.getSceneX(), event.getSceneY());
    
    if (event.getClickCount() == 2 || (event.getClickCount() == 1 && event.isShiftDown())) {
      Integer[] poses = findNearLinePos(mousePos, false);
      if (poses != null) {
        source.getData().getPoints().add(poses[1], mousePos);
      }
    } else if (event.getClickCount() == 1 && event.isControlDown()) {
      Integer pos = findNearPointPos(mousePos);
      if (pos != null) source.getData().getPoints().remove(pos.intValue());
    }
  }
  
  private void handlePressed(MouseEvent event) {
    parent.getScene().setCursor(Cursor.MOVE);
    startMousePos = parent.convertScenePointToDiagramPoint(event.getSceneX(), event.getSceneY());
    Integer pos = findNearPointPos(startMousePos);
    if (pos != null) {
      firstPointPos = pos;
      firstPoint = source.getData().getPoints().get(firstPointPos);
      status = STATUS.POINT;
      return;
    }
    
    Integer[] poses = findNearLinePos(startMousePos);
    if (poses != null) {
      firstPointPos = poses[0];
      secondPointPos = poses[1];
      firstPoint = source.getData().getPoints().get(firstPointPos);
      secondPoint = source.getData().getPoints().get(secondPointPos);
      status = STATUS.LINE;
      
    }
  }
  
  private void handleMove(MouseEvent event) {
    Point2D mousePos = parent.convertScenePointToDiagramPoint(event.getSceneX(), event.getSceneY());
    Point2D delta = mousePos.subtract(startMousePos);
    if (status == STATUS.POINT || status == STATUS.LINE) {
      source.getData().getPoints().set(firstPointPos, firstPoint.add(delta));
    }
    if (status == STATUS.LINE) {
      source.getData().getPoints().set(secondPointPos, secondPoint.add(delta));
    }
  }
  
  private void handleRelease(MouseEvent event) {
    status = STATUS.NOTHING;
    firstPoint = null;
    secondPoint = null;
    firstPointPos = null;
    secondPointPos = null;
    startMousePos = null;
    parent.getScene().setCursor(Cursor.DEFAULT);
  }
  
  private Integer findNearPointPos(Point2D point) {
    ObservableList<Point2D> points = source.getData().getPoints();
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
    ObservableList<Point2D> points = source.getData().getPoints();
    for (int i = (withBeginAndEnd) ? 0 : 1, j = (withBeginAndEnd) ? 1 : 2, size = points.size() - ((withBeginAndEnd) ? 0 : 1); j < size; i++, j++) {       //first and last source is not moveable, it's bound to the connector!
      Point2D p1 = points.get(i);
      Point2D p2 = points.get(j);
      if (Math.abs((p1.distance(point) + p2.distance(point)) - p1.distance(p2)) < 5) return new Integer[]{i, j};
    }
    return null;
  }
}

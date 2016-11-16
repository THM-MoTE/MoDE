package de.thm.mni.mhpp11.statemachine.states;

import de.thm.mni.mhpp11.control.icon.MoDiagramGroup;
import de.thm.mni.mhpp11.control.icon.MoIconGroup;
import de.thm.mni.mhpp11.control.icon.handlers.FocusHandler;
import de.thm.mni.mhpp11.util.parser.models.MoConnection;
import javafx.geometry.Point2D;
import javafx.scene.Cursor;
import javafx.scene.input.MouseEvent;
import javafx.scene.transform.Translate;
import lombok.Value;
import lombok.experimental.NonFinal;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by hobbypunk on 16.11.16.
 */

@Value
public class ModelMoveState extends State<MouseEvent> {
  @NonFinal Point2D startMousePos = null;
  @NonFinal Point2D startOrigin = null;
  Map<MoConnection, List<Point2D>> startConnectionPoints = new HashMap<>();
  Map<MoConnection, List<Integer>> startConnectionPointPoses = new HashMap<>();
  
  @NonFinal Translate o;
  @NonFinal MoIconGroup source;
  MoDiagramGroup parent;
  
  public ModelMoveState(MoDiagramGroup parent) {
    this.parent = parent;
  }
  
  @Override
  public void enter() {
    this.getMachine().getScene().setCursor(Cursor.CLOSED_HAND);
  }
  
  @Override
  public void exit() {
    FocusHandler.getInstance().clearFocus();
    if (source != null) source.setOpacity(1.0);
    startMousePos = null;
    startOrigin = null;
    startConnectionPointPoses.clear();
    startConnectionPoints.clear();
  }
  
  @Override
  public void handle(MouseEvent event) {
    MoIconGroup src = (MoIconGroup) event.getSource();
    
    if (source != null && src != source) return;
    
    if (event.getEventType().equals(MouseEvent.MOUSE_PRESSED)) {
      this.source = src;
      this.o = source.getOrigin();
    }
    
    if (event.getEventType().equals(MouseEvent.MOUSE_PRESSED)) {
      handlePressed(event);
    } else if (event.getEventType().equals(MouseEvent.MOUSE_DRAGGED)) {
      handleMove(event);
    } else if (event.getEventType().equals(MouseEvent.MOUSE_RELEASED)) {
      handleRelease(event);
    }
    
    if (event.getEventType().equals(MouseEvent.MOUSE_RELEASED)) {
      this.source = null;
      this.o = null;
    }
    
  }
  
  private void handleMove(MouseEvent event) {
    if (o != null) {
      Point2D mousePos = parent.convertScenePointToDiagramPoint(event.getSceneX(), event.getSceneY());
      Point2D delta = mousePos.subtract(startMousePos);
      updateConnections(delta);
      Point2D origin = startOrigin.add(delta);
      o.setX(origin.getX());
      o.setY(origin.getY());
    }
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
  
  private void handlePressed(MouseEvent event) {
    source.toFront();
    source.setOpacity(0.8);
    FocusHandler.getInstance().setFocus(source);
    startMousePos = parent.convertScenePointToDiagramPoint(event.getSceneX(), event.getSceneY());
    startOrigin = new Point2D(o.getX(), o.getY());
    source.getVariable().getConnections().forEach(moConn -> {
      Boolean to = moConn.toContains(source.getVariable());
      Boolean from = moConn.fromContains(source.getVariable());
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
  
  private void handleRelease(MouseEvent event) {
    this.getMachine().switchToNoState();
  }
}

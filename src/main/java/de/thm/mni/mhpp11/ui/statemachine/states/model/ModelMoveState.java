package de.thm.mni.mhpp11.ui.statemachine.states.model;

import de.thm.mni.mhpp11.modelica.MoConnection;
import de.thm.mni.mhpp11.ui.control.modelica.MoDiagramGroup;
import de.thm.mni.mhpp11.ui.control.modelica.MoIconGroup;
import de.thm.mni.mhpp11.ui.handlers.FocusHandler;
import javafx.geometry.Point2D;
import javafx.scene.Cursor;
import javafx.scene.input.MouseEvent;
import javafx.scene.transform.Translate;
import lombok.Value;
import lombok.experimental.NonFinal;

import java.util.*;

/**
 * Created by hobbypunk on 16.11.16.
 */

@Value
public class ModelMoveState extends ModelModifyState {
  @NonFinal Point2D startMousePos = null;
  @NonFinal Point2D startOrigin = null;
  Map<MoConnection, List<Point2D>> startConnectionPoints = new HashMap<>();
  Map<MoConnection, List<Integer>> startConnectionPointPoses = new HashMap<>();
  
  Translate o;
  
  public ModelMoveState(MoDiagramGroup parent, MoIconGroup source) {
    super(parent, source);
    this.o = source.getOrigin();
  }
  
  @Override
  protected void initTransitions() {
    getTransitions().put(MouseEvent.MOUSE_DRAGGED, Arrays.asList(this.getClass()));
    getTransitions().put(MouseEvent.MOUSE_RELEASED, Arrays.asList(ModelModifyState.class));
  }
  
  
  @Override
  public void enter() {
    this.getMachine().getScene().setCursor(Cursor.CLOSED_HAND);
  }
  
  @Override
  public void exit() {
    MoIconGroup source = getSource();
    FocusHandler.getInstance().clearFocus();
    if (source != null) source.setOpacity(1.0);
  }
  
  @Override
  protected void handleDragged(MouseEvent event) {
    if (o != null) {
      Point2D mousePos = getParent().convertScenePointToDiagramPoint(event.getSceneX(), event.getSceneY());
      Point2D delta = mousePos.subtract(startMousePos);
      updateConnections(delta);
      Point2D origin = startOrigin.add(delta);
      o.setX(origin.getX());
      o.setY(origin.getY());
    }
  }
  
  @Override
  protected void handlePressed(MouseEvent event) {
    MoIconGroup source = getSource();
    source.toFront();
    source.setOpacity(0.8);
    FocusHandler.getInstance().setFocus(source);
    startMousePos = getParent().convertScenePointToDiagramPoint(event.getSceneX(), event.getSceneY());
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
  
  @Override
  protected void handleReleased(MouseEvent event) {
    this.getMachine().switchToState(new ModelModifyState(getParent(), getSource()));
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
}

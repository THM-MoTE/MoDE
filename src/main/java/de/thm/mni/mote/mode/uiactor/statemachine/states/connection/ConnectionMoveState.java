package de.thm.mni.mote.mode.uiactor.statemachine.states.connection;

import de.thm.mni.mote.mode.uiactor.control.modelica.MoDiagramGroup;
import de.thm.mni.mote.mode.uiactor.elementmanager.elements.ManagedLine;
import javafx.geometry.Point2D;
import javafx.scene.Cursor;
import javafx.scene.input.MouseEvent;
import lombok.AccessLevel;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;
import lombok.experimental.FieldDefaults;

import java.util.Arrays;

/**
 * Created by hobbypunk on 16.11.16.
 */
@SuppressWarnings("ArraysAsListWithZeroOrOneArgument")
@Getter
@FieldDefaults(level = AccessLevel.PRIVATE)
@ToString
@EqualsAndHashCode(callSuper = false)
public class ConnectionMoveState extends ConnectionModifyState {
  
  private enum STATUS {
    NOTHING,
    POINT,
    LINE
  }
  
  final MoDiagramGroup parent;
  STATUS status = STATUS.NOTHING;
  Point2D startMousePos = null;
  Integer firstPointPos = null;
  Integer secondPointPos = null;
  Point2D firstPoint = null;
  Point2D secondPoint = null;
  
  public ConnectionMoveState(MoDiagramGroup parent, ManagedLine source) {
    super(parent, source);
    this.parent = parent;
  }
  
  @Override
  protected void initTransitions() {
    getTransitions().put(MouseEvent.MOUSE_DRAGGED, Arrays.asList(this.getClass()));
    getTransitions().put(MouseEvent.MOUSE_RELEASED, Arrays.asList(ConnectionModifyState.class));
  }
  
  @Override
  protected void handlePressed(MouseEvent event) {
    parent.getScene().setCursor(Cursor.MOVE);
    startMousePos = parent.convertScenePointToDiagramPoint(event.getSceneX(), event.getSceneY());
    Integer pos = findNearPointPos(startMousePos);
    if (pos != null) {
      firstPointPos = pos;
      firstPoint = getSource().getData().getPoints().get(firstPointPos);
      status = STATUS.POINT;
      return;
    }
    
    Integer[] poses = findNearLinePos(startMousePos);
    if (poses != null) {
      firstPointPos = poses[0];
      secondPointPos = poses[1];
      firstPoint = getSource().getData().getPoints().get(firstPointPos);
      secondPoint = getSource().getData().getPoints().get(secondPointPos);
      status = STATUS.LINE;
    }
  }
  
  @Override
  protected void handleDragged(MouseEvent event) {
    Point2D mousePos = parent.convertScenePointToDiagramPoint(event.getSceneX(), event.getSceneY());
    Point2D delta = mousePos.subtract(startMousePos);
    if (status == STATUS.POINT || status == STATUS.LINE) {
      getSource().getData().getPoints().set(firstPointPos, firstPoint.add(delta));
    }
    if (status == STATUS.LINE) {
      getSource().getData().getPoints().set(secondPointPos, secondPoint.add(delta));
    }
  }
  
  @Override
  protected void handleReleased(MouseEvent event) {
    this.getMachine().switchToState(new ConnectionModifyState(getParent(), getSource()));
  }
  
  @Override
  protected void handleClicked(MouseEvent event) {}
}

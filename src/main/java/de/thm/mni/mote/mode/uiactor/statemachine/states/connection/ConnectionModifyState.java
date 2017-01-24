package de.thm.mni.mote.mode.uiactor.statemachine.states.connection;

import de.thm.mni.mote.mode.uiactor.control.modelica.MoDiagramGroup;
import de.thm.mni.mote.mode.uiactor.handlers.FocusHandler;
import de.thm.mni.mote.mode.uiactor.shape.Line;
import de.thm.mni.mote.mode.uiactor.statemachine.states.NoState;
import de.thm.mni.mote.mode.uiactor.statemachine.states.State;
import de.thm.mni.mote.mode.uiactor.statemachine.states.diagram.DiagramZoomState;
import de.thm.mni.mote.mode.uiactor.statemachine.states.model.ModelMoveState;
import de.thm.mni.mote.mode.uiactor.utilities.MyEvents;
import javafx.collections.ObservableList;
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
@Getter
@FieldDefaults(level = AccessLevel.PRIVATE)
@ToString
@EqualsAndHashCode(callSuper = true)
public class ConnectionModifyState extends State<MouseEvent, Line> {
  
  final MoDiagramGroup parent;
  
  public ConnectionModifyState(MoDiagramGroup parent, Line source) {
    super(source);
    this.parent = parent;
  }
  
  @Override
  protected void initTransitions() {
    getTransitions().put(MyEvents.MOUSE_CTRL_CLICKED, Arrays.asList(ConnectionDeleteState.class));
    getTransitions().put(MyEvents.MOUSE_SHIFT_CLICKED, Arrays.asList(ConnectionAddPointState.class));
    getTransitions().put(MyEvents.MOUSE_DOUBLE_CLICKED, Arrays.asList(ConnectionAddPointState.class));
    getTransitions().put(MouseEvent.MOUSE_CLICKED, Arrays.asList(NoState.class, this.getClass(), ConnectionCreateState.class));
    getTransitions().put(MouseEvent.MOUSE_PRESSED, Arrays.asList(ConnectionMoveState.class, ModelMoveState.class));
    getTransitions().put(MyEvents.SCROLL_SHIFT, Arrays.asList(DiagramZoomState.class));
  }
  
  @Override
  public void enter() {
    FocusHandler.getInstance().setFocus(getSource());
    getMachine().getScene().setCursor(Cursor.HAND);
  }
  
  @Override
  public void exit() {
    FocusHandler.getInstance().clearFocus();
  }
  
  protected Integer findNearPointPos(Point2D point) {
    ObservableList<Point2D> points = getSource().getData().getPoints();
    for (int i = 1, size = points.size() - 1; i < size; i++) {       //first and last point is not moveable, it's bound to the connector!
      Point2D p = points.get(i);
      if (p.distance(point) < 5) {
        return i;
      }
    }
    return null;
  }
  
  protected Integer[] findNearLinePos(Point2D point) {
    return findNearLinePos(point, false);
  }
  
  protected Integer[] findNearLinePos(Point2D point, Boolean withBeginAndEnd) {
    ObservableList<Point2D> points = getSource().getData().getPoints();
    for (int i = (withBeginAndEnd) ? 0 : 1, j = (withBeginAndEnd) ? 1 : 2, size = points.size() - ((withBeginAndEnd) ? 0 : 1); j < size; i++, j++) {       //first and last source is not moveable, it's bound to the connector!
      Point2D p1 = points.get(i);
      Point2D p2 = points.get(j);
      if (Math.abs((p1.distance(point) + p2.distance(point)) - p1.distance(p2)) < 5) return new Integer[]{i, j};
    }
    return null;
  }
}

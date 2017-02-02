package de.thm.mni.mote.mode.uiactor.statemachine.states;

import de.thm.mni.mote.mode.uiactor.statemachine.StateMachine;
import de.thm.mni.mote.mode.uiactor.statemachine.states.connection.ConnectionCreateState;
import de.thm.mni.mote.mode.uiactor.statemachine.states.connection.ConnectionModifyState;
import de.thm.mni.mote.mode.uiactor.statemachine.states.connection.ConnectionMoveState;
import de.thm.mni.mote.mode.uiactor.statemachine.states.diagram.DiagramZoomState;
import de.thm.mni.mote.mode.uiactor.statemachine.states.model.ModelModifyState;
import de.thm.mni.mote.mode.uiactor.statemachine.states.model.ModelMoveState;
import de.thm.mni.mote.mode.uiactor.utilities.MyEvents;
import javafx.event.Event;
import javafx.scene.Cursor;
import javafx.scene.Node;
import javafx.scene.input.MouseEvent;

import java.util.Arrays;

/**
 * Created by hobbypunk on 15.11.16.
 */
@SuppressWarnings("ArraysAsListWithZeroOrOneArgument")
public class NoState extends State<Event, Node> {
  
  public NoState(StateMachine machine) {
    super(machine);
  }
  
  @Override
  protected void initTransitions() {
    getTransitions().put(MouseEvent.MOUSE_CLICKED, Arrays.asList(ModelModifyState.class, ConnectionCreateState.class, ConnectionModifyState.class));
    getTransitions().put(MouseEvent.MOUSE_PRESSED, Arrays.asList(ModelMoveState.class, ConnectionMoveState.class));
    getTransitions().put(MyEvents.SCROLL_SHIFT, Arrays.asList(DiagramZoomState.class));
  }
  
  @Override
  public void enter() {
    getMachine().getScene().setCursor(Cursor.DEFAULT);
  }
}

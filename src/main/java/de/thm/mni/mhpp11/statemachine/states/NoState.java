package de.thm.mni.mhpp11.statemachine.states;

import de.thm.mni.mhpp11.statemachine.StateMachine;
import javafx.event.Event;
import javafx.scene.Cursor;

/**
 * Created by hobbypunk on 15.11.16.
 */
public class NoState extends State<Event> {
  
  public NoState(StateMachine machine) {
    super(machine);
  }
  
  @Override
  public void enter() {
    getMachine().getScene().setCursor(Cursor.DEFAULT);
  }
}

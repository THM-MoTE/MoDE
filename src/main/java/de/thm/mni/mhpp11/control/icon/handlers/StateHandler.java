package de.thm.mni.mhpp11.control.icon.handlers;

import de.thm.mni.mhpp11.statemachine.StateMachine;
import de.thm.mni.mhpp11.statemachine.states.State;
import javafx.event.Event;
import javafx.event.EventHandler;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

/**
 * Created by hobbypunk on 16.11.16.
 */

@Getter
@Setter
@FieldDefaults(makeFinal = true, level = AccessLevel.PRIVATE)
public abstract class StateHandler<T extends Event> implements EventHandler<T> {
  StateMachine sm;
  State<T> state;
  
  public StateHandler(State<T> state) {
    this.sm = StateMachine.getInstance();
    this.state = state;
  }
  
  @Override
  public void handle(T event) {
    if (!this.sm.getState().equals(state)) this.sm.switchToState(state);
    event.consume();
    state.handle(event);
  }
}

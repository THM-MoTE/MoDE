package de.thm.mni.mhpp11.statemachine.states;

import de.thm.mni.mhpp11.statemachine.StateMachine;
import javafx.event.Event;
import lombok.Getter;

/**
 * Created by hobbypunk on 15.11.16.
 */

@Getter
public abstract class State<T extends Event> {
  
  private final StateMachine machine;
  
  public State() {
    this.machine = StateMachine.getInstance();
  }
  
  public State(StateMachine machine) {
    this.machine = machine;
  }
  
  public void enter() {}
  
  public void exit() {}
  
  public void handle(T event) {}
}

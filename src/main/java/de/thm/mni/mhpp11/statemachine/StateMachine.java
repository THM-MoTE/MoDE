package de.thm.mni.mhpp11.statemachine;

import de.thm.mni.mhpp11.statemachine.states.NoState;
import de.thm.mni.mhpp11.statemachine.states.State;
import javafx.event.Event;
import javafx.scene.Scene;
import lombok.Getter;
import lombok.NonNull;

/**
 * Created by hobbypunk on 15.11.16.
 */

@Getter
public class StateMachine {
  
  private State<Event> noState;
  
  private Scene scene;
  @NonNull private State<Event> state;
  
  private static StateMachine INSTANCE = null;
  
  public static StateMachine getInstance() {
    if (INSTANCE == null) INSTANCE = new StateMachine();
    return INSTANCE;
  }
  
  public static StateMachine getInstance(Scene scene) {
    if (INSTANCE == null) INSTANCE = new StateMachine(scene);
    if (!INSTANCE.getScene().equals(scene)) {
      INSTANCE.switchToNoState();
      INSTANCE = new StateMachine(scene);
    }
    return INSTANCE;
  }
  
  /**
   * Testing only ...
   */
  private StateMachine() {
    this(null);
  }
  
  private StateMachine(Scene scene) {
    this.scene = scene;
    this.state = this.noState = new NoState(this);
    this.state.enter();
  }
  
  public void switchToState(@NonNull State<? extends Event> newState) {
    if (!this.state.equals(newState)) {
      System.out.println("SM: from " + this.state.getClass().getSimpleName() + " to " + newState.getClass().getSimpleName());
      this.state.exit();
      this.state = (State<Event>) newState;
      this.state.enter();
    }
  }
  
  public void switchToNoState() {
    this.switchToState(this.noState);
  }
  
  public void handle(Event event) {
    this.state.handle(event);
  }
}
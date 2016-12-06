package de.thm.mni.mhpp11.ui.statemachine;

import de.thm.mni.mhpp11.ui.statemachine.states.NoState;
import de.thm.mni.mhpp11.ui.statemachine.states.State;
import javafx.event.Event;
import javafx.event.EventType;
import javafx.scene.Node;
import javafx.scene.Scene;
import lombok.Getter;
import lombok.NonNull;

/**
 * Created by hobbypunk on 15.11.16.
 */

@Getter
public class StateMachine {
  
  private State<? extends Event, ? extends Node> noState;
  
  private Scene scene;
  @NonNull private State<? extends Event, ? extends Node> lastState;
  @NonNull private State<? extends Event, ? extends Node> curState;
  
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
    this.lastState = this.curState = this.noState = new NoState(this);
    this.curState.enter();
  }
  
  public void switchToState(@NonNull State<? extends Event, ? extends Node> newState, Boolean switchIfSameInstance) {
    if ((switchIfSameInstance && !this.curState.equals(newState)) || (!switchIfSameInstance && !this.curState.getClass().equals(newState.getClass()))) {
      //System.out.println("SM: from " + this.curState.getClass().getSimpleName() + " to " + newState.getClass().getSimpleName());
      this.curState.exit();
      this.lastState = this.curState;
      this.curState = newState;
      this.curState.enter();
    }
  }
  
  public void switchToState(@NonNull State<? extends Event, ? extends Node> newState) {
    switchToState(newState, true);
  }
  
  public void switchToLastState() {
    this.switchToState(this.lastState);
  }
  
  public void switchToNoState() {
    this.switchToState(this.noState);
  }
  
  public boolean isSwitchToNoStateAllowed(EventType<? extends Event> transition) {
    return isSwitchAllowed(transition, this.noState);
  }
  
  public boolean isSwitchAllowed(EventType<? extends Event> transition, State<? extends Event, ? extends Node> state) {
    return isSwitchAllowed(transition, state.getClass());
  }
  
  public boolean isSwitchAllowed(EventType<? extends Event> transition, Class<? extends State> clazz) {
    return this.curState.isSwitchAllowed(transition, clazz);
  }
  
  public void handle(Event event) {
    this.curState.handle(event);
  }
  
}
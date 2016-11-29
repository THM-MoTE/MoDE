package de.thm.mni.mhpp11.ui.statemachine.states;

import de.thm.mni.mhpp11.ui.statemachine.StateMachine;
import javafx.event.Event;
import javafx.event.EventType;
import javafx.scene.Node;
import javafx.scene.input.MouseEvent;
import javafx.scene.input.ScrollEvent;
import lombok.EqualsAndHashCode;
import lombok.Getter;

import java.util.HashMap;
import java.util.List;

/**
 * Created by hobbypunk on 15.11.16.
 */

@Getter
@EqualsAndHashCode(exclude = {"machine"})
public abstract class State<E extends Event, P extends Node> {
  
  private final StateMachine machine;
  private final P source;
  
  private final HashMap<EventType<? extends Event>, List<Class<? extends State>>> transitions = new HashMap<>();
  
  protected State() {
    this(StateMachine.getInstance());
  }
  
  protected State(StateMachine machine) {
    this(machine, null);
  }
  
  protected State(P source) {
    this(StateMachine.getInstance(), source);
  }
  
  protected State(StateMachine machine, P source) {
    this.machine = machine;
    this.source = source;
    initTransitions();
  }
  
  protected abstract void initTransitions();
  
  public void enter() {}
  
  public void exit() {}
  
  public void handle(Event event) {
    if (event.getEventType().equals(MouseEvent.MOUSE_PRESSED)) handlePressed((E) event);
    else if (event.getEventType().equals(MouseEvent.MOUSE_DRAGGED)) handleDragged((E) event);
    else if (event.getEventType().equals(MouseEvent.MOUSE_RELEASED)) handleReleased((E) event);
    else if (event.getEventType().equals(MouseEvent.MOUSE_CLICKED)) handleClicked((E) event);
    else if (event.getEventType().equals(ScrollEvent.SCROLL)) handleScroll((E) event);
  }
  
  protected void handleClicked(E event) {}
  
  protected void handlePressed(E event) {}
  
  protected void handleDragged(E event) {}
  
  protected void handleReleased(E event) {}
  
  protected void handleScroll(E event) {}
  
  public Boolean isSwitchAllowed(EventType<? extends Event> transition, Class<? extends State> clazz) {
    return this.getTransitions().containsKey(transition) && this.getTransitions().get(transition).contains(clazz);
  }
}

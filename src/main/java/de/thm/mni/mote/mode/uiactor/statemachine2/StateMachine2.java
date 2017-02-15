package de.thm.mni.mote.mode.uiactor.statemachine2;

import de.thm.mni.mhpp11.jActor.actors.logging.messages.TraceMessage;
import de.thm.mni.mhpp11.jActor.actors.messagebus.MessageBus;
import de.thm.mni.mote.mode.modelica.MoContainer;
import de.thm.mni.mote.mode.uiactor.control.MainTabControl;
import de.thm.mni.mote.mode.uiactor.elementmanager.ElementManager;
import de.thm.mni.mote.mode.uiactor.elementmanager.interfaces.Hoverable;
import de.thm.mni.mote.mode.uiactor.elementmanager.interfaces.Selectable;
import de.thm.mni.mote.mode.uiactor.statemachine2.interfaces.Deletable;
import de.thm.mni.mote.mode.uiactor.statemachine2.interfaces.Moveable;
import de.thm.mni.mote.mode.uiactor.statemachine2.interfaces.Resizeable;
import de.thm.mni.mote.mode.uiactor.statemachine2.interfaces.Rotateable;
import de.thm.mni.mote.mode.uiactor.statemachine2.states.KeyState;
import de.thm.mni.mote.mode.uiactor.statemachine2.states.State;
import de.thm.mni.mote.mode.uiactor.statemachine2.states.States;
import de.thm.mni.mote.mode.util.Utilities;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.event.EventType;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.input.InputEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.input.ScrollEvent;
import lombok.Getter;
import lombok.NonNull;

import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;

/**
 * Created by hobbypunk on 15.11.16.
 */

@Getter
public class StateMachine2 implements EventHandler<InputEvent> {
  private static Map<MoContainer, StateMachine2> INSTANCES = new HashMap<>();
  
  public static StateMachine2 getInstance(MoContainer container) {
    if (!INSTANCES.containsKey(container)) throw new NoSuchElementException("No such StateMachine");
    return INSTANCES.get(container);
  }
  
  public static StateMachine2 getInstance(MainTabControl tab, MoContainer container) {
    if (!INSTANCES.containsKey(container)) INSTANCES.put(container, new StateMachine2(tab));
    return INSTANCES.get(container);
  }
  
  public static void removeInstance(MoContainer data) {
    INSTANCES.remove(data);
  }
  
  
  private MainTabControl tab;
  @NonNull private ObjectProperty<KeyState> keyState = new SimpleObjectProperty<>(KeyState.NONE);
  
  @NonNull private State state = States.NONE;
  
  
  private StateMachine2(MainTabControl tab) {
    this.tab = tab;
  }
  
  @Override
  public void handle(InputEvent event) {
//    if(!event.getEventType().equals(MouseEvent.MOUSE_MOVED)) MessageBus.getInstance().send(new TraceMessage(StateMachine2.class, tab.getText() + " Event: " + event.getSource().getClass().getSimpleName() + " : " + event.getEventType()));
    if (event instanceof MouseEvent) updateKeyState((MouseEvent) event);
    if (event instanceof ScrollEvent) updateKeyState((ScrollEvent) event);
  
    handleElementManagment(event);
    updateState(event);
  
    if (state.handle(event)) event.consume();
  }
  
  private void updateKeyState(MouseEvent event) {
    if (event.isShiftDown()) keyState.setValue(KeyState.SHIFT);
    else if (event.isAltDown()) keyState.setValue(KeyState.ALT);
    else if (event.isMetaDown()) keyState.setValue(KeyState.META);
    else if (event.isControlDown()) keyState.setValue(KeyState.CTRL);
    else keyState.setValue(KeyState.NONE);
  }
  
  private void updateKeyState(ScrollEvent event) {
    if (event.isShiftDown()) keyState.setValue(KeyState.SHIFT);
    else if (event.isAltDown()) keyState.setValue(KeyState.ALT);
    else if (event.isMetaDown()) keyState.setValue(KeyState.META);
    else if (event.isControlDown()) keyState.setValue(KeyState.CTRL);
    else keyState.setValue(KeyState.NONE);
  }
  
  private void updateState(InputEvent event) {
    Object src = event.getSource();
    State state = States.NONE;
    if (keyState.get().equals(KeyState.CTRL) && src instanceof Deletable) state = States.DELETE;
    else if (keyState.get().equals(KeyState.NONE) && src instanceof Moveable) state = States.MOVE;
    else if (keyState.get().equals(KeyState.NONE) && src instanceof Resizeable) state = States.RESIZE;
    else if (keyState.get().equals(KeyState.SHIFT) && src instanceof Rotateable) state = States.ROTATE;
    else if ((Utilities.isMac() && keyState.get().equals(KeyState.META)) || (!Utilities.isMac() && keyState.get().equals(KeyState.CTRL))) state = States.ZOOM; //TODO
    
    changeState(event, state);
  }
  
  private void changeState(InputEvent event, State newState) {
    if (this.state == newState) return;
    this.state.leave(((Node) event.getSource()).getScene());
//    MessageBus.getInstance().send(new TraceMessage(StateMachine2.class, "Switch State: " + this.state.getClass().getSimpleName() + " -> " + newState.getClass().getSimpleName()));
    this.state = newState;
    this.state.enter(((Node) event.getSource()).getScene());
  }
  
  private void handleElementManagment(InputEvent event) {
    Object src = event.getSource();
    EventType<? extends Event> type = event.getEventType();
    if (type.equals(MouseEvent.MOUSE_PRESSED)) ElementManager.getInstance(tab.getData()).clearSelectedElement();
    if (src instanceof Hoverable) {
      if (type.equals(MouseEvent.MOUSE_ENTERED)) ElementManager.getInstance(tab.getData()).setHoveredElement((Hoverable) src);
      if (type.equals(MouseEvent.MOUSE_EXITED)) ElementManager.getInstance(tab.getData()).clearHoveredElement();
    }
    
    if (src instanceof Selectable) {
      if (type.equals(MouseEvent.MOUSE_PRESSED)) ElementManager.getInstance(tab.getData()).setSelectedElement((Selectable) src);
    }
  }
  
  
  public void leave(Scene scene) {
    state.leave(scene);
    MessageBus.getInstance().send(new TraceMessage(StateMachine2.class, tab.getText() + " leave"));
  }
  
  public void enter(Scene scene) {
    MessageBus.getInstance().send(new TraceMessage(StateMachine2.class, tab.getText() + " enter"));
    state.enter(scene);
  }
}
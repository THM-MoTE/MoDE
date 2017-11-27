package de.thm.mni.mote.mode.frontend.editor.statemachine;

import de.thm.mni.mhpp11.smbj.logging.messages.TraceMessage;
import de.thm.mni.mhpp11.smbj.manager.ActorManager;
import de.thm.mni.mote.mode.frontend.controls.MainTabControl;
import de.thm.mni.mote.mode.frontend.editor.actionmanager.ActionManager;
import de.thm.mni.mote.mode.frontend.editor.actionmanager.commands.Command;
import de.thm.mni.mote.mode.frontend.editor.elementmanager.ElementManager;
import de.thm.mni.mote.mode.frontend.editor.elementmanager.interfaces.Hoverable;
import de.thm.mni.mote.mode.frontend.editor.elementmanager.interfaces.Selectable;
import de.thm.mni.mote.mode.frontend.editor.statemachine.interfaces.*;
import de.thm.mni.mote.mode.frontend.editor.statemachine.states.KeyState;
import de.thm.mni.mote.mode.frontend.editor.statemachine.states.State;
import de.thm.mni.mote.mode.frontend.editor.statemachine.states.States;
import de.thm.mni.mote.mode.frontend.utilities.ActiveInstance;
import de.thm.mni.mote.mode.frontend.utilities.ActiveInstanceManager;
import de.thm.mni.mote.mode.modelica.MoContainer;
import de.thm.mni.mote.mode.util.Utilities;
import javafx.beans.property.BooleanProperty;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleBooleanProperty;
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
import org.apache.commons.lang3.NotImplementedException;

/**
 * Created by Marcel Hoppe on 15.11.16.
 */

@Getter
public class StateMachine extends ActiveInstance implements EventHandler<InputEvent> {
  
  @Getter
  private static ActiveInstanceManager<StateMachine> instanceManager = new ActiveInstanceManager<StateMachine>() {
    @Override
    public void create(MoContainer container) {
      throw new NotImplementedException("");
    }
  
    @Override
    public void create(Scene scene, MainTabControl tab, MoContainer container) {
      if(instances.containsKey(container)) throw new RuntimeException("Already created!");
  
      instances.put(container, new StateMachine(scene, tab, container));
    }
  };
  
  
  public BooleanProperty active = new SimpleBooleanProperty(false);
  private Boolean freezeState = false;
  private Node target;
  private final MoContainer data;

  private Scene scene;
  private MainTabControl tab;
  
  private EventType<? extends Event> eventToSkip = null;
  
  @NonNull private ObjectProperty<KeyState> keyState = new SimpleObjectProperty<>(KeyState.NONE);
  
  @NonNull private State state = States.NONE;
  
  
  private StateMachine(Scene scene, MainTabControl tab, MoContainer container) {
    this.scene = scene;
    this.tab = tab;
    this.data = container;
  }
  
  @Override
  public void handle(InputEvent event) {
    handleElementManagement(event, freezeState);
    if (eventToSkip != null && event.getEventType() == eventToSkip) {
      eventToSkip = null;
      event.consume();
      return;
    }
    if (!freezeState) {
      //if (event.getSource() instanceof FXMoDiagramMoGroup && event.getEventType().equals(MouseEvent.MOUSE_MOVED)) return;
      //if (!event.getEventType().equals(MouseEvent.MOUSE_MOVED)) ActorManager.getInstance().send(new TraceMessage(StateMachine.class, tab.getText() + " Event: " + event.getSource().getClass().getSimpleName() + " : " + event.getEventType()));
      if (event instanceof MouseEvent) updateKeyState((MouseEvent) event);
      if (event instanceof ScrollEvent) updateKeyState((ScrollEvent) event);
      
      updateState(event);
    }
    
    Node target = findTarget(event);
    
    if (this.freezeState) {
      if (target == null || !this.target.getClass().isAssignableFrom(target.getClass()))
        target = this.target;
    } else {
      this.target = target;
    }

//    mousePositionHelp(event);
        
    Command c = state.handle(this, target, event);
    if (c != null) {
      ActionManager.getInstanceManager().get(this.data).addUndo(c);
      event.consume();
    }
  }
  
  public void switchToNone() {
    this.state = States.NONE;
    ElementManager.getInstanceManager().get(this.data).clearSelectedElement();
  }
  
  private void updateKeyState(MouseEvent event) {
    updateKeyState(event.isShiftDown(), event.isAltDown(), event.isMetaDown(), event.isControlDown());
  }
  
  private void updateKeyState(ScrollEvent event) {
    updateKeyState(event.isShiftDown(), event.isAltDown(), event.isMetaDown(), event.isControlDown());
  }
  
  private void updateKeyState(Boolean isShiftDown, Boolean isAltDown, Boolean isMetaDown, Boolean isControlDown) {
    if (isShiftDown) keyState.setValue(KeyState.SHIFT);
    else if (isAltDown) keyState.setValue(KeyState.ALT);
    else if (isMetaDown) keyState.setValue(KeyState.META);
    else if (isControlDown) keyState.setValue(KeyState.CTRL);
    else keyState.setValue(KeyState.NONE);
  }
  
  private void updateState(InputEvent event) {
    Node target = (Node) event.getTarget();
    State state = States.NONE;
    if (event instanceof MouseEvent) {
      MouseEvent e = (MouseEvent) event;
      if (!(this.freezeState && this.state == States.MOVE) && e.getEventType().equals(MouseEvent.MOUSE_CLICKED) && (keyState.get().equals(KeyState.SHIFT) || e.getClickCount() % 2 == 0) && hasMatchingParent(target, Actionable.class))
        state = States.ACTION;
    }
    if (state == States.NONE) {
      if (keyState.get().equals(KeyState.CTRL) && hasMatchingParent(target, Deletable.class)) state = States.DELETE;
      else if (keyState.get().equals(KeyState.NONE) && hasMatchingParent(target, Resizeable.class)) state = States.RESIZE;
      else if (keyState.get().equals(KeyState.SHIFT) && hasMatchingParent(target, Rotateable.class)) state = States.ROTATE;
      else if ((keyState.get().equals(KeyState.NONE) || keyState.get().equals(KeyState.SHIFT)) && hasMatchingParent(target, Moveable.class)) state = States.MOVE;
      else if ((Utilities.isMac() && keyState.get().equals(KeyState.META)) || (!Utilities.isMac() && keyState.get().equals(KeyState.CTRL))) state = States.ZOOM; //TODO
    }
    changeState(state);
  }
  
  private void handleElementManagement(InputEvent event, Boolean fixedSelection) {
    handleElementManagement(event, (Node) event.getTarget(), fixedSelection);
  }
  
  private void handleElementManagement(InputEvent event, Node target, Boolean fixedSelection) {
    EventType<? extends Event> type = event.getEventType();
    ElementManager em = ElementManager.getInstanceManager().get(this.data);
  
    if (type.equals(MouseEvent.MOUSE_ENTERED) || type.equals(MouseEvent.MOUSE_MOVED) || type.equals(MouseEvent.MOUSE_EXITED)) {
      if (hasMatchingParent(target, Hoverable.class)) {
        if (type.equals(MouseEvent.MOUSE_ENTERED) || type.equals(MouseEvent.MOUSE_MOVED))
          em.setHoveredElement((Hoverable) getMatchingParent(target, Hoverable.class));
        if (type.equals(MouseEvent.MOUSE_EXITED))
          em.clearHoveredElement();
      } else {
        if(type.equals(MouseEvent.MOUSE_MOVED))
          em.clearHoveredElement();
      }
    }
  
    if (type.equals(MouseEvent.MOUSE_PRESSED)) {
      if (!fixedSelection) {
        if (hasMatchingParent(target, Selectable.class)) {
          em.setSelectedElement((Selectable) getMatchingParent(target, Selectable.class));
        } else {
          em.clearSelectedElement();
        }
      }
    }
  }
  
  
  private Node findTarget(InputEvent event) {
    if (state.equals(States.ACTION)) return getMatchingParent((Node) event.getTarget(), Actionable.class);
    if (state.equals(States.DELETE)) return getMatchingParent((Node) event.getTarget(), Deletable.class);
    if (state.equals(States.MOVE)) return getMatchingParent((Node) event.getTarget(), Moveable.class);
    if (state.equals(States.RESIZE)) return getMatchingParent((Node) event.getTarget(), Resizeable.class);
    if (state.equals(States.ROTATE)) return getMatchingParent((Node) event.getTarget(), Rotateable.class);
    if (state.equals(States.ZOOM)) return getMatchingParent((Node) event.getTarget(), Zoomable.class);
    return (Node) event.getTarget();
  }
  
  private boolean hasMatchingParent(Node target, Class<?> thatClass) {
    return getMatchingParent(target, thatClass) != null;
  }
  
  private Node getMatchingParent(Node target, Class<?> thatClass) {
    if (target == null) return null;
    if (thatClass.isAssignableFrom(target.getClass())) return target;
    return getMatchingParent(target.getParent(), thatClass);
  }
  
  private void changeState(State newState) {
    if (this.state == newState) return;
    this.state.leave(this.scene);
    ActorManager.getInstance().send(new TraceMessage(StateMachine.class, "Switch State: " + this.state.getClass().getSimpleName() + " -> " + newState.getClass().getSimpleName()));
    this.state = newState;
    this.state.enter(this.scene);
  }
  
  @Override
  public void onDeactivation() {
    state.leave(this.scene);
    ActorManager.getInstance().send(new TraceMessage(StateMachine.class, tab.getText() + " leave"));
  }
  
  @Override
  public void onActivation() {
    ActorManager.getInstance().send(new TraceMessage(StateMachine.class, tab.getText() + " enter"));
    state.enter(this.scene);
  }
  
  public void freeze() {
    this.freezeState = true;
  }
  
  public void unfreeze() {
    this.freezeState = false;
  }
  
  public void skipNextEvent(EventType<? extends Event> type) {
    this.eventToSkip = type;
  }
}
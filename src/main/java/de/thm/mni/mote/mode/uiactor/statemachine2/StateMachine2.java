package de.thm.mni.mote.mode.uiactor.statemachine2;

import de.thm.mni.mhpp11.jActor.actors.logging.messages.TraceMessage;
import de.thm.mni.mhpp11.jActor.actors.messagebus.MessageBus;
import de.thm.mni.mote.mode.modelica.MoContainer;
import de.thm.mni.mote.mode.uiactor.control.MainTabControl;
import de.thm.mni.mote.mode.uiactor.elementmanager.ElementManager;
import de.thm.mni.mote.mode.uiactor.elementmanager.interfaces.Hoverable;
import de.thm.mni.mote.mode.uiactor.elementmanager.interfaces.Selectable;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.event.EventType;
import javafx.scene.input.MouseEvent;
import lombok.Getter;

import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;

/**
 * Created by hobbypunk on 15.11.16.
 */

@Getter
public class StateMachine2 implements EventHandler<Event> {
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
  
  private StateMachine2(MainTabControl tab) {
    this.tab = tab;
  }
  
  @Override
  public void handle(Event event) {
    if (event.getEventType().equals(MouseEvent.MOUSE_MOVED)) return;
    event.consume();
    MessageBus.getInstance().send(new TraceMessage(StateMachine2.class, tab.getText() + " Event: " + event.getSource().getClass().getSimpleName() + " : " + event.getEventType()));
    handleElementManagment(event);
  }
  
  private void handleElementManagment(Event event) {
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
  
  public void leave() {
    MessageBus.getInstance().send(new TraceMessage(StateMachine2.class, tab.getText() + " leave"));
  }
  
  public void enter() {
    MessageBus.getInstance().send(new TraceMessage(StateMachine2.class, tab.getText() + " enter"));
  }
}
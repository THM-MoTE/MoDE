package de.thm.mni.mhpp11.control.icon.handlers;

import de.thm.mni.mhpp11.control.icon.MoDiagramGroup;
import de.thm.mni.mhpp11.control.icon.MoIconGroup;
import de.thm.mni.mhpp11.shape.Line;
import de.thm.mni.mhpp11.statemachine.StateMachine;
import de.thm.mni.mhpp11.statemachine.states.State;
import de.thm.mni.mhpp11.statemachine.states.connection.ConnectionCreateState;
import de.thm.mni.mhpp11.statemachine.states.connection.ConnectionModifyState;
import de.thm.mni.mhpp11.statemachine.states.connection.ConnectionMoveState;
import de.thm.mni.mhpp11.statemachine.states.diagram.DiagramZoomState;
import de.thm.mni.mhpp11.statemachine.states.model.ModelModifyState;
import de.thm.mni.mhpp11.statemachine.states.model.ModelMoveState;
import de.thm.mni.mhpp11.statemachine.states.model.ModelOpenState;
import de.thm.mni.mhpp11.util.parser.models.MoConnector;
import de.thm.mni.mhpp11.util.ui.MyMouseEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.event.EventType;
import javafx.scene.Node;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.input.ScrollEvent;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by hobbypunk on 16.11.16.
 */

@Getter
@Setter(AccessLevel.PROTECTED)
@FieldDefaults(level = AccessLevel.PRIVATE)
public class StateHandler implements EventHandler<Event> {
  final StateMachine sm;
  private final MoDiagramGroup parent;
  State<? extends Event, ? extends Node> state;
  
  static private Map<MoDiagramGroup, StateHandler> INSTANCES = new HashMap<>();
  
  public static StateHandler getInstance(MoDiagramGroup parent) {
    if (!INSTANCES.containsKey(parent)) {
      INSTANCES.put(parent, new StateHandler(parent));
    }
    return INSTANCES.get(parent);
  }
  
  private StateHandler(MoDiagramGroup parent) {
    this.sm = StateMachine.getInstance();
    this.parent = parent;
  }
  
  public void handle(Event event) {
    if (event.isConsumed()) return;
    
    EventType type = event.getEventType();
    if (type.equals(MouseEvent.MOUSE_CLICKED) && ((MouseEvent) event).getClickCount() % 2 == 0)
      type = MyMouseEvent.MOUSE_DOUBLE_CLICKED;
    
    Node src = (Node) event.getSource();
    if (event.getEventType().equals(MouseEvent.MOUSE_CLICKED)) {
      String clazz = src.getClass().getSimpleName();
      if (src instanceof MoIconGroup) clazz = ((MoIconGroup) src).getMoClass().getClass().getSimpleName();
      System.out.println("Node: " + clazz + " State: " + getSm().getCurState().getClass().getSimpleName());
    }
    
    Boolean handle = handleConnector(src, type, event);
    if (!handle) handle = handleLine(src, type, event);
    if (!handle) handle = handleModel(src, type, event);
    if (!handle) handle = handleDiagram(src, type, event);
    
    if (handle) {
      event.consume();
      this.sm.handle(event);
    }
  }
  
  
  private Boolean handleLine(Node src, EventType type, Event event) {
    if (src instanceof Line) {
      Line line = (Line) src;
      
      if (this.sm.isSwitchAllowed(type, ConnectionModifyState.class)) {        //click
        this.sm.switchToState(new ConnectionModifyState(getParent(), line));
        return true;
      } else if (this.sm.isSwitchAllowed(type, ConnectionMoveState.class)) {   //press && drag
        this.sm.switchToState(new ConnectionMoveState(getParent(), line), false);
        return true;
      } else if (this.sm.isSwitchAllowed(type, ConnectionModifyState.class)) { //release
        return true;
      }
    }
    return false;
  }
  
  private Boolean handleConnector(Node src, EventType type, Event event) {
    if (src instanceof MoIconGroup && ((MoIconGroup) src).getMoClass() instanceof MoConnector) {
      if (this.sm.isSwitchAllowed(type, ConnectionCreateState.class)) {          //click
        this.sm.switchToState(new ConnectionCreateState(getParent(), (MoIconGroup) src), false);
        return true;
      }
    }
    return false;
  }
  
  private Boolean handleModel(Node src, EventType type, Event event) {
    if (src instanceof MoIconGroup) {
      MoIconGroup mig = (MoIconGroup) src;
      if (this.sm.isSwitchAllowed(type, ModelOpenState.class)) {           //double click
        this.sm.switchToState(new ModelOpenState(mig));
        return true;
      } else if (this.sm.isSwitchAllowed(type, ModelMoveState.class)) {    //Press & Drag
        this.sm.switchToState(new ModelMoveState(getParent(), mig), false);
        return true;
      } else if (this.sm.isSwitchAllowed(type, ModelModifyState.class)) {  //click & Release
        return true;
      }
    }
    return false;
  }
  
  private Boolean handleDiagram(Node src, EventType type, Event event) {
    if (src instanceof MoDiagramGroup) {
      MoDiagramGroup mdg = (MoDiagramGroup) src;
      
      if (event.getEventType().equals(KeyEvent.KEY_PRESSED)) System.out.println(((KeyEvent) event).getCharacter());
      
      if (this.sm.isSwitchToNoStateAllowed(type)) {
        this.sm.switchToNoState();
        return true;
      } else if (event.getEventType().equals(ScrollEvent.SCROLL) && ((ScrollEvent) event).isControlDown()) {
        this.sm.switchToState(new DiagramZoomState(mdg));
        return true;
      }
    }
    return false;
  }
}

package de.thm.mni.mote.mode.uiactor.handlers;

import de.thm.mni.mote.mode.modelica.MoConnector;
import de.thm.mni.mote.mode.parser.ParserException;
import de.thm.mni.mote.mode.uiactor.control.modelica.MoDiagramGroup;
import de.thm.mni.mote.mode.uiactor.control.modelica.MoIconGroup;
import de.thm.mni.mote.mode.uiactor.shape.Line;
import de.thm.mni.mote.mode.uiactor.statemachine.StateMachine;
import de.thm.mni.mote.mode.uiactor.statemachine.states.State;
import de.thm.mni.mote.mode.uiactor.statemachine.states.connection.*;
import de.thm.mni.mote.mode.uiactor.statemachine.states.diagram.DiagramZoomState;
import de.thm.mni.mote.mode.uiactor.statemachine.states.model.ModelDeleteState;
import de.thm.mni.mote.mode.uiactor.statemachine.states.model.ModelModifyState;
import de.thm.mni.mote.mode.uiactor.statemachine.states.model.ModelMoveState;
import de.thm.mni.mote.mode.uiactor.statemachine.states.model.ModelOpenState;
import de.thm.mni.mote.mode.uiactor.utilities.MyEvents;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.event.EventType;
import javafx.scene.Node;
import javafx.scene.input.MouseEvent;
import javafx.scene.input.ScrollEvent;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

/**
 * Created by hobbypunk on 16.11.16.
 */

@Getter
@Setter(AccessLevel.PROTECTED)
@FieldDefaults(level = AccessLevel.PRIVATE)
public class StateHandler implements EventHandler<Event> {
  final StateMachine sm = StateMachine.getInstance();
  private MoDiagramGroup parent = null;
  State<? extends Event, ? extends Node> state;
  
  static private StateHandler INSTANCE = new StateHandler();
  
  public static StateHandler getInstance() {
    return getInstance(null);
  }
  
  public static StateHandler getInstance(MoDiagramGroup parent) {
    if (parent != null && (INSTANCE.getParent() == null || !INSTANCE.getParent().equals(parent)))
      INSTANCE.setParent(parent);
    return INSTANCE;
  }
  
  public void setParent(MoDiagramGroup parent) {
    this.sm.switchToNoState();
    this.parent = parent;
  }
  
  @SuppressWarnings("ConstantConditions")
  public void handle(Event event) {
    if (this.parent == null || event.isConsumed()) return;
    
    EventType type = event.getEventType();
    
    if (type.equals(MouseEvent.MOUSE_CLICKED) && ((MouseEvent) event).isAltDown()) type = MyEvents.MOUSE_ALT_CLICKED;
    else if (type.equals(MouseEvent.MOUSE_CLICKED) && ((MouseEvent) event).isShiftDown()) type = MyEvents.MOUSE_SHIFT_CLICKED;
    else if (type.equals(MouseEvent.MOUSE_CLICKED) && ((MouseEvent) event).isControlDown()) type = MyEvents.MOUSE_CTRL_CLICKED;
    else if (type.equals(MouseEvent.MOUSE_CLICKED) && ((MouseEvent) event).getClickCount() % 2 == 0) type = MyEvents.MOUSE_DOUBLE_CLICKED;
    else if (type.equals(ScrollEvent.SCROLL) && ((ScrollEvent) event).isShiftDown()) type = MyEvents.SCROLL_SHIFT;
    
    Node src = (Node) event.getSource();
//    if (event.getEventType().equals(MouseEvent.MOUSE_CLICKED)) {
//      String clazz = src.getClass().getSimpleName();
//      if (src instanceof MoIconGroup) try {
//        clazz = ((MoIconGroup) src).getMoClass().getClass().getSimpleName();
//      } catch (ParserException e) {
//        e.printStackTrace(); //TODO send msg
//      }
//    }
    
    Boolean handle = handleConnector(src, type, event);
    if (!handle) handle = handleLine(src, type, event);
    if (!handle) handle = handleModel(src, type, event);
    if (!handle) handle = handleDiagram(src, type, event);
    
    if (handle) {
      event.consume();
      this.sm.handle(event);
    }
  }
  
  @SuppressWarnings("unchecked")
  private Boolean handleLine(Node src, EventType type, Event event) {
    if (src instanceof Line) {
      Line line = (Line) src;
      
      if (this.sm.isSwitchAllowed(type, ConnectionModifyState.class)) {        //click
        this.sm.switchToState(new ConnectionModifyState(getParent(), line));
        return true;
      } else if (this.sm.isSwitchAllowed(type, ConnectionMoveState.class)) {   //press && drag
        this.sm.switchToState(new ConnectionMoveState(getParent(), line), false);
        return true;
      } else if (this.sm.isSwitchAllowed(type, ConnectionDeleteState.class)) { //strg+click
        this.sm.switchToState(new ConnectionDeleteState(getParent(), line), false);
        return true;
      } else if (this.sm.isSwitchAllowed(type, ConnectionAddPointState.class)) { //double click & shift+click
        this.sm.switchToState(new ConnectionAddPointState(getParent(), line), false);
        return true;
      }
    }
    return false;
  }
  
  @SuppressWarnings("unchecked")
  private Boolean handleConnector(Node src, EventType type, Event event) {
    try {
      if (src instanceof MoIconGroup && ((MoIconGroup) src).getMoClass() instanceof MoConnector) {
        if (this.sm.isSwitchAllowed(type, ConnectionCreateState.class)) {          //click
          this.sm.switchToState(new ConnectionCreateState(getParent(), (MoIconGroup) src), false);
          return true;
        }
      }
    } catch (ParserException e) {
      e.printStackTrace(); //TODO send msg
    }
    return false;
  }
  
  @SuppressWarnings("unchecked")
  private Boolean handleModel(Node src, EventType type, Event event) {
    if (src instanceof MoIconGroup && src.getParent().getParent() instanceof MoDiagramGroup) {
      MoIconGroup mig = (MoIconGroup) src;
      if (this.sm.isSwitchAllowed(type, ModelOpenState.class)) {           //double click
        this.sm.switchToState(new ModelOpenState(getParent(), mig));
        return true;
      } else if (this.sm.isSwitchAllowed(type, ModelMoveState.class)) {    //Press & Drag
        this.sm.switchToState(new ModelMoveState(getParent(), mig), false);
        return true;
      } else if (this.sm.isSwitchAllowed(type, ModelDeleteState.class)) { //strg + click
        this.sm.switchToState(new ModelDeleteState(getParent(), mig), false);
        return true;
      } else if (this.sm.isSwitchAllowed(type, ModelModifyState.class)) {  //click & Release
        return true;
      }
    }
    return false;
  }
  
  @SuppressWarnings("unchecked")
  private Boolean handleDiagram(Node src, EventType type, Event event) {
    if (src instanceof MoDiagramGroup) {
      MoDiagramGroup mdg = (MoDiagramGroup) src;
      
      if (this.sm.isSwitchAllowed(type, DiagramZoomState.class)) {      //shift + scroll
        this.sm.switchToState(new DiagramZoomState(mdg));
        return true;
      } else if (this.sm.isSwitchToNoStateAllowed(type)) {
        this.sm.switchToNoState();
        return true;
      }
    }
    return false;
  }
}

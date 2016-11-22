package de.thm.mni.mhpp11.util.ui;

import javafx.beans.NamedArg;
import javafx.event.EventTarget;
import javafx.event.EventType;
import javafx.scene.input.MouseButton;
import javafx.scene.input.MouseEvent;
import javafx.scene.input.PickResult;

/**
 * Created by hobbypunk on 18.11.16.
 */
public class MyMouseEvent extends MouseEvent {
  
  public static final EventType<MyMouseEvent> MOUSE_ALT_CLICKED = new EventType<>(MouseEvent.ANY, "MOUSE_ALT_CLICKED");
  public static final EventType<MyMouseEvent> MOUSE_CTRL_CLICKED = new EventType<>(MouseEvent.ANY, "MOUSE_CTRL_CLICKED");
  public static final EventType<MyMouseEvent> MOUSE_SHIFT_CLICKED = new EventType<>(MouseEvent.ANY, "MOUSE_SHIFT_CLICKED");

  public static final EventType<MyMouseEvent> MOUSE_DOUBLE_CLICKED = new EventType<>(MouseEvent.ANY, "MOUSE_DOUBLE_CLICKED");
  
  
  public MyMouseEvent(@NamedArg("eventType") EventType<? extends MouseEvent> eventType, @NamedArg("x") double x, @NamedArg("y") double y, @NamedArg("screenX") double screenX, @NamedArg("screenY") double screenY, @NamedArg("button") MouseButton button, @NamedArg("clickCount") int clickCount, @NamedArg("shiftDown") boolean shiftDown, @NamedArg("controlDown") boolean controlDown, @NamedArg("altDown") boolean altDown, @NamedArg("metaDown") boolean metaDown, @NamedArg("primaryButtonDown") boolean primaryButtonDown, @NamedArg("middleButtonDown") boolean middleButtonDown, @NamedArg("secondaryButtonDown") boolean secondaryButtonDown, @NamedArg("synthesized") boolean synthesized, @NamedArg("popupTrigger") boolean popupTrigger, @NamedArg("stillSincePress") boolean stillSincePress, @NamedArg("pickResult") PickResult pickResult) {
    super(eventType, x, y, screenX, screenY, button, clickCount, shiftDown, controlDown, altDown, metaDown, primaryButtonDown, middleButtonDown, secondaryButtonDown, synthesized, popupTrigger, stillSincePress, pickResult);
  }
  
  public MyMouseEvent(@NamedArg("source") Object source, @NamedArg("target") EventTarget target, @NamedArg("eventType") EventType<? extends MouseEvent> eventType, @NamedArg("x") double x, @NamedArg("y") double y, @NamedArg("screenX") double screenX, @NamedArg("screenY") double screenY, @NamedArg("button") MouseButton button, @NamedArg("clickCount") int clickCount, @NamedArg("shiftDown") boolean shiftDown, @NamedArg("controlDown") boolean controlDown, @NamedArg("altDown") boolean altDown, @NamedArg("metaDown") boolean metaDown, @NamedArg("primaryButtonDown") boolean primaryButtonDown, @NamedArg("middleButtonDown") boolean middleButtonDown, @NamedArg("secondaryButtonDown") boolean secondaryButtonDown, @NamedArg("synthesized") boolean synthesized, @NamedArg("popupTrigger") boolean popupTrigger, @NamedArg("stillSincePress") boolean stillSincePress, @NamedArg("pickResult") PickResult pickResult) {
    super(source, target, eventType, x, y, screenX, screenY, button, clickCount, shiftDown, controlDown, altDown, metaDown, primaryButtonDown, middleButtonDown, secondaryButtonDown, synthesized, popupTrigger, stillSincePress, pickResult);
  }
}

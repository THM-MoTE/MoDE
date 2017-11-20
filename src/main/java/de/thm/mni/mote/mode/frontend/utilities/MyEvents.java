package de.thm.mni.mote.mode.frontend.utilities;

import javafx.event.EventType;
import javafx.scene.input.MouseEvent;
import javafx.scene.input.ScrollEvent;

/**
 * Created by Marcel Hoppe on 18.11.16.
 */
class MyEvents {
  
  public static final EventType<MouseEvent> MOUSE_ALT_CLICKED = new EventType<>(MouseEvent.ANY, "MOUSE_ALT_CLICKED");
  public static final EventType<MouseEvent> MOUSE_CTRL_CLICKED = new EventType<>(MouseEvent.ANY, "MOUSE_CTRL_CLICKED");
  public static final EventType<MouseEvent> MOUSE_SHIFT_CLICKED = new EventType<>(MouseEvent.ANY, "MOUSE_SHIFT_CLICKED");
  
  public static final EventType<MouseEvent> MOUSE_DOUBLE_CLICKED = new EventType<>(MouseEvent.ANY, "MOUSE_DOUBLE_CLICKED");
  
  public static final EventType<ScrollEvent> SCROLL_SHIFT = new EventType<>(ScrollEvent.ANY, "SCROLL_SHIFT");
  
}

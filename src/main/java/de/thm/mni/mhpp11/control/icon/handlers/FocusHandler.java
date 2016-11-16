package de.thm.mni.mhpp11.control.icon.handlers;

import de.thm.mni.mhpp11.shape.interfaces.Focusable;
import javafx.event.EventHandler;
import javafx.scene.input.MouseEvent;

/**
 * Created by hobbypunk on 08.11.16.
 */
public class FocusHandler implements EventHandler<MouseEvent> {
  private static FocusHandler ourInstance = new FocusHandler();
  
  public static FocusHandler getInstance() {
    return ourInstance;
  }
  
  private Focusable focused = null;
  
  private FocusHandler() {}
  
  @Override
  public void handle(MouseEvent event) {
    if (event.getSource() instanceof Focusable) {
      if (focused != event.getSource()) {
        setFocus((Focusable) event.getSource());
      }
      event.consume();
    } else {
      clearFocus();
    }
  }
  
  public void setFocus(Focusable source) {
    clearFocus();
    focused = source;
    focused.setFocus();
  }
  
  public void clearFocus() {
    if (focused != null) {
      focused.clearFocus();
      focused = null;
    }
  }
}

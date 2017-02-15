package de.thm.mni.mote.mode.uiactor.statemachine2.states.implementations;

import de.thm.mni.mote.mode.uiactor.statemachine2.interfaces.Zoomable;
import de.thm.mni.mote.mode.uiactor.statemachine2.states.State;
import javafx.application.Platform;
import javafx.scene.Cursor;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ScrollPane;
import javafx.scene.input.InputEvent;
import javafx.scene.input.ScrollEvent;

/**
 * Created by hobbypunk on 15.02.17.
 */
public class ZoomState extends State {
  
  @Override
  public void enter(Scene scene) {
    Platform.runLater(() -> scene.setCursor(Cursor.NE_RESIZE));
  }
  
  @Override
  public boolean handle(InputEvent event) {
    if (event instanceof ScrollEvent) {
      Parent parent = null;
      if (event.getSource() instanceof ScrollPane)
        parent = (Parent) ((ScrollPane) event.getSource()).getContent();
      else if (event.getSource() instanceof Parent)
        parent = (Parent) event.getSource();
      Zoomable z = findZoomable(parent);
      if (z == null) return false;
      
      z.zoom((ScrollEvent) event);
    }
    return true;
  }
  
  private Zoomable findZoomable(Parent that) {
    if (that == null) return null;
    if (that instanceof Zoomable) return (Zoomable) that;
    for (Node child : that.getChildrenUnmodifiable()) {
      if (child instanceof Parent) {
        Zoomable z = findZoomable((Parent) child);
        if (z != null) return z;
      }
    }
    return null;
  }
}

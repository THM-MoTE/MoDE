package de.thm.mni.mote.mode.uiactor.editor.statemachine.states.impl;

import de.thm.mni.mote.mode.uiactor.editor.actionmanager.commands.Command;
import de.thm.mni.mote.mode.uiactor.editor.statemachine.StateMachine;
import de.thm.mni.mote.mode.uiactor.editor.statemachine.interfaces.Zoomable;
import de.thm.mni.mote.mode.uiactor.editor.statemachine.states.State;
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
  public Command handle(StateMachine sm, Node target, InputEvent event) {
    if (event instanceof ScrollEvent) {
      Parent parent = null;
      if (event.getSource() instanceof ScrollPane)
        parent = (Parent) ((ScrollPane) event.getSource()).getContent();
      else if (event.getSource() instanceof Parent)
        parent = (Parent) event.getSource();
      Zoomable z = findZoomable(parent);
      if (z == null) return null;
      
      z.zoom((ScrollEvent) event);
    }
    return Command.IGNORE;
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

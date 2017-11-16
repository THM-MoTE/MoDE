package de.thm.mni.mote.mode.frontend.editor.statemachine.states.impl;

import de.thm.mni.mote.mode.frontend.editor.actionmanager.commands.Command;
import de.thm.mni.mote.mode.frontend.editor.statemachine.StateMachine;
import de.thm.mni.mote.mode.frontend.editor.statemachine.interfaces.Deletable;
import de.thm.mni.mote.mode.frontend.editor.statemachine.states.State;
import javafx.application.Platform;
import javafx.scene.Cursor;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.input.InputEvent;
import javafx.scene.input.MouseEvent;

/**
 * Created by hobbypunk on 15.02.17.
 */
public class DeleteState extends State {
  @Override
  public void enter(Scene scene) {
    Platform.runLater(() -> scene.setCursor(Cursor.CROSSHAIR));
  }
  
  @Override
  public Command handle(StateMachine sm, Node target, InputEvent event) {
    if (event.getEventType().equals(MouseEvent.MOUSE_CLICKED) && target != null && target instanceof Deletable) {
      Command c = ((Deletable) target).delete(event);
      sm.switchToNone();
      return c;
    }
    return null;
  }
}

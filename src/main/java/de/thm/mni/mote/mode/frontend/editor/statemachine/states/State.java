package de.thm.mni.mote.mode.frontend.editor.statemachine.states;

import de.thm.mni.mote.mode.frontend.editor.actionmanager.commands.Command;
import de.thm.mni.mote.mode.frontend.editor.statemachine.StateMachine;
import javafx.application.Platform;
import javafx.scene.Cursor;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.input.InputEvent;
import lombok.NonNull;

/**
 * Created by hobbypunk on 15.02.17.
 */
public abstract class State {
  
  public abstract void enter(Scene scene);
  
  public void leave(Scene scene) {
    if (scene != null) Platform.runLater(() -> scene.setCursor(Cursor.DEFAULT));
  }
  
  public abstract Command handle(@NonNull StateMachine sm, @NonNull Node target, @NonNull InputEvent event);
}

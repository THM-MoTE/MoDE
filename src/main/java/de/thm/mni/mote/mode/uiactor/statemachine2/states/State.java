package de.thm.mni.mote.mode.uiactor.statemachine2.states;

import javafx.application.Platform;
import javafx.scene.Cursor;
import javafx.scene.Scene;
import javafx.scene.input.InputEvent;

/**
 * Created by hobbypunk on 15.02.17.
 */
public abstract class State {
  
  public abstract void enter(Scene scene);
  
  public void leave(Scene scene) {
    Platform.runLater(() -> scene.setCursor(Cursor.DEFAULT));
  }
  
  public abstract boolean handle(InputEvent event);
}

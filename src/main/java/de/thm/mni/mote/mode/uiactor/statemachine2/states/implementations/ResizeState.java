package de.thm.mni.mote.mode.uiactor.statemachine2.states.implementations;

import de.thm.mni.mote.mode.uiactor.statemachine2.states.State;
import javafx.application.Platform;
import javafx.scene.Cursor;
import javafx.scene.Scene;
import javafx.scene.input.InputEvent;

/**
 * Created by hobbypunk on 15.02.17.
 */
public class ResizeState extends State {
  @Override
  public void enter(Scene scene) {
    Platform.runLater(() -> scene.setCursor(Cursor.H_RESIZE));
  }
  
  @Override
  public boolean handle(InputEvent event) {
    return false;
    
  }
}

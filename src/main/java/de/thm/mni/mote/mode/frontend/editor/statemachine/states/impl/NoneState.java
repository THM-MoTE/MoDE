package de.thm.mni.mote.mode.frontend.editor.statemachine.states.impl;

import de.thm.mni.mote.mode.frontend.editor.actionmanager.commands.Command;
import de.thm.mni.mote.mode.frontend.editor.statemachine.StateMachine;
import de.thm.mni.mote.mode.frontend.editor.statemachine.states.State;
import javafx.application.Platform;
import javafx.scene.Cursor;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.input.InputEvent;

/**
 * Created by Marcel Hoppe on 15.02.17.
 */
public class NoneState extends State {
  @Override
  public void enter(Scene scene) {
    Platform.runLater(() -> scene.setCursor(Cursor.DEFAULT));
  }
  
  @Override
  public Command handle(StateMachine sm, Node target, InputEvent event) {
    return null;
  }
}

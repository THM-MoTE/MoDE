package de.thm.mni.mote.mode.frontend.editor.statemachine.states.impl;

import de.thm.mni.mote.mode.frontend.editor.actionmanager.commands.Command;
import de.thm.mni.mote.mode.frontend.editor.statemachine.StateMachine;
import de.thm.mni.mote.mode.frontend.editor.statemachine.interfaces.Actionable;
import de.thm.mni.mote.mode.frontend.editor.statemachine.states.State;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.input.InputEvent;
import lombok.NonNull;

/**
 * ActionState == double click or shift click
 * Created by Marcel Hoppe on 16.02.17.
 */
public class ActionState extends State {
  
  @Override
  public void enter(Scene scene) {}
  
  @Override
  public Command handle(@NonNull StateMachine sm, @NonNull Node target, @NonNull InputEvent event) {
    return target != null && target instanceof Actionable ? ((Actionable) target).action(sm, event) : null;
  }
}

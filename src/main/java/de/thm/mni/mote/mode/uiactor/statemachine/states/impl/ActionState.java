package de.thm.mni.mote.mode.uiactor.statemachine.states.impl;

/**
 * Created by hobbypunk on 16.02.17.
 */

import de.thm.mni.mote.mode.uiactor.statemachine.StateMachine;
import de.thm.mni.mote.mode.uiactor.statemachine.interfaces.Actionable;
import de.thm.mni.mote.mode.uiactor.statemachine.states.State;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.input.InputEvent;
import lombok.NonNull;

/**
 * ActionState == double click or shift click
 */
public class ActionState extends State {
  
  @Override
  public void enter(Scene scene) {}
  
  @Override
  public boolean handle(@NonNull StateMachine sm, @NonNull Node target, @NonNull InputEvent event) {
    return (target != null && target instanceof Actionable && ((Actionable) target).action(sm, event));
  }
}

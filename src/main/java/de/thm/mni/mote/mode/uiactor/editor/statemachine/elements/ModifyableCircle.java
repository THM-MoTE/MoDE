package de.thm.mni.mote.mode.uiactor.editor.statemachine.elements;

import de.thm.mni.mote.mode.uiactor.editor.actionmanager.commands.Command;
import de.thm.mni.mote.mode.uiactor.editor.statemachine.StateMachine;
import de.thm.mni.mote.mode.uiactor.editor.statemachine.interfaces.Rotateable;
import javafx.scene.input.InputEvent;
import javafx.scene.shape.Circle;

/**
 * Created by hobbypunk on 22.02.17.
 */
public class ModifyableCircle extends Circle implements Rotateable {
  @Override
  public Command rotate(StateMachine sm, InputEvent event) {
    return null;
  }
}

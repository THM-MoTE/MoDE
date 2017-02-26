package de.thm.mni.mote.mode.uiactor.editor.statemachine.interfaces;

import de.thm.mni.mote.mode.uiactor.editor.actionmanager.commands.Command;
import de.thm.mni.mote.mode.uiactor.editor.statemachine.StateMachine;
import javafx.scene.input.InputEvent;

/**
 * Created by hobbypunk on 16.02.17.
 */
public interface Actionable extends HandleEvent {
  
  Command action(StateMachine sm, InputEvent inputEvent);
}

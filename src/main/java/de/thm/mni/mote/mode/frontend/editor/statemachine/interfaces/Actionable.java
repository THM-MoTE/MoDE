package de.thm.mni.mote.mode.frontend.editor.statemachine.interfaces;

import de.thm.mni.mote.mode.frontend.editor.actionmanager.commands.Command;
import de.thm.mni.mote.mode.frontend.editor.statemachine.StateMachine;
import javafx.scene.input.InputEvent;

/**
 * Created by Marcel Hoppe on 16.02.17.
 */
public interface Actionable extends HandleEvent {
  
  Command action(StateMachine sm, InputEvent inputEvent);
}

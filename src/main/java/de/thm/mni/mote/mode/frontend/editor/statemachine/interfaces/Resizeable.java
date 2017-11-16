package de.thm.mni.mote.mode.frontend.editor.statemachine.interfaces;

import de.thm.mni.mote.mode.frontend.editor.actionmanager.commands.Command;
import de.thm.mni.mote.mode.frontend.editor.statemachine.StateMachine;
import javafx.scene.input.InputEvent;

/**
 * Created by hobbypunk on 15.02.17.
 */
public interface Resizeable extends HandleEvent {
  Command resize(StateMachine sm, InputEvent event);
}

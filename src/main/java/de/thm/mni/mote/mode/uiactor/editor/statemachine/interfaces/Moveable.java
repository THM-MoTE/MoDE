package de.thm.mni.mote.mode.uiactor.editor.statemachine.interfaces;

import de.thm.mni.mote.mode.uiactor.editor.actionmanager.commands.Command;
import de.thm.mni.mote.mode.uiactor.editor.statemachine.StateMachine;
import javafx.scene.input.InputEvent;

/**
 * Created by hobbypunk on 15.02.17.
 */
public interface Moveable {
  Command move(StateMachine sm, InputEvent event);
}

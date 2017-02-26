package de.thm.mni.mote.mode.uiactor.editor.statemachine.interfaces;

import de.thm.mni.mote.mode.uiactor.editor.actionmanager.commands.Command;
import javafx.scene.input.InputEvent;

/**
 * Created by hobbypunk on 21.02.17.
 */
public interface Addable extends HandleEvent {
  Command add(InputEvent event);
}

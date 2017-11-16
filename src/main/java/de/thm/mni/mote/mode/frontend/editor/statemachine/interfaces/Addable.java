package de.thm.mni.mote.mode.frontend.editor.statemachine.interfaces;

import de.thm.mni.mote.mode.frontend.editor.actionmanager.commands.Command;
import javafx.scene.input.InputEvent;

/**
 * Created by hobbypunk on 21.02.17.
 */
public interface Addable extends HandleEvent {
  Command add(InputEvent event);
}

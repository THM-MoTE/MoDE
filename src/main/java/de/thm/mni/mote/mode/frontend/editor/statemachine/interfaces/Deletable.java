package de.thm.mni.mote.mode.frontend.editor.statemachine.interfaces;

import de.thm.mni.mote.mode.frontend.editor.actionmanager.commands.Command;
import javafx.scene.input.InputEvent;

/**
 * Created by Marcel Hoppe on 15.02.17.
 */
public interface Deletable extends HandleEvent {
  Command delete(InputEvent event);
}

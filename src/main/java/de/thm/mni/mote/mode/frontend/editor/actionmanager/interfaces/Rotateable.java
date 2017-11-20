package de.thm.mni.mote.mode.frontend.editor.actionmanager.interfaces;

import de.thm.mni.mote.mode.frontend.editor.actionmanager.commands.Command;

/**
 * Created by Marcel Hoppe on 22.02.17.
 */
public interface Rotateable {
  Command rotate(Object... params);
}

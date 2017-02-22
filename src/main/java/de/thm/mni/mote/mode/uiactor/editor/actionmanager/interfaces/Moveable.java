package de.thm.mni.mote.mode.uiactor.editor.actionmanager.interfaces;

import de.thm.mni.mote.mode.uiactor.editor.actionmanager.commands.Command;

/**
 * Created by hobbypunk on 15.02.17.
 */
public interface Moveable {
  Command move(Object... params);
}

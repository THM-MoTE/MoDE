package de.thm.mni.mote.mode.uiactor.editor.actionmanager.interfaces;

import de.thm.mni.mote.mode.uiactor.editor.actionmanager.commands.Command;

/**
 * Created by hobbypunk on 21.02.17.
 */
public interface Addable {
  Command add(Object... params);
}

package de.thm.mni.mote.mode.uiactor.editor.actionmanager.interfaces;

import de.thm.mni.mote.mode.uiactor.editor.actionmanager.commands.Command;

/**
 * Created by hobbypunk on 22.02.17.
 */
public interface Resizeable {
  Command resize(Object... params);
}

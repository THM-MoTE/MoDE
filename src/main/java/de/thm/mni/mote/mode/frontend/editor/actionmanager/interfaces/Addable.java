package de.thm.mni.mote.mode.frontend.editor.actionmanager.interfaces;

import de.thm.mni.mote.mode.frontend.editor.actionmanager.commands.Command;

/**
 * Created by hobbypunk on 21.02.17.
 */
public interface Addable {
  Command add(Object... params);
}

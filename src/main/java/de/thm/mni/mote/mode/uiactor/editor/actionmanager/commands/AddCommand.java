package de.thm.mni.mote.mode.uiactor.editor.actionmanager.commands;

import de.thm.mni.mote.mode.uiactor.editor.actionmanager.interfaces.Addable;

/**
 * Created by hobbypunk on 21.02.17.
 */
public class AddCommand extends Command {
  private Addable that;
  
  public AddCommand(Addable that, Object... params) {
    super(params);
    this.that = that;
  }
  
  @Override
  public Command execute() {
    return that.add(params);
  }
}

package de.thm.mni.mote.mode.frontend.editor.actionmanager.commands;

import de.thm.mni.mote.mode.frontend.editor.actionmanager.interfaces.Addable;

/**
 * Created by Marcel Hoppe on 21.02.17.
 */
public class AddCommand extends Command {
  private final Addable that;
  
  public AddCommand(Addable that, Object... params) {
    super(params);
    this.that = that;
  }
  
  @Override
  public Command execute() {
    return that.add(params);
  }
}

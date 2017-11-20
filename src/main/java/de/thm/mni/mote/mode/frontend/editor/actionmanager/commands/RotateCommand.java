package de.thm.mni.mote.mode.frontend.editor.actionmanager.commands;

import de.thm.mni.mote.mode.frontend.editor.actionmanager.interfaces.Rotateable;

/**
 * Created by Marcel Hoppe on 21.02.17.
 */
public class RotateCommand extends Command {
  
  private final Rotateable that;
  
  public RotateCommand(Rotateable that, Object... params) {
    super(params);
    this.that = that;
  }
  
  @Override
  public Command execute() {
    return that.rotate(params);
  }
}

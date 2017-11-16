package de.thm.mni.mote.mode.frontend.editor.actionmanager.commands;

import de.thm.mni.mote.mode.frontend.editor.actionmanager.interfaces.Rotateable;

/**
 * Created by hobbypunk on 21.02.17.
 */
public class RotateCommand extends Command {
  
  private Rotateable that;
  
  public RotateCommand(Rotateable that, Object... params) {
    super(params);
    this.that = that;
  }
  
  @Override
  public Command execute() {
    return that.rotate(params);
  }
}

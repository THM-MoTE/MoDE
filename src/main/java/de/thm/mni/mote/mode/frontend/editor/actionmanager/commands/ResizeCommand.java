package de.thm.mni.mote.mode.frontend.editor.actionmanager.commands;

import de.thm.mni.mote.mode.frontend.editor.actionmanager.interfaces.Resizeable;

/**
 * Created by hobbypunk on 21.02.17.
 */
public class ResizeCommand extends Command {
  
  private Resizeable that;
  
  public ResizeCommand(Resizeable that, Object... params) {
    super(params);
    this.that = that;
  }
  
  @Override
  public Command execute() {
    return that.resize(params);
  }
}

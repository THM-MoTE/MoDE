package de.thm.mni.mote.mode.uiactor.editor.actionmanager.commands;

import de.thm.mni.mote.mode.uiactor.editor.actionmanager.interfaces.Moveable;

/**
 * Created by hobbypunk on 21.02.17.
 */
public class MoveCommand extends Command {
  
  private Moveable that;
  
  public MoveCommand(Moveable that, Object... params) {
    super(params);
    this.that = that;
  }
  
  @Override
  public Command execute() {
    return that.move(params);
  }
}

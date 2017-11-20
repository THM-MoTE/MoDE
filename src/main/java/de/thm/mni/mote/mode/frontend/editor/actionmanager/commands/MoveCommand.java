package de.thm.mni.mote.mode.frontend.editor.actionmanager.commands;

import de.thm.mni.mote.mode.frontend.editor.actionmanager.interfaces.Moveable;

/**
 * Created by Marcel Hoppe on 21.02.17.
 */
public class MoveCommand extends Command {
  
  private final Moveable that;
  
  public MoveCommand(Moveable that, Object... params) {
    super(params);
    this.that = that;
  }
  
  @Override
  public Command execute() {
    return that.move(params);
  }
}

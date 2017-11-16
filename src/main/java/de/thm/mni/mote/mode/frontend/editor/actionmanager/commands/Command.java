package de.thm.mni.mote.mode.frontend.editor.actionmanager.commands;

/**
 * Created by hobbypunk on 21.02.17.
 */
public abstract class Command {
  public static Command IGNORE = new Command() {
    @Override
    public Command execute() {
      throw new UnsupportedOperationException();
    }
  };
  
  protected final Object[] params;
  
  private Command() {
    params = new Object[0];
  }
  
  protected Command(Object... params) {
    this.params = params;
  }
  
  public abstract Command execute();
}

package de.thm.mni.mote.mode.frontend.editor.actionmanager.commands;

/**
 * Created by Marcel Hoppe on 21.02.17.
 */
public abstract class Command {
  public static final Command IGNORE = new Command() {
    @Override
    public Command execute() {
      throw new UnsupportedOperationException();
    }
  };
  
  final Object[] params;
  
  private Command() {
    params = new Object[0];
  }
  
  Command(Object... params) {
    this.params = params;
  }
  
  public abstract Command execute();
}

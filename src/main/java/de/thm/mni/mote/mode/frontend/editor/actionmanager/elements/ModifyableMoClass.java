package de.thm.mni.mote.mode.frontend.editor.actionmanager.elements;

import de.thm.mni.mote.mode.modelica.MoClass;
import de.thm.mni.mote.mode.modelica.MoConnection;
import de.thm.mni.mote.mode.modelica.MoVariable;
import de.thm.mni.mote.mode.frontend.editor.actionmanager.commands.AddCommand;
import de.thm.mni.mote.mode.frontend.editor.actionmanager.commands.Command;
import de.thm.mni.mote.mode.frontend.editor.actionmanager.commands.DeleteCommand;
import de.thm.mni.mote.mode.frontend.editor.actionmanager.interfaces.Addable;
import de.thm.mni.mote.mode.frontend.editor.actionmanager.interfaces.Deletable;

import java.util.List;

/**
 * Created by hobbypunk on 21.02.17.
 */
public class ModifyableMoClass implements Addable, Deletable {
  
  private MoClass element;
  
  public ModifyableMoClass(MoClass element) {
    this.element = element;
  }
  
  @Override
  public Command add(Object... params) {
    if (params[0] instanceof MoVariable) {
      MoVariable variable = (MoVariable) params[0];
      List<MoConnection> connections = (List<MoConnection>) params[1];
      this.element.addAllConnections(connections);
      this.element.addVariable(variable);
      return new DeleteCommand(this, variable);
    } else if (params[0] instanceof MoConnection[]) {
      MoConnection[] connections = (MoConnection[]) params[0];
      this.element.addAllConnections(connections);
      return new DeleteCommand(this, (Object) connections);
    }
    return Command.IGNORE;
  }
  
  @Override
  public Command delete(Object... params) {
    if (params[0] instanceof MoVariable) {
      MoVariable variable = (MoVariable) params[0];
      List<MoConnection> connections = variable.getConnections();
      this.element.removeVariable(variable);
      return new AddCommand(this, variable, connections);
    } else if (params[0] instanceof MoConnection[]) {
      MoConnection[] connections = (MoConnection[]) params[0];
      this.element.removeAllConnections(connections);
      return new AddCommand(this, (Object) connections);
    }
    return Command.IGNORE;
  }
}

package de.thm.mni.mote.mode.frontend.editor.actionmanager;

import de.thm.mni.mote.mode.frontend.editor.actionmanager.commands.Command;
import de.thm.mni.mote.mode.frontend.utilities.ActiveInstanceManager;
import de.thm.mni.mote.mode.frontend.utilities.ActiveInstance;
import de.thm.mni.mote.mode.modelica.MoContainer;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import lombok.Getter;

import java.util.List;

/**
 * Created by Marcel Hoppe on 21.02.17.
 */

public class ActionManager extends ActiveInstance {
  
  @Getter
  private static ActiveInstanceManager<ActionManager> instanceManager = new ActiveInstanceManager<ActionManager>() {
    @Override
    protected ActionManager createInstance(MoContainer container) {
      return new ActionManager();
    }
  };
  
  @Getter private ObservableList<Command> undoStack = FXCollections.observableArrayList();
  @Getter private ObservableList<Command> redoStack = FXCollections.observableArrayList();
  
  private ActionManager() {}
  
  public void addUndo(Command command) {
    addUndo(command, true);
  }
  
  private void addUndo(Command command, Boolean redoClear) {
    add(undoStack, command);
    if (redoClear) {
      redoStack.clear();
    }
  }
  
  private void addRedo(Command command) {
    add(redoStack, command);
  }
  
  private void add(List<Command> stack, Command command) {
    if (command != null && command != Command.IGNORE) {
      stack.add(command);
    }
  }
  
  public void undo() {
    if (!undoStack.isEmpty()) {
      Command c = undoStack.get(undoStack.size()-1);
      undoStack.remove(undoStack.size()-1);
      addRedo(c.execute());
    }
  }
  
  public void redo() {
    if (!redoStack.isEmpty()) {
      Command c = redoStack.get(redoStack.size()-1);
      redoStack.remove(redoStack.size()-1);
      addUndo(c.execute(), false);
    }
  }
}

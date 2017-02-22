package de.thm.mni.mote.mode.uiactor.editor.actionmanager;

import de.thm.mni.mote.mode.modelica.MoContainer;
import de.thm.mni.mote.mode.uiactor.editor.actionmanager.commands.Command;
import javafx.beans.property.BooleanProperty;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.beans.property.SimpleObjectProperty;
import lombok.Getter;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * Created by hobbypunk on 21.02.17.
 */

public class ActionManager {
  public static ObjectProperty<ActionManager> activeInstance = new SimpleObjectProperty<>(null);
  private static Map<MoContainer, ActionManager> INSTANCES = new HashMap<>();
  
  public static ActionManager getInstance(MoContainer container) {
    if (!INSTANCES.containsKey(container)) INSTANCES.put(container, new ActionManager());
    
    return INSTANCES.get(container);
  }
  
  public static void removeInstance(MoContainer data) {
    if (activeInstance.get() == INSTANCES.get(data)) activeInstance.set(null);
    INSTANCES.remove(data);
  }
  
  @Getter public BooleanProperty active = new SimpleBooleanProperty(false);
  @Getter public BooleanProperty hasUndoCommand = new SimpleBooleanProperty(false);
  @Getter public BooleanProperty hasRedoCommand = new SimpleBooleanProperty(false);
  
  private Stack<Command> undoStack = new Stack<>();
  private Stack<Command> redoStack = new Stack<>();
  
  private ActionManager() {
    active.addListener((observable, oldValue, newValue) -> {
      if (newValue) activeInstance.set(this);
      else if (activeInstance.get() == this) activeInstance.set(null);
    });
  }
  
  public void addUndo(Command command) {
    addUndo(command, true);
  }
  
  private void addUndo(Command command, Boolean redoClear) {
    add(undoStack, command);
    if (redoClear) {
      redoStack.clear();
      hasRedoCommand.set(false);
    }
  }
  
  private void addRedo(Command command) {
    add(redoStack, command);
  }
  
  private void add(Stack<Command> stack, Command command) {
    if (command != null && command != Command.IGNORE) {
      stack.push(command);
      checkHasCommands();
    }
  }
  
  public void undo() {
    if (!undoStack.isEmpty())
      addRedo(undoStack.pop().execute());
  }
  
  public void redo() {
    if (!redoStack.isEmpty())
      addUndo(redoStack.pop().execute(), false);
  }
  
  private void checkHasCommands() {
    hasUndoCommand.set(undoStack.isEmpty());
    hasRedoCommand.set(redoStack.isEmpty());
    
    hasUndoCommand.set(!undoStack.isEmpty());
    hasRedoCommand.set(!redoStack.isEmpty());
  }
}

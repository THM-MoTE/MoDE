package de.thm.mni.mote.mode.frontend.editor.actionmanager;

import de.thm.mni.mote.mode.modelica.MoContainer;
import de.thm.mni.mote.mode.frontend.editor.actionmanager.commands.Command;
import javafx.beans.property.BooleanProperty;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import lombok.Getter;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Marcel Hoppe on 21.02.17.
 */

public class ActionManager {
  public static final ObjectProperty<ActionManager> activeInstance = new SimpleObjectProperty<>(null);
  private static final Map<MoContainer, ActionManager> INSTANCES = new HashMap<>();
  
  public static ActionManager getInstance(MoContainer container) {
    if (!INSTANCES.containsKey(container)) INSTANCES.put(container, new ActionManager());
    
    return INSTANCES.get(container);
  }
  
  public static void removeInstance(MoContainer data) {
    if (activeInstance.get() == INSTANCES.get(data)) activeInstance.set(null);
    INSTANCES.remove(data);
  }
  
  @Getter BooleanProperty active = new SimpleBooleanProperty(false);
  
  @Getter private ObservableList<Command> undoStack = FXCollections.observableArrayList();
  @Getter private ObservableList<Command> redoStack = FXCollections.observableArrayList();
  
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

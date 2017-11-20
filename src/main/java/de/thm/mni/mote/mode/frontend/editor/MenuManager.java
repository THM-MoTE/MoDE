package de.thm.mni.mote.mode.frontend.editor;

import de.thm.mni.mote.mode.modelica.MoContainer;
import de.thm.mni.mote.mode.frontend.editor.actionmanager.ActionManager;
import de.thm.mni.mote.mode.frontend.editor.actionmanager.commands.Command;
import javafx.beans.property.*;
import javafx.collections.ListChangeListener;
import lombok.Getter;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Marcel Hoppe on 21.02.17.
 */

public class MenuManager {
  public static final ObjectProperty<MenuManager> activeInstance = new SimpleObjectProperty<>(null);
  private static final Map<MoContainer, MenuManager> INSTANCES = new HashMap<>();
  
  public static MenuManager getInstance(MoContainer container) {
    if (!INSTANCES.containsKey(container)) INSTANCES.put(container, new MenuManager(container));
    
    return INSTANCES.get(container);
  }
  
  public static void removeInstance(MoContainer data) {
    if (activeInstance.get() == INSTANCES.get(data)) activeInstance.set(null);
    INSTANCES.remove(data);
    ActionManager.removeInstance(data);
  }
  
  @Getter BooleanProperty active = new SimpleBooleanProperty(false);
  @Getter final ReadOnlyBooleanProperty hasUndoCommandsProperty;
  @Getter final ReadOnlyBooleanProperty hasRedoCommandsProperty;
  
  @Getter final ReadOnlyBooleanProperty hasIconProperty;
  @Getter BooleanProperty showIconProperty = new SimpleBooleanProperty(false);
  
  
  private MenuManager(MoContainer container) {
    active.addListener((observable, oldValue, newValue) -> {
      if (newValue) activeInstance.set(this);
      else if (activeInstance.get() == this) activeInstance.set(null);
    });
  
    BooleanProperty hasRedoCommandsProperty = new SimpleBooleanProperty(false);
    BooleanProperty hasUndoCommandsProperty = new SimpleBooleanProperty(false);
    BooleanProperty hasIconProperty = new SimpleBooleanProperty(false);
    
    this.hasRedoCommandsProperty = hasRedoCommandsProperty;
    this.hasUndoCommandsProperty = hasUndoCommandsProperty;
    this.hasIconProperty = hasIconProperty;
    
    ActionManager.getInstance(container).getRedoStack().addListener((ListChangeListener<? super Command>) c -> hasRedoCommandsProperty.set(!ActionManager.getInstance(container).getRedoStack().isEmpty()));
  
    ActionManager.getInstance(container).getUndoStack().addListener((ListChangeListener<? super Command>) c -> hasUndoCommandsProperty.set(!ActionManager.getInstance(container).getUndoStack().isEmpty()));
    
    hasIconProperty.set(container.getElement().hasIcon());
  }
}

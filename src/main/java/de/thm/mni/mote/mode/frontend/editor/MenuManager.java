package de.thm.mni.mote.mode.frontend.editor;

import de.thm.mni.mote.mode.frontend.editor.actionmanager.ActionManager;
import de.thm.mni.mote.mode.frontend.editor.actionmanager.commands.Command;
import de.thm.mni.mote.mode.frontend.utilities.ActiveInstance;
import de.thm.mni.mote.mode.frontend.utilities.ActiveInstanceManager;
import de.thm.mni.mote.mode.modelica.MoContainer;
import javafx.beans.property.BooleanProperty;
import javafx.beans.property.ReadOnlyBooleanProperty;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.collections.ListChangeListener;
import lombok.AccessLevel;
import lombok.Getter;

/**
 * Created by Marcel Hoppe on 21.02.17.
 */

@Getter
public class MenuManager extends ActiveInstance {
  
  @Getter
  private static ActiveInstanceManager<MenuManager> instanceManager = new ActiveInstanceManager<MenuManager>() {
    @Override
    protected MenuManager createInstance(MoContainer container) {
      return new MenuManager(container);
    }
  };
  
  @Getter(AccessLevel.PRIVATE) final BooleanProperty internalHasRedoCommandsProperty = new SimpleBooleanProperty(false);
  @Getter(AccessLevel.PRIVATE) final BooleanProperty internalHasUndoCommandsProperty = new SimpleBooleanProperty(false);
  @Getter(AccessLevel.PRIVATE) final BooleanProperty internalHasIconProperty = new SimpleBooleanProperty(false);
  @Getter(AccessLevel.PRIVATE) final BooleanProperty internalShowIconProperty = new SimpleBooleanProperty(false);
  
  final ReadOnlyBooleanProperty hasUndoCommandsProperty = internalHasUndoCommandsProperty;
  final ReadOnlyBooleanProperty hasRedoCommandsProperty = internalHasRedoCommandsProperty;
  
  final ReadOnlyBooleanProperty hasIconProperty = internalHasIconProperty;
  final BooleanProperty showIconProperty = internalShowIconProperty;
  
  
  private MenuManager(MoContainer container) {
    ActionManager ai = ActionManager.getInstanceManager().get(container);
    ai.getRedoStack().addListener(
        (ListChangeListener<? super Command>) c -> internalHasRedoCommandsProperty.set(!ai.getRedoStack().isEmpty()));
    ai.getUndoStack().addListener(
        (ListChangeListener<? super Command>) c -> internalHasUndoCommandsProperty.set(!ai.getUndoStack().isEmpty()));
    
    internalHasIconProperty.set(container.getElement().hasIcon());
  }
}

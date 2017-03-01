package de.thm.mni.mote.mode.uiactor.control;

import de.thm.mni.mote.mode.modelica.MoContainer;
import de.thm.mni.mote.mode.modelica.MoRoot;
import de.thm.mni.mote.mode.modelica.graphics.MoDefaults;
import de.thm.mni.mote.mode.parser.ParserException;
import de.thm.mni.mote.mode.uiactor.control.modelica.MoIconGroup;
import de.thm.mni.mote.mode.uiactor.handlers.LibraryHandler;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.*;
import javafx.scene.input.ContextMenuEvent;
import javafx.scene.input.MouseEvent;
import org.kordamp.ikonli.javafx.FontIcon;

import static de.thm.mni.mote.mode.util.Translator.tr;

/**
 * Created by hobbypunk on 03.02.17.
 */
public class MoTreeCell extends TreeCell<MoContainer> {
  
  private ContextMenu cm = null;
  private TabPane tabPane;
  
  private ObjectProperty<EventHandler<ActionEvent>> onEditAction = new SimpleObjectProperty<>(null);
  private ObjectProperty<EventHandler<ActionEvent>> onAddNewActionProperty = new SimpleObjectProperty<>(null);
  
  private ObjectProperty<EventHandler<MouseEvent>> onNonRootMouseClickedProperty = new SimpleObjectProperty<>(null);
  private ObjectProperty<EventHandler<? super ContextMenuEvent>> onNonRootContextMenuRequest = new SimpleObjectProperty<>(null);
  
  public MoTreeCell(TabPane tabPane) {
    super();
    this.tabPane = tabPane;
  }
  
  @Override
  protected void updateItem(MoContainer item, boolean empty) {
    super.updateItem(item, empty);
    this.setDisable(false);
    this.setStyle(null);
    this.setContextMenu(null);
    this.onContextMenuRequestedProperty().unbind();
    this.setOnContextMenuRequested(null);
    this.onMouseClickedProperty().unbind();
    this.setOnMouseClicked(null);
    this.getStyleClass().removeAll("root-element");
    if (empty || item == null) {
      this.setText(null);
      this.setGraphic(null);
    } else {
      if (item instanceof MoRoot) updateItem((MoRoot) item);
      else updateItem(item);
    }
  }
  
  private void updateItem(MoRoot item) {
    String text = tr("Main", "tree.entries." + item.getSimpleName());
    this.setText(text);
    this.selectedProperty().addListener((observable, oldValue, newValue) -> {
      if (newValue) this.updateSelected(false);
    });
    this.setEditable(false);
    this.getStyleClass().add("root-element");
    Button btn = new Button("");
    btn.getStyleClass().add("no-border");
    this.setGraphic(btn);
    this.setContentDisplay(ContentDisplay.RIGHT);
    
    if (!text.equals(tr("Main", "tree.entries.project"))) {
      btn.setGraphic(new FontIcon("gmi-edit"));
      this.setOnMouseClicked(event -> {
        if (event.getClickCount() % 2 == 0 && btn.getOnAction() != null) btn.getOnAction().handle(new ActionEvent(btn, null));
      });
      btn.onActionProperty().bind(onEditAction);
    }
  }
  
  private void updateItem(MoContainer item) {
    try {
      this.setText(item.getSimpleName());
      if (item.getElement().hasConnectors()) this.setStyle("-fx-font-weight: bold");
      this.setGraphic(new MoIconGroup(item).scaleToSize(25., 25.));
      this.setContentDisplay(ContentDisplay.LEFT);
      this.setContextMenu(createLibraryMenu());
  
      this.onMouseClickedProperty().bind(this.onNonRootMouseClickedProperty);
      this.onContextMenuRequestedProperty().bind(this.onNonRootContextMenuRequest);
    
    } catch (ParserException e) {
      e.printStackTrace(); //TODO: send msg
    }
  }
  
  private final ObjectProperty<EventHandler<ActionEvent>> onEditActionProperty() { return onEditAction; }
  
  public final void setOnEditAction(EventHandler<ActionEvent> value) { onEditActionProperty().set(value); }
  
  private final ObjectProperty<EventHandler<MouseEvent>> onNonRootMouseClickedProperty() { return onNonRootMouseClickedProperty; }
  
  public final void setOnNonRootMouseClicked(EventHandler<MouseEvent> value) { onNonRootMouseClickedProperty().set(value); }
  
  private final ObjectProperty<EventHandler<? super ContextMenuEvent>> onNonRootContextMenuRequest() { return onNonRootContextMenuRequest; }
  
  public final void setOnNonRootContextMenuRequest(EventHandler<? super ContextMenuEvent> value) { onNonRootContextMenuRequest().set(value); }
  
  private ContextMenu createLibraryMenu() {
    if (cm != null) return cm;
    cm = new ContextMenu();
  
    for (String action : new String[]{"add_new.package", "add_new.model", "seperator", "open_as_diagram", "add_to_diagram", "open_as_icon"}) {
      createMenu(action, 0, cm.getItems());
    }
    return cm;
  }
  
  private void createMenu(String action, int part, ObservableList<MenuItem> items) {
    String[] splittedAction = action.split("\\.");
    if (part + 1 >= splittedAction.length) {
      items.add(createMenuItem(action));
    } else {
      String newAction = "";
      for (int i = 0; i <= part; i++) {
        if (!newAction.isEmpty()) newAction += ".";
        newAction += ((newAction.isEmpty()) ? "" : ".") + splittedAction[i];
      }
      Menu submenu = null;
      for (MenuItem item : items) {
        if (item instanceof Menu && item.getText().equals(tr("Main", "menu.context." + newAction))) {
          submenu = (ContextSubMenu) item;
          break;
        }
      }
      if (submenu == null) {
        submenu = new ContextSubMenu(tr("Main", "menu.context." + newAction), newAction);
        items.add(submenu);
      }
      createMenu(action, part + 1, submenu.getItems());
    }
  }
  
  private MenuItem createMenuItem(String action) {
    if (action.equals("seperator")) return new SeparatorMenuItem();
    ContextMenuItem tmp = new ContextMenuItem(tr("Main", "menu.context." + action), action);
    
    if (action.startsWith("add_new")) {
      if (action.endsWith("package")) tmp.setGraphic(new MoIconGroup(MoDefaults.newPackage()).scaleToSize(20., 20.));
      else if (action.endsWith("model")) tmp.setGraphic(new MoIconGroup(MoDefaults.newModel()).scaleToSize(20., 20.));
    }
    
    tmp.setOnAction(event -> {
      if (tmp.getAction().startsWith("add_new")) {
        if (onAddNewActionProperty.isNotNull().get()) {
          onAddNewActionProperty.get().handle(event);
        }
      } else {
        LibraryHandler.getInstance().handleMenu(tabPane, this.getItem(), action);
      }
    });
    
    return tmp;
  }
  
  
}

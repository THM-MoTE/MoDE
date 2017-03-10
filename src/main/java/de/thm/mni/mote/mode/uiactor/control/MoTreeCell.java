package de.thm.mni.mote.mode.uiactor.control;

import de.thm.mni.mote.mode.modelica.MoContainer;
import de.thm.mni.mote.mode.modelica.MoRoot;
import de.thm.mni.mote.mode.modelica.graphics.MoDefaults;
import de.thm.mni.mote.mode.uiactor.control.modelica.MoIconGroup;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.value.ChangeListener;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.*;
import javafx.scene.input.*;
import org.kordamp.ikonli.javafx.FontIcon;

import static de.thm.mni.mote.mode.uiactor.utilities.Constants.MOCONTAINER;
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
  private ObjectProperty<EventHandler<ActionEvent>> onNonRootContextMenuItemAction = new SimpleObjectProperty<>(null);
  
  private ChangeListener<Boolean> preventRootSelection = (observable, oldValue, newValue) -> {
    if (newValue) this.updateSelected(false);
  };
  
  private Button btnRootEdit = new Button("");
  
  {
    btnRootEdit.getStyleClass().add("no-border");
    btnRootEdit.setGraphic(new FontIcon("gmi-edit"));
    btnRootEdit.onActionProperty().bind(onEditAction);
  }
    
  
  public MoTreeCell(TabPane tabPane) {
    super();
    this.tabPane = tabPane;
  }
  
  @Override
  protected void updateItem(MoContainer item, boolean empty) {
    super.updateItem(item, empty);
    this.setContextMenu(null);
    this.onContextMenuRequestedProperty().unbind();
    this.setOnContextMenuRequested(null);
  
    this.onMouseClickedProperty().unbind();
    this.setOnMouseClicked(null);
  
    this.selectedProperty().removeListener(preventRootSelection);
    
    this.getStyleClass().removeAll("root-element");
  
    if (empty || item == null) {
      this.setText(null);
      this.setGraphic(null);
      this.setStyle(null);
    } else {
      if (item instanceof MoRoot) updateItem((MoRoot) item);
      else updateItem(item);
    }
  }
  
  private void updateItem(MoRoot item) {
    String text = tr("Main", "tree.entries." + item.getSimpleName());
    this.setText(text);
    this.selectedProperty().addListener(preventRootSelection);
    this.setEditable(false);
  
    this.getStyleClass().add("root-element");
  
    if (!item.getSimpleName().equals("project")) {
      this.setGraphic(btnRootEdit);
      this.setOnMouseClicked(event -> {
        if (event.getClickCount() % 2 == 0 && btnRootEdit.getOnAction() != null) btnRootEdit.getOnAction().handle(new ActionEvent(btnRootEdit, null));
      });
      this.setContentDisplay(ContentDisplay.RIGHT);
    }
  }
  
  private void updateItem(MoContainer item) {
    this.setText(item.getSimpleName());
    if (item.getElement().hasConnectors()) this.setStyle("-fx-font-weight: bold");
    this.setGraphic(new MoIconGroup(item).scaleToSize(20., 20.));
    this.setContentDisplay(ContentDisplay.LEFT);
    this.setContextMenu(createLibraryMenu());
  
    this.onMouseClickedProperty().bind(this.onNonRootMouseClickedProperty);
    this.onContextMenuRequestedProperty().bind(this.onNonRootContextMenuRequest);
    this.setOnDragDetected(createDragDetectEventHandler());
    this.layout();
  }
  
  private EventHandler<MouseEvent> createDragDetectEventHandler() {
    return (event) -> {
      System.out.println("Drag begin: " + this.getItem().getElement());
      Dragboard db;
      if (this.getItem().getElement().hasConnectors())
        db = this.startDragAndDrop(TransferMode.COPY_OR_MOVE);
      else
        db = this.startDragAndDrop(TransferMode.MOVE);
      
      ClipboardContent cc = new ClipboardContent();
      cc.put(MOCONTAINER, this.getItem().getName());
      cc.putString(this.getItem().getName());
      db.setContent(cc);
      event.consume();
    };
  }
  
  private final ObjectProperty<EventHandler<ActionEvent>> onEditActionProperty() { return onEditAction; }
  
  public final void setOnEditAction(EventHandler<ActionEvent> value) { onEditActionProperty().set(value); }
  
  private final ObjectProperty<EventHandler<MouseEvent>> onNonRootMouseClickedProperty() { return onNonRootMouseClickedProperty; }
  
  public final void setOnNonRootMouseClicked(EventHandler<MouseEvent> value) { onNonRootMouseClickedProperty().set(value); }
  
  private final ObjectProperty<EventHandler<? super ContextMenuEvent>> onNonRootContextMenuRequest() { return onNonRootContextMenuRequest; }
  
  public final void setOnNonRootContextMenuRequest(EventHandler<? super ContextMenuEvent> value) { onNonRootContextMenuRequest().set(value); }
  
  private final ObjectProperty<EventHandler<ActionEvent>> onNonRootContextMenuItemAction() { return onNonRootContextMenuItemAction; }
  
  public final void setOnNonRootContextMenuItemAction(EventHandler<ActionEvent> value) { onNonRootContextMenuItemAction().set(value); }
  
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
    tmp.onActionProperty().bind(onNonRootContextMenuItemAction);

    return tmp;
  }
  
  
}

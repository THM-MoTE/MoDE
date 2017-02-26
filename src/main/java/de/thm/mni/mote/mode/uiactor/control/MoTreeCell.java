package de.thm.mni.mote.mode.uiactor.control;

import de.thm.mni.mote.mode.modelica.MoContainer;
import de.thm.mni.mote.mode.modelica.MoRoot;
import de.thm.mni.mote.mode.parser.ParserException;
import de.thm.mni.mote.mode.uiactor.control.modelica.MoIconGroup;
import de.thm.mni.mote.mode.uiactor.handlers.LibraryHandler;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;
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
  
  ObjectProperty<EventHandler<ActionEvent>> onEditAction = new SimpleObjectProperty<>(null);
  
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
    this.setOnContextMenuRequested(null);
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
      btn.onActionProperty().bindBidirectional(onEditAction);
    }
  }
  
  private void updateItem(MoContainer item) {
    try {
      this.setText(item.getSimpleName());
      if (item.getElement().hasConnectors()) this.setStyle("-fx-font-weight: bold");
      this.setGraphic(new MoIconGroup(item).scaleToSize(25., 25.));
      this.setContentDisplay(ContentDisplay.LEFT);
      this.setContextMenu(createLibraryMenu());
      this.setOnContextMenuRequested(createContextHandler());
      this.setOnMouseClicked(createMouseHandler());
    } catch (ParserException e) {
      e.printStackTrace(); //TODO: send msg
    }
  }
  
  public final ObjectProperty<EventHandler<ActionEvent>> onEditActionProperty() { return onEditAction; }
  
  public final void setOnEditAction(EventHandler<ActionEvent> value) { onEditActionProperty().set(value); }
  
  public final EventHandler<ActionEvent> getOnEditAction() { return onEditActionProperty().get(); }
  
  
  private ContextMenu createLibraryMenu() {
    if (cm != null) return cm;
    cm = new ContextMenu();
    
    for (String action : new String[]{"open_as_diagram", "add_to_diagram", "open_as_icon"}) {
      MenuItem tmp = new ContextMenuItem(tr("Main", "menu.context." + action), action);
      
      tmp.setOnAction(event -> {
        try {
          LibraryHandler.getInstance().handleMenu(tabPane, this.getItem(), action);
        } catch (ParserException e) {
          e.printStackTrace();//TODO: send msg
        }
      });
      
      cm.getItems().add(tmp);
    }
    return cm;
  }
  
  private EventHandler<? super ContextMenuEvent> createContextHandler() {
    return event -> MoTreeCell.this.getContextMenu().getItems().forEach(menuItem -> {
      ContextMenuItem cmi = (ContextMenuItem) menuItem;
      MoContainer container = MoTreeCell.this.getItem();
      
      if (cmi.getAction().equals("add_to_diagram")) {
        MainTabControl mtc = (MainTabControl) tabPane.getSelectionModel().getSelectedItem();
        cmi.setDisable(!container.getElement().hasIcon() || mtc == null);
      } else {
        if (cmi.getAction().equals("open_as_diagram")) cmi.setDisable(!container.getElement().hasDiagram());
        else if (cmi.getAction().equals("open_as_icon")) cmi.setDisable(!container.getElement().hasIcon());
      }
    });
  }
  
  private EventHandler<? super MouseEvent> createMouseHandler() {
    return event -> {
      MoContainer item = this.getItem();
      if (item == null || !item.getElement().hasDiagram()) return;//TODO
      
      for (Tab t : tabPane.getTabs()) {
        if (t instanceof MainTabControl && ((MainTabControl) t).getData().equals(item)) {
          tabPane.getSelectionModel().select(t);
          return;
        }
      }
      
      if (event.getClickCount() == 2) {
        try {
          if (tabPane.getSelectionModel().getSelectedItem() != null && item.getElement().hasIcon())
            LibraryHandler.getInstance().handleMenu(tabPane, item, "add_to_diagram");
          else
            LibraryHandler.getInstance().handleMenu(tabPane, item, "open_as_diagram");
        } catch (ParserException e) {
          e.printStackTrace(); //TODO: send msg;
        }
      }
    };
  }
  
  
}

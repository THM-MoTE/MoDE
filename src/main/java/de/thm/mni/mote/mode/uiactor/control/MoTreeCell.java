package de.thm.mni.mote.mode.uiactor.control;

import de.thm.mni.mote.mode.modelica.MoContainer;
import de.thm.mni.mote.mode.modelica.MoRoot;
import de.thm.mni.mote.mode.parser.ParserException;
import de.thm.mni.mote.mode.uiactor.control.modelica.MoIconGroup;
import de.thm.mni.mote.mode.uiactor.handlers.LibraryHandler;
import javafx.event.EventHandler;
import javafx.scene.control.*;
import javafx.scene.input.ContextMenuEvent;
import org.kordamp.ikonli.javafx.FontIcon;

import static de.thm.mni.mote.mode.util.Translator.tr;

/**
 * Created by hobbypunk on 03.02.17.
 */
public class MoTreeCell extends TreeCell<MoContainer> {
  
  private ContextMenu cm = null;
  private TabPane tabPane;
  
  public MoTreeCell(TabPane tabPane) {
    super();
    this.tabPane = tabPane;
  }
  
  @Override
  protected void updateItem(MoContainer item, boolean empty) {
    super.updateItem(item, empty);
    this.setDisable(false);
    this.setStyle(null);
    this.getStyleClass().removeAll("root-element");
    if (empty) {
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
    this.setDisable(true);
    this.getStyleClass().add("root-element");
    Button btn = new Button("");
    btn.getStyleClass().add("no-border");
    this.setGraphic(btn);
    this.setContentDisplay(ContentDisplay.RIGHT);
    
    if (!text.equals(tr("Main", "tree.entries.project"))) {
      btn.setGraphic(new FontIcon("gmi-edit"));
    }
  }
  
  private void updateItem(MoContainer item) {
    try {
      this.setText(item.getSimpleName());
      if (item.getElement().hasConnectors()) this.setStyle("-fx-font-weight: bold");
      this.setGraphic(new MoIconGroup(item).scaleToSize(25., 25.));
      this.setContentDisplay(ContentDisplay.LEFT);
      this.setContextMenu(createLibraryMenu());
      this.setOnContextMenuRequested(createHandler());
    } catch (ParserException e) {
      e.printStackTrace(); //TODO: send msg
    }
  }
  
  private EventHandler<? super ContextMenuEvent> createHandler() {
    return event -> MoTreeCell.this.getContextMenu().getItems().forEach(menuItem -> {
      ContextMenuItem cmi = (ContextMenuItem) menuItem;
      MoContainer container = MoTreeCell.this.getItem();
      
      if (cmi.getAction().equals("add_to_diagram")) {
        MainTabControl mtc = (MainTabControl) tabPane.getSelectionModel().getSelectedItem();
        cmi.setDisable(!container.getElement().hasIcon() || mtc == null || !mtc.isDiagram());
      } else {
        if (cmi.getAction().equals("open_as_diagram")) cmi.setDisable(!container.getElement().hasDiagram());
        else if (cmi.getAction().equals("open_as_icon")) cmi.setDisable(!container.getElement().hasIcon());
      }
    });
  }
  
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
}

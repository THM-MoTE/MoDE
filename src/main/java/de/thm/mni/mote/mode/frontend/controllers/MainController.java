package de.thm.mni.mote.mode.frontend.controllers;

import de.thm.mni.mhpp11.smbj.logging.messages.ErrorMessage;
import de.thm.mni.mhpp11.smbj.messages.ExitMessage;
import de.thm.mni.mhpp11.smbj.ui.messages.StartUIMessage;
import de.thm.mni.mote.mode.backend.file.messages.FileNewMessage;
import de.thm.mni.mote.mode.backend.file.messages.ModelsSaveMessage;
import de.thm.mni.mote.mode.backend.messages.SetProjectMessage;
import de.thm.mni.mote.mode.backend.omc.actors.OMCActor;
import de.thm.mni.mote.mode.backend.omc.messages.GetAvailableLibsOMCMessage;
import de.thm.mni.mote.mode.backend.omc.messages.GetDataOMCMessage;
import de.thm.mni.mote.mode.backend.omc.messages.UpdateClassOMCMessage;
import de.thm.mni.mote.mode.config.Settings;
import de.thm.mni.mote.mode.config.model.MainWindow;
import de.thm.mni.mote.mode.config.model.Project;
import de.thm.mni.mote.mode.frontend.actors.MainActor;
import de.thm.mni.mote.mode.frontend.actors.WelcomeActor;
import de.thm.mni.mote.mode.frontend.controls.*;
import de.thm.mni.mote.mode.frontend.dialogs.controllers.ChangeProjectLibrariesDialogController;
import de.thm.mni.mote.mode.frontend.dialogs.controllers.ChangeSystemLibrariesDialogController;
import de.thm.mni.mote.mode.frontend.dialogs.controllers.CreateNewController;
import de.thm.mni.mote.mode.frontend.editor.MenuManager;
import de.thm.mni.mote.mode.frontend.editor.actionmanager.ActionManager;
import de.thm.mni.mote.mode.frontend.handlers.LibraryHandler;
import de.thm.mni.mote.mode.frontend.utilities.ScrollPaneHorizontalScroll;
import de.thm.mni.mote.mode.frontend.utilities.TreeViewWithItemsWrapper;
import de.thm.mni.mote.mode.modelica.MoContainer;
import de.thm.mni.mote.mode.modelica.MoPackage;
import de.thm.mni.mote.mode.modelica.MoRoot;
import de.thm.mni.mote.mode.util.Utilities;
import javafx.application.Platform;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.control.*;
import javafx.scene.input.ContextMenuEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
import org.apache.commons.lang3.tuple.MutablePair;

import java.io.IOException;
import java.net.URL;
import java.util.Collections;
import java.util.List;
import java.util.ResourceBundle;
import java.util.UUID;
import java.util.stream.Collectors;

import static de.thm.mni.mote.mode.util.Translator.tr;

/**
 * Created by Marcel Hoppe on 15.09.16.
 */
public class MainController extends NotifyController {
  
  private Project project;
  
  @FXML private ScrollPane spLeft;
  
  @FXML private TextField tfLibFilter;
  
  @FXML private HBox hbLeft;
  @FXML private Separator sLeft;
  
  @FXML private HBox hbRight;
  @FXML private Separator sRight;
  
  @FXML private TabPane tabPane;
  
  @FXML private TreeView<MoContainer> tvLibrary;
  private TreeViewWithItemsWrapper<MoContainer> treeViewWithItemsWrapper;
  
  @FXML private MenuItem miUndo;
  @FXML private MenuItem miRedo;
  
  @FXML private MenuItem miShowIcon;
  @FXML private CheckBox cbShowIcon;
  
  @Override
  public void initialize(URL location, ResourceBundle resources) {
    super.initialize(location, resources);
    ScrollPaneHorizontalScroll.modify(spLeft);
  
    treeViewWithItemsWrapper = new TreeViewWithItemsWrapper<>(tvLibrary);
    DragResizer.makeResizable(sLeft, hbLeft, DragResizer.LTR);
    DragResizer.makeResizable(sRight, hbRight, DragResizer.RTL);
  }
  
  
  public void lateInitialize() {
    super.lateInitialize();
    this.project = (Project) getParams().get(0);
    
    getActor().send(new GetDataOMCMessage(getID(), OMCActor.class) {
      @Override
      public Void answer(UUID source, ObservableList<MoContainer> payload) {
        Platform.runLater(() -> treeViewWithItemsWrapper.setItems(payload));
        return null;
      }
    });
    
    initTreeView();
    initMenuManager();
  }
  
  private void initMenuManager() {
    MenuManager.activeInstance.addListener((observable, oldValue, newValue) -> {
      miUndo.disableProperty().unbind();
      miRedo.disableProperty().unbind();
      miShowIcon.disableProperty().unbind();
      if(oldValue != null) cbShowIcon.selectedProperty().unbindBidirectional(oldValue.getShowIconProperty());
      if (newValue != null) {
        miUndo.disableProperty().bind(newValue.getHasUndoCommandsProperty().not());
        miRedo.disableProperty().bind(newValue.getHasRedoCommandsProperty().not());
        miShowIcon.disableProperty().bind(newValue.getHasIconProperty().not());
        cbShowIcon.selectedProperty().bindBidirectional(newValue.getShowIconProperty());
      } else {
        miUndo.setDisable(true);
        miRedo.setDisable(true);
        miShowIcon.setDisable(true);
        cbShowIcon.setSelected(false);
      }
    });
  }
  
  @Override
  public void deinitialize() {
    super.deinitialize();
  
    MainWindow mw = getSettings().getMainwindow();
    mw.setPos(new MutablePair<>(getStage().getX(), getStage().getY()));
    mw.setSize(new MutablePair<>(getStage().getWidth(), getStage().getHeight()));
    mw.setWidthLeftPane((int) hbLeft.getPrefWidth());
    mw.setWidthRightPane((int) hbRight.getPrefWidth());
  }
  
  @Override
  public void show() {
    MainWindow mw = getSettings().getMainwindow();
  
    getStage().setX(mw.getPos().getLeft());
    getStage().setY(mw.getPos().getRight());
    getStage().setWidth(mw.getSize().getLeft());
    getStage().setHeight(mw.getSize().getRight());
    
    hbLeft.setPrefWidth(mw.getWidthLeftPane());
    hbRight.setPrefWidth(mw.getWidthRightPane());
    getStage().setTitle(String.format("%1$s - %2$s %3$s", this.project.getName(), Settings.TITLE, Settings.VERSION));
    getStage().setResizable(true);
    super.show();
  }
  
  
  private void initTreeView() {
    tvLibrary.setRoot(new TreeItem<>());
    tvLibrary.setShowRoot(false);
    
    treeViewWithItemsWrapper.setTreeItemExpandListener(parent -> getActor().send(new UpdateClassOMCMessage(getID(), parent)));
    treeViewWithItemsWrapper.setTreeItemConfigurator((treeItem, value) -> {
      if (value instanceof MoRoot) {
        treeItem.setExpanded(true);
        treeItem.expandedProperty().addListener((observable, oldValue, newValue) -> {
          if (!newValue) treeItem.setExpanded(true);
        });
      }
    });
    tvLibrary.setCellFactory(param -> {
      MoTreeCell tmp = new MoTreeCell();
      tmp.setOnEditAction(this::handleTreeCellLibraryEdit);
      tmp.setOnNonRootMouseClicked(this::handleTreeCellMouseClick);
      tmp.setOnNonRootContextMenuRequest(this::handleTreeCellContextMenuRequest);
      tmp.setOnNonRootContextMenuItemAction(event -> this.handleTreeCellContextMenuItemAction(tmp, event));
      return tmp;
    });
  }
  
  private void handleTreeCellContextMenuItemAction(MoTreeCell cell, ActionEvent event) {
    ContextMenuItem item = ((ContextMenuItem) event.getSource());
    
    if (item.getAction().startsWith("add_new")) {
      String type = item.getAction().substring(8);
      type = Character.toUpperCase(type.charAt(0)) + type.substring(1);
      System.out.println(item.getAction() + ": " + type + ":" + cell.getItem().getName());
      if (type.equals("Package") || type.equals("Model")) handleCreateNew(type, cell.getItem());
    } else {
      LibraryHandler.getInstance().handleMenu(tabPane, cell.getItem(), item.getAction());
    }
  }
  
  private void handleTreeCellContextMenuRequest(ContextMenuEvent event) {
    MoTreeCell cell = ((MoTreeCell) event.getSource());
    cell.getContextMenu().getItems().forEach(menuItem -> {
      
      if (!(menuItem instanceof HasAction)) return;
      
      HasAction tmp = (HasAction) menuItem;
      MoContainer container = cell.getItem();
      if (tmp.getAction().equals("add_new")) {
        menuItem.setDisable(!(container.getElement() instanceof MoPackage) || cell.isLibrary());
      } else if (tmp.getAction().equals("add_to_diagram")) {
        MainTabControl mtc = (MainTabControl) tabPane.getSelectionModel().getSelectedItem();
        menuItem.setDisable(!container.getElement().hasIcon() || mtc == null);
      } else {
        if (tmp.getAction().equals("open")) menuItem.setDisable(!container.getElement().hasDiagram());
      }
    });
  }
  
  private void handleTreeCellMouseClick(MouseEvent event) {
    MoContainer item = ((MoTreeCell) event.getSource()).getItem();
    tvLibrary.getSelectionModel().select(((MoTreeCell) event.getSource()).getTreeItem());
    if (item == null || !item.getElement().hasDiagram()) return;//TODO
    
    for (Tab t : tabPane.getTabs()) {
      if (t instanceof MainTabControl && ((MainTabControl) t).getData().equals(item)) {
        tabPane.getSelectionModel().select(t);
        return;
      }
    }
    if (event.getClickCount() == 2) {
      LibraryHandler.getInstance().handleMenu(tabPane, item, "open_as_diagram");
    }
  }
  
  private void handleTreeCellLibraryEdit(ActionEvent event) {
    if (((Node) event.getSource()).getParent() instanceof MoTreeCell) {
      String text = ((MoTreeCell) ((Node) event.getSource()).getParent()).getText();
      if (text.equals(tr("Main", "tree.entries.system_libraries"))) {
        handleSystemLibraryEdit();
      } else if (text.equals(tr("Main", "tree.entries.project_libraries"))) {
        handleProjectLibraryEdit();
      }
    }
  }
  
  private void handleSystemLibraryEdit() {
    getActor().send(new GetAvailableLibsOMCMessage(getID()) {
      @Override
      public Void answer(UUID source, List<String> payload) {
        Platform.runLater(() -> handleSystemLibraryEdit(payload));
        return null;
      }
    });
  }
  
  private void handleSystemLibraryEdit(List<String> libs) {
    Dialog<Boolean> d = new Dialog<>();
    FXMLLoader loader = new FXMLLoader();
    loader.setLocation(Utilities.getView("dialogs", "ChangeSystemLibraries"));
    loader.setResources(Utilities.getBundle("MoDE"));
    
    try {
      DialogPane dp = loader.load();
      ChangeSystemLibrariesDialogController<String> controller = loader.getController();
      controller.setLists(libs, project.getSystemLibraries());
      d.setDialogPane(dp);
      d.show();
      d.setResultConverter(param -> param.getButtonData().getTypeCode().equals("A"));
      d.setOnCloseRequest(event -> {
        if (d.getResult()) {
          project.getSystemLibraries().clear();
          project.getSystemLibraries().addAll(controller.getSelected());
          reloadProject();
        }
      });
    } catch (IOException e) {
      getActor().send(new ErrorMessage(this.getClass(), getID(), e));
    }
  }
  
  private void handleProjectLibraryEdit() {
    Dialog<Boolean> d = new Dialog<>();
    FXMLLoader loader = new FXMLLoader();
    loader.setLocation(Utilities.getView("dialogs", "ChangeProjectLibraries"));
    loader.setResources(Utilities.getBundle("MoDE"));
    
    try {
      DialogPane dp = loader.load();
      ChangeProjectLibrariesDialogController controller = loader.getController();
      controller.setLibraries(project.getProjectLibraries());
      d.setDialogPane(dp);
      d.show();
      d.setResultConverter(param -> param.getButtonData().getTypeCode().equals("A"));
      d.setOnCloseRequest(event -> {
        if (d.getResult()) {
          project.getProjectLibraries().clear();
          project.getProjectLibraries().addAll(controller.getLibraries());
          reloadProject();
        }
      });
    } catch (IOException e) {
      getActor().send(new ErrorMessage(this.getClass(), getID(), e));
    }
  }
  
  private void handleCreateNew(String type, MoContainer parent) {
    Dialog<Boolean> d = new Dialog<>();
    FXMLLoader loader = new FXMLLoader();
    loader.setLocation(Utilities.getView("dialogs", "CreateNew" + type));
    loader.setResources(Utilities.getBundle("MoDE"));
    
    try {
      DialogPane dp = loader.load();
      CreateNewController controller = loader.getController();
      controller.setPath(parent.getName());
      d.setDialogPane(dp);
      d.show();
      d.setResultConverter(param -> param.getButtonData().getTypeCode().equals("I"));
      d.setOnCloseRequest(event -> {
        if (d.getResult()) {
          getActor().send(new FileNewMessage(getID(), parent, type, controller.getData()));
        }
      });
    } catch (IOException e) {
      getActor().send(new ErrorMessage(this.getClass(), getID(), e));
    }
    
  }
  
  private void reloadProject() {
    try {
      project.save();
      getActor().send(new SetProjectMessage(getID(), project) {
        @Override
        public Void answer(UUID source, Project payload) {
          Platform.runLater(MainController.this::hide);
          //TODO: configure splash -> show progress
          getActor().send(new StartUIMessage(source, MainActor.class, getStage(), Collections.singletonList(payload)));
  
          return null;
        }
      });
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
  
  @FXML
  private void handleSave() {
    if (!tabPane.getSelectionModel().isEmpty()) {
      handleSave(((MainTabControl) tabPane.getSelectionModel().getSelectedItem()).getData());
    }
  }
  
  @FXML
  private void handleSaveAll() {
    getActor().send(new ModelsSaveMessage(getID(), tabPane.getTabs().stream().map(tab -> ((MainTabControl) tab).getData()).collect(Collectors.toList())));
    tabPane.getTabs().forEach(tab -> handleSave(((MainTabControl) tab).getData()));
  }
  
  private void handleSave(MoContainer container) {
    getActor().send(new ModelsSaveMessage(getID(), container));
  }
  
  @FXML
  private void handleCloseProject() {
    this.hide();
    getActor().send(new StartUIMessage(getID(), WelcomeActor.class, new Stage()));
    getActor().send(new ExitMessage(getID(), getID()));
  }
  
  @FXML
  private void handleClose() {
    getActor().send(new ExitMessage(getID()));
  }
  
  @FXML
  private void handleUndo() {
    ActionManager am = ActionManager.activeInstance.get();
    if (am != null) am.undo();
  }
  
  @FXML
  private void handleRedo() {
    ActionManager am = ActionManager.activeInstance.get();
    if (am != null) am.redo();
  }
  
  @FXML
  private void handleShowIcon() {
    cbShowIcon.setSelected(!cbShowIcon.isSelected());
  }

}


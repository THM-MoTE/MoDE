package de.thm.mni.mote.mode.uiactor.controller;

import de.thm.mni.mhpp11.jActor.actors.logging.messages.ErrorMessage;
import de.thm.mni.mhpp11.jActor.actors.messagebus.MessageBus;
import de.thm.mni.mhpp11.jActor.actors.ui.interfaces.ActorController;
import de.thm.mni.mhpp11.jActor.actors.ui.messages.StartUIMessage;
import de.thm.mni.mhpp11.jActor.actors.ui.splash.messages.SplashShowMessage;
import de.thm.mni.mhpp11.jActor.messages.ExitMessage;
import de.thm.mni.mhpp11.jActor.messages.interfaces.Message;
import de.thm.mni.mote.mode.config.Settings;
import de.thm.mni.mote.mode.config.model.MainWindow;
import de.thm.mni.mote.mode.config.model.Project;
import de.thm.mni.mote.mode.modelica.MoContainer;
import de.thm.mni.mote.mode.modelica.MoPackage;
import de.thm.mni.mote.mode.modelica.MoRoot;
import de.thm.mni.mote.mode.omcactor.messages.*;
import de.thm.mni.mote.mode.uiactor.control.*;
import de.thm.mni.mote.mode.uiactor.controller.dialogs.ChangeProjectLibrariesDialogController;
import de.thm.mni.mote.mode.uiactor.controller.dialogs.ChangeSystemLibrariesDialogController;
import de.thm.mni.mote.mode.uiactor.controller.dialogs.CreateNewController;
import de.thm.mni.mote.mode.uiactor.editor.actionmanager.ActionManager;
import de.thm.mni.mote.mode.uiactor.handlers.LibraryHandler;
import de.thm.mni.mote.mode.uiactor.messages.OMCAvailableLibsUIMessage;
import de.thm.mni.mote.mode.uiactor.messages.OMCDataUIMessage;
import de.thm.mni.mote.mode.uiactor.messages.OMCSetProjectUIMessage;
import de.thm.mni.mote.mode.uiactor.utilities.ScrollPaneHorizontalScroll;
import de.thm.mni.mote.mode.uiactor.utilities.TreeViewWithItemsWrapper;
import de.thm.mni.mote.mode.util.Utilities;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.control.*;
import javafx.scene.input.ContextMenuEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.HBox;
import org.apache.commons.lang3.tuple.MutablePair;

import javax.management.ReflectionException;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;
import java.util.UUID;
import java.util.stream.Collectors;

import static de.thm.mni.mote.mode.util.Translator.tr;

/**
 * Created by hobbypunk on 15.09.16.
 */
public class MainController extends NotifyController {
  
  private Project project;
  
  public static void configure(List<Object> params) throws ReflectionException, InvocationTargetException, IOException, InstantiationException, IllegalAccessException, NoSuchMethodException {
    UUID group = (UUID) params.get(0);
    ActorController controller = configure(group, Utilities.getView("Main"), Utilities.getBundle("Main"), params);
    controller.start();
  }
  
  @FXML private ScrollPane spLeft;
  
  @FXML private TextField tfLibFilter;
  
  @FXML private HBox hbLeft;
  @FXML private Separator sLeft;
  
  @FXML private HBox hbRight;
  @FXML private Separator sRight;
  
  @FXML private TabPane tabPane;
  
  @FXML private TreeView<MoContainer> tvLibrary;
  private TreeViewWithItemsWrapper<MoContainer> tvwiwLibrary;
  
  @FXML private MenuItem miUndo;
  @FXML private MenuItem miRedo;
  
  @Override
  public void initialize(URL location, ResourceBundle resources) {
    super.initialize(location, resources);
    ScrollPaneHorizontalScroll.modify(spLeft);
  
    tvwiwLibrary = new TreeViewWithItemsWrapper<>(tvLibrary);
    DragResizer.makeResizable(sLeft, hbLeft, DragResizer.LTR);
    DragResizer.makeResizable(sRight, hbRight, DragResizer.RTL);
  }
  
  
  public void lateInitialize() throws InvocationTargetException, NoSuchMethodException, ReflectionException, InstantiationException, IllegalAccessException {
    super.lateInitialize();
    this.project = (Project) getParams().get(1);
    initTreeView();
    initActionManager();
  }
  
  private void initActionManager() {
    ActionManager.activeInstance.addListener((observable, oldValue, newValue) -> {
      miUndo.disableProperty().unbind();
      miRedo.disableProperty().unbind();
      if (newValue != null) {
        miUndo.disableProperty().bind(newValue.getHasUndoCommand().not());
        miRedo.disableProperty().bind(newValue.getHasRedoCommand().not());
      } else {
        miUndo.setDisable(true);
        miRedo.setDisable(true);
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
    getActor().send(new GetDataOMCMessage(getGroup()));
    MainWindow mw = getSettings().getMainwindow();
  
    getStage().setX(mw.getPos().getLeft());
    getStage().setY(mw.getPos().getRight());
    getStage().setWidth(mw.getSize().getLeft());
    getStage().setHeight(mw.getSize().getRight());
    
    hbLeft.setPrefWidth(mw.getWidthLeftPane());
    hbRight.setPrefWidth(mw.getWidthRightPane());
    getStage().setTitle(String.format("%1$s - %2$s %3$s", this.project.getName(), Settings.TITLE, Settings.VERSION));
    getStage().setResizable(true);
    getStage().show();
    getActor().send(new SplashShowMessage(false));
  }
  
  @Override
  public void start() {
  }
  
  private void initTreeView() {
    tvLibrary.setRoot(new TreeItem<>());
    tvLibrary.setShowRoot(false);
    
    tvwiwLibrary.setTreeItemExpandListener(parent -> getActor().send(new UpdateClassOMCMessage(getGroup(), parent)));
    tvwiwLibrary.setTreeItemConfigurer((treeItem, value) -> {
      if (value instanceof MoRoot) {
        treeItem.setExpanded(true);
        treeItem.expandedProperty().addListener((observable, oldValue, newValue) -> {
          if (!newValue) treeItem.setExpanded(true);
        });
      }
    });
    tvLibrary.setCellFactory(param -> {
      MoTreeCell tmp = new MoTreeCell(tabPane);
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
        menuItem.setDisable(!(container.getElement() instanceof MoPackage));
      } else if (tmp.getAction().equals("add_to_diagram")) {
        MainTabControl mtc = (MainTabControl) tabPane.getSelectionModel().getSelectedItem();
        menuItem.setDisable(!container.getElement().hasIcon() || mtc == null);
      } else {
        if (tmp.getAction().equals("open_as_diagram")) menuItem.setDisable(!container.getElement().hasDiagram());
        else if (tmp.getAction().equals("open_as_icon")) menuItem.setDisable(!container.getElement().hasIcon());
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
      if (tabPane.getSelectionModel().getSelectedItem() != null && item.getElement().hasIcon())
        LibraryHandler.getInstance().handleMenu(tabPane, item, "add_to_diagram");
      else
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
    getActor().send(new GetAvailableLibsOMCMessage(getGroup()));
  }
  
  private void handleSystemLibraryEdit(List<String> libs) {
    Dialog<Boolean> d = new Dialog<>();
    FXMLLoader loader = new FXMLLoader();
    loader.setLocation(Utilities.getView("dialogs/ChangeSystemLibraries"));
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
      getActor().send(new ErrorMessage(this.getClass(), getGroup(), e));
    }
  }
  
  private void handleProjectLibraryEdit() {
    Dialog<Boolean> d = new Dialog<>();
    FXMLLoader loader = new FXMLLoader();
    loader.setLocation(Utilities.getView("dialogs/ChangeProjectLibraries"));
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
      getActor().send(new ErrorMessage(this.getClass(), getGroup(), e));
    }
  }
  
  private void handleCreateNew(String type, MoContainer parent) {
    Dialog<Boolean> d = new Dialog<>();
    FXMLLoader loader = new FXMLLoader();
    loader.setLocation(Utilities.getView("dialogs/CreateNew" + type));
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
          getActor().send(new CreateNewOMCMessage(getGroup(), parent, type, controller.getData()));
        }
      });
    } catch (IOException e) {
      getActor().send(new ErrorMessage(this.getClass(), getGroup(), e));
    }
    
  }
  
  private void reloadProject() {
    try {
      project.save();
      this.hide();
      getActor().send(new SplashShowMessage(true));
      getActor().send(new SetProjectOMCMessage(getGroup(), project));
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
    getActor().send(new SaveAllOMCMessage(getGroup(), tabPane.getTabs().stream().map(tab -> ((MainTabControl) tab).getData()).collect(Collectors.toList())));
    tabPane.getTabs().forEach(tab -> handleSave(((MainTabControl) tab).getData()));
  }
  
  private void handleSave(MoContainer container) {
    getActor().send(new SaveOMCMessage(getGroup(), container));
  }
  
  @FXML
  private void handleCloseProject() {
    MessageBus.getInstance().send(new StartUIMessage(WelcomeController.class, getGroup()));
    this.getStage().close();
  }
  
  @FXML
  private void handleClose() {
    MessageBus.getInstance().send(new ExitMessage(getGroup()));
  }
  
  @FXML
  private void undo() {
    ActionManager am = ActionManager.activeInstance.get();
    if (am != null) am.undo();
  }
  
  @FXML
  private void redo() {
    ActionManager am = ActionManager.activeInstance.get();
    if (am != null) am.redo();
  }
  
  private static class MainActor extends NotifyActor<MainController, Message> {
    
    private MainActor(MainController controller) {
      super(controller);
    }
    
    @Override
    public void executeUI(Message msg) {
      super.executeUI(msg);
      if (msg instanceof OMCDataUIMessage) {
        getController().tvwiwLibrary.setItems(((OMCDataUIMessage) msg).getData());
      } else if (msg instanceof OMCLoadStatusUIMessage) {
        if (((OMCLoadStatusUIMessage) msg).getStatus() == OMCLoadStatusUIMessage.STATUS.COMPLETE) {
          getController().show();
        }
      } else if (msg instanceof OMCAvailableLibsUIMessage) {
        Platform.runLater(() -> getController().handleSystemLibraryEdit(((OMCAvailableLibsUIMessage) msg).getLibs()));
      } else if (msg instanceof OMCSetProjectUIMessage) {
        send(new StartUIMessage(MainController.class, getGroup(), ((OMCSetProjectUIMessage) msg).getProject()));
      }
    }
  }
}


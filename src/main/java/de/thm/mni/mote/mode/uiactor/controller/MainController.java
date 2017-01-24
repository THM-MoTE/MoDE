package de.thm.mni.mote.mode.uiactor.controller;

import de.thm.mni.mhpp11.jActor.actors.messagebus.MessageBus;
import de.thm.mni.mhpp11.jActor.actors.ui.interfaces.ActorController;
import de.thm.mni.mhpp11.jActor.actors.ui.splash.messages.SplashShowMessage;
import de.thm.mni.mhpp11.jActor.messages.ExitMessage;
import de.thm.mni.mhpp11.jActor.messages.interfaces.Message;
import de.thm.mni.mote.mode.config.Settings;
import de.thm.mni.mote.mode.config.model.MainWindow;
import de.thm.mni.mote.mode.config.model.Project;
import de.thm.mni.mote.mode.modelica.MoClass;
import de.thm.mni.mote.mode.modelica.MoRoot;
import de.thm.mni.mote.mode.modelica.Saver;
import de.thm.mni.mote.mode.omcactor.messages.GetDataOMCMessage;
import de.thm.mni.mote.mode.omcactor.messages.UpdateClassOMCMessage;
import de.thm.mni.mote.mode.uiactor.control.ContextMenuItem;
import de.thm.mni.mote.mode.uiactor.control.DragResizer;
import de.thm.mni.mote.mode.uiactor.control.MainTabControl;
import de.thm.mni.mote.mode.uiactor.control.TreeViewWithItems;
import de.thm.mni.mote.mode.uiactor.handlers.LibraryHandler;
import de.thm.mni.mote.mode.uiactor.messages.OMCDataUIMessage;
import de.thm.mni.mote.mode.uiactor.statemachine.StateMachine;
import de.thm.mni.mote.mode.util.Utilities;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.layout.HBox;
import javafx.util.Callback;
import lombok.AccessLevel;
import lombok.Getter;

import javax.management.ReflectionException;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;
import java.util.UUID;

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
  
  @FXML private TextField tfLibFilter;
  
  @FXML private HBox hbLeft;
  @FXML private Separator sLeft;
  
  @FXML private HBox hbRight;
  @FXML private Separator sRight;
  
  @FXML private TabPane tabPane;
  
  @Getter(AccessLevel.PROTECTED) @FXML private TreeViewWithItems<MoClass> tvLibrary;
  
  @Override
  public void initialize(URL location, ResourceBundle resources) {
    super.initialize(location, resources);
    
    DragResizer.makeResizable(sLeft, hbLeft, DragResizer.LTR);
    DragResizer.makeResizable(sRight, hbRight, DragResizer.RTL);
  }
  
  
  public void lateInitialize() throws InvocationTargetException, NoSuchMethodException, ReflectionException, InstantiationException, IllegalAccessException {
    super.lateInitialize();
    this.project = (Project) getParams().get(1);
    getActor().send(new GetDataOMCMessage(getGroup()));
    StateMachine.getInstance(this.getScene());
    initTreeView();
  }
  
  @Override
  public void deinitialize() {
    super.deinitialize();
  
    MainWindow mw = getSettings().getMainwindow();
    mw.setPos(getStage().getX(), getStage().getY());
    mw.setSize(getStage().getWidth(), getStage().getHeight());
    mw.setWidthLeftPane((int) hbLeft.getPrefWidth());
    mw.setWidthRightPane((int) hbRight.getPrefWidth());
  }
  
  @Override
  public void show() {
    MainWindow mw = getSettings().getMainwindow();
  
    getStage().setX(mw.getPos().getX());
    getStage().setY(mw.getPos().getY());
    getStage().setWidth(mw.getSize().getX());
    getStage().setHeight(mw.getSize().getY());
    
    hbLeft.setPrefWidth(mw.getWidthLeftPane());
    hbRight.setPrefWidth(mw.getWidthRightPane());
    getStage().setTitle(String.format("%1$s - %2$s %3$s", this.project.getName(), Settings.TITLE, Settings.VERSION));
    getStage().setResizable(true);
    getStage().show();
    getActor().send(new SplashShowMessage(false));
  }
  
  @Override
  public void start() {
    show();
  }
  
  private void initTreeView() {
    tvLibrary.setRoot(new TreeItem<>());
    tvLibrary.setShowRoot(false);
    tvLibrary.setContextMenu(createLibraryMenu());
    tvLibrary.setOnContextMenuRequested(event -> tvLibrary.getContextMenu().getItems().forEach(menuItem -> {
      ContextMenuItem cmi = (ContextMenuItem) menuItem;
      MoClass moClass = tvLibrary.getSelectionModel().getSelectedItem().getValue();
    
      if (cmi.getAction().equals("add.to.diagram")) {
        MainTabControl mtc = (MainTabControl) tabPane.getSelectionModel().getSelectedItem();
        cmi.setDisable(!moClass.hasIcon() || mtc == null || !mtc.isDiagram());
      } else {
        if (cmi.getAction().equals("open.as.diagram")) cmi.setDisable(!moClass.hasDiagram());
        else if (cmi.getAction().equals("open.as.modelica")) cmi.setDisable(!moClass.hasIcon());
      }
    }));
    
    tvLibrary.setOnMouseClicked(event -> {
      TreeItem<MoClass> item = tvLibrary.getSelectionModel().getSelectedItem();
      if (item == null || !item.getValue().hasDiagram()) return;
  
      for (Tab t : tabPane.getTabs()) {
        if (t instanceof MainTabControl && ((MainTabControl) t).getData().equals(item.getValue())) {
          tabPane.getSelectionModel().select(t);
          return;
        }
      }
  
      if (event.getClickCount() == 2) {
        if (tabPane.getSelectionModel().getSelectedItem() != null && ((MainTabControl) tabPane.getSelectionModel().getSelectedItem()).isDiagram() && item.getValue().hasIcon())
          LibraryHandler.getInstance().handleMenu(tabPane, item.getValue(), "add.to.diagram");
        else
          LibraryHandler.getInstance().handleMenu(tabPane, item.getValue(), "open.as.diagram");
      }
    });
    tvLibrary.setTreeItemExpandListener(parent -> getActor().send(new UpdateClassOMCMessage(getGroup(), parent)));
    tvLibrary.setTreeItemConfigurer((treeItem, value) -> {
      if (value instanceof MoRoot) {
        treeItem.setExpanded(true);
      }
    });
    tvLibrary.setCellFactory(new Callback<TreeView<MoClass>, TreeCell<MoClass>>() {
      @Override
      public TreeCell<MoClass> call(TreeView<MoClass> param) {
        return new TreeCell<MoClass>() {
          @Override
          protected void updateItem(MoClass item, boolean empty) {
            super.updateItem(item, empty);
            setDisable(false);
            setStyle(null);
            if (empty) {
              setText(null);
              setGraphic(null);
            } else {
              setText(item.getSimpleName());
              if (item.hasConnectors()) setStyle("-fx-font-weight: bold");
              if (item instanceof MoRoot) {
                setDisable(true);
                setStyle("-fx-background-color: gainsboro;-fx-font-weight: bold; -fx-font-size: 90%; -fx-padding: 2 -15;");
              } else {
                //setGraphic(new MoIconGroup(item).scaleToSize(25., 25.));
              }
            }
          }
        };
      }
    });
  }
  
  private ContextMenu createLibraryMenu() {
    ContextMenu cm = new ContextMenu();
  
    for (String action : new String[]{"open.as.diagram", "open.as.diagram", "add.to.diagram"}) {
      MenuItem tmp = new ContextMenuItem(i18n.getString("menu.context." + action), action);   //todo multilingual
  
      tmp.setOnAction(event -> LibraryHandler.getInstance().handleMenu(tabPane, tvLibrary.getSelectionModel().getSelectedItem().getValue(), action));
      
      cm.getItems().add(tmp);
    }
    return cm;
  }
  
  @FXML
  private void handleSave() {
    if (!tabPane.getSelectionModel().isEmpty()) {
      handleSave(((MainTabControl) tabPane.getSelectionModel().getSelectedItem()).getData());
    }
    
  }
  
  @FXML
  private void handleSaveAll() {
    tabPane.getTabs().forEach(tab -> handleSave(((MainTabControl) tab).getData()));
  }
  
  private void handleSave(MoClass moClass) {
    Saver.save(moClass);
  }
  
  @FXML
  private void handleClose() {
    MessageBus.getInstance().send(new ExitMessage(getGroup()));
  }
  
  private static class MainActor extends NotifyActor<MainController, Message> {
    
    private MainActor(MainController controller) {
      super(controller);
    }
    
    @Override
    public void executeUI(Message msg) {
      super.executeUI(msg);
      if (msg instanceof OMCDataUIMessage) {
        getController().getTvLibrary().setItems(((OMCDataUIMessage) msg).getData());
      }
    }
  }
}


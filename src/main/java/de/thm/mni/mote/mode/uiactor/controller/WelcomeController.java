package de.thm.mni.mote.mode.uiactor.controller;

import de.thm.mni.mhpp11.smbj.messages.logging.ErrorMessage;
import de.thm.mni.mhpp11.smbj.messages.messagebus.StartMessage;
import de.thm.mni.mhpp11.smbj.controller.ui.ActorController;
import de.thm.mni.mhpp11.smbj.messages.ui.creator.StartUIMessage;
import de.thm.mni.mhpp11.smbj.messages.ui.SplashShowMessage;
import de.thm.mni.mhpp11.smbj.messages.Message;
import de.thm.mni.mote.mode.config.Settings;
import de.thm.mni.mote.mode.config.model.Project;
import de.thm.mni.mote.mode.omcactor.OMCActor;
import de.thm.mni.mote.mode.omcactor.OMCException;
import de.thm.mni.mote.mode.omcactor.messages.GetAvailableLibsOMCMessage;
import de.thm.mni.mote.mode.omcactor.messages.OMCLoadErrorMessage;
import de.thm.mni.mote.mode.omcactor.messages.OMCLoadStatusUIMessage;
import de.thm.mni.mote.mode.omcactor.messages.SetProjectOMCMessage;
import de.thm.mni.mote.mode.uiactor.control.RecentProjectControl;
import de.thm.mni.mote.mode.uiactor.controller.dialogs.SettingsDialogController;
import de.thm.mni.mote.mode.uiactor.controller.dialogs.newproject.FirstPageController;
import de.thm.mni.mote.mode.uiactor.messages.OMCAvailableLibsUIMessage;
import de.thm.mni.mote.mode.uiactor.messages.OMCSetProjectUIMessage;
import de.thm.mni.mote.mode.uiactor.messages.OMCStartedMessage;
import de.thm.mni.mote.mode.util.Utilities;
import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.control.Dialog;
import javafx.scene.control.DialogPane;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.FileChooser;
import org.controlsfx.control.PopOver;

import javax.management.ReflectionException;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.net.URL;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

import static de.thm.mni.mote.mode.util.Translator.tr;


/**
 * Created by hobbypunk on 10.09.16.
 */
public class WelcomeController extends NotifyController {
  
  public static void configure(List params) throws ReflectionException, InvocationTargetException, IOException, InstantiationException, IllegalAccessException, NoSuchMethodException {
    ActorController controller;
    if (params.size() > 0 && params.get(0) instanceof UUID)
      controller = configure((UUID) params.get(0), Utilities.getView("Welcome"), Utilities.getBundle("Welcome"));
    else
      controller = configure(Utilities.getView("Welcome"), Utilities.getBundle("Welcome"));
    controller.setParams(params);
    controller.start();
  }
  
  private Boolean omcStarted = true;
  
  @FXML private Label lName;
  @FXML private Label lVersion;
  @FXML private VBox vbRecent;
  
  @FXML private Button btnNewProject;
  @FXML private Button btnOpenProject;
  @FXML private Button btnSettings;
  
  @FXML private StackPane dialogStack;
  
  private PopOver po = new PopOver();
  
  @FXML
  @Override
  public void initialize(URL location, ResourceBundle resources) {
    super.initialize(location, resources);
    
    lName.setText(Settings.TITLE);
    lVersion.setText(Settings.VERSION);
  }
  
  @Override
  protected void lateInitialize() throws ReflectionException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
    super.lateInitialize();
    po.setContentNode(new Label(tr(i18n, "popover.click_to_configure_omc")));
    po.setArrowLocation(PopOver.ArrowLocation.LEFT_BOTTOM);
    po.setDetachable(false);
    po.setAutoHide(false);
    po.setHideOnEscape(false);
    updateRecentList();
  }
  
  @Override
  public void deinitialize() {
    super.deinitialize();
  }
  
  @Override
  public void show() {
    if (getParams().size() == 0) showIgnoreParams();
    else {
      String file = "";
      if (getParams().get(0) instanceof String)
        file = (String) getParams().get(0);
      if (file.isEmpty()) showIgnoreParams();
      else {
        try {
          onOpenProject(Paths.get(file));
        } catch (Exception e) {
          showIgnoreParams();
          getActor().send(new ErrorMessage(Project.class, this.getGroup(), e));
        }
      }
    }
  }
  
  
  private void showIgnoreParams() {
    this.getStage().setTitle(tr(i18n, "title.title") + " " + Settings.TITLE + " " + Settings.VERSION);
    this.getStage().setResizable(false);
    this.getStage().centerOnScreen();
    super.show();
    this.getStage().toFront();
  }
  
  @Override
  public void start() {
    hide();
    getActor().send(new StartMessage(OMCActor.class, this.getGroup()));
  }
  
  
  private void onRemoveLastProject(Project project) {
    getSettings().getRecent().remove(project.getProjectPath());
    Platform.runLater(this::updateRecentList);
  }
  
  private void onOpenLastProject(Project project) {
    onOpenProject(project);
  }
  
  @FXML
  private void onCreateProject() {
    getActor().send(new GetAvailableLibsOMCMessage(getGroup()));
  }
  
  private void onCreateProject(List<String> libs) {
    FirstPageController tmp = new FirstPageController(getGroup(), dialogStack, libs);
    tmp.setOnFinishListener(data -> {
      try {
        data.save();
        this.onOpenProject(data);
      } catch (Exception e) {
        e.printStackTrace();
      }
    });
  }
  
  @FXML
  private void onOpenProject() {
    Path p = getSettings().getRecent().getLastPath();
    FileChooser fc = new FileChooser();
    if (p != null) fc.setInitialDirectory(p.toFile());
    fc.getExtensionFilters().add(new FileChooser.ExtensionFilter(tr(i18n, "file.mode_project"), "*.mp"));
    File f = fc.showOpenDialog(getStage());
    if (f == null) return;
  
    try {
      onOpenProject(f.toPath());
    } catch (Exception e) {
      getActor().send(new ErrorMessage(Project.class, this.getGroup(), e));
    }
  }
  
  private void onOpenProject(Path f) throws Exception {
    Project p = null;
    
    if (getSettings().getRecent().getAll().contains(f)) p = Project.load(f);
    
    if (p == null) {
      p = Project.load(f);
      getSettings().getRecent().add(f);
    }
    
    onOpenProject(p);
  }
  
  private void onOpenProject(Project p) {
    p.updateLastOpened();
    try {
      p.save();
      getSettings().getRecent().remove(p.getProjectPath());
      getSettings().getRecent().add(p.getProjectPath());
      getActor().send(new SplashShowMessage(true));
      getActor().send(new SetProjectOMCMessage(getGroup(), p));
    } catch (Exception e) {
      getActor().send(new ErrorMessage(this.getClass(), p.getName(), e));
    }
  }
  
  @FXML
  void onOpenSettings() {
    Path omc = getSettings().getModelica().getCompiler();
    Dialog d = new Dialog();
    FXMLLoader loader = new FXMLLoader();
    loader.setLocation(Utilities.getView("dialogs/Settings"));
    loader.setResources(Utilities.getBundle("MoDE"));
    try {
      DialogPane dp = loader.load();
      d.setDialogPane(dp);
      po.hide();
      ((SettingsDialogController) loader.getController()).updateUI(this.omcStarted);
      d.show();
      d.setOnCloseRequest(event -> {
        if (!omc.equals(getSettings().getModelica().getCompiler())) start();
        if (!omcStarted) po.show(btnSettings);
      });
    } catch (IOException e) {
      getActor().send(new ErrorMessage(this.getClass(), getGroup(), e));
    }
  }
  
  private void updateRecentList() {
    vbRecent.getChildren().clear();
    List<Path> removedProjects = new ArrayList<>();
    for (Path tmp : getSettings().getRecent().getAll()) {
      try {
        Project p = Project.load(tmp);
        RecentProjectControl rpc = new RecentProjectControl(p, getSettings().getLang());
        vbRecent.getChildren().add(rpc);
        rpc.setOnClick(event -> onOpenLastProject(rpc.getProject()));
        rpc.setOnClose(event -> onRemoveLastProject(rpc.getProject()));
      } catch (Exception e) {
        getActor().send(new ErrorMessage(WelcomeController.class, getGroup(), e));
        removedProjects.add(tmp);
      }
    }
  
    removedProjects.forEach(getSettings().getRecent()::remove);
  }
  
  @FXML
  void onOpenHelp() {
    System.out.println("onOpenHelp");
  }
  
  @FXML
  void onOpenAbout() {
    System.out.println("onOpenAbout");
  }
  
  private void updateUI(Boolean omcStarted) {
    this.omcStarted = omcStarted;
    vbRecent.setDisable(!omcStarted);
    btnNewProject.setDisable(!omcStarted);
    btnOpenProject.setDisable(!omcStarted);
  
    if (!omcStarted) {
      btnSettings.getStyleClass().add("red-text");
    
      this.getStage().setOnShown(event -> {
        try {
          Thread.sleep(500);
        } catch (InterruptedException e) {
          e.printStackTrace();
        }
        Platform.runLater(() -> po.show(btnSettings));
      });
  
    } else btnSettings.getStyleClass().remove("red-text");
  }
  
  
  private static class WelcomeActor extends NotifyActor<WelcomeController, Message> {
    
    protected WelcomeActor(WelcomeController controller) {
      super(controller);
    }
    
    @Override
    public void executeUI(Message msg) {
      if (msg instanceof OMCLoadErrorMessage) {
        send(new SplashShowMessage(true));
        getController().show();
      }
  
      if (msg instanceof OMCStartedMessage) {
        Platform.runLater(() -> {
          getController().updateUI(true);
          getController().show();
        });
      } else if (msg instanceof ErrorMessage && ((ErrorMessage) msg).getThrowable() instanceof OMCException) {
        Platform.runLater(() -> {
          getController().updateUI(false);
          getController().showIgnoreParams();
        });
      } else if (msg instanceof OMCSetProjectUIMessage) {
        send(new StartUIMessage(MainController.class, getGroup(), ((OMCSetProjectUIMessage) msg).getProject()));
      } else if (msg instanceof OMCAvailableLibsUIMessage) {
        Platform.runLater(() -> getController().onCreateProject(((OMCAvailableLibsUIMessage) msg).getLibs()));
      } else if (msg instanceof OMCLoadStatusUIMessage) {
        send(msg);
      }
  
      //if (!(msg instanceof ErrorMessage && ((ErrorMessage) msg).getThrowable() instanceof OMCException))
        super.executeUI(msg);
    }
  }
}

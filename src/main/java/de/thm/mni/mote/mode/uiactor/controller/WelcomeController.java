package de.thm.mni.mote.mode.uiactor.controller;

import de.thm.mni.mhpp11.jActor.actors.logging.messages.DebugMessage;
import de.thm.mni.mhpp11.jActor.actors.logging.messages.ErrorMessage;
import de.thm.mni.mhpp11.jActor.actors.messagebus.messages.StartMessage;
import de.thm.mni.mhpp11.jActor.actors.ui.interfaces.ActorController;
import de.thm.mni.mhpp11.jActor.actors.ui.messages.StartUIMessage;
import de.thm.mni.mhpp11.jActor.messages.interfaces.Message;
import de.thm.mni.mote.mode.config.Settings;
import de.thm.mni.mote.mode.config.model.Project;
import de.thm.mni.mote.mode.omcactor.OMCActor;
import de.thm.mni.mote.mode.omcactor.OMCException;
import de.thm.mni.mote.mode.omcactor.messages.GetAvailableLibsOMCMessage;
import de.thm.mni.mote.mode.omcactor.messages.SetProjectOMCMessage;
import de.thm.mni.mote.mode.uiactor.control.NewProjectFirstPageControl;
import de.thm.mni.mote.mode.uiactor.control.RecentProjectControl;
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

import javax.management.ReflectionException;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.net.URL;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Observable;
import java.util.ResourceBundle;


/**
 * Created by hobbypunk on 10.09.16.
 */
public class WelcomeController extends NotifyController {
  
  public static void configure(List<String> params) throws ReflectionException, InvocationTargetException, IOException, InstantiationException, IllegalAccessException, NoSuchMethodException {
    ActorController controller = configure(Utilities.getView("Welcome"), Utilities.getBundle("Welcome"));
    controller.setParams(params);
    controller.start();
  }
  
  
  @FXML private Label lName;
  @FXML private Label lVersion;
  @FXML private VBox vbRecent;
  
  @FXML private Button btnNewProject;
  @FXML private Button btnOpenProject;
  
  @FXML private StackPane dialogStack;
  
  @FXML
  @Override
  public void initialize(URL location, ResourceBundle resources) {
    super.initialize(location, resources);
    
    lName.setText(Settings.TITLE);
    lVersion.setText(Settings.VERSION);
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
      String file = (String) getParams().get(0);
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
    this.getStage().setTitle(i18n.getString("title.title") + " " + Settings.TITLE + " " + Settings.VERSION);
    this.getStage().setResizable(false);
    this.getStage().centerOnScreen();
    super.show();
  }
  
  @Override
  public void start() {
    updateUI(false);
    hide();
    getActor().send(new StartMessage(OMCActor.class, this.getGroup()));
  }
  
  
  private void onRemoveLastProject(Project project) {
    getSettings().getRecent().remove(project.getProjectPath());
  }
  
  private void onOpenLastProject(Project project) {
    onOpenProject(project);
  }
  
  @FXML
  private void onCreateProject() {
    getActor().send(new GetAvailableLibsOMCMessage(getGroup()));
  }
  
  private void onCreateProject(List<String> libs) {
    NewProjectFirstPageControl tmp = new NewProjectFirstPageControl(dialogStack, libs);
    tmp.setOnFinishListener(this::onOpenProject);
  }
  
  @FXML
  private void onOpenProject() {
    Path p = getSettings().getRecent().getLastPath();
    FileChooser fc = new FileChooser();
    if (p != null) fc.setInitialDirectory(p.toFile());
    fc.getExtensionFilters().add(new FileChooser.ExtensionFilter("MoDE Project Files", "*.mp"));
    File f = fc.showOpenDialog(root.getScene().getWindow());
    if (f == null) return;
  
    try {
      onOpenProject(f.toPath());
    } catch (Exception e) {
      getActor().send(new ErrorMessage(Project.class, this.getGroup(), e));
    }
  }
  
  private void onOpenProject(Path f) throws Exception {
    Project p = null;
    
    getActor().send(new DebugMessage(this.getClass(), getGroup(), "Load File", f.toString()));
    
    if (getSettings().getRecent().getAll().contains(f)) p = Project.load(f);
    
    if (p == null) {
      p = Project.load(f);
      getSettings().getRecent().add(f);
    }
    
    onOpenProject(p);
  }
  
  void onOpenProject(Project p) {
    p.updateLastOpened();
    try {
      p.save();
      getSettings().getRecent().remove(p.getProjectPath());
      getSettings().getRecent().add(p.getProjectPath());
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
    loader.setLocation(Utilities.getView("Settings"));
    loader.setResources(Utilities.getBundle("Settings"));
    try {
      DialogPane dp = loader.load();
      dp.getStylesheets().add(0, Utilities.getRessources("css/Basis.css").toExternalForm());
      d.setDialogPane(dp);
      d.show();
      d.setOnCloseRequest(event -> {
        if (!omc.equals(getSettings().getModelica().getCompiler())) start();
      });
    } catch (IOException e) {
      getActor().send(new ErrorMessage(this.getClass(), getGroup(), e));
    }
  }
  
  @Override
  public void update(Observable o, Object arg) {
    super.update(o, arg);
    if (arg instanceof String && ((String) arg).contains("Recent")) {
      updateRecentList();
    }
  }
  
  private void updateRecentList() {
    vbRecent.getChildren().clear();
    for (Path tmp : getSettings().getRecent().getAll()) {
      try {
        Project p = Project.load(tmp);
        RecentProjectControl rpc = new RecentProjectControl(p, getSettings().getLang());
        vbRecent.getChildren().add(rpc);
        rpc.setOnClick(event -> onOpenLastProject(rpc.getProject()));
        rpc.setOnClose(event -> onRemoveLastProject(rpc.getProject()));
      } catch (Exception e) {
        e.printStackTrace();
      }
    }
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
    if (omcStarted) {
      btnNewProject.setDisable(false);
      btnOpenProject.setDisable(false);
    } else {
      btnNewProject.setDisable(true);
      btnOpenProject.setDisable(true);
    }
  }
  
  
  private static class WelcomeActor extends NotifyActor<WelcomeController, Message> {
    
    protected WelcomeActor(WelcomeController controller) {
      super(controller);
    }
    
    @Override
    public void executeUI(Message msg) {
      if (msg instanceof OMCStartedMessage) {
        //send(new StartDataCollectionOMCMessage(getGroup(), TYPE.SYSTEM));
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
      }
  
      super.executeUI(msg);
    }
  }
}

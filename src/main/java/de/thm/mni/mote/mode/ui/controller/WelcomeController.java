package de.thm.mni.mote.mode.ui.controller;

import de.thm.mni.mhpp11.jActor.actors.messagebus.messages.StartMessage;
import de.thm.mni.mhpp11.jActor.actors.ui.interfaces.AbstractUIActor;
import de.thm.mni.mhpp11.jActor.actors.ui.interfaces.ActorController;
import de.thm.mni.mhpp11.jActor.messages.interfaces.Message;
import de.thm.mni.mote.mode.config.Settings;
import de.thm.mni.mote.mode.config.model.Project;
import de.thm.mni.mote.mode.omcactor.OMCActor;
import de.thm.mni.mote.mode.omcactor.messages.OMCErrorMessage;
import de.thm.mni.mote.mode.omcactor.messages.OMCStartedMessage;
import de.thm.mni.mote.mode.parser.PackageParser;
import de.thm.mni.mote.mode.ui.control.RecentProjectControl;
import de.thm.mni.mote.mode.util.Utilities;
import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Dialog;
import javafx.scene.control.DialogPane;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.FileChooser;

import javax.management.ReflectionException;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.net.URL;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Observable;
import java.util.ResourceBundle;


/**
 * Created by hobbypunk on 10.09.16.
 */
public class WelcomeController extends NotifyController {
  
  @FXML private Label lName;
  @FXML private Label lVersion;
  @FXML private VBox vbRecent;
  
  @FXML private Button btnNewProject;
  @FXML private Button btnOpenProject;
  
  @FXML @Override
  public void initialize(URL location, ResourceBundle resources) {
    super.initialize(location, resources);
  
    lName.setText(Settings.TITLE);
    lVersion.setText(Settings.VERSION);
    updateRecentList();
  }
  
  public static void configure() throws ReflectionException, InvocationTargetException, IOException, InstantiationException, IllegalAccessException, NoSuchMethodException {
    ActorController controller = configure(Utilities.getView("Welcome"), Utilities.getBundle("Welcome"));
    controller.start();
  }
  
  @Override
  public void deinitialize() {
    super.deinitialize();
  }
  
  public void show(String file) {
    if(file.isEmpty()) show();
    else onOpenProject(Paths.get(file));
  }
  
  @Override
  public void show() {
    this.getStage().setTitle(i18n.getString("title.title") + " " + Settings.TITLE + " " + Settings.VERSION);
    this.getStage().setScene(this.scene);
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
    settings.getRecent().remove(project);
  }
  
  private void onOpenLastProject(Project project) {
    onOpenProject(project);
  }
  
  @FXML
  private void onCreateProject() {
    System.out.println("onCreateProject");
  }
  
  @FXML
  private void onOpenProject() {
    Path p = settings.getRecent().getLastPath();
    FileChooser fc = new FileChooser();
    if (p != null) fc.setInitialDirectory(p.toFile());
    fc.getExtensionFilters().add(new FileChooser.ExtensionFilter("Modelica Files", "*.mo"));
    File f = fc.showOpenDialog(root.getScene().getWindow());
    if(f == null) return;
    onOpenProject(f.toPath());
  }
  
  private void onOpenProject(Path f) {
    Project p = null;
    String name;
    
    logger.debug("Load File", f.toString());
  
    f = PackageParser.findBasePackage(f);
    if (f.getFileName().toString().toLowerCase().equals("package.mo")) name = f.getParent().getFileName().toString();
    else name = f.getFileName().toString().replaceAll(".mo$", "");
    for (Project tmp : settings.getRecent().getAll()) {
      if(tmp.getFile().equals(f)) {
        p = tmp;
        break;
      }
    }
  
    if(p == null) p = new Project(name, f);
  
    onOpenProject(p);
    
  }
  
  private void onOpenProject(Project p) {
    p.updateLastOpened();
    settings.getRecent().remove(p);
    settings.getRecent().add(p);
    FXMLLoader loader = new FXMLLoader();
    loader.setLocation(Utilities.getView("Main"));
    loader.setResources(Utilities.getBundle("Main"));
    try {
      Pane rootLayout = loader.load();
      MainController controller = loader.getController();
      Scene scene = new Scene(rootLayout);
      controller.lateInitialize(this.getStage(), scene, p);
      controller.show();
    } catch (IOException e) {
      logger.error(e);
    }
  }
  
  @FXML
  void onOpenSettings() {
    Path omc = Settings.load().getModelica().getCompiler();
    Dialog d = new Dialog();
    FXMLLoader loader = new FXMLLoader();
    loader.setLocation(Utilities.getView("Settings"));
    loader.setResources(Utilities.getBundle("Settings"));
    try {
      DialogPane dp = loader.load();
      d.setDialogPane(dp);
      d.show();
      d.setOnCloseRequest(event -> {
        if (!omc.equals(Settings.load().getModelica().getCompiler())) start();
      });
    } catch (IOException e) {
      logger.error(e);
    }
  }
  
  @Override
  public void update(Observable o, Object arg) {
    super.update(o, arg);
    if(arg instanceof String && ((String) arg).contains("Recent")) {
      updateRecentList();
    }
  }
  
  private void updateRecentList() {
    vbRecent.getChildren().clear();
    for(Project p : settings.getRecent().getAll()) {
      RecentProjectControl rpc = new RecentProjectControl(p, settings.getLang());
      vbRecent.getChildren().add(rpc);
      rpc.setOnClick(event -> onOpenLastProject(rpc.getProject()));
      rpc.setOnClose(event -> onRemoveLastProject(rpc.getProject()));
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
      //btnNewProject.setDisable(false);
      btnOpenProject.setDisable(false);
    } else {
      btnNewProject.setDisable(true);
      btnOpenProject.setDisable(true);
    }
  }
  
  
  private static class WelcomeActor extends AbstractUIActor<WelcomeController, Message> {
    
    protected WelcomeActor(WelcomeController controller) {
      super(controller);
    }
    
    @Override
    public void executeUI(Message msg) {
      if (msg instanceof OMCStartedMessage) {
        getController().updateUI(true);
        Platform.runLater(() -> getController().show());
      } else if (msg instanceof OMCErrorMessage) {
        getController().updateUI(false);
        Platform.runLater(() -> getController().show());
      }
    }
  }
}

package de.thm.mni.mhpp11.controller;

import de.thm.mni.mhpp11.control.RecentProjectControl;
import de.thm.mni.mhpp11.util.UTF8ResourceBundleControl;
import de.thm.mni.mhpp11.util.config.Settings;
import de.thm.mni.mhpp11.util.config.model.Project;
import de.thm.mni.mhpp11.util.parser.PackageParser;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Dialog;
import javafx.scene.control.DialogPane;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.FileChooser;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.Observable;
import java.util.ResourceBundle;


/**
 * Created by hobbypunk on 10.09.16.
 */
public class WelcomeController extends NotifyController {
  
  @FXML private Label lName;
  @FXML private Label lVersion;
  @FXML private VBox vbRecent;
  
  @FXML @Override
  public void initialize(URL location, ResourceBundle resources) {
    super.initialize(location, resources);
    
    lName.setText(Settings.NAME);
    lVersion.setText(Settings.VERSION);
    updateRecentList();
  }
  
  @Override
  public void show() {
    this.stage.setTitle(i18n.getString("title.title") + " " + Settings.NAME + " " + Settings.VERSION);
    this.stage.setScene(this.scene);
    this.stage.setResizable(false);
    this.stage.centerOnScreen();
    this.stage.show();
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
    Project p = null;
    File f;
    FileChooser fc = new FileChooser();
    fc.getExtensionFilters().add(new FileChooser.ExtensionFilter("Modelica Files", "*.mo"));
    f = fc.showOpenDialog(root.getScene().getWindow());
    if(f == null) return;
    String name;
  
    logger.debug("Load File", f.getPath());
  
    f = PackageParser.getInstance().findBasePackage(f);
    if(f.getName().equals("package.mo")) name = f.getParentFile().getName();
    else name = f.getName().replaceAll(".mo$", "");
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
    loader.setLocation(getClass().getResource("../view/Main.fxml"));
    //TODO: loader.setResources();
    try {
      Pane rootLayout = loader.load();
      MainController controller = loader.getController();
      Scene scene = new Scene(rootLayout);
      controller.lateInitialize(this.stage, scene, p);
      controller.show();
    } catch (IOException e) {
      logger.error(e);
    }
  }
  
  @FXML
  void onOpenSettings() {
    Dialog d = new Dialog();
    FXMLLoader loader = new FXMLLoader();
    loader.setLocation(getClass().getResource("../view/Settings.fxml"));
    loader.setResources(ResourceBundle.getBundle("de/thm/mni/mhpp11/i18n/Settings", settings.getLang(), new UTF8ResourceBundleControl()));
    try {
      DialogPane dp = loader.load();
      d.setDialogPane(dp);
      d.show();
    } catch (IOException e) {
      logger.error(e);
      //TODO remove
      e.printStackTrace();
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
}

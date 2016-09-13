package de.thm.mni.mhpp11.controller;

import de.thm.mni.mhpp11.control.RecentProjectControl;
import de.thm.mni.mhpp11.util.config.Settings;
import de.thm.mni.mhpp11.util.config.model.Project;
import de.thm.mni.mhpp11.util.logger.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.FileChooser;

import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;


/**
 * Created by hobbypunk on 10.09.16.
 */
public class WelcomeController extends NotifyController implements Initializable {
  
  @FXML private HBox root;
  @FXML private Label lName;
  @FXML private Label lVersion;
  @FXML private VBox vbRecent;
  
  private Settings settings;
  private Logger logger;
  
  @Override
  public void initialize(URL location, ResourceBundle resources) {
    try {
      this.settings = Settings.load();
      logger = settings.getLogger();
    } catch (Exception e) {
      //TODO: Should never call
    }
    lName.setText(Settings.NAME);
    lVersion.setText(Settings.VERSION);
    for(Project p : settings.getRecents()) {
      final RecentProjectControl rpc = new RecentProjectControl(p);
      rpc.setController(this);
      vbRecent.getChildren().add(rpc);
      rpc.setOnClick(event -> onOpenLastProject(rpc.getProject()));
      rpc.setOnClose(event -> onRemoveLastProject(rpc, rpc.getProject()));
    }
  }
  
  private void onRemoveLastProject(RecentProjectControl rpc, Project project) {
    vbRecent.getChildren().remove(rpc);
    settings.removeRecent(project);
  }
  
  private void onOpenLastProject(Project project) {
    System.out.println("onOpenLastProject: " + project.getName());
  }
  
  @FXML
  void onCreateProject(ActionEvent event) {
    System.out.println("onCreateProject");
  }
  
  @FXML
  void onOpenProject(ActionEvent event) {
    System.out.println("onOpenProject");
    FileChooser fc = new FileChooser();
    fc.getExtensionFilters().add(new FileChooser.ExtensionFilter("Modelica Files", "*.mo"));
    File f = fc.showOpenDialog(root.getScene().getWindow());
    if(f == null) return;
    logger.debug("Load File", f.getPath());
  }
  
  @FXML
  void onOpenSettings(ActionEvent event) {
    System.out.println("onOpenSettings");
  }
  
  @FXML
  void onOpenHelp(ActionEvent event) {
    System.out.println("onOpenHelp");
  }
  
  @FXML
  void onOpenAbout(ActionEvent event) {
    System.out.println("onOpenAbout");
  }
}

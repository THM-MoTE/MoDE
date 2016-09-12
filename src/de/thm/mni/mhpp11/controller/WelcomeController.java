package de.thm.mni.mhpp11.controller;

import de.thm.mni.mhpp11.control.RecentProjectControl;
import de.thm.mni.mhpp11.util.config.Settings;
import de.thm.mni.mhpp11.util.config.model.Project;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;

import java.net.URL;
import java.util.ResourceBundle;


/**
 * Created by hobbypunk on 10.09.16.
 */
public class WelcomeController implements Initializable {
  
  private Settings settings;
  
  @FXML private Label lName;
  @FXML private Label lVersion;
  @FXML private VBox vbRecent;
  
  @Override
  public void initialize(URL location, ResourceBundle resources) {
    try {
      this.settings = Settings.load();
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
    System.out.println("Open: " + project);
  }
  
  @FXML
  void onCreate(ActionEvent event) {
    System.out.println("onCreate");
  }
  
  @FXML
  void onOpen(ActionEvent event) {
    System.out.println("onOpen");
  }
}

package de.thm.mni.mote.mode.frontend.dialogs.newproject.controllers;

import de.thm.mni.mote.mode.config.model.Project;
import de.thm.mni.mote.mode.frontend.welcome.fragments.controllers.DialogStackController;
import de.thm.mni.mote.mode.frontend.welcome.fragments.controllers.SelectProjectLibsController;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.layout.StackPane;
import lombok.Setter;

import java.net.URL;
import java.util.ResourceBundle;
import java.util.UUID;

/**
 * Created by hobbypunk on 26.01.17.
 */
public class ThirdPageController extends DialogStackController {
  
  @Setter
  private Project.ProjectBuilder projectBuilder = null;
  
  @FXML private SelectProjectLibsController selectProjectLibsController;
  
  public ThirdPageController(UUID id, StackPane parent) {
    super(id, parent, true);
    load();
  }
  
  @Override
  public void initialize(URL location, ResourceBundle resources) {
    super.initialize(location, resources);
  }
  
  @Override
  protected void onBtnNext(ActionEvent event) {
    this.projectBuilder.projectLibraries(selectProjectLibsController.getLibraries());
    if (getOnFinishListener() != null) getOnFinishListener().handle(this.projectBuilder.build());
    getStackPane().getChildren().remove(this);
  }
}
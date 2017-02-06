package de.thm.mni.mote.mode.uiactor.controller.dialogs.newproject;

import de.thm.mni.mote.mode.config.model.Project;
import de.thm.mni.mote.mode.uiactor.control.NewProject;
import de.thm.mni.mote.mode.uiactor.controller.fragments.DialogStackController;
import de.thm.mni.mote.mode.uiactor.controller.fragments.SelectProjectLibsController;
import javafx.beans.property.BooleanProperty;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.layout.StackPane;
import lombok.Getter;
import lombok.Setter;

import java.net.URL;
import java.util.ResourceBundle;
import java.util.UUID;

/**
 * Created by hobbypunk on 26.01.17.
 */
public class ThirdPageController extends DialogStackController implements NewProject {
  
  @Getter private final BooleanProperty isValidProperty = new SimpleBooleanProperty(true);
  @Setter private Project.ProjectBuilder projectBuilder = Project.builder();
  
  @FXML private SelectProjectLibsController selectProjectLibsController;
  
  public ThirdPageController(UUID group, StackPane parent) {
    super(group, parent, "newproject/ThirdPage", true);
    load();
  }
  
  @Override
  public void initialize(URL location, ResourceBundle resources) {
    super.initialize(location, resources);
  }
  
  @Override
  protected void onBtnNext(ActionEvent event) {
    
    if (getOnFinishListener() != null) getOnFinishListener().handle(getProjectBuilder().build());
    getStackPane().getChildren().remove(this);
  }
  
  @Override
  public Project.ProjectBuilder getProjectBuilder() {
    return this.projectBuilder;
  }
}

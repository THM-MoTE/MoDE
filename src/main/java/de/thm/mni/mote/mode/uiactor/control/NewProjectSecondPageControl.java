package de.thm.mni.mote.mode.uiactor.control;

import de.thm.mni.mote.mode.config.model.Project;
import javafx.beans.property.BooleanProperty;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.fxml.FXML;
import javafx.scene.layout.StackPane;
import lombok.Getter;
import lombok.Setter;

import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;
import java.util.UUID;

/**
 * Created by hobbypunk on 26.01.17.
 */
public class NewProjectSecondPageControl extends DialogStackControl implements NewProject {
  
  private final List<String> libs;
  @Getter private final BooleanProperty isValidProperty = new SimpleBooleanProperty(true);
  @Setter private Project.ProjectBuilder projectBuilder = Project.builder();
  
  @FXML private SelectLibsControl<String> selectLibsController;
  
  public NewProjectSecondPageControl(UUID group, StackPane parent, List<String> libs) {
    super(group, parent, "NewProjectSecondPage", "NewProject", true);
    this.libs = libs;
    load();
  }
  
  @Override
  public void initialize(URL location, ResourceBundle resources) {
    super.initialize(location, resources);
    selectLibsController.setList(libs);
  }
  
  @Override
  protected void onBtnNext() {
    //Todo: page 3, project libs
    getProjectBuilder().systemLibraries(selectLibsController.getSelected());
    if (getOnFinishListener() != null) getOnFinishListener().handle(getProjectBuilder().build());
    getStackPane().getChildren().remove(this);
  }
  
  @Override
  public Project.ProjectBuilder getProjectBuilder() {
    return this.projectBuilder;
  }
}

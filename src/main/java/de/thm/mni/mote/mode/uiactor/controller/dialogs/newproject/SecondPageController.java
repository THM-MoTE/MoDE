package de.thm.mni.mote.mode.uiactor.controller.dialogs.newproject;

import de.thm.mni.mote.mode.config.model.Project;
import de.thm.mni.mote.mode.uiactor.controller.fragments.DialogStackController;
import de.thm.mni.mote.mode.uiactor.controller.fragments.SelectSystemLibsController;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.layout.StackPane;
import lombok.Setter;

import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;
import java.util.UUID;

/**
 * Created by hobbypunk on 26.01.17.
 */
public class SecondPageController extends DialogStackController {
  
  private final List<String> libs;
  @Setter
  private Project.ProjectBuilder projectBuilder = null;
  
  @FXML private SelectSystemLibsController<String> selectSystemLibsController;
  
  public SecondPageController(UUID group, StackPane parent, List<String> libs) {
    super(group, parent, "newproject/SecondPage", false);
    this.libs = libs;
    load();
  }
  
  @Override
  public void initialize(URL location, ResourceBundle resources) {
    super.initialize(location, resources);
    selectSystemLibsController.setList(libs);
  }
  
  @Override
  protected void onBtnNext(ActionEvent event) {
    this.projectBuilder.systemLibraries(selectSystemLibsController.getSelected());
  
    ThirdPageController page = new ThirdPageController(getGroup(), this.getStackPane());
    page.setProjectBuilder(this.projectBuilder);
    page.setOnFinishListener(data -> {
      this.getOnFinishListener().handle(data);
      getStackPane().getChildren().remove(this);
    });
  
  }
}

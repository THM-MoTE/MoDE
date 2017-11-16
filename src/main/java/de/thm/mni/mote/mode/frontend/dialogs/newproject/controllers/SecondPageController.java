package de.thm.mni.mote.mode.frontend.dialogs.newproject.controllers;

import de.thm.mni.mhpp11.smbj.manager.ActorManager;
import de.thm.mni.mote.mode.backend.omc.messages.GetAvailableLibsOMCMessage;
import de.thm.mni.mote.mode.config.model.Project;
import de.thm.mni.mote.mode.frontend.welcome.fragments.controllers.DialogStackController;
import de.thm.mni.mote.mode.frontend.welcome.fragments.controllers.SelectSystemLibsController;
import javafx.application.Platform;
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
  
  @Setter
  private Project.ProjectBuilder projectBuilder = null;
  
  @FXML private SelectSystemLibsController<String> selectSystemLibsController;
  
  public SecondPageController(UUID id, StackPane parent) {
    super(id, parent, false);
    load();
  }
  
  @Override
  public void initialize(URL location, ResourceBundle resources) {
    super.initialize(location, resources);
    ActorManager.getInstance().send(new GetAvailableLibsOMCMessage(getID()) {
  
      @Override
      public Void answer(UUID source, List<String> payload) {
        Platform.runLater(() -> selectSystemLibsController.setList(payload));
        return null;
      }
    });
  }
  
  @Override
  protected void onBtnNext(ActionEvent event) {
    this.projectBuilder.systemLibraries(selectSystemLibsController.getSelected());
  
    ThirdPageController page = new ThirdPageController(getID(), this.getStackPane());
    page.setProjectBuilder(this.projectBuilder);
    page.setOnFinishListener(data -> {
      this.getOnFinishListener().handle(data);
      getStackPane().getChildren().remove(this);
    });
  
  }
}

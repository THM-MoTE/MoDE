package de.thm.mni.mote.mode.frontend.controllers;

import de.thm.mni.mhpp11.smbj.logging.messages.ErrorMessage;
import de.thm.mni.mhpp11.smbj.messages.ExitMessage;
import de.thm.mni.mhpp11.smbj.ui.controllers.ActorController;
import de.thm.mni.mote.mode.config.Settings;
import de.thm.mni.mote.mode.util.Utilities;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Modality;
import javafx.stage.Stage;
import lombok.Getter;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

/**
 * Created by Marcel Hoppe on 14.09.16.
 */
@Getter
public abstract class Controller extends ActorController implements IController {
  
  private Settings settings;
  
  ResourceBundle i18n;
  
  protected Controller() {
    try {
      settings = Settings.load();
    } catch (Exception e) {
      getActor().send(new ErrorMessage(this.getClass(), e));
    }
  }
  
  @Override
  public String getViewPath() {
    return getActor().getViewPath();
  }
  
  @Override
  public String getBundlePath() {
    return getActor().getBundlePath();
  }
  
  
  
  @Override
  public void initialize(URL location, ResourceBundle resources) {
    i18n = resources;
  }
  
  public void lateInitialize() {
    this.getScene().getStylesheets().add(0, Utilities.getCSS("css/Basis.css").toExternalForm());
    super.lateInitialize();
  }
  
  @Override
  public void close() {
    getActor().send(new ExitMessage(getID()));
  }
  
  @Override
  public void onClose() {
    this.deinitialize();
    settings.save();
    super.onClose();
  }
  
  void deinitialize() {}
  
  @FXML
  void onOpenHelp() {
    System.out.println("onOpenHelp");
  }
  
  @FXML
  void onOpenAbout() {
    Stage dialog = new Stage();
    FXMLLoader loader = new FXMLLoader();
    loader.setLocation(Utilities.getView("About"));
    loader.setResources(Utilities.getBundle("About"));
    try {
      Scene scene = new Scene(loader.load());
      dialog.setScene(scene);
      dialog.initOwner(getStage());
      dialog.initModality(Modality.APPLICATION_MODAL);
      
      Controller c = loader.getController();
      c.setActor(getActor());
      c.setScene(scene);
      c.setStage(dialog);
      c.lateInitialize();
      dialog.showAndWait();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}

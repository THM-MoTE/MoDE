package de.thm.mni.mote.mode.frontend.controllers;

import de.thm.mni.mhpp11.smbj.logging.messages.ErrorMessage;
import de.thm.mni.mhpp11.smbj.messages.ExitMessage;
import de.thm.mni.mhpp11.smbj.ui.controllers.ActorController;
import de.thm.mni.mote.mode.config.Settings;
import de.thm.mni.mote.mode.util.Utilities;
import lombok.Getter;

import java.net.URL;
import java.util.ResourceBundle;

/**
 * Created by hobbypunk on 14.09.16.
 */
@Getter
public abstract class Controller extends ActorController implements IController {
  
  private Settings settings;
  
  ResourceBundle i18n;
  
  public Controller() {
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
  
  public void deinitialize() {}
}

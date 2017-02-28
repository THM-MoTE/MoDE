package de.thm.mni.mote.mode.uiactor.controller;

import de.thm.mni.mhpp11.jActor.actors.logging.messages.ErrorMessage;
import de.thm.mni.mhpp11.jActor.actors.ui.interfaces.ActorController;
import de.thm.mni.mote.mode.config.Settings;
import de.thm.mni.mote.mode.util.Utilities;
import javafx.fxml.Initializable;
import lombok.Getter;

import javax.management.ReflectionException;
import java.lang.reflect.InvocationTargetException;
import java.net.URL;
import java.util.ResourceBundle;

/**
 * Created by hobbypunk on 14.09.16.
 */
@Getter
public abstract class Controller extends ActorController implements Initializable {
  private Settings settings;
  
  ResourceBundle i18n;
  
  public Controller() {
    try {
      settings = Settings.load();
    } catch (Exception e) {
      getActor().send(new ErrorMessage(this.getClass(), getGroup(), e));
    }
  }
  
  @Override
  public void initialize(URL location, ResourceBundle resources) {
    i18n = resources;
  }
  
  protected void lateInitialize() throws ReflectionException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
    this.getScene().getStylesheets().add(0, Utilities.getResource("css/Basis.css").toExternalForm());
    super.lateInitialize();
  }
  
  @Override
  public void onClose() {
    this.deinitialize();
    settings.save();
    getStage().hide();
  }
  
  public void deinitialize() {}
}

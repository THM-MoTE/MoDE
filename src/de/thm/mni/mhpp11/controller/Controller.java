package de.thm.mni.mhpp11.controller;

import de.thm.mni.mhpp11.util.config.Settings;
import de.thm.mni.mhpp11.util.logger.Logger;
import de.thm.mni.mhpp11.util.logger.LoggerFactory;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ResourceBundle;

/**
 * Created by hobbypunk on 14.09.16.
 */
public abstract class Controller implements Initializable {
  protected Settings settings;
  protected Logger logger;
  
  protected Stage stage;
  protected Scene scene;
  
  @Override
  public void initialize(URL location, ResourceBundle resources) {
    logger = LoggerFactory.getConsoleLogger(de.thm.mni.mhpp11.util.config.model.Logger.LEVEL.ALWAYS, de.thm.mni.mhpp11.util.config.model.Logger.LEVEL.ALWAYS);
    try {
      settings = Settings.load();
    } catch (Exception e) {
      logger.error(e);
    }
    logger = LoggerFactory.getConsoleLogger(settings.getLogLevel(), settings.getNotifyLevel());
  }
  
  public void lateInitialize(Stage stage, Scene scene) {
    this.stage = stage;
    this.scene = scene;
  }
  
  public void deinitialize() {}
}

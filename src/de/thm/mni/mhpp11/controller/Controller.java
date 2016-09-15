package de.thm.mni.mhpp11.controller;

import de.thm.mni.mhpp11.MainApp;
import de.thm.mni.mhpp11.util.config.Settings;
import de.thm.mni.mhpp11.util.config.model.Logger;
import de.thm.mni.mhpp11.util.config.model.Logger.LEVEL;
import de.thm.mni.mhpp11.util.logger.ConsoleLogger;
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
  
  protected MainApp app;
  protected Stage stage;
  protected Scene scene;
  
  ResourceBundle i18n;
  
  @Override
  public void initialize(URL location, ResourceBundle resources) {
    i18n = resources;
    logger = new ConsoleLogger(LEVEL.ERROR, LEVEL.ERROR);
    try {
      settings = Settings.load();
    } catch (Exception e) {
      logger.error(e);
    }
    logger = settings.getLogger();
  }
  
  public void lateInitialize(MainApp app, Stage stage, Scene scene) {
    this.app = app;
    this.stage = stage;
    this.scene = scene;
  }
  
  public void deinitialize() {}
}

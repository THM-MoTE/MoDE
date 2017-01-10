package de.thm.mni.mote.mode.ui.controller;

import de.thm.mni.mote.mode.config.Settings;
import de.thm.mni.mote.mode.config.model.Logger;
import de.thm.mni.mote.mode.parser.OMCompiler;
import de.thm.mni.mote.mode.parser.PackageParser;
import de.thm.mni.mote.mode.util.logger.ConsoleLogger;
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
  
  ResourceBundle i18n;
  
  Controller() {
    logger = new ConsoleLogger(Logger.LEVEL.ERROR, Logger.LEVEL.ERROR);
    try {
      settings = Settings.load();
    } catch (Exception e) {
      logger.error(e);
    }
    logger = settings.getLogger();
  }
  
  @Override
  public void initialize(URL location, ResourceBundle resources) {
    i18n = resources;
    
  }
  
  public void lateInitialize(Stage stage, Scene scene) {
    this.stage = stage;
    this.scene = scene;
    this.stage.setOnCloseRequest(value -> close());
  }
  
  public void close() {
    this.deinitialize();
    PackageParser.close();
    try {
      OMCompiler.getInstance().disconnect();
    } catch (Exception e) {
    }
    settings.save();
  }
  
  public void deinitialize() {}
}

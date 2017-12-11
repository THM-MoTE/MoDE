package de.thm.mni.mote.mode.frontend.controllers;

import de.thm.mni.mhpp11.smbj.logging.messages.ErrorMessage;
import de.thm.mni.mote.mode.config.Settings;
import de.thm.mni.mote.mode.util.Utilities;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

import java.awt.*;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ResourceBundle;

public class AboutController extends Controller {
  
  @FXML
  private Label lVersion;
  
  @Override
  public void initialize(URL location, ResourceBundle resources) {
    super.initialize(location, resources);
    lVersion.setText(Settings.VERSION);
  }
  
  @Override
  public void lateInitialize() {
    getStage().setTitle(String.format("%s %s", getI18n().getString("window_title"), Settings.VERSION));
    super.lateInitialize();
  }
  
  @FXML
  void onClickLink() {
    try {
      String url = "http://www.github.com/THM-MoTE/MoDE";
      //FIXME: not beautiful, but rar
      if(Utilities.isWin() && Desktop.isDesktopSupported()) {
        Desktop.getDesktop().browse(new URI(url));
      } else if(Utilities.isMac() && Desktop.isDesktopSupported()) {
        Runtime.getRuntime().exec(new String[]{"open", url});
      } else {
        Runtime.getRuntime().exec(new String[]{"xdg-open", url});
      }
    } catch (IOException | URISyntaxException e) {
      getActor().send(new ErrorMessage(this.getClass(), e));
    }
  }
  
  @Override @FXML
  public void close() {
    this.getStage().hide();
  }
  
  @Override
  public void show() {
    this.getStage().toFront();
    this.getStage().show();
  }
}

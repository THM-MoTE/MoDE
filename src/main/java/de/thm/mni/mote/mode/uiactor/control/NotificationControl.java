package de.thm.mni.mote.mode.uiactor.control;

import de.thm.mni.mhpp11.jActor.actors.logging.messages.ErrorMessage;
import de.thm.mni.mhpp11.jActor.actors.logging.messages.InfoMessage;
import de.thm.mni.mhpp11.jActor.actors.logging.messages.LogMessage;
import de.thm.mni.mhpp11.jActor.actors.logging.messages.WarnMessage;
import de.thm.mni.mote.mode.config.Settings;
import de.thm.mni.mote.mode.util.Utilities;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import org.kordamp.ikonli.javafx.FontIcon;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

/**
 * Created by hobbypunk on 13.09.16.
 */
public class NotificationControl extends VBox implements Initializable {
  
  @FXML private Label lHeadline;
  @FXML private Label lMessage;
  @FXML private FontIcon fIcon;
  
  private final LogMessage message;
  
  public NotificationControl(LogMessage message) {
    this.message = message;
    FXMLLoader loader = new FXMLLoader();
    loader.setLocation(Utilities.getControlView("Notification"));
    loader.setRoot(this);
    loader.setController(this);
    try {
      loader.load();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
  
  @Override
  public void initialize(URL location, ResourceBundle resources) {
    try {
      Settings s = Settings.load();
      if (this.message.getTitle() == null || this.message.getTitle().isEmpty()) lHeadline.textProperty().set(this.message.getSimpleCause());
      else lHeadline.textProperty().set(this.message.getTitle());
      
      lMessage.textProperty().set(message.getMessage());
      String icon = ":22:";
      if (this.message instanceof InfoMessage) {
        icon = "gmi-info" + icon + "cornflowerblue";
      } else if (this.message instanceof WarnMessage) {
        icon = "gmi-warning" + icon + "darkorange";
      } else if (this.message instanceof ErrorMessage) {
        icon = "gmi-error" + icon + "firebrick";
      } else
        icon = "gmi-settings-input-component" + icon + "darkgrey";
      fIcon.setIconLiteral(icon);
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}

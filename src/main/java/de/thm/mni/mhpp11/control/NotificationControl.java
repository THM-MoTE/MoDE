package de.thm.mni.mhpp11.control;

import de.thm.mni.mhpp11.util.config.Settings;
import de.thm.mni.mhpp11.util.logger.Message;
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
  
  private final Message message;
  
  public NotificationControl(Message message) {
    this.message = message;
    FXMLLoader loader = new FXMLLoader();
    loader.setLocation(getClass().getResource("view/Notification.fxml"));
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
      lHeadline.textProperty().set(message.getHeadline());
      lMessage.textProperty().set(message.getMessage());
      Message.TYPE type = message.getType();
      String icon = ":22:";
      if(type.isInfo()) {
        icon = "gmi-info" + icon + "cornflowerblue";
      } else if(type.isWarning()) {
        icon = "gmi-warning" + icon + "darkorange";
      } else if(type.isError()) {
        icon = "gmi-error" + icon + "firebrick";
      } else
        icon = "gmi-settings-input-component" + icon + "darkgrey";
      fIcon.setIconLiteral(icon);
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}

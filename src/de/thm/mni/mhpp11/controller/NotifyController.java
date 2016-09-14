package de.thm.mni.mhpp11.controller;

import de.thm.mni.mhpp11.control.NotificationControl;
import de.thm.mni.mhpp11.util.logger.Logger.Message;
import javafx.animation.FadeTransition;
import javafx.animation.PauseTransition;
import javafx.fxml.FXML;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.util.Duration;

import java.net.URL;
import java.util.Observable;
import java.util.Observer;
import java.util.ResourceBundle;

/**
 * Created by hobbypunk on 13.09.16.
 */
public abstract class NotifyController extends Controller implements Observer {
  
  @FXML protected GridPane root;
  @FXML private VBox notifications;
  
  @Override
  public void initialize(URL location, ResourceBundle resources) {
    super.initialize(location, resources);
    logger.addObserver(this);
    settings.addObserver(this);
  }
  
  @Override
  public void deinitialize() {
    super.deinitialize();
    logger.deleteObserver(this);
  }
  
  public void addNotification(final NotificationControl notification) {
    notifications.getChildren().add(notification);
    notification.setOpacity(0.0);
    FadeTransition fadeIn = new FadeTransition(Duration.millis(250), notification);
    fadeIn.setFromValue(0.0);
    fadeIn.setToValue(1.0);
    fadeIn.setOnFinished(e1 -> {
      PauseTransition delay = new PauseTransition(Duration.seconds(settings.getNotifySeconds()));
      delay.setOnFinished(e2 -> {
        FadeTransition fadeOut = new FadeTransition(Duration.millis(250), notification);
        fadeOut.setFromValue(notification.getOpacity());
        fadeOut.setToValue(0.0);
        fadeOut.setOnFinished(e3 -> notifications.getChildren().remove(notification));
        fadeOut.play();
      });
      delay.play();
    });
    fadeIn.play();
  }
  
  public void update(Observable o, Object arg) {
    if(arg instanceof Message) {
      Message msg = (Message) arg;
      this.addNotification(new NotificationControl(msg));
    }
  }
}

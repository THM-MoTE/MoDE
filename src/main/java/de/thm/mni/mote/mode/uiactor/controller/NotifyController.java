package de.thm.mni.mote.mode.uiactor.controller;

import de.thm.mni.mhpp11.jActor.actors.logging.messages.*;
import de.thm.mni.mhpp11.jActor.actors.ui.interfaces.AbstractUIActor;
import de.thm.mni.mhpp11.jActor.messages.interfaces.Message;
import de.thm.mni.mote.mode.config.model.Logger;
import de.thm.mni.mote.mode.uiactor.control.NotificationControl;
import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

import java.net.URL;
import java.util.Observable;
import java.util.Observer;
import java.util.ResourceBundle;

/**
 * Created by hobbypunk on 13.09.16.
 */
public abstract class NotifyController extends Controller implements Observer {
  
  @FXML private Button btnNotifications;
  
  @Override
  public void initialize(URL location, ResourceBundle resources) {
    super.initialize(location, resources);
    getSettings().addObserver(this);
  }
  
  @Override
  public void deinitialize() {
    super.deinitialize();
  }
  
  @FXML
  private void onShowNotifications() {
    
  }
  
  private void addNotification(final NotificationControl notification) {
//    notifications.getChildren().add(notification);
//    notification.setOpacity(0.0);
//    FadeTransition fadeIn = new FadeTransition(Duration.millis(250), notification);
//    fadeIn.setFromValue(0.0);
//    fadeIn.setToValue(1.0);
//    fadeIn.setOnFinished(e1 -> {
//      PauseTransition delay = new PauseTransition(Duration.seconds(getSettings().getNotification().getSeconds()));
//      delay.setOnFinished(e2 -> {
//        FadeTransition fadeOut = new FadeTransition(Duration.millis(250), notification);
//        fadeOut.setFromValue(notification.getOpacity());
//        fadeOut.setToValue(0.0);
//        fadeOut.setOnFinished(e3 -> notifications.getChildren().remove(notification));
//        fadeOut.play();
//      });
//      delay.play();
//    });
//    fadeIn.play();
  }
  
  @Override
  public void update(Observable o, Object arg) {
  }
  
  void sendNotification(LogMessage msg) {
    Logger.LEVEL level = getSettings().getLogger().getNotifyLevel();
    Boolean notify = false;
    
    switch (level) {
      case TRACE:
        if (msg instanceof TraceMessage) notify = true;
      case DEBUG:
        if (msg instanceof DebugMessage) notify = true;
      case INFO:
        if (msg instanceof InfoMessage) notify = true;
      case WARNING:
        if (msg instanceof WarnMessage) notify = true;
      case ERROR:
        if (msg instanceof ErrorMessage) notify = true;
    }
    
    if (notify) this.addNotification(new NotificationControl(msg));
  }
  
  protected static class NotifyActor<C extends NotifyController, T extends Message> extends AbstractUIActor<C, T> {
    
    NotifyActor(C controller) {
      super(controller);
    }
    
    @Override
    public void executeUI(T msg) {
      if (LogMessage.class.isAssignableFrom(msg.getClass())) {
        Platform.runLater(() -> getController().sendNotification((LogMessage) msg));
      }
    }
  }
}

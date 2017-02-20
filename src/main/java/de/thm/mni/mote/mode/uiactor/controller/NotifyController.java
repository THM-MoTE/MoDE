package de.thm.mni.mote.mode.uiactor.controller;

import de.thm.mni.mhpp11.jActor.actors.logging.messages.LogMessage;
import de.thm.mni.mhpp11.jActor.actors.ui.interfaces.AbstractUIActor;
import de.thm.mni.mhpp11.jActor.messages.interfaces.Message;
import de.thm.mni.mote.mode.uiactor.control.NotificationControl;
import javafx.application.Platform;
import javafx.collections.ListChangeListener;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import org.controlsfx.control.PopOver;
import org.slf4j.event.Level;

import java.net.URL;
import java.util.Observable;
import java.util.Observer;
import java.util.ResourceBundle;

/**
 * Created by hobbypunk on 13.09.16.
 */
public abstract class NotifyController extends Controller implements Observer {
  
  @FXML private Button btnNotifications;
  
  private VBox notifications = new VBox(1);
  private PopOver poNotifications = new PopOver(notifications);
  
  @Override
  public void initialize(URL location, ResourceBundle resources) {
    super.initialize(location, resources);
    poNotifications.setArrowLocation(PopOver.ArrowLocation.BOTTOM_RIGHT);
    poNotifications.setAutoHide(false);
    poNotifications.setDetachable(false);
    notifications.getChildren().addListener((ListChangeListener<Node>) c -> Platform.runLater(() -> {
      if (notifications.getChildren().isEmpty()) {
        btnNotifications.setText("");
        btnNotifications.getStyleClass().clear();
        btnNotifications.getStyleClass().add("notification");
        btnNotifications.getStyleClass().add("no-notification");
        poNotifications.hide();
      } else {
        btnNotifications.setText("" + notifications.getChildren().size());
        btnNotifications.getStyleClass().remove("no-notification");
        Level highest = Level.TRACE;
        for (Node node : notifications.getChildren()) {
          if (!(node instanceof NotificationControl)) continue;
          NotificationControl nc = (NotificationControl) node;
        
          if (nc.getMessage().getLevel().toInt() > highest.toInt())
            highest = nc.getMessage().getLevel();
        }
        btnNotifications.getStyleClass().add(highest.toString().toLowerCase() + "-notification");
      }
    }));
  }
  
  @Override
  public void deinitialize() {
    super.deinitialize();
  }
  
  @FXML
  private void onShowNotifications() {
    Platform.runLater(() -> {
      if (poNotifications.isShowing()) {
        poNotifications.hide();
        notifications.getChildren().clear();
      } else {
        if (notifications.getChildren().isEmpty()) return;
        poNotifications.show(btnNotifications);
      }
    });
  }
  
  @Override
  public void update(Observable o, Object arg) {}
  
  void sendNotification(LogMessage msg) {
    Level level = getSettings().getLogger().getNotifyLevel();
    Boolean notify = false;
    switch (level) {
      case TRACE:
        if (msg.getLevel() == Level.TRACE) notify = true;
      case DEBUG:
        if (msg.getLevel() == Level.DEBUG) notify = true;
      case INFO:
        if (msg.getLevel() == Level.INFO) notify = true;
      case WARN:
        if (msg.getLevel() == Level.WARN) notify = true;
      case ERROR:
        if (msg.getLevel() == Level.ERROR) notify = true;
    }
  
    if (notify) notifications.getChildren().add(new NotificationControl(msg));
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

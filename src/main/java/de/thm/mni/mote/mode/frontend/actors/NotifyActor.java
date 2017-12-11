package de.thm.mni.mote.mode.frontend.actors;

import de.thm.mni.mhpp11.smbj.logging.messages.LogMessage;
import de.thm.mni.mhpp11.smbj.messages.base.Message;
import de.thm.mni.mhpp11.smbj.ui.actors.AbstractUIActor;
import de.thm.mni.mote.mode.config.Settings;
import de.thm.mni.mote.mode.frontend.controllers.NotifyController;
import javafx.application.Platform;
import javafx.stage.Stage;

import java.util.List;
import java.util.Locale;
import java.util.UUID;

abstract class NotifyActor<C extends NotifyController> extends AbstractUIActor<C> {
  
  NotifyActor(UUID id, Stage stage, List<?> params) {
    super(id, stage, params);
  }
  
  @Override
  protected Locale getLocale() {
    return Settings.load().getLang();
  }
  
  @Override
  public void executeUI(Message msg) {
    if (LogMessage.class.isAssignableFrom(msg.getClass())) {
      Platform.runLater(() -> getController().sendNotification((LogMessage) msg));
    }
  }
}
package de.thm.mni.mote.mode.frontend.actors;

import de.thm.mni.mhpp11.smbj.manager.messages.StartedMessage;
import de.thm.mni.mhpp11.smbj.messages.base.Message;
import de.thm.mni.mote.mode.backend.omc.actors.OMCActor;
import de.thm.mni.mote.mode.backend.omc.messages.StartOMCMessage;
import de.thm.mni.mote.mode.frontend.controllers.WelcomeController;
import javafx.application.Platform;
import javafx.stage.Stage;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;
import java.util.UUID;

@Data
@EqualsAndHashCode(callSuper = true)
public class WelcomeActor extends NotifyActor<WelcomeController> {
  
  public WelcomeActor(UUID id, Stage stage, List<?> params) {
    super(id, stage, params);
  }
  
  @Override
  public void executeUI(Message msg) {
    if (msg instanceof StartedMessage) {
      send(new StartOMCMessage(getID(), OMCActor.class) {
  
        @Override
        public Void answer(UUID source, Void payload) {
          Platform.runLater(() -> {
            getController().updateUI(true);
            getController().show();
          });
          return null;
        }
  
        @Override
        public void error(UUID source, Exception e) {
          Platform.runLater(() -> {
            getController().updateUI(false);
            getController().showIgnoreParams();
          });
        }
      });
    }
    
    super.executeUI(msg);
  }
}

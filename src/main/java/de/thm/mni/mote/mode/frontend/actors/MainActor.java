package de.thm.mni.mote.mode.frontend.actors;

import de.thm.mni.mhpp11.smbj.messages.base.Message;
import de.thm.mni.mote.mode.backend.omc.messages.LoadStatusOMCMessage;
import de.thm.mni.mote.mode.frontend.controllers.MainController;
import javafx.stage.Stage;

import java.util.List;
import java.util.UUID;

public class MainActor extends NotifyActor<MainController> {
  
  public MainActor(UUID id, Stage stage, List<?> params) {
    super(id, stage, params);
  }
  
  @Override
  public void executeUI(Message msg) {
    super.executeUI(msg);
    if (msg instanceof LoadStatusOMCMessage) {
      if (((LoadStatusOMCMessage) msg).getPayload() == LoadStatusOMCMessage.STATUS.COMPLETE) {
        getController().show();
      }
    }
  }
}

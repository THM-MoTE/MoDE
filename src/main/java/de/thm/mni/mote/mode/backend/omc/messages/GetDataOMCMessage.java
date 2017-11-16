package de.thm.mni.mote.mode.backend.omc.messages;

import de.thm.mni.mhpp11.smbj.actors.IActor;
import de.thm.mni.mhpp11.smbj.messages.base.ask.AskClassMessage;
import de.thm.mni.mote.mode.modelica.MoContainer;
import javafx.collections.ObservableList;

import java.util.UUID;

/**
 * Created by hobbypunk on 24.01.17.
 */
public abstract class GetDataOMCMessage extends AskClassMessage<Void, ObservableList<MoContainer>, Void> implements OMCMessage {
  public GetDataOMCMessage(UUID source, Class<? extends IActor> sink) {
    super(source, sink, null);
  }
}

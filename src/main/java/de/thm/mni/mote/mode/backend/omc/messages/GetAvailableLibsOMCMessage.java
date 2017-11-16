package de.thm.mni.mote.mode.backend.omc.messages;

import de.thm.mni.mhpp11.smbj.messages.base.ask.AskClassMessage;
import de.thm.mni.mote.mode.backend.omc.actors.OMCActor;
import lombok.NonNull;

import java.util.List;
import java.util.UUID;

/**
 * Created by hobbypunk on 26.01.17.
 */
public abstract class GetAvailableLibsOMCMessage extends AskClassMessage<Void, List<String>, Void> implements OMCMessage {
  public GetAvailableLibsOMCMessage(@NonNull UUID source) {
    super(source, OMCActor.class, null);
  }
}

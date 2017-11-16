package de.thm.mni.mote.mode.backend.omc.messages;

import de.thm.mni.mhpp11.smbj.messages.base.tell.TellUUIDMessage;
import lombok.Getter;
import lombok.NonNull;

import java.util.UUID;

/**
 * Created by hobbypunk on 30.01.17.
 */
@Getter
public class ReloadProjectOMCMessage extends TellUUIDMessage<Void> implements OMCMessage {
  public ReloadProjectOMCMessage(@NonNull UUID source) {
    super(source, null);
  }
}

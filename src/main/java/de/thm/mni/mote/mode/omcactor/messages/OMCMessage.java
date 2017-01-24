package de.thm.mni.mote.mode.omcactor.messages;

import de.thm.mni.mhpp11.jActor.messages.interfaces.Message;
import de.thm.mni.mote.mode.util.Constants;
import lombok.NonNull;

import java.util.UUID;

/**
 * Created by hobbypunk on 24.01.17.
 */
public abstract class OMCMessage extends Message {
  public OMCMessage(@NonNull UUID group) {
    super(group, Constants.OMC);
  }
}

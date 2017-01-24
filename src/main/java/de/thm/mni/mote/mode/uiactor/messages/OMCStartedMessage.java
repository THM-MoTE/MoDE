package de.thm.mni.mote.mode.uiactor.messages;

import de.thm.mni.mhpp11.jActor.messages.interfaces.Message;
import lombok.NonNull;

import java.util.UUID;

/**
 * Created by hobbypunk on 23.01.17.
 */
public class OMCStartedMessage extends Message {
  public OMCStartedMessage(@NonNull UUID group, @NonNull Integer to) {
    super(group, to);
  }
}

package de.thm.mni.mote.mode.omcactor.messages;

import lombok.NonNull;

import java.util.UUID;

/**
 * Created by hobbypunk on 26.01.17.
 */
public class GetAvailableLibsOMCMessage extends OMCMessage {
  public GetAvailableLibsOMCMessage(@NonNull UUID group) {
    super(group);
  }
}

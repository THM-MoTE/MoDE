package de.thm.mni.mote.mode.omcactor.messages;

import lombok.NonNull;

import java.util.UUID;

/**
 * Created by hobbypunk on 24.01.17.
 */
public class GetDataOMCMessage extends OMCMessage {
  public GetDataOMCMessage(@NonNull UUID group) {
    super(group);
  }
}

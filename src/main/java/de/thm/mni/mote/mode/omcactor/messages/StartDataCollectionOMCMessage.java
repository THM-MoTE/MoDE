package de.thm.mni.mote.mode.omcactor.messages;

import lombok.Getter;
import lombok.NonNull;

import java.util.UUID;

/**
 * Created by hobbypunk on 24.01.17.
 */
@Getter
public class StartDataCollectionOMCMessage extends OMCMessage {
  
  public enum TYPE {
    SYSTEM,
    PROJECTLIB,
    PROJECT
  }
  
  private final TYPE type;
  
  public StartDataCollectionOMCMessage(@NonNull UUID group, TYPE type) {
    super(group);
    this.type = type;
  }
}

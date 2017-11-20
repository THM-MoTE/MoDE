package de.thm.mni.mote.mode.backend.omc.messages;

import de.thm.mni.mhpp11.smbj.messages.base.tell.TellUUIDMessage;
import lombok.Getter;
import lombok.NonNull;

import java.util.UUID;

/**
 * Created by Marcel Hoppe on 30.01.17.
 */
@Getter
public class LoadStatusOMCMessage extends TellUUIDMessage<LoadStatusOMCMessage.STATUS> implements OMCMessage {
  private final Integer progress;
  
  public enum STATUS {
    START,
    PROJECT_READY,
    PROJECT_LIB_READY,
    SYSTEM_LIB_READY,
    COMPLETE;
    
    public static boolean isComplete(int value) {
      return value >= (START.ordinal() + SYSTEM_LIB_READY.ordinal() + PROJECT_LIB_READY.ordinal() + PROJECT_READY.ordinal());
    }
  }
  
  public LoadStatusOMCMessage(@NonNull UUID source, STATUS status) {
    super(source, status);
    this.progress = 0;
  }

  public LoadStatusOMCMessage(@NonNull UUID source, STATUS status, Integer progress) {
    super(source, status);
    this.progress = progress;
  }
  
}

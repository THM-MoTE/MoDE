package de.thm.mni.mote.mode.omcactor.messages;

import de.thm.mni.mhpp11.jActor.actors.ui.messages.UIMessage;
import lombok.Getter;
import lombok.NonNull;

import java.util.UUID;

/**
 * Created by hobbypunk on 30.01.17.
 */
@Getter
public class OMCLoadStatusUIMessage extends UIMessage {
  public enum STATUS {
    START,
    SYSTEMLIB_READY,
    PROJECTLIB_READY,
    PROJECT_READY,
    COMPLETE;
    
    public static boolean isComplete(int value) {
      return value >= (START.ordinal() + SYSTEMLIB_READY.ordinal() + PROJECTLIB_READY.ordinal() + PROJECT_READY.ordinal());
    }
  }
  
  private final STATUS status;
  
  public OMCLoadStatusUIMessage(@NonNull UUID group, STATUS status) {
    super(group);
    this.status = status;
  }
  
}

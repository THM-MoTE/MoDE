package de.thm.mni.mote.mode.omcactor.messages;

import de.thm.mni.mhpp11.jActor.messages.interfaces.Message;
import lombok.Getter;
import lombok.NonNull;

import java.util.UUID;

/**
 * Created by hobbypunk on 23.01.17.
 */
@Getter
public class OMCErrorMessage extends Message {
  private final Throwable err;
  
  public OMCErrorMessage(@NonNull UUID group, @NonNull Integer to) {
    this(group, to, null);
  }
  
  public OMCErrorMessage(@NonNull UUID group, @NonNull Integer to, Throwable err) {
    super(group, to);
    this.err = err;
  }
  
}

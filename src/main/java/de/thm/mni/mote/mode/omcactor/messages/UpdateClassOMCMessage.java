package de.thm.mni.mote.mode.omcactor.messages;

import de.thm.mni.mote.mode.modelica.MoClass;
import lombok.Getter;

import java.util.UUID;

/**
 * Created by hobbypunk on 24.01.17.
 */
@Getter
public class UpdateClassOMCMessage extends OMCMessage {
  
  private final MoClass moClass;
  
  public UpdateClassOMCMessage(UUID group, MoClass moClass) {
    super(group);
    this.moClass = moClass;
  }
}

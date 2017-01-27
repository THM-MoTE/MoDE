package de.thm.mni.mote.mode.omcactor.messages;

import de.thm.mni.mote.mode.modelica.MoContainer;
import lombok.Getter;

import java.util.UUID;

/**
 * Created by hobbypunk on 24.01.17.
 */
@Getter
public class UpdateClassOMCMessage extends OMCMessage {
  
  private final MoContainer container;
  
  public UpdateClassOMCMessage(UUID group, MoContainer container) {
    super(group);
    this.container = container;
  }
}

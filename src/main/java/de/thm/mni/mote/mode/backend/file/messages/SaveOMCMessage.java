package de.thm.mni.mote.mode.backend.file.messages;

import de.thm.mni.mote.mode.modelica.MoContainer;
import lombok.Getter;

import java.util.UUID;

/**
 * Created by hobbypunk on 09.03.17.
 */
@Getter
public class SaveOMCMessage {
  private final MoContainer container;
  
  public SaveOMCMessage(UUID group, MoContainer container) {
    this.container = container;
  }
}

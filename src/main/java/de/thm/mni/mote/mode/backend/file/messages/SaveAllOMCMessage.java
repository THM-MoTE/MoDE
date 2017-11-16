package de.thm.mni.mote.mode.backend.file.messages;

import de.thm.mni.mote.mode.modelica.MoContainer;
import lombok.Getter;

import java.util.List;
import java.util.UUID;

/**
 * Created by hobbypunk on 09.03.17.
 */
@Getter
public class SaveAllOMCMessage {
  private final List<MoContainer> containers;
  
  public SaveAllOMCMessage(UUID group, List<MoContainer> containers) {
    this.containers = containers;
  }
}

package de.thm.mni.mote.mode.omcactor.messages;

import de.thm.mni.mote.mode.modelica.MoContainer;
import lombok.Getter;

import java.util.List;
import java.util.UUID;

/**
 * Created by hobbypunk on 09.03.17.
 */
@Getter
public class SaveAllOMCMessage extends OMCMessage {
  private final List<MoContainer> containers;
  
  public SaveAllOMCMessage(UUID group, List<MoContainer> containers) {
    super(group);
    this.containers = containers;
  }
}

package de.thm.mni.mote.mode.backend.file.messages;

import de.thm.mni.mhpp11.smbj.messages.base.tell.TellClassMessage;
import de.thm.mni.mote.mode.backend.file.actors.FileManagmentActor;
import de.thm.mni.mote.mode.modelica.MoContainer;
import lombok.Getter;

import java.util.Arrays;
import java.util.List;
import java.util.UUID;

/**
 * Created by hobbypunk on 09.03.17.
 */
@Getter
public class ModelsSaveMessage extends TellClassMessage<List<MoContainer>> {
  public ModelsSaveMessage(UUID source, MoContainer... payload) {
    super(source, FileManagmentActor.class, Arrays.asList(payload));
  }
  
  public ModelsSaveMessage(UUID source, List<MoContainer> payload) {
    super(source, FileManagmentActor.class, payload);
  }
}

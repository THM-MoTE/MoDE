package de.thm.mni.mote.mode.backend.file.messages;

import de.thm.mni.mhpp11.smbj.messages.base.tell.TellClassMessage;
import de.thm.mni.mote.mode.backend.file.actors.FileManagmentActor;
import de.thm.mni.mote.mode.modelica.MoContainer;
import lombok.Getter;
import lombok.NonNull;

import java.util.Map;
import java.util.UUID;

/**
 * Created by hobbypunk on 01.03.17.
 */
@Getter
public class FileNewMessage extends TellClassMessage<MoContainer> {
  
  private final String type;
  private final Map<String, String> data;
  
  public FileNewMessage(@NonNull UUID source, @NonNull MoContainer parent, @NonNull String type, @NonNull Map<String, String> data) {
    super(source, FileManagmentActor.class, parent);
    this.type = type;
    this.data = data;
  }
}

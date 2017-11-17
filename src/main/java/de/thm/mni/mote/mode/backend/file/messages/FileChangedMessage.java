package de.thm.mni.mote.mode.backend.file.messages;

import de.thm.mni.mhpp11.smbj.messages.base.tell.TellClassMessage;
import lombok.EqualsAndHashCode;
import lombok.Value;

import java.nio.file.Path;
import java.util.UUID;

@Value
@EqualsAndHashCode(callSuper = true)
public class FileChangedMessage extends TellClassMessage<Path> {
  
  public enum TYPE {
    CREATED,
    DELETED,
    MODIFIED
  }
  
  TYPE type;
  
  public FileChangedMessage(UUID source, Path payload, TYPE type) {
    super(source, payload);
    this.type = type;
  }
}

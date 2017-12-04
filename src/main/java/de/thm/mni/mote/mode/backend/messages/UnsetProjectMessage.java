package de.thm.mni.mote.mode.backend.messages;

import de.thm.mni.mhpp11.smbj.messages.base.tell.TellClassMessage;
import de.thm.mni.mote.mode.backend.file.actors.FileWatcherActor;
import de.thm.mni.mote.mode.backend.omc.actors.OMCActor;
import lombok.Getter;
import lombok.NonNull;

import java.util.Arrays;
import java.util.UUID;

/**
 * Created by Marcel Hoppe on 24.01.17.
 */
@Getter
public class UnsetProjectMessage extends TellClassMessage<Void> {
  
  public UnsetProjectMessage(@NonNull UUID source) {
    super(source, Arrays.asList(OMCActor.class, FileWatcherActor.class), null);
  }
}

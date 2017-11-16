package de.thm.mni.mote.mode.backend.omc.messages;

import de.thm.mni.mhpp11.smbj.messages.base.ask.AskClassMessage;
import de.thm.mni.mote.mode.backend.omc.actors.OMCActor;
import de.thm.mni.mote.mode.config.model.Project;
import lombok.Getter;
import lombok.NonNull;

import java.util.UUID;

/**
 * Created by hobbypunk on 24.01.17.
 */
@Getter
public abstract class SetProjectOMCMessage extends AskClassMessage<Project, Project, Void> implements OMCMessage {
  
  public SetProjectOMCMessage(@NonNull UUID source, Project payload) {
    super(source, OMCActor.class, payload);
  }
}

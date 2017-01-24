package de.thm.mni.mote.mode.omcactor.messages;

import de.thm.mni.mote.mode.config.model.Project;
import lombok.Getter;
import lombok.NonNull;

import java.util.UUID;

/**
 * Created by hobbypunk on 24.01.17.
 */
@Getter
public class SetProjectOMCMessage extends OMCMessage {
  private final Project project;
  
  public SetProjectOMCMessage(@NonNull UUID group, Project project) {
    super(group);
    this.project = project;
  }
}

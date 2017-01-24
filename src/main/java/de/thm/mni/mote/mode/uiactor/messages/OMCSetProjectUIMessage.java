package de.thm.mni.mote.mode.uiactor.messages;

import de.thm.mni.mhpp11.jActor.actors.ui.messages.UIMessage;
import de.thm.mni.mote.mode.config.model.Project;
import lombok.Getter;
import lombok.NonNull;

import java.util.UUID;

/**
 * Created by hobbypunk on 24.01.17.
 */
@Getter
public class OMCSetProjectUIMessage extends UIMessage {
  private final Project project;
  
  public OMCSetProjectUIMessage(@NonNull UUID group, Project project) {
    super(group);
    this.project = project;
  }
}

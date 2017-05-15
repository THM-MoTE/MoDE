package de.thm.mni.mote.mode.uiactor.messages;

import de.thm.mni.mhpp11.smbj.messages.ui.UIMessage;
import lombok.Getter;

import java.util.List;
import java.util.UUID;

/**
 * Created by hobbypunk on 26.01.17.
 */
@Getter
public class OMCAvailableLibsUIMessage extends UIMessage {
  private final List<String> libs;
  
  public OMCAvailableLibsUIMessage(UUID group, List<String> availableLibraries) {
    super(group);
    this.libs = availableLibraries;
  }
}

package de.thm.mni.mote.mode.backend.file.messages;

import de.thm.mni.mote.mode.modelica.MoContainer;
import lombok.Getter;
import lombok.NonNull;

import java.util.Map;
import java.util.UUID;

/**
 * Created by hobbypunk on 01.03.17.
 */
@Getter
public class CreateNewOMCMessage {
  private final MoContainer parent;
  private final String type;
  private final Map<String, String> data;
  
  public CreateNewOMCMessage(@NonNull UUID group, @NonNull MoContainer parent, @NonNull String type, @NonNull Map<String, String> data) {
    this.parent = parent;
    this.type = type;
    this.data = data;
  }
}

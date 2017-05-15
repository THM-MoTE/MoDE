package de.thm.mni.mote.mode.uiactor.messages;

import de.thm.mni.mhpp11.smbj.messages.ui.UIMessage;
import de.thm.mni.mote.mode.modelica.MoContainer;
import javafx.collections.ObservableList;
import lombok.Getter;
import lombok.NonNull;

import java.util.UUID;

/**
 * Created by hobbypunk on 24.01.17.
 */
@Getter
public class OMCDataUIMessage extends UIMessage {
  
  private final ObservableList<MoContainer> data;
  
  public OMCDataUIMessage(@NonNull UUID group, @NonNull ObservableList<MoContainer> data) {
    super(group);
    this.data = data;
  }
}

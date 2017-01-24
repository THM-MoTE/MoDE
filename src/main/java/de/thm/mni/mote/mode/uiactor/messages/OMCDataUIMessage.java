package de.thm.mni.mote.mode.uiactor.messages;

import de.thm.mni.mhpp11.jActor.actors.ui.messages.UIMessage;
import de.thm.mni.mote.mode.modelica.MoClass;
import javafx.collections.ObservableList;
import lombok.Getter;
import lombok.NonNull;

import java.util.UUID;

/**
 * Created by hobbypunk on 24.01.17.
 */
@Getter
public class OMCDataUIMessage extends UIMessage {
  
  private final ObservableList<MoClass> data;
  
  public OMCDataUIMessage(@NonNull UUID group, @NonNull ObservableList<MoClass> data) {
    super(group);
    this.data = data;
  }
}

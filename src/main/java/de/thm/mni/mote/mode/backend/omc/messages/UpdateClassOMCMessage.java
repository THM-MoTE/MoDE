package de.thm.mni.mote.mode.backend.omc.messages;

import de.thm.mni.mhpp11.smbj.messages.base.tell.TellClassMessage;
import de.thm.mni.mote.mode.backend.omc.actors.OMCActor;
import de.thm.mni.mote.mode.modelica.MoContainer;

import java.util.UUID;

/**
 * Created by Marcel Hoppe on 24.01.17.
 */
public class UpdateClassOMCMessage extends TellClassMessage<MoContainer> implements OMCMessage {
  
  public UpdateClassOMCMessage(UUID source, MoContainer payload) {
    super(source, OMCActor.class, payload);
  }
}

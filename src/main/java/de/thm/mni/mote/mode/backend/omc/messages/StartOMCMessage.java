package de.thm.mni.mote.mode.backend.omc.messages;

import de.thm.mni.mhpp11.smbj.actors.IActor;
import de.thm.mni.mhpp11.smbj.messages.base.ask.AskClassMessage;

import java.util.UUID;

public abstract class StartOMCMessage extends AskClassMessage<Void, Void, Void> implements OMCMessage {
  public StartOMCMessage(UUID source, Class<? extends IActor> sink) {
    super(source, sink, null);
  }
}

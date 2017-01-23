package de.thm.mni.mote.mode.omcactor;

import de.thm.mni.mhpp11.jActor.actors.interfaces.AbstractActor;
import de.thm.mni.mhpp11.jActor.actors.messagebus.messages.RegisterMessage;
import de.thm.mni.mhpp11.jActor.actors.messagebus.messages.StartMessage;
import de.thm.mni.mhpp11.jActor.actors.messagebus.messages.UnregisteredMessage;
import de.thm.mni.mhpp11.jActor.messages.ExitMessage;
import de.thm.mni.mhpp11.jActor.messages.interfaces.Message;
import de.thm.mni.mote.mode.config.Settings;
import de.thm.mni.mote.mode.config.model.Modelica;
import de.thm.mni.mote.mode.omcactor.messages.OMCErrorMessage;
import de.thm.mni.mote.mode.omcactor.messages.OMCStartedMessage;
import de.thm.mni.mote.mode.parser.OMCompiler;
import de.thm.mni.mote.mode.util.Constants;
import lombok.Getter;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.UUID;

/**
 * Created by hobbypunk on 23.01.17.
 */
@Getter
public class OMCActor extends AbstractActor {
  OMCompiler omc = null;
  
  public OMCActor(UUID group) {
    super(group);
  }
  
  @Override
  public Integer getID() {
    return Constants.OMC;
  }
  
  private void startOMC() {
    Settings settings = Settings.load();
    Modelica m = settings.getModelica();
    try {
      omc = new OMCompiler(m.getCompiler(), Paths.get("/usr/lib/omlibrary"), settings.getLang());
      send(new OMCStartedMessage(getGroup(), Constants.UI));
    } catch (IOException e) {
      send(new OMCErrorMessage(getGroup(), Constants.UI, e));
    }
  }
  
  @Override
  public void execute(Message msg) {
    if (msg instanceof StartMessage) {
      send(new RegisterMessage(getGroup(), this));
      startOMC();
    }
    if (msg instanceof ExitMessage || msg instanceof UnregisteredMessage) {
      if (omc != null) omc.disconnect();
    }
  }
  
  @Override
  public Boolean exitCondition(Message lastMsg) {
    return super.exitCondition(lastMsg) || lastMsg instanceof UnregisteredMessage;
  }
}

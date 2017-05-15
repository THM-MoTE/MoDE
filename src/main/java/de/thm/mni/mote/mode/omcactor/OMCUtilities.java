package de.thm.mni.mote.mode.omcactor;

import de.thm.mni.mhpp11.smbj.actors.messagebus.MessageBus;
import de.thm.mni.mote.mode.modelica.MoContainer;
import de.thm.mni.mote.mode.modelica.MoLater;
import de.thm.mni.mote.mode.omcactor.messages.OMCLoadErrorMessage;
import de.thm.mni.mote.mode.parser.ParserException;
import lombok.experimental.UtilityClass;
import org.apache.commons.lang3.tuple.Pair;

import java.nio.file.Path;
import java.util.List;

/**
 * Created by hobbypunk on 24.01.17.
 */
@UtilityClass
class OMCUtilities {
  
  void lightCollect(OMCompiler omc, MoContainer parent, List<Pair<String, Path>> libraries) {
    libraries.forEach(library -> {
      try {
        MoLater.lightParsing(omc, library.getKey(), parent);
      } catch (ParserException e) {
        MessageBus.getInstance().send(new OMCLoadErrorMessage(OMCUtilities.class, omc.getGroup(), e));
      }
    });
  }
  
  void lightCollect(OMCompiler omc, MoContainer parent, Pair<String, Path> project) {
    try {
      MoLater.lightParsing(omc, project.getKey(), parent);
    } catch (ParserException e) {
      MessageBus.getInstance().send(new OMCLoadErrorMessage(OMCUtilities.class, omc.getGroup(), e));
    }
  }
}

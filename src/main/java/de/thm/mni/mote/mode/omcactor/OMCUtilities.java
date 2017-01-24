package de.thm.mni.mote.mode.omcactor;

import de.thm.mni.mhpp11.jActor.actors.logging.messages.ErrorMessage;
import de.thm.mni.mhpp11.jActor.actors.messagebus.MessageBus;
import de.thm.mni.mote.mode.modelica.MoClass;
import de.thm.mni.mote.mode.modelica.MoLater;
import de.thm.mni.mote.mode.parser.ParserException;
import javafx.util.Pair;
import lombok.experimental.UtilityClass;

import java.nio.file.Path;
import java.util.List;

/**
 * Created by hobbypunk on 24.01.17.
 */
@UtilityClass
class OMCUtilities {
  
  void lightCollect(OMCompiler omc, MoClass parent, List<Pair<String, Path>> libraries) {
    libraries.forEach(library -> {
      try {
        MoLater.lightParse(omc, library.getKey(), parent);
      } catch (ParserException e) {
        MessageBus.getInstance().send(new ErrorMessage(OMCUtilities.class, e));
      }
    });
  }
  
  void lightCollect(OMCompiler omc, MoClass parent, Pair<String, Path> project) {
    try {
      MoLater.lightParse(omc, project.getKey(), parent);
    } catch (ParserException e) {
      MessageBus.getInstance().send(new ErrorMessage(OMCUtilities.class, e));
    }
    
  }
  
  
}

package de.thm.mni.mote.mode.backend.omc;

import de.thm.mni.mhpp11.smbj.logging.messages.ErrorMessage;
import de.thm.mni.mhpp11.smbj.manager.ActorManager;
import de.thm.mni.mote.mode.modelica.MoContainer;
import de.thm.mni.mote.mode.modelica.MoLater;
import de.thm.mni.mote.mode.parser.ParserException;
import lombok.experimental.UtilityClass;
import org.apache.commons.lang3.tuple.Pair;

import java.nio.file.Path;
import java.util.List;

/**
 * Created by hobbypunk on 24.01.17.
 */
@UtilityClass
public class OMCUtilities {
  
  public void lightCollect(OMCompiler omc, MoContainer parent, List<Pair<String, Path>> libraries) {
    libraries.forEach(library -> OMCUtilities.lightCollect(omc, parent, library.getKey()));
  }
  
  public void lightCollect(OMCompiler omc, MoContainer parent, Pair<String, Path> project) {
    OMCUtilities.lightCollect(omc, parent, project.getKey());
  }
  
  public void lightCollect(OMCompiler omc, MoContainer parent, String name) {
    try {
      MoLater.lightParsing(omc, name, parent);
    } catch (ParserException e) {
      ActorManager.getInstance().send(new ErrorMessage(OMCUtilities.class, omc.getID(), e));
    }
  }
}

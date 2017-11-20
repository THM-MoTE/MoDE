package de.thm.mni.mote.mode.backend.omc;

import de.thm.mni.mote.mode.modelica.MoContainer;
import de.thm.mni.mote.mode.modelica.MoLater;
import lombok.experimental.UtilityClass;
import org.apache.commons.lang3.tuple.Pair;

import java.nio.file.Path;
import java.util.List;

/**
 * Created by Marcel Hoppe on 24.01.17.
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
    MoLater.lightParsing(omc, name, parent);
  }
}

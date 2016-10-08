package de.thm.mni.mhpp11.util.parser;

import de.thm.mni.mhpp11.util.config.Settings;
import de.thm.mni.mhpp11.util.config.model.Logger;
import de.thm.mni.mhpp11.util.config.model.Modelica;
import de.thm.mni.mhpp11.util.parser.models.MoClass;
import javafx.util.Pair;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Observable;

/**
 * Created by hobbypunk on 14.09.16.
 */
public class PackageParser extends Observable {
  private static PackageParser ourInstance = new PackageParser();
  
  public static PackageParser getInstance() {
    return ourInstance;
  }
  
  private final Settings settings;
  private final Logger logger;
  
  private PackageParser() {
    this.settings = Settings.load();
    this.logger = this.settings.getLogger();
  }
  
  public Path findBasePackage(Path f) {
    try {
      List<String> tmp = Files.readAllLines(f);
      String within = null;
      for (String t : tmp) {
        if (t.contains("within")) {
          within = t;
          break;
        }
      }
      if (within == null) return f;
      within = within.replaceAll("(^\\s*within\\s+)|(;\\s*$)", "");
      String[] s = within.split("\\.");
      if (f.getFileName().toString().toLowerCase().equals("package.mo")) f = f.getParent();
      for (String value : s) {
        f = f.getParent();
      }
      DirectoryStream<Path> ds = Files.newDirectoryStream(f, "(?i)package\\.mo");
      if (ds.iterator().hasNext()) return ds.iterator().next();
    } catch (IOException e) {
      e.printStackTrace();
    }
    return f;
  }
  
  public void collectSystemLibs(MoClass parent) {
    Modelica modelica = settings.getModelica();
    try {
      OMCompiler omc = new OMCompiler(modelica.getCompiler(), modelica.getLibrary(), settings.getLang());
      for (Pair<String, Path> lib : omc.getSystemLibraries()) {
        MoClass mc = MoClass.parse(omc, lib.getKey(), parent, modelica.getDepth());
        setChanged();
        notifyObservers(mc);
      }
    } catch (IOException e) {
      logger.error(e);
    }
  }
}

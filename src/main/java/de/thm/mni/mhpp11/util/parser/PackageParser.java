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
import java.nio.file.Paths;
import java.util.*;

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
  private final Modelica modelica;
  private OMCompiler omc = null;
  
  
  private PackageParser() {
    this.settings = Settings.load();
    this.logger = this.settings.getLogger();
    this.modelica = settings.getModelica();
    this.omc = OMCompiler.getInstance();
  }
  
  public Path findBasePackage(Path f) {
    f = f.toAbsolutePath().normalize();
    Path f2 = f;
    try {
      List<String> tmp = Files.readAllLines(f2);
      String within = null;
      for (String t : tmp) {
        if (t.contains("within")) {
          within = t;
          break;
        }
      }
      if (within == null) within = "";
      within = within.replaceAll("(^\\s*within\\s+)|(;\\s*$)", "");
      String[] s = within.split("\\.");
      for (String value : s) {
        if (!value.isEmpty()) f2 = f2.getParent();
      }
      if (!Files.isDirectory(f2)) return f2;
      if (f.getFileName().toString().toLowerCase().equals("package.mo")) f2 = f2.getParent();
      DirectoryStream<Path> ds = Files.newDirectoryStream(f2, new DirectoryStream.Filter<Path>() {
        @Override
        public boolean accept(Path entry) throws IOException {
          return entry.getFileName().toString().matches("(?i)package.mo$");
        }
      });
      Iterator<Path> iterator = ds.iterator();
      if (iterator.hasNext()) return iterator.next();
    } catch (IOException e) {
      e.printStackTrace();
    }
    return f;
  }
  
  public void collectSystemLibs(MoClass parent) {
    if (this.omc == null) return;
    collect(parent, omc.getSystemLibraries());
  }
  
  public void collectProjectLibs(MoClass parent, Path file) {
    if (this.omc == null) return;
    Path p = file.getParent();
    String basename = file.getFileName().toString().replaceAll("\\.mo$", "");
    p = p.resolve(basename + ".import");
    if (Files.notExists(p)) return;
    try {
      List<Path> list = new ArrayList<>();
      for (String line : Files.readAllLines(p)) {
        list.add(Paths.get(line));
      }
      this.omc.addProjectLibraries(list);
      collect(parent, this.omc.getProjectLibraries());
    } catch (IOException | ParserException e) {
      logger.error(e);
    }
  }
  
  private void collect(MoClass parent, List<Pair<String, Path>> list) {
    for (Pair<String, Path> lib : list) {
      MoClass mc = MoClass.parse(omc, lib.getKey(), parent, 1);
      setChanged();
      notifyObservers(mc);
    }
  }
  
  public void collectProject(MoClass parent, Path file) {
    if (this.omc == null) return;
    try {
      this.omc.setProject(file);
      collect(parent, Collections.singletonList(this.omc.getProject()));
    } catch (ParserException e) {
      logger.error(e);
    }
  }
}

package de.thm.mni.mhpp11.parser;

import de.thm.mni.mhpp11.config.Settings;
import de.thm.mni.mhpp11.parser.models.MoClass;
import javafx.util.Pair;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by hobbypunk on 14.09.16.
 */
public class PackageParser {
  
  private static ExecutorService es = Executors.newSingleThreadExecutor();
  
  public static Path findBasePackage(Path f) {
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
      DirectoryStream<Path> ds = Files.newDirectoryStream(f2, entry -> entry.getFileName().toString().matches("(?i)package.mo$"));
      Iterator<Path> iterator = ds.iterator();
      if (iterator.hasNext()) return iterator.next();
    } catch (IOException e) {
      Settings.load().getLogger().error(e);
    }
    return f;
  }
  
  public static void collectSystemLibs(OMCompiler omc, MoClass parent) {
    collect(omc, parent, omc.getSystemLibraries());
  }
  
  public static void collectProjectLibs(OMCompiler omc, MoClass parent, Path file) {
    Path p = file.getParent();
    String basename = file.getFileName().toString().replaceAll("\\.mo$", "");
    p = p.resolve(basename + ".import");
    if (Files.notExists(p)) return;
    try {
      List<Path> list = new ArrayList<>();
      for (String line : Files.readAllLines(p)) {
        list.add(Paths.get(line));
      }
      omc.addProjectLibraries(list);
      collect(omc, parent, omc.getProjectLibraries());
    } catch (IOException | ParserException e) {
  
      Settings.load().getLogger().error(e);
    }
  }
  
  private static void collect(OMCompiler omc, MoClass parent, List<Pair<String, Path>> list) {
    for (Pair<String, Path> lib : list) {
      es.execute(() -> MoClass.parse(omc, lib.getKey(), parent, 1));
    }
  }
  
  public static void collectProject(OMCompiler omc, MoClass parent, Path file) {
    try {
      omc.setProject(file);
      collect(omc, parent, Collections.singletonList(omc.getProject()));
    } catch (ParserException e) {
      Settings.load().getLogger().error(e);
    }
  }
  
  public static void close() {
    es.shutdownNow();
  }
}

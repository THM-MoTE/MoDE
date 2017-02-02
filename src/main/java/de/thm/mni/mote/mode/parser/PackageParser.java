package de.thm.mni.mote.mode.parser;

import de.thm.mni.mhpp11.jActor.actors.logging.messages.WarnMessage;
import de.thm.mni.mhpp11.jActor.actors.messagebus.MessageBus;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

/**
 * Created by hobbypunk on 14.09.16.
 */
public class PackageParser {
  
  public static Path findBasePackage(UUID group, Path f) {
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
      MessageBus.getInstance().send(new WarnMessage(PackageParser.class, group, "Cannot read lines"));
    }
    return f;
  }
}

package de.thm.mni.mote.mode.omcactor;

import de.thm.mni.mote.mode.parser.PackageParser;
import org.junit.Test;

import java.nio.file.Paths;
import java.util.UUID;

/**
 * Created by hobbypunk on 08.10.16.
 */
public class PackageParserTest {
  
  @Test
  public void findBaseNameTest() {
    System.out.println(PackageParser.findBasePackage(UUID.randomUUID(), Paths.get("./test.mo")));
    PackageParser.findBasePackage(UUID.randomUUID(), Paths.get("/home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/2014-modelica-kotani/SHM/package.mo"));
  }
}

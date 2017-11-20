package de.thm.mni.mote.mode.backend.omc;

import de.thm.mni.mote.mode.parser.PackageParser;
import org.junit.Test;

import java.nio.file.Paths;

/**
 * Created by Marcel Hoppe on 08.10.16.
 */
public class PackageParserTest {
  
  @Test
  public void findBaseNameTest() {
    System.out.println(PackageParser.findBasePackage(Paths.get("./test.mo")));
    PackageParser.findBasePackage(Paths.get("/home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/2014-modelica-kotani/SHM/package.mo"));
  }
}

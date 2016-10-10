package de.thm.mni.mhpp11;

import de.thm.mni.mhpp11.util.parser.PackageParser;
import de.thm.mni.mhpp11.util.parser.models.MoRoot;
import org.junit.Test;

import java.nio.file.Paths;

/**
 * Created by hobbypunk on 08.10.16.
 */
public class PackageParserTest {
  
  @Test
  public void findBaseNameTest() {
    PackageParser pp = PackageParser.getInstance();
    System.out.println(pp.findBasePackage(Paths.get("./test.mo")));
    pp.collectProjectLibs(new MoRoot("Test"), pp.findBasePackage(Paths.get("/home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/2014-modelica-kotani/SHM/package.mo")));
  }
}

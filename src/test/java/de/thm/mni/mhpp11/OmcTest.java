package de.thm.mni.mhpp11;

import de.thm.mni.mhpp11.util.config.Settings;
import de.thm.mni.mhpp11.util.config.model.Modelica;
import de.thm.mni.mhpp11.util.parser.OMCompiler;
import de.thm.mni.mhpp11.util.parser.ParserException;
import de.thm.mni.mhpp11.util.parser.models.MoClass;
import de.thm.mni.mhpp11.util.parser.models.MoRoot;
import javafx.util.Pair;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * Created by hobbypunk on 27.09.16.
 */
public class OmcTest {
  OMCompiler omc = null;
  
  @Before
  public void before() throws IOException {
    Modelica m = Settings.load().getModelica();
    omc = OMCompiler.getInstance(m.getCompiler(), m.getLibrary(), Locale.GERMANY);
    omc.sendExpression("getClassNames()");
  }
  
  @Test
  public void testSystemLibraries() {
    List<MoClass> l = new ArrayList<>();
    ExecutorService executor = Executors.newFixedThreadPool(8);
    MoRoot mr = new MoRoot("SystemLibs");
    for (Pair<String, Path> p : omc.getSystemLibraries()) {
      executor.execute(() -> {
        System.out.println(p);
        l.add(MoClass.parse(omc, p.getKey(), mr, 3));
      });
    }
    executor.shutdown();
    try {
      executor.awaitTermination(5, TimeUnit.DAYS);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    omc.disconnect();
  }
  
  @Test
  public void testLibraries() throws ParserException {
    omc.addProjectLibraries(Arrays.asList(Paths.get("/home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/2014-modelica-kotani/SHM/package.mo"), Paths.get("./test.mo")));
    List<Pair<String, Path>> list = omc.getProjectLibraries();
    System.out.println(list);
  }
  
  @Test
  public void testProject() throws ParserException {
    omc.setProject(Paths.get("./test.mo"));
    System.out.println(omc.getProject());
    System.out.println(omc.getSystemLibraries());
    System.out.println(omc.getProjectLibraries());
  }
}

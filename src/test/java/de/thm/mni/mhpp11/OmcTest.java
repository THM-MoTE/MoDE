package de.thm.mni.mhpp11;

import de.thm.mni.mhpp11.util.config.Settings;
import de.thm.mni.mhpp11.util.config.model.Modelica;
import de.thm.mni.mhpp11.util.parser.ClassInformation;
import de.thm.mni.mhpp11.util.parser.OMCompiler;
import de.thm.mni.mhpp11.util.parser.ParserException;
import de.thm.mni.mhpp11.util.parser.models.MoClass;
import de.thm.mni.mhpp11.util.parser.models.MoRoot;
import javafx.util.Pair;
import omc.corba.Result;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

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
  
  @After
  public void after() {
    if (omc != null) omc.disconnect();
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
  public void testInherited() throws ParserException {
    omc.addProjectLibraries(Arrays.asList(Paths.get("/home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/2014-modelica-kotani/SHM/package.mo")));
    MoRoot mr = new MoRoot("SystemLibs");
    MoClass mc = MoClass.parse(omc, "SHM", mr, 1);
    mc = mc.find(omc, "SHM.SeidelThesis.Components.SympatheticSystem");
    System.out.println(mc);
    System.out.println(mc.getInheritedClasses());
  }
  
  @Test
  public void testAnnotations() throws ParserException {
    omc.addProjectLibraries(Arrays.asList(Paths.get("/home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/2014-modelica-kotani/SHM/package.mo")));
    List<String> list = omc.getAnnotationStrings("SHM.SeidelThesis.Components.SympatheticSystem");
    
  }
  
  @Test
  public void testConnections() throws ParserException {
    omc.addProjectLibraries(Arrays.asList(Paths.get("/home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/2014-modelica-kotani/SHM/package.mo")));
    List<Map<String, String>> list = omc.getConnections("SHM.SeidelThesis.Examples.FullModel.SeidelThesisFullExample");
    System.out.println(list);
  }
  
  @Test
  public void testProject() throws ParserException {
    omc.setProject(Paths.get("./test.mo"));
    System.out.println(omc.getProject());
    System.out.println(omc.getSystemLibraries());
    System.out.println(omc.getProjectLibraries());
  }
  
  @Test
  public void testConnectors() throws ParserException {
    omc.addProjectLibraries(Arrays.asList(Paths.get("/home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/2014-modelica-kotani/SHM/package.mo")));
    Result r = omc.sendExpression("getEquationItemsCount(SHM.SeidelThesis.Examples.FullModel.SeidelThesisFullExample)");
    ClassInformation ci = omc.getClassInformation("SHM.Shared.Components.Compartments.BloodSystem");
    System.out.println(r.result);
    Integer count = Integer.parseInt(r.result);
    for (int i = 1; i <= count; i++) {
      r = omc.sendExpression("getNthEquationItem(SHM.SeidelThesis.Examples.FullModel.SeidelThesisFullExample, " + i + ")");
      Pattern p = Pattern.compile("^\"connect\\(\\s*([\\w\\.]+)\\s*,\\s*([\\w\\.]+)\\s*\\);\"$");
      Matcher m = p.matcher(r.result);
      System.out.println(r.result);
      if (m.matches()) {
        System.out.println("\tfrom: " + m.group(1));
        System.out.println("\tto:   " + m.group(2));
      }
    }
  
    omc.getConnections("SHM.SeidelThesis.Examples.FullModel.SeidelThesisFullExample").forEach(System.out::println);
  }
}

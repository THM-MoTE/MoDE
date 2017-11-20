package de.thm.mni.mote.mode.backend.omc;

import de.thm.mni.mote.mode.config.Settings;
import de.thm.mni.mote.mode.config.model.Modelica;
import de.thm.mni.mote.mode.modelica.ClassInformation;
import de.thm.mni.mote.mode.modelica.MoClass;
import de.thm.mni.mote.mode.modelica.MoRoot;
import de.thm.mni.mote.mode.parser.ParserException;
import lombok.val;
import omc.corba.Result;
import org.apache.commons.lang3.tuple.Pair;
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
 * Created by Marcel Hoppe on 27.09.16.
 */
public class OmcTest {
  private OMCompiler omc = null;
  
  @Before
  public void before() throws IOException {
    Modelica m = Settings.load().getModelica();
    omc = new OMCompiler(UUID.randomUUID(), m.getCompiler(), Locale.GERMANY);
    System.out.println(omc.getClient().call("getModelicaPath"));
    omc.getClient().call("getClassNames");
  }
  
  @After
  public void after() {
    if (omc != null) {
      omc.disconnect();
    }
  }
  
  @Test
  public void testSystemLibraries() {
    List<MoClass> l = new ArrayList<>();
    ExecutorService executor = Executors.newFixedThreadPool(8);
    MoRoot mr = new MoRoot("SystemLibs");
    for (Pair<String, Path> p : omc.getSystemLibraries()) {
      executor.execute(() -> {
        System.out.println(p);
//        try {
//          l.add(MoClass.parse(omc, new MoLater(p.getKey(), mr)));
//        } catch (ParserException e) {
//          e.printStackTrace();
//        }
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
//    omc.loadProjectLibraries(Arrays.asList(Paths.get("/home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/2014-modelica-kotani/SHM/package.mo"), Paths.get("./test.mo")));
    List<Pair<String, Path>> list = omc.getProjectLibraries();
    System.out.println(list);
  }
  
  @Test
  public void testInherited() throws ParserException {
//    omc.loadProjectLibraries(Arrays.asList(Paths.get("/home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/2014-modelica-kotani/SHM/package.mo")));
    MoRoot mr = new MoRoot("SystemLibs");
//    MoClass mc = MoClass.parse(omc, "SHM", mr, 1);
//    mc = mc.find(omc, "SHM.SeidelThesis.Components.SympatheticSystem");
//    System.out.println(mc);
//    System.out.println(mc.getInheritedClasses());
  }
  
  @Test
  public void testAnnotations() throws ParserException {
//    omc.loadProjectLibraries(Arrays.asList(Paths.get("/home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/2014-modelica-kotani/SHM/package.mo")));
    List<String> list = omc.getAnnotationStrings("SHM.SeidelThesis.Components.SympatheticSystem");
    
  }
  
  @Test
  public void testConnections() throws ParserException {
//    omc.loadProjectLibraries(Arrays.asList(Paths.get("/home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/2014-modelica-kotani/SHM/package.mo")));
    val className = "SHM.SeidelThesis.Examples.FullModel.SeidelThesisFullExample";
    List<Map<String, String>> list = omc.getConnections(className, omc.getClassInformation(className));
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
    //omc.loadProjectLibraries(Arrays.asList(Paths.get("/home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/2014-modelica-kotani/SHM/package.mo")));
    Result r = omc.getClient().call("getEquationItemsCount", "SHM.SeidelThesis.Examples.FullModel.SeidelThesisFullExample");
    ClassInformation ci = omc.getClassInformation("SHM.Shared.Components.Compartments.BloodSystem");
    System.out.println(r.result);
    Integer count = Integer.parseInt(r.result);
    for (int i = 1; i <= count; i++) {
      r = omc.getClient().call("getNthEquationItem", "SHM.SeidelThesis.Examples.FullModel.SeidelThesisFullExample", i);
      Pattern p = Pattern.compile("^\"connect\\(\\s*([\\w.]+)\\s*,\\s*([\\w.]+)\\s*\\);\"$");
      Matcher m = p.matcher(r.result);
      System.out.println(r.result);
      if (m.matches()) {
        System.out.println("\tfrom: " + m.group(1));
        System.out.println("\tto:   " + m.group(2));
      }
    }
    val className = "SHM.SeidelThesis.Examples.FullModel.SeidelThesisFullExample";
    omc.getConnections(className, omc.getClassInformation(className)).forEach(System.out::println);
  }
}

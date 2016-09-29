package de.thm.mni.mhpp11;

import de.thm.mni.mhpp11.util.parser.OMCompiler;
import de.thm.mni.mhpp11.util.parser.models.MoElement;
import omc.corba.Result;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by hobbypunk on 27.09.16.
 */
public class OmcTest {
  OMCompiler omc = null;
  
  @Before
  public void before() throws IOException {
    omc = new OMCompiler();
    omc.sendExpression("getClassNames()");
  }
  
  @Test
  public void test() {
    Result result = null;
    result = omc.sendExpression("loadFile(\"/home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/MoDE/test.mo\")");
    result = omc.sendExpression("getClassNames()");
    //MoElement.parse(omc, "Compartments", null);
    List<MoElement> l = new ArrayList<>();
    for (String s : omc.getSystemLibraries()) {
      System.out.println(s);
      l.add(MoElement.parse(omc, s, null));
    }
    omc.disconnect();
  }
}

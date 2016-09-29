package de.thm.mni.mhpp11;

import de.thm.mni.mhpp11.util.parser.OMCompiler;
import omc.corba.Result;

import java.io.IOException;

/**
 * Created by hobbypunk on 27.09.16.
 */
public class Test {
  
  public static void main(String args[]) {
    OMCompiler omc = null;
    try {
      omc = new OMCompiler();
      Result result = null;
//      MoElement e = MoElement.parse(omc, "BioChem", null);
      result = omc.sendExpression("loadFile(\"/home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/MoDE/test.mo\")");
      result = omc.sendExpression("getClassNames()");
      for (String s : omc.getLibraries()) {
        System.out.println(s);
        result = omc.sendExpression("getAnnotationCount(" + s + ")");
        result = omc.sendExpression("getNthAnnotationString(" + s + ", 0)");
        result = omc.sendExpression("getNthAnnotationString(" + s + ", 1)");
        result = omc.sendExpression("getNthAnnotationString(" + s + ", 2)");
        //System.out.println(result);
        result = omc.sendExpression("isClass(" + s + ")");
        System.out.println(result);
      }
      Thread.sleep(5000);
      omc.disconnect();
    } catch (IOException e) {
      e.printStackTrace();
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }
}

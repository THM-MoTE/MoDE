package de.thm.mni.mhpp11;

import de.thm.mni.mhpp11.util.parser.ASTParser;
import de.thm.mni.mhpp11.util.parser.ParserException;

import java.io.File;

/**
 * Hello world!
 *
 */
public class Main {
  
  public static void main(String[] args) {
    Main m = new Main();
    
    //m.testJModelica();
    m.startGUI(new String[]{"../2014-modelica-kotani/SHM/SeidelThesis/Components/Heart.mo"});
  }
  
  private void startGUI(String[] args) {
    MainApp.launch(MainApp.class, args);
  }
  
  private void testJModelica() {
    File file  = new File("./test.mo");
    file = new File("../2014-modelica-kotani/SHM/SeidelThesis/Examples/FullModel/package.mo");
    
    try {
      ASTParser.parse(file);
    } catch(ParserException e) {
      e.printStackTrace();
    }
  }
  
}

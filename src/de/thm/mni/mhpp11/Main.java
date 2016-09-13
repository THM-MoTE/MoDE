package de.thm.mni.mhpp11;

import de.thm.mni.mhpp11.util.parser.ASTParser;
import de.thm.mni.mhpp11.util.parser.ParserException;

/**
 * Hello world!
 *
 */
public class Main {
  
  public static void main(String[] args) {
    Main m = new Main();
    
    m.startGUI(args);
  }
  
  private void startGUI(String[] args) {
    MainApp.launch(MainApp.class, args);
  }
  
  private void testJModelica() {
    String path = "./test.mo";
    path = "/home/hobbypunk/Dokumente/Entwicklung/THM_Projekte/Projektphase/2014-modelica-kotani/SHM/SeidelThesis/Examples/FullModel/package.mo";
  
    ASTParser ap = ASTParser.getInstance();
    try {
      ap.parse(path);
    } catch(ParserException e) {
      e.printStackTrace();
    }
  }
  
}

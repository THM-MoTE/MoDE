package de.thm.mni.mhpp11;

import de.thm.mni.mhpp11.util.parser.ASTParser;
import de.thm.mni.mhpp11.util.parser.ParserException;
import de.thm.mni.mhpp11.util.UTF8ResourceBundleControl;

import java.util.Locale;
import java.util.ResourceBundle;

/**
 * Hello world!
 *
 */
public class Main {
  
  public static void main(String[] args) {
    Main m = new Main();
    m.startGUI(args);
    //m.internationalHelloWorld(args);
  }
  
  private void startGUI(String[] args) {
    MainApp.launch(MainApp.class, args);
  }
  
  private void internationalHelloWorld(String[] args) {
    String language = (args.length != 2) ? "en" : args[0];
    String country = (args.length != 2) ? "US" : args[1];
    
    Locale currentLocale = new Locale(language, country);
    System.out.println(new UTF8ResourceBundleControl().getFallbackLocale("de/thm/mni/mhpp11/i18n/Default", currentLocale));
    ResourceBundle messages = ResourceBundle.getBundle("de/thm/mni/mhpp11/i18n/Default", currentLocale, new UTF8ResourceBundleControl());
    System.out.println(messages.getString("hello_world"));
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

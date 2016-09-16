package de.thm.mni.mhpp11.util.parser;

import beaver.Parser.Exception;
import de.thm.mni.mhpp11.util.parser.models.MoProgramm;
import org.jmodelica.modelica.compiler.*;
import org.jmodelica.util.OptionRegistry;
import org.jmodelica.util.OptionRegistry.LocalIteration;
import org.jmodelica.util.streams.CodeStream;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


/**
 * Created by hobbypunk on 08.09.16.
 */
public class ASTParser {
  
  public static MoProgramm parse(File file) throws ParserException {
    OptionRegistry or = ModelicaCompiler.createOptions();
    or.setStringOption("local_iteration_in_tearing", LocalIteration.ALL);
    SourceRoot sr;
    
    try {
      sr = ParserHandler.parseModelicaFile(UtilInterface.create(or), file.getAbsolutePath());
      return parse(sr);
      
    } catch (Exception | IOException e) {
      e.printStackTrace();
      throw new ParserException(e.getCause());
    }
  }
  
  public static MoProgramm parse(SourceRoot sr) {
    Program p = sr.getProgram();
    return MoProgramm.parse(p);
  }
  
  public static List<String> parse(Access a) {
    List<String> packageList = new ArrayList<>();
    
    if (a instanceof ParseAccess) {
      packageList.add(((ParseAccess) a).getID());
    } else {
      for (int i = 0; i < a.getChild(0).getNumChild(); i++) {
        ParseAccess pa = (ParseAccess) a.getChild(0).getChild(i);
        packageList.add(pa.getID());
      }
    }
    
    return packageList;
  }
  
  private static void print(List<? extends ClassDecl> list) {
    Printer print = new DumpTreePrinter();
    CodeStream cs = new CodeStream(System.out);
    for (ClassDecl bcd : list) {
      bcd.prettyPrint(print, cs, "");
      System.out.println("\n===========================");
    }
  }
  
  private static void print(Program p) {
    Printer print = new DumpTreePrinter();
    CodeStream cs = new CodeStream(System.out);
    p.prettyPrint(print, cs, "");
  }
}

package de.thm.mni.mhpp11.parser;

import beaver.Parser.Exception;
import de.thm.mni.mhpp11.parser.model.MoProgramm;
import de.thm.mni.mhpp11.parser.model.MoWithin;
import org.jmodelica.modelica.compiler.*;
import org.jmodelica.modelica.compiler.LibraryList.LibraryDef;
import org.jmodelica.util.OptionRegistry;
import org.jmodelica.util.OptionRegistry.LocalIteration;
import org.jmodelica.util.streams.CodeStream;

import java.io.IOException;
import java.util.Set;


/**
 * Created by hobbypunk on 08.09.16.
 */
public class ASTParser {
  
  private static ASTParser ourInstance = new ASTParser();
  
  public static ASTParser getInstance() {
    return ourInstance;
  }
  
  private ASTParser() {}
  
  public MoProgramm parse(String file) throws ParserException {
    OptionRegistry or = ModelicaCompiler.createOptions();
    or.setStringOption("local_iteration_in_tearing", LocalIteration.ALL);
    SourceRoot sr;
    
    try {
      sr = ParserHandler.parseModelicaFile(UtilInterface.create(or), file);
      return parse(sr);
      
    } catch(Exception | IOException e) {
      e.printStackTrace();
      throw new ParserException(e.getCause());
    }
  }
  
  public MoProgramm parse(SourceRoot sr) {
    Program p = (Program)sr.getChild(0);
    print(p);
    return parse(p);
  }
  
  private MoProgramm parse(Program p) {
    MoProgramm mp = new MoProgramm("","");
    StoredDefinition sd = (StoredDefinition)p.getChild(0).getChild(0);
    mp.setWithin(parseWithin(sd));
    return mp;
  }
  
  private MoWithin parseWithin(StoredDefinition sd) {
    if(sd.getWithin() == null) return null;
    Within w = sd.getWithin();
    return new MoWithin(w.getPackageName().toString());
  }
  
  private void print(List<? extends ClassDecl> list) {
    Printer print = new DumpTreePrinter();
    CodeStream cs = new CodeStream(System.out);
    for(ClassDecl bcd: list) {
      bcd.prettyPrint(print, cs, "");
      System.out.println("\n===========================");
    }
  }
  
  private void print(Program p) {
    Printer print = new DumpTreePrinter();
    CodeStream cs = new CodeStream(System.out);
    p.prettyPrint(print, cs, "");
  }
}

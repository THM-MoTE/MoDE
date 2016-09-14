package de.thm.mni.mhpp11.util.parser;

import beaver.Parser.Exception;
import de.thm.mni.mhpp11.model.MoPackage;
import de.thm.mni.mhpp11.model.MoProgramm;
import de.thm.mni.mhpp11.model.MoWithin;
import org.jmodelica.modelica.compiler.*;
import org.jmodelica.util.OptionRegistry;
import org.jmodelica.util.OptionRegistry.LocalIteration;
import org.jmodelica.util.streams.CodeStream;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;


/**
 * Created by hobbypunk on 08.09.16.
 */
public class ASTParser {
  
  private static ASTParser ourInstance = new ASTParser();
  
  public static ASTParser getInstance() {
    return ourInstance;
  }
  
  private ASTParser() {}
  
  public MoProgramm parse(File file) throws ParserException {
    OptionRegistry or = ModelicaCompiler.createOptions();
    or.setStringOption("local_iteration_in_tearing", LocalIteration.ALL);
    SourceRoot sr;
    
    try {
      sr = ParserHandler.parseModelicaFile(UtilInterface.create(or), file.getAbsolutePath());
      return parse(sr);
      
    } catch(Exception | IOException e) {
      e.printStackTrace();
      throw new ParserException(e.getCause());
    }
  }
  
  public MoProgramm parse(SourceRoot sr) {
    Program p = sr.getProgram();
    return parse(p);
  }
  
  private MoProgramm parse(Program p) {
    MoProgramm mp = new MoProgramm("");
    StoredDefinition sd = (StoredDefinition)p.getChild(0).getChild(0);
    mp.setWithin(parseWithin(sd));
    mp.setPackage(parsePackage(sd));
    return mp;
  }
  
  private MoWithin parseWithin(StoredDefinition sd) {
    java.util.List<String> packageList = new ArrayList<>();
    if(sd.getWithin() == null) return new MoWithin(packageList);
    Access a =sd.getWithin().getPackageName();
    if(a instanceof ParseAccess) {
     packageList.add(((ParseAccess) a).getID());
    } else {
      for (int i = 0; i < a.getChild(0).getNumChild(); i++) {
        ParseAccess pa = (ParseAccess) a.getChild(0).getChild(i);
        packageList.add(pa.getID());
      }
    }
    return new MoWithin(packageList);
  }
  
  private MoPackage parsePackage(StoredDefinition sd) {
    FullClassDecl fcd = (FullClassDecl)sd.getChild(1).getChild(0);
    if(!(fcd.getChild(4) instanceof MPackage)) return null;
    String name = fcd.getName().getID();
    StringComment sc = fcd.getStringComment();
    String comment = (sc == null)? null: sc.getComment();
    return new MoPackage(name, comment);
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

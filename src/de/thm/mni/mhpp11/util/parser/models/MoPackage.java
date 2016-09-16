package de.thm.mni.mhpp11.util.parser.models;

import org.jmodelica.modelica.compiler.FullClassDecl;
import org.jmodelica.modelica.compiler.MPackage;
import org.jmodelica.modelica.compiler.StringComment;

/**
 * Created by hobbypunk on 16.09.16.
 */
public class MoPackage extends MoClass {
  
  private MoPackage(String name, String description) {
    super(name, description);
  }
  
  public static MoPackage parse(FullClassDecl fcd) {
    if(!(fcd.getChild(4) instanceof MPackage)) return null;
    String name = fcd.getName().getID();
    StringComment sc = fcd.getStringComment();
    String comment = (sc == null)? null: sc.getComment();
    return new MoPackage(name, comment);
  }
}

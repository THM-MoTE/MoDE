package de.thm.mni.mhpp11.util.parser.models;

import org.jmodelica.modelica.compiler.FullClassDecl;
import org.jmodelica.modelica.compiler.Model;
import org.jmodelica.modelica.compiler.StringComment;

import java.util.List;

/**
 * Created by hobbypunk on 16.09.16.
 */
public class MoModel extends MoClass {
  
  public MoModel(String name, String description, List<MoAnnotation> annotations) {
    super(name, description, annotations);
  }
  
  
  public static MoModel parse(FullClassDecl fcd) {
    if(!(fcd.getChild(4) instanceof Model)) return null;
    String name = fcd.getName().getID();
    StringComment sc = fcd.getStringComment();
    String comment = (sc == null)? null: sc.getComment();
    List<MoAnnotation> list = MoAnnotation.parse(fcd.getAnnotation());
    return new MoModel(name, comment, list);
  }
}

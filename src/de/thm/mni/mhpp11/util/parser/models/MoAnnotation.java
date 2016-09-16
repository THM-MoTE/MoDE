package de.thm.mni.mhpp11.util.parser.models;

import org.jmodelica.modelica.compiler.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by hobbypunk on 16.09.16.
 */
public class MoAnnotation {
  
  public static List<MoAnnotation> parse(Annotation annotation) {
    if(annotation == null) return null;
    org.jmodelica.modelica.compiler.List<Argument> list = ((ClassModification)annotation.getChild(0)).getArguments();
    List<MoAnnotation> l = new ArrayList<>();
    for(Argument a : list) {
      MoAnnotation ma = parse((ComponentModification)a);
      if(ma != null) l.add(ma);
    }
    return l;
  }
  
  public static MoAnnotation parse(ComponentModification cm) {
    if(cm.getName().asID().toLowerCase().equals("icon")) {
      return MoIcon.parse(((CompleteModification)cm.getChild(3).getChild(0)).getClassModification().getArguments());
    }
    return null;
  }
}

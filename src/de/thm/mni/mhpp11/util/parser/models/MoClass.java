package de.thm.mni.mhpp11.util.parser.models;

import lombok.Getter;
import org.jmodelica.modelica.compiler.FullClassDecl;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by hobbypunk on 07.09.16.
 */
public class MoClass extends MoElement {
  
  @Getter private final List<MoAnnotation> annotations;
  
  public MoClass(String name, String description) {
    super(name, description);
    this.annotations = new ArrayList<>();
  }
  public MoClass(String name, String description, List<MoAnnotation> annotations) {
    super(name, description);
    this.annotations = annotations;
  }
  
  @Override
  public String toString() { return "p > " + this.getName(); }
  
  public static MoClass parse(FullClassDecl fcd) {
    MoClass tmp = MoModel.parse(fcd);
    
    return tmp;
  }
  
  
}

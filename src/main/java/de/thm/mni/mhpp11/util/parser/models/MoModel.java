package de.thm.mni.mhpp11.util.parser.models;

import de.thm.mni.mhpp11.util.parser.OMCompiler;
import lombok.Builder;

/**
 * Created by hobbypunk on 16.09.16.
 */
public class MoModel extends MoClass {
  
  @Builder
  public MoModel(String name, MoElement parent) {
    super(name, parent);
  }
  
  @Override
  public String toString() { return "m > " + this.getName(); }
  
  public static MoModel parse(OMCompiler omc, String name, MoPackage parent) {
    MoModelBuilder mb = builder();
    mb.name(name);
    mb.parent(parent);
    MoModel mm = mb.build();
    
    //mm.getAnnotations().addAll(MoAnnotation.parse(omc, mm));
    parseExtra(omc, mm);
    return mm;
  }
}

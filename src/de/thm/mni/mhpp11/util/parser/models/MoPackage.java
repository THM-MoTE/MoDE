package de.thm.mni.mhpp11.util.parser.models;

import de.thm.mni.mhpp11.util.parser.OMCompiler;
import lombok.Builder;

/**
 * Created by hobbypunk on 16.09.16.
 */
public class MoPackage extends MoClass {
  
  @Builder
  private MoPackage(String name, MoElement parent) {
    super(name, parent);
  }
  
  @Override
  public String toString() {
    return "p > " + this.getName();
  }
  
  public static MoPackage parse(OMCompiler omc, String name, MoPackage parent) {
    MoPackageBuilder mb = builder();
    mb.name(name).parent(parent);
    MoPackage mp = mb.build();
    name = mp.getName();
    mp.setDescription(omc.getDescription(name));
    for (String child : omc.getChildren(name)) {
      mp.getChildren().add(MoElement.parse(omc, child, mp));
    }
    
    return mp;
  }
}

package de.thm.mni.mote.mode.modelica;

import lombok.EqualsAndHashCode;
import lombok.Value;

/**
 * Created by Marcel Hoppe on 06.10.16.
 */
@Value
@EqualsAndHashCode(callSuper = true)
public class MoRoot extends MoContainer {
  
  public MoRoot() {
    this("");
  }
  
  public MoRoot(String name) {
    super(null, null, name);
  }
  
  @Override
  public MoContainer find(String s) {
    MoContainer that;
    for (MoContainer child : getChildren()) {
      that = child.find(s);
      if (that != null) return that;
    }
    return null;
  }
}

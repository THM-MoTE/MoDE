package de.thm.mni.mote.mode.modelica;

/**
 * Created by hobbypunk on 06.10.16.
 */
public class MoRoot extends MoContainer {
  
  public MoRoot() {
    this("");
  }
  
  public MoRoot(String name) {
    super(null, null, name);
  }
  
  @Override
  public String getName() {
    return super.name;
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

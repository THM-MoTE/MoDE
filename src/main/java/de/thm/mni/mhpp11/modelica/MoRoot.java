package de.thm.mni.mhpp11.modelica;

/**
 * Created by hobbypunk on 06.10.16.
 */
public class MoRoot extends MoClass {
  
  public MoRoot() {
    this("");
  }
  
  public MoRoot(String name) {
    super(null, name, null);
    PREFIX = "r";
  }
}

package de.thm.mni.mhpp11.util.parser.models;

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

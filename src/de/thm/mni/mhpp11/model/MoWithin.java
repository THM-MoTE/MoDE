package de.thm.mni.mhpp11.model;

/**
 * Created by hobbypunk on 08.09.16.
 */
public class MoWithin extends MoElement {
  
  public MoWithin(String name) {
    super(name);
  }
  
  @Override
  public String toString() {
    return "w > " + this.name;
  }
}

package de.thm.mni.mhpp11.model;

/**
 * Created by hobbypunk on 07.09.16.
 */
public class MoPackage extends MoElement {
  
  public MoPackage(String name, String description) {
    super(name, description);
  }
  
  @Override
  public String toString() { return "p > " + this.name; }
}

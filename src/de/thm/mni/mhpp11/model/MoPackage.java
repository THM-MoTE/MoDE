package de.thm.mni.mhpp11.model;

import java.util.List;


/**
 * Created by hobbypunk on 07.09.16.
 */
public class MoPackage extends MoElement {
    
  public final List<MoElement> list;
  
  public MoPackage(String name, String description, List<MoElement> list) {
    super(name, description);
    this.list = list;
  }
  
  @Override
  public String toString() { return "p > " + this.name; }
}

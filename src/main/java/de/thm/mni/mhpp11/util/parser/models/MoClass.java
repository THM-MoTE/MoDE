package de.thm.mni.mhpp11.util.parser.models;

import lombok.Getter;
import lombok.Setter;

/**
 * Created by hobbypunk on 07.09.16.
 */
@Getter
@Setter
public class MoClass extends MoElement {
  
  public MoClass(String name, MoElement parent) {
    super(name, parent);
  }
  
  @Override
  public String toString() { return "c > " + this.getName(); }
  
}

package de.thm.mni.mhpp11.util.parser.models.interfaces;

import lombok.Getter;
import lombok.Setter;

/**
 * Created by hobbypunk on 20.10.16.
 */
@Getter
public abstract class MoElement extends MoAnnotatable {
  protected String PREFIX = " ";
  protected String name = "";
  @Setter private String comment = "";
  
  
  public MoElement(String prefix, String name, String comment) {
    this.PREFIX = prefix;
    this.name = name;
    this.comment = comment;
  }
  
  public String toString() { return PREFIX + " > " + this.getName(); }
}

package de.thm.mni.mhpp11.util.parser.models.interfaces;

import de.thm.mni.mhpp11.util.parser.models.annotations.MoAnnotation;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by hobbypunk on 20.10.16.
 */
@Getter
public abstract class MoElement {
  protected String PREFIX = " ";
  protected String name = "";
  @Setter private String comment = "";
  
  private final List<MoAnnotation> annotations = new ArrayList<>();
  
  public MoElement(String prefix, String name, String comment) {
    this.PREFIX = prefix;
    this.name = name;
    this.comment = comment;
  }
}

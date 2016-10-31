package de.thm.mni.mhpp11.util.parser.models.interfaces;

import de.thm.mni.mhpp11.util.parser.models.annotations.MoAnnotation;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.Collection;
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
  
  public void add(MoAnnotation annotation) {
    annotations.add(annotation);
  }
  
  public void add(int index, MoAnnotation annotation) {
    annotations.add(index, annotation);
  }
  
  public void addAll(Collection<? extends MoAnnotation> list) {
    annotations.addAll(list);
  }
  
  public void addAll(int index, Collection<? extends MoAnnotation> list) {
    annotations.addAll(index, list);
  }
  
  public String toString() { return PREFIX + " > " + this.getName(); }
}

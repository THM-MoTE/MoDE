package de.thm.mni.mote.mode.modelica.interfaces;

import de.thm.mni.mote.mode.modelica.annotations.MoAnnotation;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Marcel Hoppe on 01.11.16.
 */

@SuppressWarnings("MismatchedQueryAndUpdateOfCollection")
@Getter
public abstract class MoAnnotatable {
  private final List<MoAnnotation> annotations = new ArrayList<>();
  
  public void add(MoAnnotation annotation) {
    annotations.add(annotation);
  }
  
  public void add(int index, MoAnnotation annotation) {
    annotations.add(index, annotation);
  }
  
  protected void addAllAnnotations(List<MoAnnotation> list) {
    annotations.addAll(list);
  }
  
  public void addAllAnnotations(int index, List<MoAnnotation> list) {
    annotations.addAll(index, list);
  }
  
}

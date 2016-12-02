package de.thm.mni.mhpp11.modelica.interfaces;

import de.thm.mni.mhpp11.modelica.annotations.MoAnnotation;

import java.util.List;

/**
 * Created by hobbypunk on 20.10.16.
 */
public interface ElementWithAnnotations {
  List<MoAnnotation> getAnnotations();
}

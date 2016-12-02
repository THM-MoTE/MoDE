package de.thm.mni.mhpp11.modelica;

import de.thm.mni.mhpp11.parser.ClassInformation;

/**
 * Created by hobbypunk on 16.09.16.
 */
public class MoModel extends MoClass {
  
  MoModel(ClassInformation classInformation, String name, MoClass parent) {
    super(classInformation, name, parent);
    PREFIX = "m";
  }
}

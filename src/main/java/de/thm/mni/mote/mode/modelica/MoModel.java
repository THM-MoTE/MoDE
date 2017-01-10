package de.thm.mni.mote.mode.modelica;

import de.thm.mni.mote.mode.parser.ClassInformation;

/**
 * Created by hobbypunk on 16.09.16.
 */
public class MoModel extends MoClass {
  
  MoModel(ClassInformation classInformation, String name, MoClass parent) {
    super(classInformation, name, parent);
    PREFIX = "m";
  }
}

package de.thm.mni.mote.mode.modelica;

/**
 * Created by Marcel Hoppe on 16.09.16.
 */
class MoModel extends MoClass {
  
  MoModel(ClassInformation classInformation, MoLater that) {
    super(classInformation, that);
    PREFIX = "m";
  }
}

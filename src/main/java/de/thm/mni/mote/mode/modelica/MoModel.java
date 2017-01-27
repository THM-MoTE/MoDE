package de.thm.mni.mote.mode.modelica;

/**
 * Created by hobbypunk on 16.09.16.
 */
public class MoModel extends MoClass {
  
  MoModel(ClassInformation classInformation, MoLater that) {
    super(classInformation, that);
    PREFIX = "m";
  }
}

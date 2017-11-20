package de.thm.mni.mote.mode.modelica;

/**
 * Created by Marcel Hoppe on 20.10.16.
 */
public class MoConnector extends MoClass {
  MoConnector(ClassInformation classInformation, MoLater that) {
    super(classInformation, that);
    PREFIX = "c";
  }
}

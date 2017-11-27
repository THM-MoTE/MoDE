package de.thm.mni.mote.mode.modelica;

import lombok.EqualsAndHashCode;
import lombok.Value;

/**
 * Created by Marcel Hoppe on 16.09.16.
 */
@Value
@EqualsAndHashCode(callSuper = true)
public class MoPackage extends MoClass {
  
  MoPackage(ClassInformation classInformation, MoLater that) {
    super(classInformation, that);
    PREFIX = "p";
  }
}

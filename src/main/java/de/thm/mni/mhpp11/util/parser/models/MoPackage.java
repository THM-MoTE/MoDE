package de.thm.mni.mhpp11.util.parser.models;

/**
 * Created by hobbypunk on 16.09.16.
 */
public class MoPackage extends MoClass {
  
  MoPackage(String name, MoClass parent) {
    super(name, parent);
    PREFIX = "p";
  }
}

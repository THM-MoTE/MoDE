package de.thm.mni.mhpp11.util.parser.models;

/**
 * Created by hobbypunk on 16.09.16.
 */
public class MoModel extends MoClass {
  
  MoModel(String name, MoClass parent) {
    super(name, parent);
    PREFIX = "m";
  }
}

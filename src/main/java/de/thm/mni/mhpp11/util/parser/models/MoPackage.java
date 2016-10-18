package de.thm.mni.mhpp11.util.parser.models;

import de.thm.mni.mhpp11.util.parser.models.annotations.MoIcon;
import de.thm.mni.mhpp11.util.parser.models.graphics.MoDefaults;

/**
 * Created by hobbypunk on 16.09.16.
 */
public class MoPackage extends MoClass {
  
  MoPackage(String name, MoClass parent) {
    super(name, parent);
    PREFIX = "p";
  }
  
  @Override
  public MoIcon getIcon() {
    return (super.getIcon() != null) ? super.getIcon() : MoDefaults.newPackage();
  }
}

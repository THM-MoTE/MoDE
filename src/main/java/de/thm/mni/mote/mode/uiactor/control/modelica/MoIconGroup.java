package de.thm.mni.mote.mode.uiactor.control.modelica;

import de.thm.mni.mote.mode.modelica.MoContainer;
import de.thm.mni.mote.mode.modelica.graphics.MoText;
import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;

/**
 * Created by hobbypunk on 19.09.16.
 */
@FieldDefaults(makeFinal = true, level = AccessLevel.PRIVATE)
public class MoIconGroup extends MoGroup {

  public MoIconGroup(MoContainer parent) {
    super(parent);
    init();
  }
  
  protected void initImage() {
    this.getMoClass().getIcon().getMoGraphics().stream().filter(mg -> !(mg instanceof MoText)).forEach(this::initImage);
  }
}

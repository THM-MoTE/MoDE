package de.thm.mni.mhpp11.control.icon;

import de.thm.mni.mhpp11.util.parser.models.MoClass;

/**
 * Created by hobbypunk on 19.09.16.
 */
public class MoDiagramPane extends MoPane {
  
  public MoDiagramPane(MoClass moClass) {
    super(moClass);
    init();
  }
  
  @Override
  protected void initImage() {
    initVariables();
  }
  
  private void initVariables() {
    this.getMoClass().getVariables().forEach(super::initVariable);
  }
}

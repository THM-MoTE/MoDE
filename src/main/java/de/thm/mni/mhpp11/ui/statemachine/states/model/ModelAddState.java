package de.thm.mni.mhpp11.ui.statemachine.states.model;

import de.thm.mni.mhpp11.ui.control.modelica.MoDiagramGroup;
import lombok.EqualsAndHashCode;

/**
 * Created by hobbypunk on 23.11.16.
 */
@EqualsAndHashCode(callSuper = true)
public class ModelAddState extends ModelModifyState {
  
  public ModelAddState(MoDiagramGroup parent) {
    super(parent, null);
  }
}

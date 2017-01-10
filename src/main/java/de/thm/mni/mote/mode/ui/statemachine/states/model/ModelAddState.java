package de.thm.mni.mote.mode.ui.statemachine.states.model;

import de.thm.mni.mote.mode.ui.control.modelica.MoDiagramGroup;
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

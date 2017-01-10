package de.thm.mni.mote.mode.ui.statemachine.states.model;

import de.thm.mni.mote.mode.ui.control.modelica.MoDiagramGroup;
import de.thm.mni.mote.mode.ui.control.modelica.MoIconGroup;
import javafx.scene.input.MouseEvent;
import lombok.EqualsAndHashCode;

/**
 * Created by hobbypunk on 23.11.16.
 */
@EqualsAndHashCode(callSuper = true)
public class ModelDeleteState extends ModelModifyState {
  
  
  public ModelDeleteState(MoDiagramGroup parent, MoIconGroup source) {
    super(parent, source);
  }
  
  @Override
  protected void handleClicked(MouseEvent event) {
    getParent().getMoClass().removeVariable(getSource().getVariable());
    getMachine().switchToNoState();
  }
}

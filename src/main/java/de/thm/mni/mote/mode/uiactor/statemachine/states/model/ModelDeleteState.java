package de.thm.mni.mote.mode.uiactor.statemachine.states.model;

import de.thm.mni.mote.mode.parser.ParserException;
import de.thm.mni.mote.mode.uiactor.control.modelica.MoDiagramGroup;
import de.thm.mni.mote.mode.uiactor.control.modelica.MoIconGroup;
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
    try {
      getParent().getMoClass().removeVariable(getSource().getVariable());
    } catch (ParserException e) {
      e.printStackTrace(); //TODO send msg
    }
    getMachine().switchToNoState();
  }
}

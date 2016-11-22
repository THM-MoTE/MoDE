package de.thm.mni.mhpp11.statemachine.states.connection;

import de.thm.mni.mhpp11.control.icon.MoDiagramGroup;
import de.thm.mni.mhpp11.shape.Line;
import javafx.geometry.Point2D;
import javafx.scene.input.MouseEvent;
import lombok.EqualsAndHashCode;

/**
 * Created by hobbypunk on 22.11.16.
 */
@EqualsAndHashCode(callSuper = true)
public class ConnectionAddPointState extends ConnectionModifyState {
  
  
  public ConnectionAddPointState(MoDiagramGroup parent, Line source) {
    super(parent, source);
  }
  
  
  @Override
  protected void handleClicked(MouseEvent event) {
    Point2D mousePos = getParent().convertScenePointToDiagramPoint(event.getSceneX(), event.getSceneY());
    
    Integer[] poses = findNearLinePos(mousePos, true);
    if (poses != null) {
      getSource().getData().getPoints().add(poses[1], mousePos);
    }
    
    this.getMachine().switchToState(new ConnectionModifyState(getParent(), getSource()));
  }
}

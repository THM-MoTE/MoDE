package de.thm.mni.mhpp11.ui.statemachine.states.connection;

import de.thm.mni.mhpp11.parser.models.MoConnection;
import de.thm.mni.mhpp11.ui.control.modelica.MoDiagramGroup;
import de.thm.mni.mhpp11.ui.shape.Line;
import javafx.geometry.Point2D;
import javafx.scene.input.MouseEvent;
import lombok.EqualsAndHashCode;

import java.util.List;

/**
 * Created by hobbypunk on 22.11.16.
 */
@EqualsAndHashCode(callSuper = true)
public class ConnectionDeleteState extends ConnectionModifyState {
  
  public ConnectionDeleteState(MoDiagramGroup parent, Line source) {
    super(parent, source);
  }
  
  @Override
  protected void initTransitions() {}
  
  @Override
  protected void handleClicked(MouseEvent event) {
    Point2D mousePos = getParent().convertScenePointToDiagramPoint(event.getSceneX(), event.getSceneY());
    Boolean noState = false;
    
    Integer pos = findNearPointPos(mousePos);
    if (pos != null) {
      getSource().getData().getPoints().remove(pos.intValue());
    } else {
      Integer[] poses = findNearLinePos(mousePos, true);
      if (poses != null) {
        List<MoConnection> connections = getParent().getMoClass().getConnections();
        MoConnection conn;
        for (int i = 0, size = connections.size(); i < size; i++) {
          conn = connections.get(i);
          if (conn.getMoGraphics().contains(getSource().getData())) {
            connections.remove(i);
            break;
          }
        }
        noState = true;
      }
    }
    
    if (noState) this.getMachine().switchToNoState();
    else this.getMachine().switchToState(new ConnectionModifyState(getParent(), getSource()));
  }
}

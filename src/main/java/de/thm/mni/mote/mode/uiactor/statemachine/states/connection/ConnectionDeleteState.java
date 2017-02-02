package de.thm.mni.mote.mode.uiactor.statemachine.states.connection;

import de.thm.mni.mote.mode.modelica.MoConnection;
import de.thm.mni.mote.mode.parser.ParserException;
import de.thm.mni.mote.mode.uiactor.control.modelica.MoDiagramGroup;
import de.thm.mni.mote.mode.uiactor.shape.Line;
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
        try {
          List<MoConnection> connections = getParent().getMoClass().getConnections();
          for (MoConnection conn : connections) {
            if (conn.getMoGraphics().contains(getSource().getData())) {
              getParent().getMoClass().removeConnection(conn);
              break;
            }
          }
        } catch (ParserException e) {
          e.printStackTrace();
        }
        noState = true;
      }
    }
    
    if (noState) this.getMachine().switchToNoState();
    else this.getMachine().switchToState(new ConnectionModifyState(getParent(), getSource()));
  }
}

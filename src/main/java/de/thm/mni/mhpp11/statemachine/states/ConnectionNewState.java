package de.thm.mni.mhpp11.statemachine.states;

import de.thm.mni.mhpp11.control.icon.MoDiagramGroup;
import de.thm.mni.mhpp11.control.icon.MoIconGroup;
import de.thm.mni.mhpp11.control.icon.handlers.FocusHandler;
import de.thm.mni.mhpp11.util.parser.models.MoConnection;
import de.thm.mni.mhpp11.util.parser.models.MoVariable;
import de.thm.mni.mhpp11.util.parser.models.graphics.MoLine;
import javafx.geometry.Point2D;
import javafx.scene.Cursor;
import javafx.scene.Node;
import javafx.scene.input.MouseEvent;
import lombok.Value;
import lombok.experimental.NonFinal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by hobbypunk on 15.11.16.
 */
@Value
public class ConnectionNewState extends State<MouseEvent> {
  
  MoDiagramGroup parent;
  @NonFinal private List<MoVariable> startConnector;
  @NonFinal private Point2D startPos;
  
  public ConnectionNewState(MoDiagramGroup parent) {
    this.parent = parent;
  }
  
  @Override
  public void enter() {
    getMachine().getScene().setCursor(Cursor.CROSSHAIR);
  }
  
  @Override
  public void exit() {
    startConnector = null;
    startPos = null;
  }
  
  @Override
  public void handle(MouseEvent event) {
    if (event.getEventType().equals(MouseEvent.MOUSE_CLICKED)) {
      FocusHandler.getInstance().handle(event);
      handleClick(event);
      event.consume();
    }
  }
  
  private void handleClick(MouseEvent event) {
    MoIconGroup src = (MoIconGroup) event.getSource();
    Point2D mousePos = parent.convertScenePointToDiagramPoint(event.getSceneX(), event.getSceneY());
    if (startConnector == null) {
      startConnector = getVariables(src);
      startPos = mousePos;
    } else {
      parent.getMoClass().addConnection(new MoConnection(parent.getMoClass(), startConnector, getVariables(src), Collections.singletonList(new MoLine(startPos, mousePos))));
      this.getMachine().switchToNoState();
    }
  }
  
  private List<MoVariable> getVariables(Node parent) {
    return getVariables(parent, new ArrayList<>());
  }
  
  private List<MoVariable> getVariables(Node parent, List<MoVariable> list) {
    if (parent instanceof MoDiagramGroup) return list;
    if (parent instanceof MoIconGroup) {
      list.add(0, ((MoIconGroup) parent).getVariable());
    }
    return getVariables(parent.getParent(), list);
  }
}

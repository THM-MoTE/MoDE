package de.thm.mni.mote.mode.uiactor.statemachine.states.connection;

import de.thm.mni.mote.mode.modelica.MoConnection;
import de.thm.mni.mote.mode.modelica.MoVariable;
import de.thm.mni.mote.mode.modelica.graphics.MoLine;
import de.thm.mni.mote.mode.parser.ParserException;
import de.thm.mni.mote.mode.uiactor.control.modelica.MoDiagramGroup;
import de.thm.mni.mote.mode.uiactor.control.modelica.MoIconGroup;
import de.thm.mni.mote.mode.uiactor.shape.Line;
import de.thm.mni.mote.mode.uiactor.statemachine.states.NoState;
import de.thm.mni.mote.mode.uiactor.statemachine.states.State;
import javafx.collections.ListChangeListener;
import javafx.geometry.Point2D;
import javafx.scene.Cursor;
import javafx.scene.Node;
import javafx.scene.input.MouseEvent;
import lombok.EqualsAndHashCode;
import lombok.Value;
import lombok.experimental.NonFinal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by hobbypunk on 15.11.16.
 */
@Value
@EqualsAndHashCode(exclude = {"parent", "startPos"})
public class ConnectionCreateState extends State<MouseEvent, MoIconGroup> {
  
  MoDiagramGroup parent;
  private List<MoVariable> startConnector;
  @NonFinal private Point2D startPos;
  
  public ConnectionCreateState(MoDiagramGroup parent, MoIconGroup source) {
    super(source);
    this.parent = parent;
    startConnector = getVariables(source);
  }
  
  @Override
  protected void initTransitions() {
    getTransitions().put(MouseEvent.MOUSE_CLICKED, Arrays.asList(NoState.class, this.getClass(), ConnectionModifyState.class));
  }
  
  @Override
  public void enter() {
    getMachine().getScene().setCursor(Cursor.CROSSHAIR);
  }
  
  @Override
  protected void handleClicked(MouseEvent event) {
    MoIconGroup src = (MoIconGroup) event.getSource();
    Point2D mousePos = parent.convertScenePointToDiagramPoint(event.getSceneX(), event.getSceneY());
    if (startPos == null) {
      startPos = mousePos;
    } else {
      parent.getBasis().getChildren().addListener(new ListChangeListener<Node>() {
        @Override
        public void onChanged(Change<? extends Node> c) {
          while (c.next()) {
            for (Node n : c.getAddedSubList()) {
              if (n instanceof Line) {
                ConnectionCreateState.this.getMachine().switchToState(new ConnectionModifyState(parent, (Line) n));
              }
            }
            parent.getBasis().getChildren().removeListener(this);
          }
        }
      });
      try {
        parent.getMoClass().addConnection(new MoConnection(parent.getMoClass(), startConnector, getVariables(src), Collections.singletonList(new MoLine(startPos, mousePos))));
      } catch (ParserException e) {
        e.printStackTrace(); //TODO send msg
      }
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

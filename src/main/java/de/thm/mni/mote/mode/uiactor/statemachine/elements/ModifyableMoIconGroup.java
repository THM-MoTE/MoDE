package de.thm.mni.mote.mode.uiactor.statemachine.elements;

import de.thm.mni.mote.mode.modelica.MoConnection;
import de.thm.mni.mote.mode.modelica.MoContainer;
import de.thm.mni.mote.mode.modelica.MoVariable;
import de.thm.mni.mote.mode.parser.ParserException;
import de.thm.mni.mote.mode.uiactor.control.modelica.MoDiagramGroup;
import de.thm.mni.mote.mode.uiactor.control.modelica.MoIconGroup;
import de.thm.mni.mote.mode.uiactor.handlers.LibraryHandler;
import de.thm.mni.mote.mode.uiactor.statemachine.StateMachine;
import de.thm.mni.mote.mode.uiactor.statemachine.interfaces.Actionable;
import de.thm.mni.mote.mode.uiactor.statemachine.interfaces.Deletable;
import de.thm.mni.mote.mode.uiactor.statemachine.interfaces.Moveable;
import javafx.geometry.Point2D;
import javafx.scene.Parent;
import javafx.scene.control.TabPane;
import javafx.scene.input.InputEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.transform.Translate;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by hobbypunk on 16.02.17.
 */

public class ModifyableMoIconGroup extends MoIconGroup implements Actionable, Deletable, Moveable {
  
  private Boolean isMoving = false;
  private Translate o = null;
  
  private Point2D startMousePos = null;
  private Point2D startOrigin = null;
  private final Map<MoConnection, List<Point2D>> startConnectionPoints = new HashMap<>();
  private final Map<MoConnection, List<Integer>> startConnectionPointPoses = new HashMap<>();
  
  protected ModifyableMoIconGroup(MoDiagramGroup diagramParent, MoContainer parent, MoVariable variable, Boolean iconOnly) {
    super(diagramParent, parent, variable, iconOnly);
  }
  
  @Override
  public Boolean action(StateMachine sm, InputEvent event) {
    if (this.getContainer().getElement().hasDiagram()) {
      TabPane tb = findTabPane(this);
      if (tb == null) return false;
      
      try {
        LibraryHandler.getInstance().handleMenu(tb, this.getContainer(), "open_as_diagram");
      } catch (ParserException e) {
        e.printStackTrace();
      }
    }
    return true;
  }
  
  @Override
  public Boolean delete(InputEvent event) {
    this.getVariable().getParent().removeVariable(this.getVariable());
    return true;
  }
  
  @Override
  public Boolean moveDrag(InputEvent inputEvent) { //TODO: line not matching...
    MouseEvent event = (MouseEvent) inputEvent;
    
    if (isMoving) {
      Point2D mousePos = getMoParent().convertScenePointToDiagramPoint(new Point2D(event.getSceneX(), event.getSceneY()));
      Point2D delta = mousePos.subtract(startMousePos);
      updateConnections(delta);
      Point2D origin = startOrigin.add(delta);
      o.setX(origin.getX());
      o.setY(origin.getY());
    } else {
      isMoving = true;
      this.o = this.getOrigin();
      
      ModifyableMoIconGroup source = this;
      source.toFront();
      source.setOpacity(0.8);
      
      startMousePos = this.getMoParent().convertScenePointToDiagramPoint(new Point2D(event.getSceneX(), event.getSceneY()));
      startOrigin = new Point2D(o.getX(), o.getY());
      source.getVariable().getConnections().forEach(moConn -> {
        Boolean to = moConn.toContains(source.getVariable());
        Boolean from = moConn.fromContains(source.getVariable());
        if (!startConnectionPointPoses.containsKey(moConn)) {
          startConnectionPointPoses.put(moConn, new ArrayList<>());
          startConnectionPoints.put(moConn, new ArrayList<>());
        }
        if (from && to) { // self connection: move all points
          for (int i = 0, size = moConn.getLine().getPoints().size(); 0 < size; i++)
            startConnectionPointPoses.get(moConn).add(i);
        } else if (from)    // from is always the first point in a connection
          startConnectionPointPoses.get(moConn).add(0);
        else if (to)        // to is always the last point in a connection
          startConnectionPointPoses.get(moConn).add(moConn.getLine().getPoints().size() - 1);
        
        for (Integer pos : startConnectionPointPoses.get(moConn))
          startConnectionPoints.get(moConn).add(moConn.getLine().getPoints().get(pos));
      });
    }
    return true;
  }
  
  @Override
  public Boolean moveDrop(InputEvent event) {
    isMoving = false;
    return true;
  }
  
  
  private void updateConnections(Point2D delta) {
    startConnectionPointPoses.keySet().forEach(moConn -> {
      for (int i = 0, size = startConnectionPointPoses.get(moConn).size(); i < size; i++) {
        Integer pos = startConnectionPointPoses.get(moConn).get(i);
        Point2D point = startConnectionPoints.get(moConn).get(i);
        moConn.getLine().getPoints().set(pos, point.add(delta));
      }
    });
  }
  
  private TabPane findTabPane(Parent parent) {
    if (parent instanceof TabPane) return (TabPane) parent;
    if (parent.getParent() == null) return null;
    return findTabPane(parent.getParent());
  }
  
}

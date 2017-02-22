package de.thm.mni.mote.mode.uiactor.editor.statemachine.elements;

import de.thm.mni.mote.mode.modelica.MoConnection;
import de.thm.mni.mote.mode.modelica.MoContainer;
import de.thm.mni.mote.mode.modelica.MoVariable;
import de.thm.mni.mote.mode.parser.ParserException;
import de.thm.mni.mote.mode.uiactor.control.modelica.MoDiagramGroup;
import de.thm.mni.mote.mode.uiactor.control.modelica.MoIconGroup;
import de.thm.mni.mote.mode.uiactor.editor.actionmanager.commands.Command;
import de.thm.mni.mote.mode.uiactor.editor.actionmanager.elements.ModifyableMoVariable;
import de.thm.mni.mote.mode.uiactor.editor.statemachine.StateMachine;
import de.thm.mni.mote.mode.uiactor.editor.statemachine.interfaces.Actionable;
import de.thm.mni.mote.mode.uiactor.editor.statemachine.interfaces.Deletable;
import de.thm.mni.mote.mode.uiactor.editor.statemachine.interfaces.Moveable;
import de.thm.mni.mote.mode.uiactor.handlers.LibraryHandler;
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
  public Command action(StateMachine sm, InputEvent event) {
    if (this.getContainer().getElement().hasDiagram()) {
      TabPane tb = findTabPane(this);
      if (tb == null) return null;
      
      try {
        LibraryHandler.getInstance().handleMenu(tb, this.getContainer(), "open_as_diagram");
      } catch (ParserException e) {
        e.printStackTrace();
      }
    }
    return Command.IGNORE;
  }
  
  @Override
  public Command delete(InputEvent event) {
    return this.getMoParent().getModifyableMoClass().delete(this.getVariable());
  }
  
  @Override
  public Command move(StateMachine sm, InputEvent inputEvent) {
    MouseEvent event = (MouseEvent) inputEvent;
    if (event.getEventType().equals(MouseEvent.MOUSE_PRESSED) || event.getEventType().equals(MouseEvent.MOUSE_DRAGGED)) {
      this.moveDrag(inputEvent);
      sm.freeze();
      return Command.IGNORE;
    } else if (event.getEventType().equals(MouseEvent.MOUSE_RELEASED)) {
      isMoving = false;
      this.setOpacity(1);
      sm.unfreeze();
  
      Command c = Command.IGNORE;
      if (!startOrigin.equals(new Point2D(this.getOrigin().getX(), this.getOrigin().getY())))
        c = new ModifyableMoVariable(getVariable()).createMove(startOrigin, startConnectionPointPoses, startConnectionPoints);
      startOrigin = null;
      startConnectionPointPoses.clear();
      startConnectionPoints.clear();
      return c;
    }
    return null;
  }
  
  private void moveDrag(InputEvent inputEvent) {
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
  
      this.toFront();
      this.setOpacity(0.8);
      
      startMousePos = this.getMoParent().convertScenePointToDiagramPoint(new Point2D(event.getSceneX(), event.getSceneY()));
      startOrigin = new Point2D(o.getX(), o.getY());
      this.getVariable().getConnections().forEach(moConn -> {
        Boolean to = moConn.toContains(this.getVariable());
        Boolean from = moConn.fromContains(this.getVariable());
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

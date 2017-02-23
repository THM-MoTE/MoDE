package de.thm.mni.mote.mode.uiactor.editor.statemachine.elements;

import de.thm.mni.mote.mode.modelica.MoConnection;
import de.thm.mni.mote.mode.modelica.MoContainer;
import de.thm.mni.mote.mode.modelica.MoVariable;
import de.thm.mni.mote.mode.modelica.graphics.MoTransformation;
import de.thm.mni.mote.mode.parser.ParserException;
import de.thm.mni.mote.mode.uiactor.control.modelica.MoDiagramGroup;
import de.thm.mni.mote.mode.uiactor.control.modelica.MoVariableIconGroup;
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

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by hobbypunk on 16.02.17.
 */

public class ModifyableMoVariableIconGroup extends MoVariableIconGroup implements Actionable, Deletable, Moveable {
  
  private Boolean isMoving = false;
  private MoTransformation transformation = null;
  
  private Point2D startMousePos = null;
  private Point2D startOrigin = null;
  private final Map<MoConnection, List<Point2D>> startConnectionPoints = new HashMap<>();
  private final Map<MoConnection, List<Integer>> startConnectionPointPoses = new HashMap<>();
  
  //ROTATE
  private Point2D variableCenter = null;
  private Double startAngle = null;
  private Double startRotation = null;
  
  //RESIZE
  private Point2D startPos = null;
  
  protected ModifyableMoVariableIconGroup(MoDiagramGroup diagramParent, MoContainer parent, MoVariable variable) {
    super(diagramParent, parent, variable);
  }
  
  @Override
  public Command action(StateMachine sm, InputEvent event) {
    if (this.getThat().getElement().hasDiagram()) {
      TabPane tb = findTabPane(this);
      if (tb == null) return null;
      
      try {
        LibraryHandler.getInstance().handleMenu(tb, this.getThat(), "open_as_diagram");
      } catch (ParserException e) {
        e.printStackTrace();
      }
    }
    return Command.IGNORE;
  }
  
  @Override
  public Command delete(InputEvent event) {
    return this.getMoDiagram().getModifyableMoClass().delete(this.getVariable());
  }
  
  @Override
  public Command move(StateMachine sm, InputEvent inputEvent) {
    if (!(inputEvent instanceof MouseEvent)) return null;
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
      if (this.transformation == null) return;
      Point2D mousePos = getMoDiagram().convertScenePointToDiagramPoint(new Point2D(event.getSceneX(), event.getSceneY()));
      Point2D delta = mousePos.subtract(startMousePos);
      updateConnections(delta);
  
      transformation.getOrigin().set(startOrigin.add(delta));
    } else {
      isMoving = true;
      transformation = getVariable().getPlacement().getIconTransformation();
      if (transformation == null) transformation = getVariable().getPlacement().getDiagramTransformation();
  
      this.toFront();
      this.setOpacity(0.8);
  
      startMousePos = this.getMoDiagram().convertScenePointToDiagramPoint(new Point2D(event.getSceneX(), event.getSceneY()));
      startOrigin = transformation.getOrigin().get();
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
  
  Command rotate(StateMachine sm, InputEvent inputEvent) {
    if (!(inputEvent instanceof MouseEvent) || this.transformation == null) return null;
    
    MouseEvent event = (MouseEvent) inputEvent;
    if (event.getEventType().equals(MouseEvent.MOUSE_PRESSED)) {
      sm.freeze();
      calcCenter();
      Point2D pos = this.getMoDiagram().convertScenePointToDiagramPoint(new Point2D(event.getSceneX(), event.getSceneY()));
      startAngle = (double) Math.round(Math.toDegrees(Math.atan2(pos.getX() - variableCenter.getX(), variableCenter.getY() - pos.getY())));
      startRotation = transformation.getRotation().get();
      return Command.IGNORE;
    } else if (event.getEventType().equals(MouseEvent.MOUSE_DRAGGED) && startAngle != null) {
      Point2D pos = this.getMoDiagram().convertScenePointToDiagramPoint(new Point2D(event.getSceneX(), event.getSceneY()));
      Double angle = (double) Math.round(Math.toDegrees(Math.atan2(pos.getX() - variableCenter.getX(), variableCenter.getY() - pos.getY())));
      Double newRotation = (startRotation - (startAngle - angle)) % 360;
      transformation.getRotation().set((newRotation < 0) ? 360 + newRotation : newRotation);
      return Command.IGNORE;
    } else if (event.getEventType().equals(MouseEvent.MOUSE_RELEASED)) {
      Command c = new ModifyableMoVariable(getVariable()).createRotation(startRotation);
      startAngle = null;
      startRotation = null;
      variableCenter = null;
      sm.unfreeze();
      return c;
    }
    
    return null;
  }
  
  private void calcCenter() {
    if (transformation == null) return;
    Point2D extent0 = transformation.getExtent().getP1();
    Point2D extent1 = transformation.getExtent().getP2();
    
    Point2D largest = new Point2D(Math.max(extent0.getX(), extent1.getX()), Math.max(extent0.getY(), extent1.getY()));
    Point2D smallest = new Point2D(Math.min(extent0.getX(), extent1.getX()), Math.min(extent0.getY(), extent1.getY()));
    
    Double width = largest.getX() - smallest.getX();
    Double height = largest.getY() - smallest.getX();
    
    variableCenter = smallest.add(width / 2, height / 2).add(transformation.getOrigin().get());
  }
  
  
  //TODO: MoTransformation change: expand extent to hoffset, voffset(origin), hscale, vscale, hflip, vflip
  Command resize(StateMachine sm, InputEvent inputEvent, Integer combination) {
    if (!(inputEvent instanceof MouseEvent) || this.transformation == null) return null;
    
    MouseEvent event = (MouseEvent) inputEvent;
    if (event.getEventType().equals(MouseEvent.MOUSE_PRESSED)) {
      sm.freeze();
      return Command.IGNORE;
    } else if (event.getEventType().equals(MouseEvent.MOUSE_DRAGGED) && startPos != null) {
      return Command.IGNORE;
    } else if (event.getEventType().equals(MouseEvent.MOUSE_RELEASED)) {
      //Command c = new ModifyableMoVariable(variable).createResize(extent0, extent1);
      sm.unfreeze();
      return Command.IGNORE;// return c;
    }
    return null;
  }
}

package de.thm.mni.mote.mode.frontend.editor.statemachine.elements;

import de.thm.mni.mote.mode.modelica.MoContainer;
import de.thm.mni.mote.mode.modelica.MoVariable;
import de.thm.mni.mote.mode.modelica.graphics.MoTransformation;
import de.thm.mni.mote.mode.frontend.controls.modelica.FXMoDiagramMoGroup;
import de.thm.mni.mote.mode.frontend.controls.modelica.FXMoVariableIconMoGroup;
import de.thm.mni.mote.mode.frontend.editor.actionmanager.commands.Command;
import de.thm.mni.mote.mode.frontend.editor.actionmanager.elements.ModifyableMoVariable;
import de.thm.mni.mote.mode.frontend.editor.statemachine.StateMachine;
import de.thm.mni.mote.mode.frontend.editor.statemachine.interfaces.Actionable;
import de.thm.mni.mote.mode.frontend.editor.statemachine.interfaces.Deletable;
import de.thm.mni.mote.mode.frontend.editor.statemachine.interfaces.Moveable;
import de.thm.mni.mote.mode.frontend.handlers.LibraryHandler;
import javafx.geometry.Point2D;
import javafx.scene.Parent;
import javafx.scene.control.TabPane;
import javafx.scene.input.InputEvent;
import javafx.scene.input.MouseEvent;

/**
 * Created by Marcel Hoppe on 16.02.17.
 */

public class ModifyableFXMoVariableIconMoGroup extends FXMoVariableIconMoGroup implements Actionable, Deletable, Moveable {
  
  private MoTransformation transformation = null;
  
  private Point2D startSceneMousePos = null;
  private Point2D startMousePos = null;
  private Point2D startOrigin = null;
  
  //ROTATE
  private Point2D startCenter = null;
  private Double startAngle = null;
  private Double startRotation = null;
  
  //RESIZE
  private Point2D startP1 = null;
  private Point2D startP2 = null;
  
  
  protected ModifyableFXMoVariableIconMoGroup(FXMoDiagramMoGroup diagramParent, MoContainer parent, MoVariable variable) {
    super(diagramParent, parent, variable);
  }
  
  @Override
  public Command action(StateMachine sm, InputEvent event) {
    if (this.getThat().getElement().hasDiagram()) {
      TabPane tb = findTabPane(this);
      if (tb == null) return null;
  
      LibraryHandler.getInstance().handleMenu(tb, this.getThat(), "open_as_diagram");
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
    if (event.getEventType().equals(MouseEvent.MOUSE_PRESSED)) {
      sm.freeze();
      moveStart(event);
      return Command.IGNORE;
    } else if (event.getEventType().equals(MouseEvent.MOUSE_DRAGGED)) {
      this.moveDrag(event);
      return Command.IGNORE;
    } else if (event.getEventType().equals(MouseEvent.MOUSE_RELEASED)) {
      this.setOpacity(1);
      sm.unfreeze();
    
      Command c = Command.IGNORE;
      if (startOrigin != null && !startOrigin.equals(new Point2D(this.getOrigin().getX(), this.getOrigin().getY())))
        c = new ModifyableMoVariable(getVariable()).createMove(startOrigin);
      clearVariables();
      return c;
    }
    return null;
  }
  
  private void moveStart(MouseEvent event) {
    transformation = getVariable().getPlacement().getIconTransformation();
    if (transformation == null) transformation = getVariable().getPlacement().getDiagramTransformation();
    
    this.toFront();
    this.setOpacity(0.8);
  
    startMousePos = this.getMoDiagram().convertTo(new Point2D(event.getSceneX(), event.getSceneY()));
    startOrigin = transformation.getOrigin().get();
  }
  
  private void moveDrag(MouseEvent event) {
    if (this.transformation == null) return;
    Point2D mousePos = getMoDiagram().convertTo(new Point2D(event.getSceneX(), event.getSceneY()));
    Point2D delta = mousePos.subtract(startMousePos);
//    updateConnections(delta);
    
    transformation.getOrigin().set(startOrigin.add(delta));
    this.calculateLocalCenterOnDiagram();
  }
  
//  private void updateConnections(Point2D delta) {
//    startConnectionPointPoses.keySet().forEach(moConn -> {
//      for (int i = 0, size = startConnectionPointPoses.get(moConn).size(); i < size; i++) {
//        Integer pos = startConnectionPointPoses.get(moConn).get(i);
//        Point2D point = startConnectionPoints.get(moConn).get(i);
//        moConn.getLine().getPoints().set(pos, point.add(delta));
//      }
//    });
//  }
  
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
      startCenter = new Point2D(0, 0);
      startSceneMousePos = new Point2D(event.getSceneX(), event.getSceneY());
      Point2D pos = this.convertTo(startSceneMousePos);
      startAngle = (double) Math.round(Math.toDegrees(Math.atan2(pos.getX() - startCenter.getX(), startCenter.getY() - pos.getY())));
      startRotation = transformation.getRotation().get();
      return Command.IGNORE;
    } else if (event.getEventType().equals(MouseEvent.MOUSE_DRAGGED) && startAngle != null) {
      Point2D pos = this.convertTo(new Point2D(event.getSceneX(), event.getSceneY()));
      Double angle = (double) Math.round(Math.toDegrees(Math.atan2(pos.getX() - startCenter.getX(), startCenter.getY() - pos.getY())));
      Double newRotation = (startRotation - (startAngle - angle)) % 360;
      transformation.getRotation().set((newRotation < 0) ? 360 + newRotation : newRotation);
      pos = this.convertTo(startSceneMousePos);
      startAngle = (double) Math.round(Math.toDegrees(Math.atan2(pos.getX() - startCenter.getX(), startCenter.getY() - pos.getY())));
      this.calculateLocalCenterOnDiagram();
      return Command.IGNORE;
    } else if (event.getEventType().equals(MouseEvent.MOUSE_RELEASED)) {
      Command c = new ModifyableMoVariable(getVariable()).createRotation(startRotation);
      clearVariables();
      sm.unfreeze();
      return c;
    }
    
    return null;
  }
  
  Command resize(StateMachine sm, InputEvent inputEvent, Integer buttonId) {
    if (!(inputEvent instanceof MouseEvent) || this.transformation == null) return null;
    MouseEvent event = (MouseEvent) inputEvent;
    if (event.getEventType().equals(MouseEvent.MOUSE_PRESSED)) {
      sm.freeze();
      startP1 = transformation.getExtent().getP1();
      startP2 = transformation.getExtent().getP2();
      startSceneMousePos = new Point2D(event.getSceneX(), event.getSceneY());
      startMousePos = this.getMoDiagram().convertTo(startSceneMousePos);
      return Command.IGNORE;
    } else if (event.getEventType().equals(MouseEvent.MOUSE_DRAGGED)) {
      this.resizeDrag(event);
      this.calculateLocalCenterOnDiagram();
      return Command.IGNORE;
    } else if (event.getEventType().equals(MouseEvent.MOUSE_RELEASED)) {
      Command c = new ModifyableMoVariable(getVariable()).createResize(startP1, startP2);
      clearVariables();
      sm.unfreeze();
      return c;
    }
    return null;
  }
  
  private void resizeDrag(MouseEvent event) {
    if (this.transformation == null) return;
    Point2D mousePos = this.getMoDiagram().convertTo(new Point2D(event.getSceneX(), event.getSceneY()));
    Point2D delta = startMousePos.subtract(mousePos);
  
    this.transformation.getExtent().setP2(new Point2D(startP2.subtract(delta).getX(), startP2.add(delta).getY()));
  }
  
  private void clearVariables() {
    startP1 = null;
    startP2 = null;
    startAngle = null;
    startOrigin = null;
    startCenter = null;
    startMousePos = null;
    startRotation = null;
  }
}

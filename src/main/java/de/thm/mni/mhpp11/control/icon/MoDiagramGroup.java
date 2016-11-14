package de.thm.mni.mhpp11.control.icon;

import de.thm.mni.mhpp11.control.icon.handlers.DragAndDropHandler;
import de.thm.mni.mhpp11.control.icon.handlers.FocusHandler;
import de.thm.mni.mhpp11.control.icon.handlers.ModifyLineHandler;
import de.thm.mni.mhpp11.control.icon.handlers.MoveHandler;
import de.thm.mni.mhpp11.shape.Line;
import de.thm.mni.mhpp11.util.parser.models.MoClass;
import de.thm.mni.mhpp11.util.parser.models.MoConnection;
import javafx.geometry.Point2D;
import javafx.scene.transform.NonInvertibleTransformException;

/**
 * Created by hobbypunk on 19.09.16.
 */
public class MoDiagramGroup extends MoGroup {
  
  public MoDiagramGroup(MoClass moClass) {
    super(moClass);
    init();
    this.setOnDragOver(DragAndDropHandler.getInstance());
    this.setOnDragDropped(DragAndDropHandler.getInstance());
    this.setOnDragDone(DragAndDropHandler.getInstance());
  }
  
  @Override
  protected void initImage() {
    initVariables();
    initConnections();
  }
  
  private void initVariables() {
    this.getMoClass().getVariables().forEach(super::initVariable);
  
    this.parentProperty().addListener((observable, oldValue, newValue) -> {
      if (oldValue != null) oldValue.setOnMouseClicked(null);
      if (newValue != null) newValue.setOnMouseClicked(FocusHandler.getInstance());
    });
  
    MoveHandler handler = MoveHandler.getInstance(this);
    getBasis().getChildren().stream().filter(node -> node instanceof MoIconGroup && ((MoIconGroup) node).getVariable() != null).forEach(node -> {
      node.setOnMousePressed(handler);
      node.setOnMouseDragged(handler);
      node.setOnMouseReleased(handler);
      node.setOnMouseClicked(FocusHandler.getInstance());
    });
  }
  
  private void initConnections() {
    this.getMoClass().getConnections().forEach(this::initConnection);
  }
  
  private void initConnection(MoConnection connection) {
    connection.getMoGraphics().forEach(super::initImage);
    ModifyLineHandler handler = ModifyLineHandler.getInstance(this);
    getBasis().getChildren().stream().filter(node -> node instanceof Line).forEach(node -> {
      node.setOnMousePressed(handler);
      node.setOnMouseDragged(handler);
      node.setOnMouseReleased(handler);
      node.setOnMouseClicked(handler);
    });
  }
  
  public Point2D convertScenePointToDiagramPoint(Point2D scenePoint) {
    return convertScenePointToDiagramPoint(scenePoint.getX(), scenePoint.getY());
  }
  
  public Point2D convertScenePointToDiagramPoint(double sceneX, double sceneY) {
    Point2D p = this.sceneToLocal(sceneX, sceneY);
    try {
      p = getScale().inverseDeltaTransform(p.getX(), p.getY());
      p = getFlipping().deltaTransform(p);
      
      Double x, y;
      if (getFlippedX()) x = -getPosition().getX() - p.getX();
      else x = -getPosition().getX() + p.getX();
      if (getFlippedY()) y = getPosition().getY() - p.getY();
      else y = getPosition().getY() + p.getY();
      
      p = new Point2D(x, y);
    } catch (NonInvertibleTransformException e) {
      System.out.println("Should never called...");
    }
    return new Point2D(p.getX(), p.getY());
  }
}

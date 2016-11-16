package de.thm.mni.mhpp11.control.icon;

import de.thm.mni.mhpp11.control.icon.handlers.*;
import de.thm.mni.mhpp11.shape.Line;
import de.thm.mni.mhpp11.util.parser.models.MoClass;
import de.thm.mni.mhpp11.util.parser.models.MoConnection;
import de.thm.mni.mhpp11.util.parser.models.MoConnector;
import javafx.collections.ListChangeListener;
import javafx.event.EventType;
import javafx.geometry.Point2D;
import javafx.scene.Node;
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
    initListeners(this);
  }
  
  private void initListeners(MoGroup group) {
    if (group.equals(this)) {
      this.addEventHandler(EventType.ROOT, new DiagramHandler(this));
      group.getBasis().getChildren().forEach(this::addGroupListeners);
    } else if (group instanceof MoIconGroup) group.getBasis().getChildren().forEach(this::addIconListeners);
    
    group.getBasis().getChildren().addListener(new ListChangeListener<Node>() {
      @Override
      public void onChanged(Change<? extends Node> c) {
        while (c.next()) {
          c.getAddedSubList().forEach(n -> {
            if (group.equals(MoDiagramGroup.this)) addGroupListeners(n);
            else if (group instanceof MoIconGroup) addIconListeners(n);
          });
          c.getRemoved().forEach(n -> {
            removeListeners(n);
          });
        }
      }
    });
  }
  
  private void addIconListeners(Node node) {
    if (node instanceof MoIconGroup && ((MoIconGroup) node).getMoClass() instanceof MoConnector) {
      CreateConnectionHandler handler = CreateConnectionHandler.getInstance(this);
      node.setOnMousePressed(handler);
      node.setOnMouseDragged(handler);
      node.setOnMouseReleased(handler);
      node.setOnMouseClicked(handler);
    }
  }
  
  private void addGroupListeners(Node node) {
    if ((node instanceof MoIconGroup)) {
      if (((MoIconGroup) node).getVariable() == null) return;
      ModelHandler handler = ModelHandler.getInstance(this);
      node.setOnMousePressed(handler);
      node.setOnMouseDragged(handler);
      node.setOnMouseReleased(handler);
      node.setOnMouseClicked(handler);
      initListeners((MoIconGroup) node);
    } else if (node instanceof Line) {
      ModifyConnectionHandler handler = ModifyConnectionHandler.getInstance(this);
      node.setOnMousePressed(handler);
      node.setOnMouseDragged(handler);
      node.setOnMouseReleased(handler);
      node.setOnMouseClicked(handler);
    }
    
  }
  
  private void removeListeners(Node node) {
    node.setOnMouseClicked(null);
    node.setOnMousePressed(null);
    node.setOnMouseDragged(null);
    node.setOnMouseReleased(null);
    if (node instanceof MoGroup) ((MoGroup) node).getBasis().getChildren().forEach(this::removeListeners);
  }
  
  
  private void initVariables() {
    this.getMoClass().getVariables().forEach(super::initVariable);
  
    this.parentProperty().addListener((observable, oldValue, newValue) -> {
      if (oldValue != null) oldValue.setOnMouseClicked(null);
      if (newValue != null) newValue.setOnMouseClicked(FocusHandler.getInstance());
    });
  }
  
  private void initConnections() {
    this.getMoClass().getConnections().forEach(this::initConnection);
    this.getMoClass().getConnections().addListener(new ListChangeListener<MoConnection>() {
      @Override
      public void onChanged(Change<? extends MoConnection> c) {
        while (c.next()) {
          c.getAddedSubList().forEach(MoDiagramGroup.this::initConnection);
        }
      }
    });
  }
  
  private void initConnection(MoConnection connection) {
    connection.getMoGraphics().forEach(super::initImage);
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

package de.thm.mni.mhpp11.control.icon;

import de.thm.mni.mhpp11.control.icon.handlers.FocusHandler;
import de.thm.mni.mhpp11.control.icon.handlers.StateHandler;
import de.thm.mni.mhpp11.util.parser.models.MoClass;
import de.thm.mni.mhpp11.util.parser.models.MoConnection;
import de.thm.mni.mhpp11.util.parser.models.MoConnector;
import de.thm.mni.mhpp11.util.parser.models.MoVariable;
import javafx.collections.ListChangeListener;
import javafx.event.EventType;
import javafx.geometry.Point2D;
import javafx.scene.Node;
import javafx.scene.paint.Color;
import javafx.scene.transform.NonInvertibleTransformException;

import java.util.function.Consumer;

/**
 * Created by hobbypunk on 19.09.16.
 */
public class MoDiagramGroup extends MoGroup {
  
  public MoDiagramGroup(MoClass moClass) {
    super(moClass);
    init();
  }
  
  @Override
  protected void initImage() {
    initVariables();
    initConnections();
    initListeners(this);
    coordianteSystem.setFill(Color.WHITE);
  }
  
  private void initListeners(MoGroup group) {
    if (group.equals(this)) {
      StateHandler.getInstance(this);
      this.addEventHandler(EventType.ROOT, StateHandler.getInstance(this));
      group.getBasis().getChildren().forEach(this::addGroupListeners);
    } else if (group instanceof MoIconGroup) group.getBasis().getChildren().forEach(this::addIconListeners);
  
    group.getBasis().getChildren().addListener((ListChangeListener<Node>) c -> {
      while (c.next()) {
        c.getAddedSubList().forEach(n -> {
          if (group.equals(MoDiagramGroup.this)) addGroupListeners(n);
          else if (group instanceof MoIconGroup) addIconListeners(n);
        });
        c.getRemoved().forEach(n -> {
          removeListeners(n);
        });
      }
    });
  }
  
  private void addIconListeners(Node node) {
    if (node instanceof MoIconGroup && ((MoIconGroup) node).getMoClass() instanceof MoConnector) {
      node.addEventHandler(EventType.ROOT, StateHandler.getInstance(this));
    }
  }
  
  private void addGroupListeners(Node node) {
    if ((node instanceof MoIconGroup) && ((MoIconGroup) node).getVariable() == null) return;
  
    node.addEventHandler(EventType.ROOT, StateHandler.getInstance(this));
    if ((node instanceof MoIconGroup)) {
      initListeners((MoIconGroup) node);
    }
  }
  
  private void removeListeners(Node node) {
    node.removeEventHandler(EventType.ROOT, StateHandler.getInstance(this));
    if (node instanceof MoGroup) ((MoGroup) node).getBasis().getChildren().forEach(this::removeListeners);
  }
  
  
  private void initVariables() {
    this.getMoClass().getVariables().forEach(super::initVariable);
  
    this.getMoClass().getVariables().addListener((ListChangeListener<MoVariable>) c -> {
      while (c.next()) {
        c.getAddedSubList().forEach(MoDiagramGroup.this::initVariable);
        c.getRemoved().forEach(MoDiagramGroup.this::remove);
      }
    });
  
    this.parentProperty().addListener((observable, oldValue, newValue) -> {
      if (oldValue != null) oldValue.setOnMouseClicked(null);
      if (newValue != null) newValue.setOnMouseClicked(FocusHandler.getInstance());
    });
  }
  
  private void initConnections() {
    this.getMoClass().getConnections().forEach(this::initConnection);
    this.getMoClass().getConnections().addListener((ListChangeListener<MoConnection>) c -> {
      while (c.next()) {
        c.getAddedSubList().forEach(MoDiagramGroup.this::initConnection);
        c.getRemoved().forEach((Consumer<MoConnection>) connection -> {
          connection.getMoGraphics().forEach(MoDiagramGroup.this::remove);
        });
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

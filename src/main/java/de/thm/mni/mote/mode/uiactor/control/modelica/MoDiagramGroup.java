package de.thm.mni.mote.mode.uiactor.control.modelica;

import de.thm.mni.mote.mode.modelica.MoConnection;
import de.thm.mni.mote.mode.modelica.MoConnector;
import de.thm.mni.mote.mode.modelica.MoContainer;
import de.thm.mni.mote.mode.modelica.MoVariable;
import de.thm.mni.mote.mode.parser.ParserException;
import de.thm.mni.mote.mode.uiactor.handlers.FocusHandler;
import de.thm.mni.mote.mode.uiactor.handlers.StateHandler;
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
  
  public MoDiagramGroup(MoContainer container) throws ParserException {
    super(container);
    init();
  }
  
  @Override
  protected void initImage() throws ParserException {
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
    } else if (group instanceof MoIconGroup) group.getBasis().getChildren().forEach((node) -> {
      try {
        addIconListeners(node);
      } catch (ParserException e) {
        e.printStackTrace(); //TODO: send msg
      }
    });
  
    group.getBasis().getChildren().addListener((ListChangeListener<Node>) c -> {
      while (c.next()) {
        c.getAddedSubList().forEach(n -> {
          if (group.equals(MoDiagramGroup.this)) addGroupListeners(n);
          else if (group instanceof MoIconGroup) try {
            addIconListeners(n);
          } catch (ParserException e) {
            e.printStackTrace(); //TODO: send msg
          }
        });
        c.getRemoved().forEach(this::removeListeners);
      }
    });
  }
  
  private void addIconListeners(Node node) throws ParserException {
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
  
  
  private void initVariables() throws ParserException {
    this.getMoClass().getVariables().forEach((mv) -> {
      try {
        super.initVariable(mv);
      } catch (ParserException e) {
        e.printStackTrace(); //TODO: send msg
      }
    });
  
    this.getMoClass().getVariables().addListener((ListChangeListener<MoVariable>) c -> {
      while (c.next()) {
        c.getAddedSubList().forEach((mv) -> {
          try {
            MoDiagramGroup.this.initVariable(mv);
          } catch (ParserException e) {
            e.printStackTrace(); //TODO: send msg
          }
        });
        c.getRemoved().forEach(MoDiagramGroup.this::remove);
      }
    });
  
    this.parentProperty().addListener((observable, oldValue, newValue) -> {
      if (oldValue != null) oldValue.setOnMouseClicked(null);
      if (newValue != null) newValue.setOnMouseClicked(FocusHandler.getInstance());
    });
  }
  
  private void initConnections() throws ParserException {
    this.getMoClass().getConnections().forEach(this::initConnection);
    this.getMoClass().getConnections().addListener((ListChangeListener<MoConnection>) c -> {
      while (c.next()) {
        c.getAddedSubList().forEach(MoDiagramGroup.this::initConnection);
        c.getRemoved().forEach((Consumer<MoConnection>) connection -> connection.getMoGraphics().forEach(MoDiagramGroup.this::remove));
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

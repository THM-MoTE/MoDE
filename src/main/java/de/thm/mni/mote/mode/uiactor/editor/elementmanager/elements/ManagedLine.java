package de.thm.mni.mote.mode.uiactor.editor.elementmanager.elements;

import de.thm.mni.mote.mode.config.Settings;
import de.thm.mni.mote.mode.modelica.graphics.MoLine;
import de.thm.mni.mote.mode.uiactor.control.modelica.MoGroup;
import de.thm.mni.mote.mode.uiactor.editor.elementmanager.interfaces.Hoverable;
import de.thm.mni.mote.mode.uiactor.editor.elementmanager.interfaces.Selectable;
import de.thm.mni.mote.mode.uiactor.editor.interfaces.Childable;
import de.thm.mni.mote.mode.uiactor.editor.statemachine.elements.ModifyableLine;
import de.thm.mni.mote.mode.uiactor.shape.Line;
import javafx.beans.property.DoubleProperty;
import javafx.collections.FXCollections;
import javafx.collections.ListChangeListener;
import javafx.collections.ObservableList;
import javafx.geometry.Point2D;
import javafx.scene.Node;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import lombok.Getter;
import lombok.NonNull;

import java.util.List;

/**
 * Created by hobbypunk on 13.02.17.
 */
@Getter
public class ManagedLine extends ModifyableLine implements Hoverable, Selectable, Childable {
  
  private Line child = null;
  private Boolean isSelected = false;
  ObservableList<Node> children = FXCollections.observableArrayList();
  
  public ManagedLine(@NonNull MoGroup parent, @NonNull MoLine data) {
    super(parent, data);
    initParentListener();
  
    this.child = new Line(parent, data);
  
    strokeWidthProperty().bind(child.strokeWidthProperty().add(Settings.load().getMainwindow().getEditor().getLineClickRadius()));
  
    child.setStrokeWidth(child.getStrokeWidth());
  
    getData().getPoints().addListener((ListChangeListener<Point2D>) c -> {
      removePointNodes();
      if (getIsSelected()) addPointNodes();
    });
  
    children.add(child);
  }
  
  @Override
  public void toFront() {
    super.toFront();
    this.child.toFront();
  }
  
  @Override
  public void init() {
    super.init();
  }
  
  @Override
  public void enterHover() {
    this.child.setStroke(Color.LIGHTCORAL);
  }
  
  @Override
  public void leaveHover() {
    this.child.setStroke(getData().getColor().get());
  }
  
  @Override
  public void enterSelection() {
    this.child.setStroke(Color.RED);
    isSelected = true;
    addPointNodes();
  }
  
  @Override
  public void leaveSelection() {
    isSelected = false;
    removePointNodes();
    this.child.setStroke(getData().getColor().get());
  }
  
  private void addPointNodes() {
    List<Point2D> points = getData().getPoints();
    for (int i = 1, pointsSize = points.size() - 1; i < pointsSize; i++) {
      Point2D p = points.get(i);
      Circle c = new Circle(p.getX(), p.getY(), 1);
      c.setFill(Color.RED);
      c.setStrokeWidth(0);
      this.children.add(0, c);
    }
  }
  
  private void removePointNodes() {
    this.children.clear();
    this.children.add(child);
  }
  
  @Override
  public DoubleProperty ownStrokeWidthProperty() {
    return child.strokeWidthProperty();
  }
  
  @Override
  public void setOwnStrokeWidth(double value) {
    if (child != null) child.setStrokeWidth(value);
  }
}

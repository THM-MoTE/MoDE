package de.thm.mni.mote.mode.uiactor.elementmanager.elements;

import de.thm.mni.mote.mode.modelica.graphics.MoLine;
import de.thm.mni.mote.mode.uiactor.control.modelica.MoGroup;
import de.thm.mni.mote.mode.uiactor.elementmanager.interfaces.Hoverable;
import de.thm.mni.mote.mode.uiactor.elementmanager.interfaces.Selectable;
import de.thm.mni.mote.mode.uiactor.shape.Line;
import de.thm.mni.mote.mode.uiactor.statemachine.elements.ModifyableLine;
import javafx.beans.property.DoubleProperty;
import javafx.collections.ListChangeListener;
import javafx.geometry.Point2D;
import javafx.scene.Group;
import javafx.scene.paint.Color;
import javafx.scene.shape.LineTo;
import javafx.scene.shape.MoveTo;
import lombok.Getter;
import lombok.NonNull;

import java.util.List;

/**
 * Created by hobbypunk on 13.02.17.
 */
@Getter
public class ManagedLine extends ModifyableLine implements Hoverable, Selectable {
  
  private Line child = null;
  private Boolean isSelected = false;
  
  public ManagedLine(@NonNull MoGroup parent, @NonNull MoLine data) {
    super(parent, data);
    this.child = new Line(parent, data);
    initParentListener();
  
    strokeWidthProperty().bind(child.strokeWidthProperty().add(getExtraWidth()));
  
    child.setStrokeWidth(child.getStrokeWidth());
  
    getData().getPoints().addListener((ListChangeListener<Point2D>) c -> {
      if (getIsSelected()) calcCrosses();
    });
  }
  
  
  @Override
  public void init() {
    super.init();
  }
  
  private void initParentListener() {
    this.parentProperty().addListener((observable, oldValue, newValue) -> {
      if (oldValue instanceof Group && ((Group) oldValue).getChildren().contains(child))
        ((Group) oldValue).getChildren().remove(child);
      if (newValue instanceof Group && !((Group) newValue).getChildren().contains(child))
        ((Group) newValue).getChildren().add(2, child);
    });
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
    calcCrosses();
  }
  
  @Override
  public void leaveSelection() {
    isSelected = false;
    this.child.calcElements(getData().getPoints());
    this.child.setStroke(getData().getColor().get());
  }
  
  private void calcCrosses() {
    List<Point2D> points = getData().getPoints();
    for (int i = 1, pointsSize = points.size() - 1; i < pointsSize; i++) {
      Point2D p = points.get(i);
      this.child.getElements().add(new MoveTo(p.getX() - 1, p.getY() - 1));
      this.child.getElements().add(new LineTo(p.getX() + 1, p.getY() + 1));
      this.child.getElements().add(new MoveTo(p.getX() - 1, p.getY() + 1));
      this.child.getElements().add(new LineTo(p.getX() + 1, p.getY() - 1));
    }
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

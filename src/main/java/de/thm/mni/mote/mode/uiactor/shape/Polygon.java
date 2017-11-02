package de.thm.mni.mote.mode.uiactor.shape;

import de.thm.mni.mote.mode.modelica.graphics.MoPolygon;
import de.thm.mni.mote.mode.uiactor.control.modelica.FXMoParentGroup;
import de.thm.mni.mote.mode.uiactor.shape.interfaces.CalculatePathElements;
import de.thm.mni.mote.mode.uiactor.shape.interfaces.Element;
import de.thm.mni.mote.mode.uiactor.shape.interfaces.FilledElement;
import de.thm.mni.mote.mode.uiactor.shape.interfaces.StrokedElement;
import javafx.beans.property.DoubleProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.geometry.Point2D;
import javafx.scene.shape.ClosePath;
import javafx.scene.shape.Path;
import javafx.scene.transform.Rotate;
import javafx.scene.transform.Transform;
import javafx.scene.transform.Translate;
import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;

import java.util.List;

/**
 * Created by hobbypunk on 02.11.16.
 */
@Getter
@Setter
public class Polygon extends Path implements Element, StrokedElement, FilledElement, CalculatePathElements {
  private final FXMoParentGroup moParent;
  private final MoPolygon data;
  
  private final Translate origin = Transform.translate(0., 0.);
  private final Rotate rotation = Transform.rotate(0., 0., 0.);
  
  DoubleProperty initialStrokeWidthProperty = new SimpleDoubleProperty(1.);
  
  public Polygon(@NonNull FXMoParentGroup parent, @NonNull MoPolygon data) {
    this.moParent = parent;
    this.data = data;
    this.init();
  }
  
  public void setInitialStrokeWidth(Double value) {
    StrokedElement.super.setInitialStrokeWidth(value);
    setStrokeWidth(value);
  }
  
  @Override
  public void calcElements(List<Point2D> points) {
    CalculatePathElements.super.calcElements(points);
    getElements().add(new ClosePath());
  }
  
  public void init() {
    Element.super.init();
    FilledElement.super.init();
    StrokedElement.super.init();
    
    calcElements(getData().getPoints());
  }
}

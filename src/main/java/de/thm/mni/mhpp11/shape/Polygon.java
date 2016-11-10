package de.thm.mni.mhpp11.shape;

import de.thm.mni.mhpp11.control.icon.MoGroup;
import de.thm.mni.mhpp11.shape.interfaces.CalculatePathElements;
import de.thm.mni.mhpp11.shape.interfaces.Element;
import de.thm.mni.mhpp11.shape.interfaces.FilledElement;
import de.thm.mni.mhpp11.shape.interfaces.StrokedElement;
import de.thm.mni.mhpp11.util.parser.models.graphics.MoPolygon;
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
  private final MoGroup moParent;
  private final MoPolygon data;
  
  private final Translate origin = Transform.translate(0., 0.);
  private final Rotate rotation = Transform.rotate(0., 0., 0.);
  
  Double initialStrokeWidth = 1.;
  
  public Polygon(@NonNull MoGroup parent, @NonNull MoPolygon data) {
    this.moParent = parent;
    this.data = data;
    this.init();
  }
  
  public void setInitialStrokeWidth(Double value) {
    initialStrokeWidth = value;
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

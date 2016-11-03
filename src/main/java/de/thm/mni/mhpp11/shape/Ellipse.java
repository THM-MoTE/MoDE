package de.thm.mni.mhpp11.shape;

import de.thm.mni.mhpp11.control.icon.MoGroup;
import de.thm.mni.mhpp11.shape.interfaces.Element;
import de.thm.mni.mhpp11.shape.interfaces.FilledElement;
import de.thm.mni.mhpp11.shape.interfaces.StrokedElement;
import de.thm.mni.mhpp11.util.config.model.Point;
import de.thm.mni.mhpp11.util.parser.models.graphics.MoEllipse;
import javafx.scene.transform.Rotate;
import javafx.scene.transform.Transform;
import javafx.scene.transform.Translate;
import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;

/**
 * Created by hobbypunk on 02.11.16.
 */

@Getter
@Setter
public class Ellipse extends javafx.scene.shape.Ellipse implements Element, FilledElement, StrokedElement {
  private final MoGroup moParent;
  private final MoEllipse data;
  
  private final Translate origin = Transform.translate(0., 0.);
  private final Rotate rotation = Transform.rotate(0., 0., 0.);
  
  Double initialStrokeWidth = 1.;
  
  public Ellipse(@NonNull MoGroup parent, @NonNull MoEllipse data) {
    this.moParent = parent;
    this.data = data;
    
    init();
  }
  
  public void setInitialStrokeWidth(Double value) {
    initialStrokeWidth = value;
    setStrokeWidth(value);
  }
  
  public void init() {
    Element.super.init();
    FilledElement.super.init();
    StrokedElement.super.init();
    
    Point<Double, Double>[] extent = getData().getExtent();
    
    Double minX = Math.min(extent[0].getX(), extent[1].getX());
    Double minY = Math.min(extent[0].getY(), extent[1].getY());
    
    Double radiusX = Math.abs(extent[0].getX() - extent[1].getX()) / 2;
    Double radiusY = Math.abs(extent[0].getY() - extent[1].getY()) / 2;
    
    this.setCenterX(minX + radiusX);
    this.setCenterY(minY + radiusY);
    this.setRadiusX(radiusX);
    this.setRadiusY(radiusY);
    
  }
}

package de.thm.mni.mhpp11.ui.shape;

import de.thm.mni.mhpp11.modelica.graphics.MoEllipse;
import de.thm.mni.mhpp11.ui.control.modelica.MoGroup;
import de.thm.mni.mhpp11.ui.shape.interfaces.Element;
import de.thm.mni.mhpp11.ui.shape.interfaces.FilledElement;
import de.thm.mni.mhpp11.ui.shape.interfaces.StrokedElement;
import javafx.geometry.Point2D;
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
  
    Point2D extent0 = getData().getExtent().get(0).getValue();
    Point2D extent1 = getData().getExtent().get(1).getValue();
  
    Double minX = Math.min(extent0.getX(), extent1.getX());
    Double minY = Math.min(extent0.getY(), extent1.getY());
  
    Double radiusX = Math.abs(extent0.getX() - extent1.getX()) / 2;
    Double radiusY = Math.abs(extent0.getY() - extent1.getY()) / 2;
    
    this.setCenterX(minX + radiusX);
    this.setCenterY(minY + radiusY);
    this.setRadiusX(radiusX);
    this.setRadiusY(radiusY);
    
  }
}

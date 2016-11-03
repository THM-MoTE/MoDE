package de.thm.mni.mhpp11.shape;

import de.thm.mni.mhpp11.control.icon.MoGroup;
import de.thm.mni.mhpp11.shape.interfaces.Element;
import de.thm.mni.mhpp11.shape.interfaces.FilledElement;
import de.thm.mni.mhpp11.shape.interfaces.StrokedElement;
import de.thm.mni.mhpp11.util.config.model.Point;
import de.thm.mni.mhpp11.util.parser.models.graphics.MoRectangle;
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
public class Rectangle extends javafx.scene.shape.Rectangle implements Element, StrokedElement, FilledElement {
  private final MoGroup moParent;
  private final MoRectangle data;
  
  private final Translate origin = Transform.translate(0., 0.);
  private final Rotate rotation = Transform.rotate(0., 0., 0.);
  
  Double initialStrokeWidth = 1.;
  
  public Rectangle(@NonNull MoGroup parent, @NonNull MoRectangle data) {
    this.moParent = parent;
    this.data = data;
    this.init();
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
    this.setX(Math.min(extent[0].getX(), extent[1].getX()));
    this.setY(Math.min(extent[0].getY(), extent[1].getY()));
    this.setWidth(Math.abs(extent[0].getX() - extent[1].getX()));
    this.setHeight(Math.abs(extent[0].getY() - extent[1].getY()));
    this.setArcHeight(getData().getRadius() * 2);
    this.setArcWidth(getData().getRadius() * 2);
  }
}
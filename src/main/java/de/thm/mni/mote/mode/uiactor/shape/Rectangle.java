package de.thm.mni.mote.mode.uiactor.shape;

import de.thm.mni.mote.mode.modelica.graphics.MoRectangle;
import de.thm.mni.mote.mode.uiactor.control.modelica.FXMoParentGroup;
import de.thm.mni.mote.mode.uiactor.shape.interfaces.Element;
import de.thm.mni.mote.mode.uiactor.shape.interfaces.FilledElement;
import de.thm.mni.mote.mode.uiactor.shape.interfaces.StrokedElement;
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
public class Rectangle extends javafx.scene.shape.Rectangle implements Element, StrokedElement, FilledElement {
  private final FXMoParentGroup moParent;
  private final MoRectangle data;
  
  private final Translate origin = Transform.translate(0., 0.);
  private final Rotate rotation = Transform.rotate(0., 0., 0.);
  
  Double initialStrokeWidth = 1.;
  
  public Rectangle(@NonNull FXMoParentGroup parent, @NonNull MoRectangle data) {
    this.moParent = parent;
    this.data = data;
    this.init();
  }
  
  public void setInitialStrokeWidth(Double value) {
    initialStrokeWidth = value;
    setOwnStrokeWidth(value);
  }
  
  public void init() {
    Element.super.init();
    FilledElement.super.init();
    StrokedElement.super.init();
  
    Point2D extent0 = getData().getExtent().getP1();
    Point2D extent1 = getData().getExtent().getP2();
  
    this.setX(Math.min(extent0.getX(), extent1.getX()));
    this.setY(Math.min(extent0.getY(), extent1.getY()));
    this.setWidth(Math.abs(extent0.getX() - extent1.getX()));
    this.setHeight(Math.abs(extent0.getY() - extent1.getY()));
    this.setArcHeight(getData().getRadius() * 2);
    this.setArcWidth(getData().getRadius() * 2);
  }
}
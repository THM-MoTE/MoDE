package de.thm.mni.mote.mode.frontend.shape;

import de.thm.mni.mote.mode.modelica.graphics.MoEllipse;
import de.thm.mni.mote.mode.frontend.controls.modelica.FXMoParentGroup;
import de.thm.mni.mote.mode.frontend.shape.interfaces.Element;
import de.thm.mni.mote.mode.frontend.shape.interfaces.FilledElement;
import de.thm.mni.mote.mode.frontend.shape.interfaces.StrokedElement;
import javafx.beans.property.DoubleProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.geometry.Point2D;
import javafx.scene.shape.ArcType;
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
public class Arc extends javafx.scene.shape.Arc implements Element, FilledElement, StrokedElement {
  private final FXMoParentGroup moParent;
  private final MoEllipse data;
  
  private final Translate origin = Transform.translate(0., 0.);
  private final Rotate rotation = Transform.rotate(0., 0., 0.);
  
  DoubleProperty initialStrokeWidthProperty = new SimpleDoubleProperty(1.);
  
  public Arc(@NonNull FXMoParentGroup parent, @NonNull MoEllipse data) {
    this.moParent = parent;
    this.data = data;
    
    init();
  }
  
  public void init() {
    Element.super.init();
    FilledElement.super.init();
    StrokedElement.super.init();
  
    Point2D extent0 = getData().getExtent().getP1();
    Point2D extent1 = getData().getExtent().getP2();
  
    Double minX = Math.min(extent0.getX(), extent1.getX());
    Double minY = Math.min(extent0.getY(), extent1.getY());
  
    Double radiusX = Math.abs(extent0.getX() - extent1.getX()) / 2;
    Double radiusY = Math.abs(extent0.getY() - extent1.getY()) / 2;
    
    this.setCenterX(minX + radiusX);
    this.setCenterY(minY + radiusY);
    this.setRadiusX(radiusX);
    this.setRadiusY(radiusY);
    
    this.setStartAngle(getData().getStartAngle());
    this.setLength(getData().getEndAngle() - getData().getStartAngle());
    this.setType(ArcType.ROUND);
  }
}

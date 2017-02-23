package de.thm.mni.mote.mode.modelica.graphics;

import javafx.beans.property.*;
import javafx.geometry.Point2D;
import lombok.Getter;

/**
 * Created by hobbypunk on 23.02.17.
 */
public class MoTransformExtent extends MoExtent {
  private Boolean calcValues;
  private MoSimpleExtent iconExtent = null;
  
  private final ObjectProperty<Point2D> origin = new SimpleObjectProperty<>(new Point2D(0, 0));
  
  private final ObjectProperty<Point2D> p1 = new SimpleObjectProperty<>(new Point2D(-100., -100.));
  private final ObjectProperty<Point2D> p2 = new SimpleObjectProperty<>(new Point2D(100., 100.));
  
  @Getter private final DoubleProperty offsetXProperty = new SimpleDoubleProperty(0.);
  @Getter private final DoubleProperty offsetYProperty = new SimpleDoubleProperty(0.);
  
  @Getter private final DoubleProperty scaleXProperty = new SimpleDoubleProperty(1.);
  @Getter private final DoubleProperty scaleYProperty = new SimpleDoubleProperty(1.);
  
  @Getter private final BooleanProperty flippedXProperty = new SimpleBooleanProperty(false);
  @Getter private final BooleanProperty flippedYProperty = new SimpleBooleanProperty(false);
  
  
  MoTransformExtent(Point2D p1, Point2D p2) {
    this(false, p1, p2);
  }
  
  MoTransformExtent(Boolean calcValues, Point2D p1, Point2D p2) {
    this.calcValues = calcValues;
    if (p1 != null) this.p1.set(p1);
    if (p2 != null) this.p2.set(p2);
    
    calcFlipped();
  }
  
  private void calcOffset() {
    offsetXProperty.set(origin.get().getX() - p1.get().getX());
    offsetYProperty.set(origin.get().getY() - p1.get().getY());
  }
  
  private void calcFlipped() {
    flippedXProperty.set(p2.get().getX() < p1.get().getX());
    flippedYProperty.set(p2.get().getY() < p1.get().getY());
  }
  
  private void calcScale() {
    if (this.iconExtent == null) return;
    
    Double variableWidth = Math.max(p1.get().getX(), p2.get().getX()) - Math.min(p1.get().getX(), p2.get().getX());
    Double variableHeight = Math.max(p1.get().getY(), p2.get().getY()) - Math.min(p1.get().getY(), p2.get().getY());
    
    Double iconWidth = iconExtent.getP2().getX() - iconExtent.getP1().getX();
    Double iconHeight = iconExtent.getP2().getY() - iconExtent.getP1().getY();
    
    scaleXProperty.set(variableWidth / iconWidth);
    scaleYProperty.set(variableHeight / iconHeight);
  }
  
  private void calcPoints() {
    //TODO: calc new p1 & p2
  }
  
  public void setOrigin(ObjectProperty<Point2D> origin) {
    this.origin.bind(origin);
    calcOffset();
  }
  
  public void setIconExtent(MoSimpleExtent iconExtent) {
    if (this.iconExtent == null) {
      this.iconExtent = iconExtent;
      calcScale();
    }
  }
  
  public Boolean isXFlipped() {
    return flippedXProperty.get();
  }
  
  public Boolean isYFlipped() {
    return flippedYProperty.get();
  }
  
  public Point2D getP1() {
    return p1.get();
  }
  
  public Point2D getP2() {
    return p2.get();
  }
  
  @Override
  public String toString() {
    if (this.calcValues) calcPoints();
    return super.toString();
  }
}

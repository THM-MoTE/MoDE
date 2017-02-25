package de.thm.mni.mote.mode.modelica.graphics;

import javafx.beans.property.*;
import javafx.geometry.Point2D;
import lombok.Getter;

/**
 * Created by hobbypunk on 23.02.17.
 */
public class MoTransformationExtent extends MoExtent {
  
  private final ObjectProperty<Point2D> p1 = new SimpleObjectProperty<>(new Point2D(-100., -100.));
  private final ObjectProperty<Point2D> p2 = new SimpleObjectProperty<>(new Point2D(100., 100.));
  
  @Getter private Double initialWidth = -1.;
  @Getter private Double initialHeight = -1.;

  @Getter private final DoubleProperty widthProperty = new SimpleDoubleProperty();
  @Getter private final DoubleProperty heightProperty = new SimpleDoubleProperty();
  
  @Getter private final ObjectProperty<Point2D> offsetProperty = new SimpleObjectProperty<>(new Point2D(0, 0));
  
  @Getter private final DoubleProperty scaleXProperty = new SimpleDoubleProperty(1.);
  @Getter private final DoubleProperty scaleYProperty = new SimpleDoubleProperty(1.);
  
  @Getter private final BooleanProperty flippedXProperty = new SimpleBooleanProperty(false);
  @Getter private final BooleanProperty flippedYProperty = new SimpleBooleanProperty(false);
  
  
  MoTransformationExtent(Point2D p1, Point2D p2) {
    if (p1 != null) this.p1.set(p1);
    if (p2 != null) this.p2.set(p2);
  
    calcOffset();
    calcFlipped();
    initListener();
  }
  
  MoTransformationExtent(MoSimpleExtent iconExtent, Double initialScale) {
    initialWidth = iconExtent.getWidth();
    initialHeight = iconExtent.getHeight();
  
    initListener();

    scaleXProperty.set(initialScale);
    scaleYProperty.set(initialScale);
    
    calcOffset();
  }
  
  private void initListener() {
    widthProperty.bind(scaleXProperty.multiply(getInitialWidth()));
    heightProperty.bind(scaleYProperty.multiply(getInitialHeight()));
  
    scaleXProperty.addListener((observable, oldValue, newValue) -> calcPoints());
    scaleYProperty.addListener((observable, oldValue, newValue) -> calcPoints());
  
    offsetProperty.addListener((observable, oldValue, newValue) -> {
      calcPoints();
    });
    
    flippedXProperty.addListener((observable, oldValue, newValue) -> calcPoints());
    flippedYProperty.addListener((observable, oldValue, newValue) -> calcPoints());
    
  }
  
  public void setIconExtent(MoSimpleExtent iconExtent) {
//    if (this.iconExtent != null)  //TODO: wahrscheinlich probleme bei vererbung und das kind verschiebt den connector. deepcopy der variablen nötig?
//      throw new UnsupportedOperationException("Already set!");
    if (this.initialWidth == -1.) {
      this.initialWidth = iconExtent.getWidth();
      this.initialHeight = iconExtent.getHeight();
    
      scaleXProperty.set(getWidth() / initialWidth);
      scaleYProperty.set(getHeight() / initialHeight);
    }
  }
  
  private void calcOffset() {
    offsetProperty.set(p1.get());
  }
  
  private void calcFlipped() {
    flippedXProperty.set(p2.get().getX() < p1.get().getX());
    flippedYProperty.set(p2.get().getY() < p1.get().getY());
  }
  
  public Double getScaleX() {
    return scaleXProperty.get();
  }
  
  public Double getScaleY() {
    return scaleYProperty.get();
  }
  
  public Boolean isFlipX() {
    return flippedXProperty.get();
  }
  
  public Boolean isFlipY() {
    return flippedYProperty.get();
  }
  
  public Point2D getP1() {
    return p1.get();
  }
  
  public Point2D getP2() {
    return p2.get();
  }
  
  public Point2D getOffset() {
    return offsetProperty.get();
  }
  
  private void calcPoints() {
  
    p1.set(offsetProperty.get());
    p2.set(p1.get().add(getWidth(), getHeight()));
    
    Point2D tmp = p1.get();
    if (isFlipX()) {
      p1.set(new Point2D(p2.get().getX(), tmp.getY()));
      p2.set(new Point2D(tmp.getX(), p2.get().getY()));
    }
    
    if (isFlipY()) {
      p1.set(new Point2D(tmp.getX(), p2.get().getY()));
      p2.set(new Point2D(p2.get().getX(), tmp.getY()));
    }
  }
  
  @Override
  public String toString() {
    calcPoints();
    
    return super.toString();
  }
}
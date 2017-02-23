package de.thm.mni.mote.mode.modelica.graphics;

import javafx.beans.property.*;
import javafx.geometry.Point2D;
import lombok.Getter;

/**
 * Created by hobbypunk on 23.02.17.
 */
public class MoTransformationExtent extends MoExtent {
  private MoSimpleExtent iconExtent = null;
  
  private final ObjectProperty<Point2D> p1 = new SimpleObjectProperty<>(new Point2D(-100., -100.));
  private final ObjectProperty<Point2D> p2 = new SimpleObjectProperty<>(new Point2D(100., 100.));
  
  @Getter private final DoubleProperty widthProperty = new SimpleDoubleProperty();
  @Getter private final DoubleProperty heightProperty = new SimpleDoubleProperty();
  
  @Getter private final DoubleProperty offsetXProperty = new SimpleDoubleProperty(0.);
  @Getter private final DoubleProperty offsetYProperty = new SimpleDoubleProperty(0.);
  
  @Getter private final DoubleProperty scaleXProperty = new SimpleDoubleProperty(1.);
  @Getter private final DoubleProperty scaleYProperty = new SimpleDoubleProperty(1.);
  
  @Getter private final BooleanProperty flippedXProperty = new SimpleBooleanProperty(false);
  @Getter private final BooleanProperty flippedYProperty = new SimpleBooleanProperty(false);
  
  
  MoTransformationExtent(Point2D p1, Point2D p2) {
    if (p1 != null) this.p1.set(p1);
    if (p2 != null) this.p2.set(p2);
    
    calcOffset();
    calcFlipped();
    //  initListener();
  }
  
  MoTransformationExtent(MoSimpleExtent iconExtent, Double initialScale) {
    scaleXProperty.set(initialScale);
    scaleYProperty.set(initialScale);
    this.iconExtent = iconExtent;
    
    calcOffset();
    // initListener();
  }
  
  private void initListener() {
    scaleXProperty.addListener((observable, oldValue, newValue) -> {
      calcPoints();
      calcSize();
    });
    scaleYProperty.addListener((observable, oldValue, newValue) -> {
      calcPoints();
      calcSize();
    });
    
    offsetXProperty.addListener((observable, oldValue, newValue) -> calcPoints());
    offsetYProperty.addListener((observable, oldValue, newValue) -> calcPoints());
    
    flippedXProperty.addListener((observable, oldValue, newValue) -> calcPoints());
    flippedYProperty.addListener((observable, oldValue, newValue) -> calcPoints());
    
  }
  
  public void setIconExtent(MoSimpleExtent iconExtent) {
//    if (this.iconExtent != null)  //TODO: wahrscheinlich probleme bei vererbung und das kind verschiebt den connector. deepcopy der variablen nötig?
//      throw new UnsupportedOperationException("Already set!");
    if (this.iconExtent == null) {
      this.iconExtent = iconExtent;
      calcSize();
      calcScale();
    }
  }
  
  private void calcOffset() {
    offsetXProperty.set(p1.get().getX());
    offsetYProperty.set(p1.get().getY());
  }
  
  private void calcFlipped() {
    flippedXProperty.set(p2.get().getX() < p1.get().getX());
    flippedYProperty.set(p2.get().getY() < p1.get().getY());
  }
  
  private void calcScale() {
    if (this.iconExtent == null) return;
  
    Double variableWidth = getWidth();
    Double variableHeight = getHeight();
    
    Double iconWidth = iconExtent.getP2().getX() - iconExtent.getP1().getX();
    Double iconHeight = iconExtent.getP2().getY() - iconExtent.getP1().getY();
    
    scaleXProperty.set(variableWidth / iconWidth);
    scaleYProperty.set(variableHeight / iconHeight);
  }
  
  private void calcSize() {
    widthProperty.set(Math.max(p1.get().getX(), p2.get().getX()) - Math.min(p1.get().getX(), p2.get().getX()));
    heightProperty.set(Math.max(p1.get().getY(), p2.get().getY()) - Math.min(p1.get().getY(), p2.get().getY()));
  }
  
  public Double getWidth() {
    return Math.max(p1.get().getX(), p2.get().getX()) - Math.min(p1.get().getX(), p2.get().getX());//widthProperty.get();
  }
  
  public Double getHeight() {
    return Math.max(p1.get().getY(), p2.get().getY()) - Math.min(p1.get().getY(), p2.get().getY());//heightProperty.get();
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
  
  private void calcPoints() {
    if (this.iconExtent == null) return;
    Point2D o = this.iconExtent.getP2().subtract(this.iconExtent.getP1());
    p1.set(new Point2D(offsetXProperty.get(), offsetXProperty.get()));
    p2.set(new Point2D((o.getX() * scaleXProperty.get()) - offsetXProperty.get(), (o.getY() * scaleYProperty.get()) - offsetXProperty.get()));
    
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
    calcSize();
    
    return super.toString();
  }
}

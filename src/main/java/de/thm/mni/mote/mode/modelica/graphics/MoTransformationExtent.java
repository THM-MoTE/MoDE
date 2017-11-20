package de.thm.mni.mote.mode.modelica.graphics;

import de.thm.mni.mote.mode.modelica.interfaces.Changeable;
import javafx.beans.binding.BooleanBinding;
import javafx.beans.binding.DoubleBinding;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.geometry.Point2D;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by Marcel Hoppe on 23.02.17.
 */
@Getter
public class MoTransformationExtent extends MoExtent implements Changeable {
  @Setter private Changeable changeParent = null;
  
  private final ObjectProperty<Change> unsavedChanges = new SimpleObjectProperty<>(Change.NONE);
  
  
  private final ObjectProperty<Point2D> p1Property = new SimpleObjectProperty<>(new Point2D(-100., -100.));
  private final ObjectProperty<Point2D> p2Property = new SimpleObjectProperty<>(new Point2D(100., 100.));
  
  private Double initialWidth = -1.;
  private Double initialHeight = -1.;
  
  private final DoubleBinding scaleXProperty = new DoubleBinding() {
    {
      super.bind(p1Property, p2Property);
    }
    @Override
    protected double computeValue() {
      return MoTransformationExtent.super.getWidth() / initialWidth;
    }
  };
  private final DoubleBinding scaleYProperty = new DoubleBinding() {
    {
      super.bind(p1Property, p2Property);
    }
    @Override
    protected double computeValue() {
      return MoTransformationExtent.super.getHeight() / initialHeight;
    }
  };
 
  private final BooleanBinding flippedXProperty = new BooleanBinding() {
    {
      super.bind(p1Property, p2Property);
    }
    @Override
    protected boolean computeValue() {
      return p2Property.get().getX() < p1Property.get().getX();
    }
  };
  private final BooleanBinding flippedYProperty = new BooleanBinding() {
    {
      super.bind(p1Property, p2Property);
    }
    @Override
    protected boolean computeValue() {
      return p2Property.get().getY() < p1Property.get().getY();
    }
  };
  
  
  MoTransformationExtent(Point2D p1, Point2D p2) {
    if (p1 != null) this.p1Property.set(p1);
    if (p2 != null) this.p2Property.set(p2);
  
    initListener();
  }
  
  private void initListener() {
    p1Property.addListener((observable, oldValue, newValue) -> changed());
    p2Property.addListener((observable, oldValue, newValue) -> changed());
  
    initChangeListener();
  }
  
  @SuppressWarnings("SpellCheckingInspection")
  public void setIconExtent(MoSimpleExtent iconExtent) {
//    if (this.iconExtent != null)  //TODO: wahrscheinlich probleme bei vererbung und das kind verschiebt den connector. deepcopy der variablen nötig?
//      throw new UnsupportedOperationException("Already set!");
    if (this.initialWidth < 0 || this.initialHeight < 0) {
      this.initialWidth = iconExtent.getWidth();
      this.initialHeight = iconExtent.getHeight();
    }
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
  
  private Boolean isFlipY() {
    return flippedYProperty.get();
  }
  
  
  
  public Point2D getP1() {
    return p1Property.get();
  }
  
  public Point2D getP2() {
    return p2Property.get();
  }

  public void setP1(Point2D p) {
    p1Property.set(p);
  }
  public void setP2(Point2D p) {
    p2Property.set(p);
  }
  
  private void calcPoints() {
//    p2.set(p1.get().add(this.initialWidth * scaleXProperty.get(), this.initialHeight * scaleYProperty.get()));
    
    Point2D tmp = p1Property.get();
    if (isFlipX()) {
      p1Property.set(new Point2D(p2Property.get().getX(), tmp.getY()));
      p2Property.set(new Point2D(tmp.getX(), p2Property.get().getY()));
    }
    
    if (isFlipY()) {
      p1Property.set(new Point2D(tmp.getX(), p2Property.get().getY()));
      p2Property.set(new Point2D(p2Property.get().getX(), tmp.getY()));
    }
  }
  
  public ObjectProperty<Point2D> getOffsetProperty() {
    return this.p1Property;
  }
}
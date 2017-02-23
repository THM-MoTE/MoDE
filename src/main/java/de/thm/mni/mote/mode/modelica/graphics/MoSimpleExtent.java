package de.thm.mni.mote.mode.modelica.graphics;

import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.geometry.Point2D;

/**
 * Created by hobbypunk on 23.02.17.
 */
public class MoSimpleExtent extends MoExtent {
  protected final ObjectProperty<Point2D> p1 = new SimpleObjectProperty<>(new Point2D(-100., -100.));
  protected final ObjectProperty<Point2D> p2 = new SimpleObjectProperty<>(new Point2D(100., 100.));
  
  MoSimpleExtent(Point2D p1, Point2D p2) {
    if (p1 != null) this.p1.set(p1);
    if (p2 != null) this.p2.set(p2);
  }
  
  public Point2D getP1() {
    return new Point2D(Math.min(p1.get().getX(), p2.get().getX()), Math.min(p1.get().getY(), p2.get().getY()));
  }
  
  public Point2D getP2() {
    return new Point2D(Math.max(p1.get().getX(), p2.get().getX()), Math.max(p1.get().getY(), p2.get().getY()));
  }
}

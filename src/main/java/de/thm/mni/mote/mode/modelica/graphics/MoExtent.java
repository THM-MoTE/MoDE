package de.thm.mni.mote.mode.modelica.graphics;

import javafx.geometry.Point2D;

/**
 * Created by Marcel Hoppe on 23.02.17.
 */
public abstract class MoExtent {
  public abstract Point2D getP1();
  
  public abstract Point2D getP2();
  
  public Double getWidth() {
    return Math.max(getP1().getX(), getP2().getX()) - Math.min(getP1().getX(), getP2().getX());
  }
  
  public Double getHeight() {
    return Math.max(getP1().getY(), getP2().getY()) - Math.min(getP1().getY(), getP2().getY());
  }
  
  
  @Override
  public String toString() {
    return Utilities.toString(getP1()) + ", " + Utilities.toString(getP2());
  }
}

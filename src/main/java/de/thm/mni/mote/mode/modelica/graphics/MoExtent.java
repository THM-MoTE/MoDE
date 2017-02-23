package de.thm.mni.mote.mode.modelica.graphics;

import javafx.geometry.Point2D;

/**
 * Created by hobbypunk on 23.02.17.
 */
public abstract class MoExtent {
  public abstract Point2D getP1();
  
  public abstract Point2D getP2();
  
  @Override
  public String toString() {
    return Utilities.toString(getP1()) + ", " + Utilities.toString(getP1());
  }
}

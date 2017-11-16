package de.thm.mni.mote.mode.frontend.shape.interfaces;

import javafx.beans.property.DoubleProperty;

/**
 * Created by hobbypunk on 02.11.16.
 */
public interface HasStrokeWidth {
  
  DoubleProperty getInitialStrokeWidthProperty();
  
  default Double getInitialStrokeWidth() {
    return getInitialStrokeWidthProperty().get();
  }
  default void setInitialStrokeWidth(Double value) {
    getInitialStrokeWidthProperty().set(value);
  }
  
  void setStrokeWidth(double value);
  
  default void setOwnStrokeWidth(double value) {
    setStrokeWidth(value);
  }
}

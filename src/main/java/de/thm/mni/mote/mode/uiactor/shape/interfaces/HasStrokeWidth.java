package de.thm.mni.mote.mode.uiactor.shape.interfaces;

import javafx.beans.property.DoubleProperty;

/**
 * Created by hobbypunk on 02.11.16.
 */
public interface HasStrokeWidth {
  Double getInitialStrokeWidth();
  
  void setInitialStrokeWidth(Double value);
  
  void setStrokeWidth(double value);
  
  DoubleProperty strokeWidthProperty();
  
  
  default DoubleProperty ownStrokeWidthProperty() {
    return strokeWidthProperty();
  }
  
  default void setOwnStrokeWidth(double value) {
    setStrokeWidth(value);
  }
}

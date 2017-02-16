package de.thm.mni.mote.mode.uiactor.shape.interfaces;

import de.thm.mni.mote.mode.modelica.graphics.MoFilledShape;
import de.thm.mni.mote.mode.modelica.graphics.Utilities;
import javafx.collections.ObservableList;

/**
 * Created by hobbypunk on 03.11.16.
 */
public interface StrokedElement extends HasStrokeWidth {
  MoFilledShape getData();
  
  ObservableList<Double> getStrokeDashArray();
  
  
  default void init() {
    //LinePattern:
    this.setInitialStrokeWidth(getData().getLineThickness());
    this.getStrokeDashArray().clear();
    this.getStrokeDashArray().addAll(Utilities.getLinePattern(getData().getPattern()));
  }
  
}

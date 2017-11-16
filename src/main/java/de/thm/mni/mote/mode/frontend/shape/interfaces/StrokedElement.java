package de.thm.mni.mote.mode.frontend.shape.interfaces;

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
    this.getInitialStrokeWidthProperty().bind(getData().getLineThicknessProperty());
    
    this.getStrokeDashArray().clear();
    this.getStrokeDashArray().addAll(Utilities.getLinePattern(getData().getPatternProperty().get()));
  
    getData().getPatternProperty().addListener((observable, oldValue, newValue) -> {
      this.getStrokeDashArray().clear();
      this.getStrokeDashArray().addAll(Utilities.getLinePattern(newValue));
    });
  }
  
}

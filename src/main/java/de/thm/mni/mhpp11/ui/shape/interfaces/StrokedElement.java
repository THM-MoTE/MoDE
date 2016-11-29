package de.thm.mni.mhpp11.ui.shape.interfaces;

import de.thm.mni.mhpp11.parser.models.graphics.MoFilledShape;
import de.thm.mni.mhpp11.parser.models.graphics.Utilities;
import javafx.collections.ObservableList;

/**
 * Created by hobbypunk on 03.11.16.
 */
public interface StrokedElement extends HasInitialStroke {
  MoFilledShape getData();
  
  ObservableList<Double> getStrokeDashArray();
  
  
  default void init() {
    //LinePattern:
    this.setInitialStrokeWidth(getData().getLineThickness());
    this.getStrokeDashArray().clear();
    this.getStrokeDashArray().addAll(Utilities.getLinePattern(getData().getPattern()));
  }
  
}

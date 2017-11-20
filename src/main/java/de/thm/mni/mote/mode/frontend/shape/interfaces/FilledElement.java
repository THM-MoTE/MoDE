package de.thm.mni.mote.mode.frontend.shape.interfaces;

import de.thm.mni.mote.mode.modelica.graphics.MoFilledShape;
import de.thm.mni.mote.mode.modelica.graphics.Utilities;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;

/**
 * Created by Marcel Hoppe on 03.11.16.
 */
public interface FilledElement {
  void setStyle(String css);
  
  String getStyle();
  
  MoFilledShape getData();
  
  void setStroke(Paint p);
  
  default void init() {
    updateStyle();
    updatePattern(getData().getPatternProperty().get());
    getData().getPatternProperty().addListener((observable, oldValue, newValue) -> updatePattern(newValue));
    getData().getFillPatternProperty().addListener((observable, oldValue, newValue) -> updateStyle());
    getData().getFillColorProperty().addListener((observable, oldValue, newValue) -> updateStyle());
    getData().getLineColorProperty().addListener((observable, oldValue, newValue) -> updateStyle());
  }
  
  default void updateStyle() {
    setStyle(this.getStyle() + " " + Utilities.getFillCSS(getData().getFillPatternProperty().get(), getData().getFillColorProperty().get(), getData().getLineColorProperty().get()));
  }
  
  default void updatePattern(Utilities.LinePattern pattern) {
    if (pattern == Utilities.LinePattern.SOLID) {
      this.setStroke(getData().getLineColorProperty().get());
    } else if (pattern == Utilities.LinePattern.NONE) {
      this.setStroke(Color.TRANSPARENT);
    }
  
  }
}

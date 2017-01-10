package de.thm.mni.mote.mode.ui.shape.interfaces;

import de.thm.mni.mote.mode.modelica.graphics.MoFilledShape;
import de.thm.mni.mote.mode.modelica.graphics.Utilities;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;

/**
 * Created by hobbypunk on 03.11.16.
 */
public interface FilledElement {
  void setStyle(String css);
  
  String getStyle();
  
  MoFilledShape getData();
  
  void setStroke(Paint p);
  
  default void init() {
    setStyle(this.getStyle() + " " + Utilities.getFillCSS(getData().getFillPattern(), getData().getFillColor(), getData().getLineColor()));
    
    if (getData().getPattern() == Utilities.LinePattern.SOLID) {
      this.setStroke(getData().getLineColor());
    } else if (getData().getPattern() == Utilities.LinePattern.NONE) {
      this.setStroke(Color.TRANSPARENT);
    }
  }
}

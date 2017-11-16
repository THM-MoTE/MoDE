package de.thm.mni.mote.mode.frontend.shape;

import de.thm.mni.mote.mode.modelica.graphics.MoLine;
import javafx.beans.property.ObjectProperty;
import javafx.geometry.Point2D;

class StartArrow extends Arrow {
  
  StartArrow(MoLine data) {
    super(data);
  }
  
  @Override
  ObjectProperty<Point2D> getStartPointProperty() {
    return getData().getFirstPointProperty();
  }
  
  @Override
  ObjectProperty<Point2D> getNextPointProperty() {
    return getData().getSecondPointProperty();
  }

  ObjectProperty<MoLine.Arrow> getArrowProperty() {
    return getData().getStartArrowProperty();
  }
}

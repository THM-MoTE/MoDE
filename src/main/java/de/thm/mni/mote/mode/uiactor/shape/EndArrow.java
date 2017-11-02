package de.thm.mni.mote.mode.uiactor.shape;

import de.thm.mni.mote.mode.modelica.graphics.MoLine;
import javafx.beans.property.ObjectProperty;
import javafx.geometry.Point2D;

class EndArrow extends Arrow {
  
  EndArrow(MoLine data) {
    super(data);
  }
  
  @Override
  ObjectProperty<Point2D> getStartPointProperty() {
    return getData().getLastPointProperty();
  }
  
  @Override
  ObjectProperty<Point2D> getNextPointProperty() {
    return getData().getSecondLastPointProperty();
  }
  
  ObjectProperty<MoLine.Arrow> getArrowProperty() {
    return getData().getEndArrowProperty();
  }
}

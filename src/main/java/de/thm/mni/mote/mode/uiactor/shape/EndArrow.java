package de.thm.mni.mote.mode.uiactor.shape;

import de.thm.mni.mote.mode.modelica.graphics.MoLine;
import javafx.geometry.Point2D;

class EndArrow extends Arrow {
  
  EndArrow(MoLine data) {
    super(data);
  }
  
  @Override
  Point2D getStartPoint() {
    return getData().getLastPoint();
  }
  
  @Override
  Point2D getNextPoint() {
    return null;
  }
}

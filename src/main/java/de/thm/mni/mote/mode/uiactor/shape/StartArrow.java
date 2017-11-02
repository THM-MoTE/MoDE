package de.thm.mni.mote.mode.uiactor.shape;

import de.thm.mni.mote.mode.modelica.graphics.MoLine;
import javafx.geometry.Point2D;

class StartArrow extends Arrow {
  
  StartArrow(MoLine data) {
    super(data);
  }
  
  @Override
  Point2D getStartPoint() {
    return getData().getFirstPoint();
  }
  
  @Override
  Point2D getNextPoint() {
    return null;
  }
}

package de.thm.mni.mote.mode.uiactor.shape;

import javafx.geometry.Point2D;

public class StartArrow extends Arrow {
  
  public StartArrow(Line parent) {
    super(parent);
  }
  
  @Override
  Point2D getPoint() {
    return line.getData().getFirstPoint();
  }
}

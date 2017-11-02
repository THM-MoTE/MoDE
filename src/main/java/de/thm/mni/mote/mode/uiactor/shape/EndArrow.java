package de.thm.mni.mote.mode.uiactor.shape;

import javafx.geometry.Point2D;

public class EndArrow extends Arrow {
  
  public EndArrow(Line parent) {
    super(parent);
  }
  
  @Override
  Point2D getPoint() {
    return line.getData().getLastPoint();
  }
}

package de.thm.mni.mote.mode.uiactor.control.modelica;

import javafx.beans.property.BooleanProperty;
import javafx.geometry.Point2D;
import javafx.scene.Group;

public abstract class FXMoParentGroup extends Group {
  public abstract BooleanProperty getFlippedXProperty();
  public abstract BooleanProperty getFlippedYProperty();
  
  public abstract Point2D convertTo(Point2D scenePoint);
}

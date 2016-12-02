package de.thm.mni.mhpp11.ui.shape.interfaces;

import de.thm.mni.mhpp11.modelica.graphics.MoGraphic;
import javafx.collections.ObservableList;
import javafx.geometry.Point2D;
import javafx.scene.transform.Rotate;
import javafx.scene.transform.Transform;
import javafx.scene.transform.Translate;

/**
 * Created by hobbypunk on 03.11.16.
 */
public interface Element {
  MoGraphic getData();
  
  Translate getOrigin();
  
  Rotate getRotation();
  
  ObservableList<Transform> getTransforms();
  
  default void init() {
    getData().getOrigin().addListener((observable, oldValue, newValue) -> updateOrigin(newValue));
    getData().getRotation().addListener((observable, oldValue, newValue) -> updateRotation(newValue));
    updateOrigin(getData().getOrigin().get());
    updateRotation(getData().getRotation().getValue());
    
    getTransforms().add(getRotation());
    getTransforms().add(getOrigin());
  }
  
  default void updateOrigin(Point2D newValue) {
    getOrigin().setX(newValue.getX());
    getOrigin().setY(newValue.getY());
    getRotation().setPivotX(newValue.getX());
    getRotation().setPivotY(newValue.getY());
  }
  
  default void updateRotation(Number newValue) {
    getRotation().setAngle(newValue.doubleValue());
  }
}

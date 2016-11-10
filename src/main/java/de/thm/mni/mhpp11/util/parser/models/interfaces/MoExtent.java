package de.thm.mni.mhpp11.util.parser.models.interfaces;

import javafx.beans.property.ObjectProperty;
import javafx.geometry.Point2D;

import java.util.List;

/**
 * Created by hobbypunk on 29.09.16.
 */
public interface MoExtent {
  
  List<ObjectProperty<Point2D>> getExtent();
}

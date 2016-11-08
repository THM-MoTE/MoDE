package de.thm.mni.mhpp11.util.parser.models.interfaces;

import de.thm.mni.mhpp11.util.config.model.Point;
import javafx.beans.property.ObjectProperty;

import java.util.List;

/**
 * Created by hobbypunk on 29.09.16.
 */
public interface MoExtent {
  
  List<ObjectProperty<Point<Double, Double>>> getExtent();
}

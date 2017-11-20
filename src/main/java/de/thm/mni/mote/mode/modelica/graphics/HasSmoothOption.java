package de.thm.mni.mote.mode.modelica.graphics;

import javafx.beans.property.ObjectProperty;

/**
 * Created by Marcel Hoppe on 03.11.16.
 */
public interface HasSmoothOption {
  ObjectProperty<Utilities.Smooth> getSmoothProperty();
}

package de.thm.mni.mhpp11.modelica.interfaces;

import javafx.beans.property.ObjectProperty;

import java.util.List;

/**
 * Created by hobbypunk on 29.11.16.
 */
public interface Changeable {
  
  enum Change {
    NONE,
    NEW,
    EDIT,
    DELETE
  }
  
  
  ObjectProperty<Change> getUnsavedChanges();
  
  Changeable getChangeParent();
  
  List<Changeable> getChangeChildren();
  
  default void initChangeListener() {
    getUnsavedChanges().addListener((observable, oldValue, newValue) -> {
      if (getChangeParent() != null && newValue != Change.NONE) getChangeParent().changed();
      if (newValue == Change.NONE) getChangeChildren().forEach(child -> child.getUnsavedChanges().set(Change.NONE));
    });
  }
  
  default void changed() {
    if (getUnsavedChanges().get() == Change.NONE) getUnsavedChanges().setValue(Change.EDIT);
  }
  
}

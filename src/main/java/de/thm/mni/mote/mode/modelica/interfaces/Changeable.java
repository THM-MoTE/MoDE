package de.thm.mni.mote.mode.modelica.interfaces;

import javafx.beans.property.ObjectProperty;

import java.util.Collections;
import java.util.List;

/**
 * Created by Marcel Hoppe on 29.11.16.
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
  
  @SuppressWarnings("unchecked")
  default List<Changeable> getChangeChildren() {return Collections.EMPTY_LIST; }
  
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

package de.thm.mni.mhpp11.parser.models.interfaces;

/**
 * Created by hobbypunk on 29.11.16.
 */
public interface Changeable {
  
  ChangeListener getInternalChangeListener();
  
  void setInternalChangeListener(ChangeListener changeListener);
  
  default ChangeListener getChangeListener() {
    return getInternalChangeListener();
  }
  
  default void setChangeListener(ChangeListener changeListener) {
    setInternalChangeListener(changeListener);
    updateChangeListeners(changeListener);
  }
  
  default void updateChangeListeners(ChangeListener changeListener) {}
  
  default void changed() {
    if (getChangeListener() != null) getChangeListener().changed();
  }
  
  interface ChangeListener {
    void changed();
  }
}

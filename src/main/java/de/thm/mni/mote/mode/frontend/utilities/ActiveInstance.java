package de.thm.mni.mote.mode.frontend.utilities;

import javafx.beans.property.BooleanProperty;
import javafx.beans.property.SimpleBooleanProperty;
import lombok.Getter;

@Getter
public abstract class ActiveInstance {
  BooleanProperty active = new SimpleBooleanProperty(false);
  
  protected ActiveInstance() {
    active.addListener((observable, oldValue, newValue) -> {
      if(newValue) onActivation();
      else onDeactivation();
    });
  }
  
  protected void onActivation() {}
  protected void onDeactivation() {}
  
  protected void onDestroy() {}
}

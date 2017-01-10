package de.thm.mni.mote.mode.config.model;

import de.thm.mni.mote.mode.config.Settings;

import java.util.Observable;

/**
 * Created by hobbypunk on 15.09.16.
 */
public abstract class MyObservable extends Observable {
  
  public void init() {
    this.addObserver(Settings.load());
  }
  
  @Override
  public void notifyObservers(Object arg) {
    this.setChanged();
    if(arg instanceof String) super.notifyObservers(getClass().getSimpleName() + "_" + arg);
    else super.notifyObservers(arg);
    this.clearChanged();
  }
}

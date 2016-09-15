package de.thm.mni.mhpp11.util.config.model;

import de.thm.mni.mhpp11.util.config.Settings;

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
    super.notifyObservers(getClass().getSimpleName() + "_" + arg);
    this.clearChanged();
  }
}

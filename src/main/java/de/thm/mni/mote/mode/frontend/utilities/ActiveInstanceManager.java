package de.thm.mni.mote.mode.frontend.utilities;

import de.thm.mni.mote.mode.frontend.controls.MainTabControl;
import de.thm.mni.mote.mode.modelica.MoContainer;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.scene.Scene;
import org.apache.commons.lang3.NotImplementedException;

import java.util.HashMap;
import java.util.Map;

public abstract class ActiveInstanceManager<T extends ActiveInstance> {
  
  private final ObjectProperty<T> activeProperty = new SimpleObjectProperty<>(null);
  protected final Map<MoContainer, T> instances = new HashMap<>();
  
  protected ActiveInstanceManager() {
    activeProperty.addListener((observable, oldValue, newValue) -> {
      if(oldValue != null) oldValue.active.set(false);
      if(newValue != null) newValue.active.set(true);
    });
  }
  
  public void create(MoContainer container) {
    if(instances.containsKey(container)) throw new RuntimeException("Already created!");
    
    instances.put(container, createInstance(container));
  }
  
  public void create(Scene scene, MainTabControl tab, MoContainer container) {
    throw new NotImplementedException("");
  }
  
  public void remove(MoContainer container) {
    if(!instances.containsKey(container)) throw new RuntimeException("No such instance!");
    
    if (activeProperty.get() == instances.get(container)) activeProperty.set(null);
    instances.get(container).onDestroy();
    instances.remove(container);
  }
  
  public void deactivate() {
    this.activeProperty.set(null);
  }
  
  public void activate(MoContainer container) {
    if(!instances.containsKey(container)) throw new RuntimeException("No such instance!");
    activate(instances.get(container));
  }
  
  private void activate(T instance) {
    if(!instances.containsValue(instance)) throw new RuntimeException("No such instance!");
    if(this.activeProperty.isNull().get() || !this.activeProperty.get().equals(instance))
      this.activeProperty.set(instance);
  }
  
  public T getActive() {
    if(this.activeProperty.isNull().get()) throw new RuntimeException("No active instance!");
    return this.activeProperty.get();
  }
  
  public ObjectProperty<T> getActiveProperty() {
    return this.activeProperty;
  }
  
  public T get(MoContainer container) {
    if(!instances.containsKey(container)) throw new RuntimeException("No such instance!");
    return instances.get(container);
  }
  
  protected T createInstance(MoContainer container) {
    throw new NotImplementedException("");
  }
}

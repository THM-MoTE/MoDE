package de.thm.mni.mote.mode.config.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.simpleframework.xml.Element;
import org.slf4j.event.Level;

/**
 * Created by hobbypunk on 13.09.16.
 */
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Logger extends MyObservable {
  
  @Element Level level = Level.ERROR;
  @Element Level notifyLevel = Level.ERROR;
  
  public void setLevel(Level level) {
    this.level = level;
    this.notifyObservers("Level");
  }
  
  public void setNotifyLevel(Level level) {
    this.notifyLevel = level;
    this.notifyObservers("NotifyLevel");
  }
  
  @Override
  public String toString() {
    return String.format("{ level: %s, this.notifyLevel %s}", this.level.name(), this.notifyLevel.name());
  }
}
package de.thm.mni.mote.mode.config.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.simpleframework.xml.Element;

/**
 * Created by hobbypunk on 13.09.16.
 */
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Logger extends MyObservable {
  
  public enum LEVEL {
    ERROR,
    WARNING,
    INFO,
    DEBUG,
    TRACE
  }
  
  @Element LEVEL level = LEVEL.ERROR;
  @Element LEVEL notifyLevel = LEVEL.ERROR;
  
  public void setLevel(LEVEL level) {
    this.level = level;
    this.notifyObservers("Level");
  }
  
  public void setNotifyLevel(LEVEL level) {
    this.notifyLevel = level;
    this.notifyObservers("NotifyLevel");
  }
  
  @Override
  public String toString() {
    return String.format("{ level: %s, this.notifyLevel %s}", this.level.name(), this.notifyLevel.name());
  }
}
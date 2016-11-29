package de.thm.mni.mhpp11.config.model;

import lombok.Getter;
import lombok.NonNull;
import org.simpleframework.xml.Element;

/**
 * Created by hobbypunk on 14.09.16.
 */
@Getter
public class Notification extends MyObservable {
  @Element
  @NonNull Integer seconds = 5;
  
  public void setSeconds(Integer seconds) {
    this.seconds = seconds;
    this.notifyObservers("Seconds");
  }
  
  @Override
  public String toString() {
    return String.format("{ seconds: %d }", seconds);
  }
}

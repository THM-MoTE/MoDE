package de.thm.mni.mote.mode.config.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import org.simpleframework.xml.Element;

import java.nio.file.Path;
import java.util.Date;


/**
 * Created by hobbypunk on 11.09.16.
 */
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Project extends MyObservable {
  @Element
  @NonNull private String name;
  @Element
  @NonNull private Path file;
  @Element
  @NonNull private Date lastOpened;
  
  public Project(String name, Path file) {
    this(name, file, new Date());
  }
  
  public void updateLastOpened() {
    this.lastOpened = new Date();
    this.notifyObservers("LastOpened");
  }
  
  @Override
  public String toString() {
    return String.format("{ name: %s, file: %s, lastOpened: %s }", name, file, lastOpened);
  }
}

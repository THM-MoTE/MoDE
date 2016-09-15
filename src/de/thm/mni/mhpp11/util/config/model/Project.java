package de.thm.mni.mhpp11.util.config.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import org.simpleframework.xml.Element;

import java.io.File;
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
  @NonNull private File file;
  @Element
  @NonNull private Date lastOpened;
  
  public Project(String name, File file) {
    this(name, file, new Date());
  }
  
  public void updateLastOpened() {
    this.lastOpened = new Date();
    this.notifyObservers("LastOpened");
  }
}

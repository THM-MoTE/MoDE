package de.thm.mni.mhpp11.util.config.model;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

import java.io.File;
import java.util.*;

/**
 * Created by hobbypunk on 11.09.16.
 */

@Root
@NoArgsConstructor
@AllArgsConstructor
public class Configuration extends Observable {
  
  @Element(required = false)
  private String lang = "en_US";
  @Element(required = false)
  Recent recent = new Recent();
  
  public File file;
  
  public void setLang(Locale lang) {
    this.lang = lang.toString();
    this.notifyObservers("Lang");
  }
  
  public Locale getLang() {
    return new Locale(lang.split("_")[0], lang.split("_")[1]);
  }
  
  public void setRecentCount(Integer count) {
    this.recent.setRecentCount(count);
    this.notifyObservers("RecentCount");
  }
  
  public Integer getRecentCount() {
    return this.recent.recentCount;
  }
  
  public void addRecent(Project project) {
    this.recent.addRecent(project);
    this.notifyObservers("addRecent");
  }
  
  public void removeRecent(Project project) {
    this.recent.removeRecent(project);
    this.notifyObservers("removeRecent");
  }
  
  public List<Project> getRecents() {
    return this.recent.getRecents();
  }
  
  @Override
  public void notifyObservers(Object arg) {
    this.setChanged();
    super.notifyObservers(arg);
    this.clearChanged();
  }
}

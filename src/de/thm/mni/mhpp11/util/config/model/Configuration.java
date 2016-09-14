package de.thm.mni.mhpp11.util.config.model;

import de.thm.mni.mhpp11.util.config.model.Logger.LEVEL;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

import java.io.File;
import java.util.List;
import java.util.Locale;
import java.util.Observable;

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
  private Recent recent = new Recent();
  @Element(required = false)
  private Logger logger = new Logger();
  @Element(required = false)
  private Notification notification = new Notification();
  
  public File file;
  
  public void setLang(Locale lang) {
    this.lang = lang.toString();
    this.notifyObservers("Lang");
  }
  
  public Locale getLang() {
    return new Locale(lang.split("_")[0], lang.split("_")[1]);
  }
  
  public void setRecentCount(Integer count) {
    this.recent.setCount(count);
    this.notifyObservers("RecentCount");
  }
  
  public Integer getRecentCount() {
    return this.recent.getCount();
  }
  
  public void addRecent(Project project) {
    this.recent.addRecent(project);
    this.notifyObservers("addRecent");
  }
  
  public void removeRecent(Project project) {
    this.recent.removeRecent(project);
    this.notifyObservers("removeRecent");
  }
  
  public void setLogLevel(LEVEL level) {
    this.logger.level = level;
    this.notifyObservers("logLevel");
  }
  
  public void setNotifyLevel(LEVEL level) {
    this.logger.notifyLevel = level;
    this.notifyObservers("notifyLevel");
  }
  
  public Integer getNotifySeconds() {
    return this.notification.seconds;
  }
  
  public void setNotifySeconds(Integer seconds) {
    this.notification.seconds = seconds;
    this.notifyObservers("notifySeconds");
  }
  
  public LEVEL getLogLevel() {
    return this.logger.level;
  }
  
  public LEVEL getNotifyLevel() {
    return this.logger.notifyLevel;
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

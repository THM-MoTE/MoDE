package de.thm.mni.mote.mode.config.model;

import de.thm.mni.mote.mode.util.Utilities;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;

import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by hobbypunk on 11.09.16.
 */

@NoArgsConstructor
public class Recent extends MyObservable {
  @Element(required = false)
  @Getter private Path lastPath = Utilities.getHome();
  
  @Element(required = false)
  @Getter private Integer count = 10;
  
  @ElementList(required = false)
  private List<Path> projects = new ArrayList<>();
  
  @Override
  public void init() {
    super.init();
  }
  
  public void setLastPath(Path lastPath) {
    this.lastPath = lastPath;
    this.notifyObservers("LastPath");
  }
  
  public void setCount(Integer count) {
    this.count = count;
    this.checkLength();
    this.notifyObservers("Count");
  }
  
  public void add(Path project) {
    this.projects.add(project);
    this.setLastPath(project.getParent());
    this.checkLength();
    this.notifyObservers("AddRecent");
  }
  
  public void remove(Path project) {
    if (this.projects.contains(project)) {
      this.projects.remove(project);
      this.notifyObservers("RemoveRecent");
    }
  }
  
  public List<Path> getAll() {
    List<Path> ret = new ArrayList<>();
    for (Path p : this.projects)
      ret.add(0, p);
    return ret;
  }
  
  private void checkLength() {
    while(projects.size() > this.count)
      projects.get(0);
  }
  
  @Override
  public String toString() {
    String tmp = "";
    for (Path p : projects) {
      tmp += ((tmp.isEmpty()) ? "" : ", ") + p;
    }
    return String.format("{ lastPath: %s, count: %d, projects: [ %s ] }", lastPath, count, tmp);
  }
}

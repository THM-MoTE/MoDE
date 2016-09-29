package de.thm.mni.mhpp11.util.config.model;

import de.thm.mni.mhpp11.util.Utilities;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by hobbypunk on 11.09.16.
 */

@NoArgsConstructor
public class Recent extends MyObservable {
  @Element(required = false)
  @Getter private File lastPath = Utilities.getHome();
  
  @Element(required = false)
  @Getter private Integer count = 10;
  
  @ElementList(required = false)
  private List<Project> projects = new ArrayList<>();
  
  @Override
  public void init() {
    super.init();
    for(Project p: projects) {
      p.init();
    }
  }
  
  public void setLastPath(File lastPath) {
    this.lastPath = lastPath;
    this.notifyObservers("LastPath");
  }
  
  public void setCount(Integer count) {
    this.count = count;
    this.checkLength();
    this.notifyObservers("Count");
  }
  
  public void add(Project project) {
    this.projects.add(project);
    this.setLastPath(project.getFile().getParentFile());
    this.checkLength();
    this.notifyObservers("AddRecent");
  }
  
  public void remove(Project project) {
    this.projects.remove(project);
    this.notifyObservers("RemoveRecent");
  }
  
  public List<Project> getAll() {
    List<Project> ret = new ArrayList<>();
    for(Project p: this.projects)
      ret.add(0, p);
    return ret;
  }
  
  private void checkLength() {
    while(projects.size() > this.count)
      projects.get(0);
  }
}

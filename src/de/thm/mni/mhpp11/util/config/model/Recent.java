package de.thm.mni.mhpp11.util.config.model;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by hobbypunk on 11.09.16.
 */
@NoArgsConstructor
@AllArgsConstructor
public class Recent {
  
  @Element(required = false)
  public Integer recentCount = 10;
  
  @ElementList(required = false)
  private List<Project> projects = new ArrayList<>();
  
  public void setRecentCount(Integer recentCount) {
    this.recentCount = recentCount;
    this.checkLength();
  }
  
  public void addRecent(Project project) {
    this.projects.add(project);
    this.checkLength();
  }
  
  public void removeRecent(Project project) {
    this.projects.remove(project);
  }
  
  public List<Project> getRecents() {
    List<Project> ret = new ArrayList<>();
    for(Project p: this.projects)
      ret.add(0, p);
    return ret;
  }
  
  private void checkLength() {
    while(projects.size() > this.recentCount)
      projects.remove(0);
  }
}

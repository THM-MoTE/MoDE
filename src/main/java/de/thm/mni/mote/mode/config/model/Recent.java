package de.thm.mni.mote.mode.config.model;

import de.thm.mni.mote.mode.util.Utilities;
import lombok.*;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by hobbypunk on 11.09.16.
 */

@Getter
@Setter
@ToString
public class Recent {
  @Element(required = false)
  private Path lastPath = Utilities.getHome();
  
  @Element(required = false)
  private Integer count = 10;
  
  @ElementList(required = false)
  @Getter(AccessLevel.PRIVATE) @Setter(AccessLevel.PRIVATE) private List<Path> projects = new ArrayList<>();
  
  public Path getLastPath() {
    if (!(Files.exists(lastPath) && Files.isDirectory(lastPath)))
      lastPath = Utilities.getHome();
    return lastPath;
  }
  
  public void add(Path project) {
    this.projects.add(project);
    this.setLastPath(project.getParent());
    this.checkLength();
  }
  
  public void remove(Path project) {
    if (this.projects.contains(project)) {
      this.projects.remove(project);
    }
  }
  
  public List<Path> getAll() {
    List<Path> ret = new ArrayList<>();
    for (Path p : this.projects)
      ret.add(0, p);
    return ret;
  }
  
  private void checkLength() {
    while (projects.size() > this.count)
      projects.get(0);
  }
}

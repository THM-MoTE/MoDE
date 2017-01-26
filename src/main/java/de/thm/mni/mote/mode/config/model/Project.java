package de.thm.mni.mote.mode.config.model;

import de.thm.mni.mote.mode.config.Settings;
import de.thm.mni.mote.mode.config.xml.MyMatcher;
import lombok.*;
import lombok.experimental.Accessors;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Serializer;
import org.simpleframework.xml.core.Persister;

import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


/**
 * Created by hobbypunk on 11.09.16.
 */
@Getter
@Accessors(chain = true)
@NoArgsConstructor
public class Project extends MyObservable {
  @Setter private Path projectPath;
  @Element
  @NonNull private String name;
  @Element
  @NonNull private Path moFile;
  @Element
  @NonNull private Date lastOpened;
  @ElementList(required = false)
  @NonNull private List<String> systemLibraries = new ArrayList<>();
  
  @Builder
  public Project(String name, Path moFile, Path projectPath, @Singular List<String> systemLibraries) {
    this.name = name;
    this.moFile = moFile;
    this.projectPath = projectPath;
    this.lastOpened = new Date();
    this.systemLibraries.clear();
    this.systemLibraries.addAll(systemLibraries);
  }
  
  public void updateLastOpened() {
    this.lastOpened = new Date();
  }
  
  public void save() throws Exception {
    
    Serializer serializer = new Persister(new MyMatcher());
    serializer.write(this, this.projectPath.toFile());
    Settings.load().getRecent().remove(this.getProjectPath());
    Settings.load().getRecent().add(this.getProjectPath());
    Settings.load().save();
  }
  
  @Override
  public String toString() {
    return String.format("{ name: %s, moFile: %s, lastOpened: %s }", name, moFile, lastOpened);
  }
  
  public static Project load(Path projectFile) throws Exception {
    Serializer serializer = new Persister(new MyMatcher());
    return serializer.read(Project.class, projectFile.toFile()).setProjectPath(projectFile);
  }
}

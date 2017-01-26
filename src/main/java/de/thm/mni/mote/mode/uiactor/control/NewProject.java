package de.thm.mni.mote.mode.uiactor.control;

import de.thm.mni.mote.mode.config.model.Project;
import javafx.beans.property.BooleanProperty;

/**
 * Created by hobbypunk on 26.01.17.
 */
public interface NewProject {
  
  BooleanProperty getIsValidProperty();
  
  void setProjectBuilder(Project.ProjectBuilder builder);
  
  Project.ProjectBuilder getProjectBuilder();
}

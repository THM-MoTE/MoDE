package de.thm.mni.mote.mode.frontend.dialogs.controllers;

import de.thm.mni.mote.mode.frontend.welcome.fragments.controllers.SelectProjectLibsController;
import javafx.fxml.FXML;

import java.nio.file.Path;
import java.util.List;

/**
 * Created by Marcel Hoppe on 03.02.17.
 */
public class ChangeProjectLibrariesDialogController {
  
  @FXML private SelectProjectLibsController selectProjectLibsController;
  
  public void setLibraries(List<Path> libraries) {
    selectProjectLibsController.setLibraries(libraries);
  }
  
  public List<Path> getLibraries() {
    return selectProjectLibsController.getLibraries();
  }
}

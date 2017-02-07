package de.thm.mni.mote.mode.uiactor.controller.dialogs;

import de.thm.mni.mote.mode.uiactor.controller.fragments.SelectProjectLibsController;
import javafx.fxml.FXML;

import java.nio.file.Path;
import java.util.List;

/**
 * Created by hobbypunk on 03.02.17.
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

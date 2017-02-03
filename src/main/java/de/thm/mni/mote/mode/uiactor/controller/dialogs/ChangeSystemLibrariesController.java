package de.thm.mni.mote.mode.uiactor.controller.dialogs;

import de.thm.mni.mote.mode.uiactor.control.SelectLibsControl;
import javafx.fxml.FXML;

import java.util.List;

/**
 * Created by hobbypunk on 03.02.17.
 */
public class ChangeSystemLibrariesController<T extends Comparable<T>> {
  
  @FXML private SelectLibsControl<T> selectLibsController;
  
  public void setLists(List<T> available, List<T> selected) {
    selectLibsController.setLists(available, selected);
  }
  
  public List<T> getAvailable() {
    return selectLibsController.getAvailable();
  }
  
  public List<T> getSelected() {
    return selectLibsController.getSelected();
  }
}

package de.thm.mni.mote.mode.uiactor.controller.dialogs;

import de.thm.mni.mote.mode.uiactor.controller.fragments.SelectSystemLibsController;
import javafx.fxml.FXML;

import java.util.List;

/**
 * Created by hobbypunk on 03.02.17.
 */
public class ChangeSystemLibrariesDialogController<T extends Comparable<T>> {
  
  @FXML private SelectSystemLibsController<T> selectSystemLibsController;
  
  public void setLists(List<T> available, List<T> selected) {
    selectSystemLibsController.setLists(available, selected);
  }
  
  public List<T> getAvailable() {
    return selectSystemLibsController.getAvailable();
  }
  
  public List<T> getSelected() {
    return selectSystemLibsController.getSelected();
  }
}

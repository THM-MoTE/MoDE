package de.thm.mni.mote.mode.uiactor.handlers;

import de.thm.mni.mote.mode.modelica.MoContainer;
import de.thm.mni.mote.mode.uiactor.control.MainTabControl;
import de.thm.mni.mote.mode.uiactor.editor.statemachine.elements.ModifyableFXMoDiagramMoGroup;
import javafx.geometry.Point2D;
import javafx.scene.control.TabPane;

/**
 * Created by hobbypunk on 22.11.16.
 */
public class LibraryHandler {
  private static LibraryHandler ourInstance = new LibraryHandler();
  
  public static LibraryHandler getInstance() {
    return ourInstance;
  }
  
  private LibraryHandler() {
  }
  
  public void handleMenu(TabPane tabPane, MoContainer container, String action) {
    if (action.startsWith("add_new")) {
      if (action.endsWith("package")) {
        System.out.println("New Package!");
      } else if (action.endsWith("model")) {
        System.out.println("New Model!");
      }
    } else if (action.startsWith("open_as_")) {
      
      MainTabControl tab;
      if(action.endsWith("diagram"))
        tab = new MainTabControl(container);
      else
        tab = new MainTabControl(container, true);
      
      tabPane.getTabs().add(tab);
      tab.lateInitialize(tabPane.getScene());
  
      if (tabPane.getSelectionModel().getSelectedItem() == null)
        tabPane.getSelectionModel().clearSelection();
      tabPane.getSelectionModel().select(tab);
  
    } else if (action.equals("add_to_diagram")) {
      MainTabControl tab = (MainTabControl) tabPane.getSelectionModel().getSelectedItem();
  
      ModifyableFXMoDiagramMoGroup mmdg = (ModifyableFXMoDiagramMoGroup) tabPane.getScene().lookup("#" + tab.getData().getName().replaceAll("\\.", "_"));
  
      mmdg.addNewVariable(container, new Point2D(0, 0));
    }
  }
}

package de.thm.mni.mhpp11.control.icon.handlers;

import de.thm.mni.mhpp11.control.MainTabControl;
import de.thm.mni.mhpp11.util.parser.models.MoClass;
import javafx.scene.control.Tab;
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
  
  public void handleMenu(TabPane tabPane, MoClass selectedClass, String action) {
    System.out.println(action);
    if (action.startsWith("open.as")) {
      Tab tab;
      if (action.equals("open.as.diagram"))
        tab = new MainTabControl(selectedClass, true);
      else
        tab = new MainTabControl(selectedClass, false);
      tabPane.getTabs().add(tab);
      tabPane.getSelectionModel().select(tab);
    }
  }
}

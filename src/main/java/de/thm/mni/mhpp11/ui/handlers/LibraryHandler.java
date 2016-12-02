package de.thm.mni.mhpp11.ui.handlers;

import de.thm.mni.mhpp11.modelica.MoClass;
import de.thm.mni.mhpp11.modelica.MoVariable;
import de.thm.mni.mhpp11.modelica.annotations.MoPlacement;
import de.thm.mni.mhpp11.modelica.graphics.MoCoordinateSystem;
import de.thm.mni.mhpp11.modelica.graphics.MoTransformation;
import de.thm.mni.mhpp11.ui.control.MainTabControl;
import javafx.geometry.Point2D;
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
    } else if (action.equals("add.to.diagram")) {
      MainTabControl tab = (MainTabControl) tabPane.getSelectionModel().getSelectedItem();
    
      Integer counter = 0;
      for (MoVariable mv : tab.getData().getVariables()) {
        if (mv.getName().equals(selectedClass.getSimpleName().toLowerCase() + "_" + counter)) counter++;
      }
      //todo: add placement to variable
      MoVariable mv = new MoVariable(tab.getData(), selectedClass, selectedClass.getSimpleName().toLowerCase() + "_" + counter);
      MoCoordinateSystem mcs = mv.getType().getDiagramCoordinateSystem();
      Point2D first = mcs.getExtent().get(0).get().multiply(0.1);
      Point2D second = mcs.getExtent().get(1).get().multiply(0.1);
    
      MoTransformation trans = new MoTransformation(first, second, new Point2D(0, 0), 0.);
      mv.add(new MoPlacement(true, null, trans));
      tab.getData().addVariable(mv);
    }
  }
}

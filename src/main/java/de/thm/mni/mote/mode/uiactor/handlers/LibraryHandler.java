package de.thm.mni.mote.mode.uiactor.handlers;

import de.thm.mni.mote.mode.modelica.MoContainer;
import de.thm.mni.mote.mode.modelica.MoVariable;
import de.thm.mni.mote.mode.modelica.annotations.MoPlacement;
import de.thm.mni.mote.mode.modelica.graphics.MoCoordinateSystem;
import de.thm.mni.mote.mode.modelica.graphics.MoSimpleExtent;
import de.thm.mni.mote.mode.modelica.graphics.MoTransformation;
import de.thm.mni.mote.mode.uiactor.control.MainTabControl;
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
    } else if (action.equals("open_as_diagram")) {
      MainTabControl tab = new MainTabControl(container);
      tabPane.getTabs().add(tab);
      tab.lateInitialize(tabPane.getScene());
    
      if (tabPane.getSelectionModel().getSelectedItem() == null)
        tabPane.getSelectionModel().clearSelection();
      tabPane.getSelectionModel().select(tab);
  
    } else if (action.equals("add_to_diagram")) {
      MainTabControl tab = (MainTabControl) tabPane.getSelectionModel().getSelectedItem();
  
      Integer counter = 0;
      for (MoVariable mv : tab.getData().getElement().getVariables()) {
        if (mv.getName().equals(container.getSimpleName().toLowerCase() + "_" + counter)) counter++;
      }
  
      MoVariable mv = new MoVariable(tab.getData().getElement(), container, container.getSimpleName().toLowerCase() + "_" + counter);
      MoCoordinateSystem mcs = mv.getType().getElement().getDiagramCoordinateSystem();
  
      MoTransformation trans = new MoTransformation(new Point2D(0, 0), (MoSimpleExtent) mcs.getExtent(), mcs.getInitialScale().get(), 0.);
      mv.add(new MoPlacement(true, null, trans));
      tab.getData().getElement().addVariable(mv);
    }
  }
}

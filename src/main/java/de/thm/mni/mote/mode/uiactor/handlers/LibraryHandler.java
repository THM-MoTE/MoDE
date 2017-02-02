package de.thm.mni.mote.mode.uiactor.handlers;

import de.thm.mni.mote.mode.modelica.MoContainer;
import de.thm.mni.mote.mode.modelica.MoVariable;
import de.thm.mni.mote.mode.modelica.annotations.MoPlacement;
import de.thm.mni.mote.mode.modelica.graphics.MoCoordinateSystem;
import de.thm.mni.mote.mode.modelica.graphics.MoTransformation;
import de.thm.mni.mote.mode.parser.ParserException;
import de.thm.mni.mote.mode.uiactor.control.MainTabControl;
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
  
  public void handleMenu(TabPane tabPane, MoContainer container, String action) throws ParserException {
    if (action.startsWith("open_as")) {
      Tab tab;
      if (action.equals("open_as_diagram"))
        tab = new MainTabControl(container, true);
      else
        tab = new MainTabControl(container, false);
      tabPane.getTabs().add(tab);
      tabPane.getSelectionModel().select(tab);
    } else if (action.equals("add_to_diagram")) {
      MainTabControl tab = (MainTabControl) tabPane.getSelectionModel().getSelectedItem();
  
      Integer counter = 0;
      for (MoVariable mv : tab.getData().getElement().getVariables()) {
        if (mv.getName().equals(container.getSimpleName().toLowerCase() + "_" + counter)) counter++;
      }
      //todo: add placement to variable
      MoVariable mv = new MoVariable(tab.getData().getElement(), container, container.getSimpleName().toLowerCase() + "_" + counter);
      MoCoordinateSystem mcs = mv.getType().getElement().getDiagramCoordinateSystem();
      Point2D first = mcs.getExtent().get(0).get().multiply(0.1);
      Point2D second = mcs.getExtent().get(1).get().multiply(0.1);
  
      MoTransformation trans = new MoTransformation(first, second, new Point2D(0, 0), 0.);
      mv.add(new MoPlacement(true, null, trans));
      tab.getData().getElement().addVariable(mv);
    }
  }
}

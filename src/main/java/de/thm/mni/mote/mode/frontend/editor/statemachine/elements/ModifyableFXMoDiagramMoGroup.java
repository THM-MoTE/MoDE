package de.thm.mni.mote.mode.frontend.editor.statemachine.elements;

import de.thm.mni.mote.mode.frontend.controls.modelica.FXMoDiagramMoGroup;
import de.thm.mni.mote.mode.frontend.editor.actionmanager.ActionManager;
import de.thm.mni.mote.mode.frontend.editor.actionmanager.commands.DeleteCommand;
import de.thm.mni.mote.mode.frontend.editor.actionmanager.elements.ModifyableMoClass;
import de.thm.mni.mote.mode.frontend.editor.elementmanager.ElementManager;
import de.thm.mni.mote.mode.frontend.editor.statemachine.interfaces.Zoomable;
import de.thm.mni.mote.mode.frontend.utilities.Constants;
import de.thm.mni.mote.mode.modelica.MoContainer;
import de.thm.mni.mote.mode.modelica.MoVariable;
import de.thm.mni.mote.mode.modelica.annotations.MoPlacement;
import de.thm.mni.mote.mode.modelica.graphics.MoCoordinateSystem;
import de.thm.mni.mote.mode.modelica.graphics.MoSimpleExtent;
import de.thm.mni.mote.mode.modelica.graphics.MoTransformation;
import javafx.geometry.Bounds;
import javafx.geometry.Point2D;
import javafx.scene.Group;
import javafx.scene.control.ScrollPane;
import javafx.scene.input.Dragboard;
import javafx.scene.input.ScrollEvent;
import javafx.scene.input.TransferMode;

/**
 * Created by Marcel Hoppe on 15.02.17.
 */
public class ModifyableFXMoDiagramMoGroup extends FXMoDiagramMoGroup implements Zoomable {
  
  protected ModifyableFXMoDiagramMoGroup(MoContainer container) {
    super(container);
    initDragNDrop();
  }
  
  @Override
  public void zoom(ScrollEvent event) {
    Double delta = Math.max(event.getDeltaX(), event.getDeltaY());
    if (delta == 0) delta = Math.min(event.getDeltaX(), event.getDeltaY());
    Group group = (Group) this.getParent().getParent();
    ScrollPane pane = (ScrollPane) this.getParent().getParent().getParent().getParent().getParent(); //long way down...
  
  
    Bounds groupBounds = group.getLayoutBounds();
    final Bounds viewportBounds = pane.getViewportBounds();
  
    // calculate pixel offsets from [0, 1] range
    double valX = pane.getHvalue() * (groupBounds.getWidth() - viewportBounds.getWidth());
    double valY = pane.getVvalue() * (groupBounds.getHeight() - viewportBounds.getHeight());
  
    // convert content coordinates to zoomTarget coordinates
    Point2D posInZoomTarget = this.parentToLocal(group.parentToLocal(new Point2D(event.getX(), event.getY())));
  
    // calculate adjustment of scroll position (pixels)
    Point2D adjustment = this.getLocalToParentTransform().deltaTransform(posInZoomTarget.multiply(this.getScaleFactor(delta > 0) - 1));
  
    // do the resizing
    this.scaleDelta(delta > 0);
  
    // refresh ScrollPane scroll positions & content bounds
    pane.layout();
  
    // convert back to [0, 1] range
    // (too large/small values are automatically corrected by ScrollPane)
    groupBounds = this.getLayoutBounds();
    pane.setHvalue((valX + adjustment.getX()) / (groupBounds.getWidth() - viewportBounds.getWidth()));
    pane.setVvalue((valY + adjustment.getY()) / (groupBounds.getHeight() - viewportBounds.getHeight()));
  
  
  }
  
  private void initDragNDrop() {
    this.getBasis().getChildren().get(0).setOnDragOver(event -> {
      Dragboard db = event.getDragboard();
      if (db.hasContent(Constants.MOCONTAINER))
        event.acceptTransferModes(TransferMode.COPY);
    });
    
    this.getBasis().getChildren().get(0).setOnDragDropped(event -> {
      Dragboard db = event.getDragboard();
      
      
      if (db.hasContent(Constants.MOCONTAINER)) {
        MoContainer container = MoContainer.staticFind((String) db.getContent(Constants.MOCONTAINER));
        if (container != null) {
          
          System.out.println("Dropped: " + container.getName());
          
          addNewVariable(container, this.convertTo(new Point2D(event.getSceneX(), event.getSceneY())));
          
          event.setDropCompleted(true);
          return;
        }
      }
      
      event.setDropCompleted(false);
    });
  }
  
  
  public void addNewVariable(MoContainer variable, Point2D pos) {
    Integer counter = 0;
    for (MoVariable mv : this.getThat().getElement().getVariables()) {
      if (mv.getName().equals(variable.getSimpleName().toLowerCase() + "_" + counter)) counter++;
    }
    
    MoVariable mv = new MoVariable(this.getThat().getElement(), variable, variable.getSimpleName().toLowerCase() + "_" + counter);
    MoCoordinateSystem mcs = mv.getType().getElement().getDiagramCoordinateSystem();
    
    MoTransformation trans = new MoTransformation(pos, (MoSimpleExtent) mcs.getExtent(), mcs.getInitialScale().get(), 0.);
    
    mv.add(new MoPlacement(true, null, trans));
    ElementManager.getInstanceManager().getActive().clearSelectedElement();
    this.getThat().getElement().addVariable(mv);
    ActionManager.getInstanceManager().getActive().addUndo(new DeleteCommand(new ModifyableMoClass(this.getThat().getElement()), mv));
  }
  
}

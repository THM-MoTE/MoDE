package de.thm.mni.mote.mode.uiactor.editor.elementmanager.elements;

import de.thm.mni.mote.mode.modelica.MoVariable;
import de.thm.mni.mote.mode.modelica.graphics.MoCoordinateSystem;
import de.thm.mni.mote.mode.uiactor.control.modelica.MoDiagramGroup;
import de.thm.mni.mote.mode.uiactor.editor.elementmanager.interfaces.Hoverable;
import de.thm.mni.mote.mode.uiactor.editor.elementmanager.interfaces.Selectable;
import de.thm.mni.mote.mode.uiactor.editor.statemachine.elements.ModifyableCircle;
import de.thm.mni.mote.mode.uiactor.editor.statemachine.elements.ModifyableMoIconGroup;
import javafx.scene.paint.Color;

/**
 * Created by hobbypunk on 13.02.17.
 */
public class ManagedMoIconGroup extends ModifyableMoIconGroup implements Hoverable, Selectable {
  private final ModifyableCircle[] corners = new ModifyableCircle[4];
  
  public ManagedMoIconGroup(MoDiagramGroup diagramParent, MoVariable variable, Boolean iconOnly) {
    super(diagramParent, variable.getType(), variable, iconOnly);
    MoCoordinateSystem mcs = this.getMoClass().getIconCoordinateSystem();
    corners[0] = new ModifyableCircle(this, mcs.getExtent().get(0).get().getX(), mcs.getExtent().get(0).get().getY(), 0);
    corners[1] = new ModifyableCircle(this, mcs.getExtent().get(1).get().getX(), mcs.getExtent().get(0).get().getY(), 1);
    corners[2] = new ModifyableCircle(this, mcs.getExtent().get(0).get().getX(), mcs.getExtent().get(1).get().getY(), 2);
    corners[3] = new ModifyableCircle(this, mcs.getExtent().get(1).get().getX(), mcs.getExtent().get(1).get().getY(), 3);
  }
  
  @Override
  public void enterSelection() {
    this.getCoordianteSystem().setStroke(Color.RED);
    this.getCoordianteSystem().setOpacity(1);
    this.getChildren().addAll(corners);
  }
  
  @Override
  public void leaveSelection() {
    this.getChildren().removeAll(corners);
    this.getCoordianteSystem().setStroke(null);
  }
  
  @Override
  public void enterHover() {
    this.getCoordianteSystem().setStroke(Color.LIGHTCORAL);
    this.getCoordianteSystem().setOpacity(1);
  }
  
  @Override
  public void leaveHover() {
    this.getCoordianteSystem().setStroke(null);
  }
}

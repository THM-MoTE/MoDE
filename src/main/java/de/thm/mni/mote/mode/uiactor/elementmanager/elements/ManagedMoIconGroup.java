package de.thm.mni.mote.mode.uiactor.elementmanager.elements;

import de.thm.mni.mote.mode.modelica.MoVariable;
import de.thm.mni.mote.mode.uiactor.control.modelica.MoDiagramGroup;
import de.thm.mni.mote.mode.uiactor.elementmanager.interfaces.Hoverable;
import de.thm.mni.mote.mode.uiactor.elementmanager.interfaces.Selectable;
import de.thm.mni.mote.mode.uiactor.statemachine.elements.ModifyableMoIconGroup;
import javafx.scene.paint.Color;

/**
 * Created by hobbypunk on 13.02.17.
 */
public class ManagedMoIconGroup extends ModifyableMoIconGroup implements Hoverable, Selectable {
  
  public ManagedMoIconGroup(MoDiagramGroup diagramParent, MoVariable variable, Boolean iconOnly) {
    super(diagramParent, variable.getType(), variable, iconOnly);
  }
  
  @Override
  public void enterSelection() {
    this.getCoordianteSystem().setStroke(Color.RED);
    this.getCoordianteSystem().setOpacity(1);
  }
  
  @Override
  public void leaveSelection() {
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

package de.thm.mni.mote.mode.uiactor.elementmanager.elements;

import de.thm.mni.mote.mode.modelica.MoVariable;
import de.thm.mni.mote.mode.uiactor.elementmanager.interfaces.Highlightable;
import javafx.scene.paint.Color;

/**
 * Created by hobbypunk on 13.02.17.
 */
public class ManagedMoIconConnectorGroup extends ManagedMoIconGroup implements Highlightable {
  
  public ManagedMoIconConnectorGroup(MoVariable variable, Boolean iconOnly) {
    super(variable, iconOnly);
  }
  
  @Override
  public void enterSelection() {
    this.getCoordianteSystem().setStroke(Color.BLUE);
    this.getCoordianteSystem().setOpacity(1);
  }
  
  @Override
  public void enterHighlight() {
    this.getCoordianteSystem().setStroke(Color.DEEPSKYBLUE);
    this.getCoordianteSystem().setOpacity(1);
  }
  
  @Override
  public void leaveHighlight() {
    this.getCoordianteSystem().setStroke(null);
  }
}

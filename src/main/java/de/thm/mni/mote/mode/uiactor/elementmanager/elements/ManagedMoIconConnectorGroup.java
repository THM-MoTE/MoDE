package de.thm.mni.mote.mode.uiactor.elementmanager.elements;

import de.thm.mni.mote.mode.modelica.MoVariable;
import de.thm.mni.mote.mode.uiactor.control.modelica.MoDiagramGroup;
import de.thm.mni.mote.mode.uiactor.elementmanager.interfaces.Highlightable;
import de.thm.mni.mote.mode.uiactor.elementmanager.interfaces.Hoverable;
import de.thm.mni.mote.mode.uiactor.elementmanager.interfaces.Selectable;
import de.thm.mni.mote.mode.uiactor.statemachine.elements.ModifyableMoIconConnectorGroup;
import javafx.scene.effect.DropShadow;
import javafx.scene.paint.Color;

/**
 * Created by hobbypunk on 13.02.17.
 */
public class ManagedMoIconConnectorGroup extends ModifyableMoIconConnectorGroup implements Highlightable, Hoverable, Selectable {
  
  public ManagedMoIconConnectorGroup(MoDiagramGroup moParent, MoVariable variable, Boolean iconOnly) {
    super(moParent, variable, iconOnly);
  }
  
  @Override
  public void enterSelection() {
    this.setEffect(new DropShadow(10., Color.RED));
  }
  
  @Override
  public void leaveSelection() {
    this.setEffect(null);
  }
  
  @Override
  public void enterHover() {
    this.setEffect(new DropShadow(10., Color.CORAL));
  }
  
  @Override
  public void leaveHover() {
    this.setEffect(null);
  }
  
  @Override
  public void enterHighlight() {
    this.setEffect(new DropShadow(10., Color.DEEPSKYBLUE));
  }
  
  @Override
  public void leaveHighlight() {
    this.setEffect(null);
  }
}

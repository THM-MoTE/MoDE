package de.thm.mni.mote.mode.uiactor.editor.elementmanager.elements;

import de.thm.mni.mote.mode.modelica.MoVariable;
import de.thm.mni.mote.mode.uiactor.control.modelica.MoVariableIconGroup;
import de.thm.mni.mote.mode.uiactor.editor.elementmanager.interfaces.Highlightable;
import de.thm.mni.mote.mode.uiactor.editor.elementmanager.interfaces.Hoverable;
import de.thm.mni.mote.mode.uiactor.editor.elementmanager.interfaces.Selectable;
import de.thm.mni.mote.mode.uiactor.editor.statemachine.elements.ModifyableMoConnectorIconGroup;
import javafx.scene.effect.DropShadow;
import javafx.scene.paint.Color;

/**
 * Created by hobbypunk on 13.02.17.
 */
public class ManagedMoConnectorIconGroup extends ModifyableMoConnectorIconGroup implements Highlightable, Hoverable, Selectable {
  
  public ManagedMoConnectorIconGroup(MoVariableIconGroup moParent, MoVariable variable) {
    super(moParent, variable);
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
    this.setEffect(new DropShadow(15., Color.PURPLE));
  }
  
  @Override
  public void leaveHighlight() {
    this.setEffect(null);
  }
}

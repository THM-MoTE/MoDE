package de.thm.mni.mote.mode.frontend.editor.elementmanager.elements;

import de.thm.mni.mote.mode.modelica.MoVariable;
import de.thm.mni.mote.mode.modelica.graphics.MoCoordinateSystem;
import de.thm.mni.mote.mode.frontend.controls.modelica.FXMoDiagramMoGroup;
import de.thm.mni.mote.mode.frontend.editor.elementmanager.interfaces.Hoverable;
import de.thm.mni.mote.mode.frontend.editor.elementmanager.interfaces.Selectable;
import de.thm.mni.mote.mode.frontend.editor.statemachine.elements.ModifyableCircle;
import de.thm.mni.mote.mode.frontend.editor.statemachine.elements.ModifyableFXMoVariableIconMoGroup;
import javafx.scene.Node;
import javafx.scene.paint.Color;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by hobbypunk on 13.02.17.
 */
public class ManagedFXMoVariableIconMoGroup extends ModifyableFXMoVariableIconMoGroup implements Hoverable, Selectable {
  private final ModifyableCircle[] corners = new ModifyableCircle[1];
  
  public ManagedFXMoVariableIconMoGroup(FXMoDiagramMoGroup diagramParent, MoVariable variable) {
    super(diagramParent, variable.getType(), variable);
    MoCoordinateSystem mcs = this.getMoClass().getIconCoordinateSystem();
//    corners[0] = new ModifyableCircle(this, mcs.getExtent().getP1().getX(), mcs.getExtent().getP1().getY(), ModifyableCircle.MODIFY_X_OFFSET | ModifyableCircle.MODIFY_Y_OFFSET);
    corners[0] = new ModifyableCircle(this, mcs.getExtent().getP2().getX(), mcs.getExtent().getP1().getY(), ModifyableCircle.MODIFY_Y_OFFSET);
//    corners[0] = new ModifyableCircle(this, mcs.getExtent().getP1().getX(), mcs.getExtent().getP2().getY(), ModifyableCircle.MODIFY_X_OFFSET);
//    corners[0] = new ModifyableCircle(this, mcs.getExtent().getP2().getX(), mcs.getExtent().getP2().getY(), ModifyableCircle.MODIFY_NO_OFFSET);
  }
  
  @Override
  public void toFront() {
    super.toFront();
    for (ModifyableCircle c : corners) {
      c.toFront();
    }
  }
  
  @Override
  public void enterSelection() {
    this.getCoordianteSystem().setStroke(Color.RED);
    this.getCoordianteSystem().setOpacity(1);
    if (!getChildren().containsAll(Arrays.asList(corners)))
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
  
  List<ManagedFXMoConnectorIconMoGroup> collectConnectors() {
    List<ManagedFXMoConnectorIconMoGroup> connectors = new ArrayList<>();
    for (Node child : this.getChildren())
      if (child instanceof ManagedFXMoConnectorIconMoGroup)
        connectors.add((ManagedFXMoConnectorIconMoGroup) child);
    
    return connectors;
  }
}

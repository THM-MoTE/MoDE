package de.thm.mni.mote.mode.uiactor.editor.elementmanager.elements;

import de.thm.mni.mote.mode.modelica.MoVariable;
import de.thm.mni.mote.mode.uiactor.control.modelica.MoDiagramGroup;
import de.thm.mni.mote.mode.uiactor.editor.elementmanager.interfaces.Hoverable;
import de.thm.mni.mote.mode.uiactor.editor.elementmanager.interfaces.Selectable;
import de.thm.mni.mote.mode.uiactor.editor.statemachine.elements.ModifyableMoIconGroup;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;

/**
 * Created by hobbypunk on 13.02.17.
 */
public class ManagedMoIconGroup extends ModifyableMoIconGroup implements Hoverable, Selectable {
  private final Circle[] corners = new Circle[4];
  
  public ManagedMoIconGroup(MoDiagramGroup diagramParent, MoVariable variable, Boolean iconOnly) {
    super(diagramParent, variable.getType(), variable, iconOnly);
    Rectangle rect = this.getCoordianteSystem();
    corners[0] = new Circle(rect.getX(), rect.getY(), 10);
    corners[1] = new Circle(rect.getX() + rect.getWidth(), rect.getY(), 10);
    corners[2] = new Circle(rect.getX(), rect.getY() + rect.getHeight(), 10);
    corners[3] = new Circle(rect.getX() + rect.getWidth(), rect.getY() + rect.getHeight(), 10);
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

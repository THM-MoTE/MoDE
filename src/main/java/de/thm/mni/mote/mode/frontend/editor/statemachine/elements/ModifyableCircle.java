package de.thm.mni.mote.mode.frontend.editor.statemachine.elements;

import de.thm.mni.mote.mode.frontend.editor.actionmanager.commands.Command;
import de.thm.mni.mote.mode.frontend.editor.statemachine.StateMachine;
import de.thm.mni.mote.mode.frontend.editor.statemachine.interfaces.Resizeable;
import de.thm.mni.mote.mode.frontend.editor.statemachine.interfaces.Rotateable;
import javafx.scene.input.InputEvent;
import javafx.scene.shape.Circle;

/**
 * Created by hobbypunk on 22.02.17.
 */
public class ModifyableCircle extends Circle implements Rotateable, Resizeable {
  
  public static final int MODIFY_NO_OFFSET = 0;
  public static final int MODIFY_X_OFFSET = 1;
  public static final int MODIFY_Y_OFFSET = 2;
  
  private static final Double RADIUS = 10.;
  
  private final ModifyableFXMoVariableIconMoGroup parent;
  private Integer buttonId;
  
  public ModifyableCircle(ModifyableFXMoVariableIconMoGroup parent, Double centerX, Double centerY, Integer buttonId) {
    super(centerX, centerY, RADIUS);
    this.parent = parent;
    this.buttonId = buttonId;
  }
  
  @Override//TODO: update connections!
  public Command rotate(StateMachine sm, InputEvent inputEvent) {
    return parent.rotate(sm, inputEvent);
  }
  
  @Override
  public Command resize(StateMachine sm, InputEvent inputEvent) {
    return parent.resize(sm, inputEvent, buttonId);
  }
}

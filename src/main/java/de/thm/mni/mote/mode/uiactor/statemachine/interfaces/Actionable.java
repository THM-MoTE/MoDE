package de.thm.mni.mote.mode.uiactor.statemachine.interfaces;

import de.thm.mni.mote.mode.uiactor.statemachine.StateMachine;
import javafx.scene.input.InputEvent;

/**
 * Created by hobbypunk on 16.02.17.
 */
public interface Actionable {
  
  Boolean action(StateMachine sm, InputEvent inputEvent);
}

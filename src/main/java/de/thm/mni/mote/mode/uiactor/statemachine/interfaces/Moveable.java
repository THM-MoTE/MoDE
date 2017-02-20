package de.thm.mni.mote.mode.uiactor.statemachine.interfaces;

import de.thm.mni.mote.mode.uiactor.statemachine.StateMachine;
import javafx.scene.input.InputEvent;

/**
 * Created by hobbypunk on 15.02.17.
 */
public interface Moveable {
  Boolean move(StateMachine sm, InputEvent event);
}

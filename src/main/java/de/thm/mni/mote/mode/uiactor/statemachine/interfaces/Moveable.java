package de.thm.mni.mote.mode.uiactor.statemachine.interfaces;

import javafx.scene.input.InputEvent;

/**
 * Created by hobbypunk on 15.02.17.
 */
public interface Moveable {
  
  Boolean moveDrag(InputEvent event);
  
  Boolean moveDrop(InputEvent event);
}

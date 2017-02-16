package de.thm.mni.mote.mode.uiactor.statemachine.states.impl;

import de.thm.mni.mote.mode.uiactor.statemachine.StateMachine;
import de.thm.mni.mote.mode.uiactor.statemachine.interfaces.Moveable;
import de.thm.mni.mote.mode.uiactor.statemachine.states.State;
import javafx.application.Platform;
import javafx.scene.Cursor;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.input.InputEvent;
import javafx.scene.input.MouseEvent;

/**
 * Created by hobbypunk on 15.02.17.
 */
public class MoveState extends State {
  @Override
  public void enter(Scene scene) {
    Platform.runLater(() -> scene.setCursor(Cursor.MOVE));
  }
  
  @Override
  public boolean handle(StateMachine sm, Node target, InputEvent event) {
    if (target != null && target instanceof Moveable) {
      Moveable mv = (Moveable) target;
      
      if (event.getEventType().equals(MouseEvent.MOUSE_PRESSED) || event.getEventType().equals(MouseEvent.MOUSE_DRAGGED)) {
        return mv.moveDrag(event);
      } else if (event.getEventType().equals(MouseEvent.MOUSE_RELEASED)) {
        return mv.moveDrop(event);
      }
    }
    return false;
    
  }
}

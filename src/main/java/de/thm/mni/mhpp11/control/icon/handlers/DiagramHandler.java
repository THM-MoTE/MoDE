package de.thm.mni.mhpp11.control.icon.handlers;

import de.thm.mni.mhpp11.control.icon.MoDiagramGroup;
import de.thm.mni.mhpp11.statemachine.states.State;
import de.thm.mni.mhpp11.statemachine.states.ZoomState;
import javafx.event.Event;
import javafx.scene.input.MouseEvent;
import javafx.scene.input.ScrollEvent;

/**
 * Created by hobbypunk on 16.11.16.
 */
public class DiagramHandler extends StateHandler<Event> {
  State<ScrollEvent> zoomState;
  
  public DiagramHandler(MoDiagramGroup source) {
    super(null);
    zoomState = new ZoomState(source);
  }
  
  @Override
  public void handle(Event event) {
    if (event.getEventType().equals(MouseEvent.MOUSE_CLICKED) || event.getEventType().equals(MouseEvent.MOUSE_EXITED)) {
      event.consume();
      getSm().switchToNoState();
    } else if (event.getEventType().equals(ScrollEvent.SCROLL) && ((ScrollEvent) event).isControlDown()) {
      event.consume();
      getSm().switchToState(zoomState);
      getSm().handle(event);
    }
  }
}

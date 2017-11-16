package de.thm.mni.mote.mode.frontend.utilities;

import javafx.event.Event;
import javafx.scene.control.ScrollPane;
import javafx.scene.input.ScrollEvent;
import lombok.experimental.UtilityClass;

/**
 * Created by hobbypunk on 15.02.17.
 */
@UtilityClass
public class ScrollPaneHorizontalScroll {
  public ScrollPane modify(ScrollPane pane) {
    pane.addEventFilter(ScrollEvent.SCROLL, e -> {
      if (e.getEventType().equals(ScrollEvent.SCROLL) && e.isShiftDown() && (e.getDeltaX() == 0 && e.getTextDeltaX() == 0)) {
        e.consume();
        ScrollEvent scrollEvent = new ScrollEvent(e.getSource(), e.getTarget(),
                                                     e.getEventType(),
                                                     e.getX(), e.getY(),
                                                     e.getScreenX(), e.getScreenY(),
                                                     false,
                                                     e.isControlDown(),
                                                     e.isAltDown(),
                                                     e.isMetaDown(),
                                                     e.isDirect(),
                                                     e.isInertia(),
                                                     e.getDeltaY(), e.getDeltaX(),
                                                     e.getTotalDeltaY(), e.getTotalDeltaX(),
                                                     e.getTextDeltaXUnits(), e.getTextDeltaY(),
                                                     e.getTextDeltaYUnits(), e.getTextDeltaX(),
                                                     e.getTouchCount(), e.getPickResult());
        Event.fireEvent(scrollEvent.getTarget(), scrollEvent);
      }
    });
    return pane;
  }
}

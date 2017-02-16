package de.thm.mni.mote.mode.uiactor.statemachine.elements;

import de.thm.mni.mhpp11.jActor.actors.logging.messages.ErrorMessage;
import de.thm.mni.mhpp11.jActor.actors.messagebus.MessageBus;
import de.thm.mni.mote.mode.modelica.MoContainer;
import de.thm.mni.mote.mode.parser.ParserException;
import de.thm.mni.mote.mode.uiactor.control.modelica.MoDiagramGroup;
import de.thm.mni.mote.mode.uiactor.statemachine.interfaces.Zoomable;
import javafx.geometry.Bounds;
import javafx.geometry.Point2D;
import javafx.scene.Group;
import javafx.scene.control.ScrollPane;
import javafx.scene.input.ScrollEvent;

/**
 * Created by hobbypunk on 15.02.17.
 */
public class ZoomableMoDiagramGroup extends MoDiagramGroup implements Zoomable {
  
  public ZoomableMoDiagramGroup(MoContainer container) throws ParserException {
    super(container);
  }
  
  @Override
  public void zoom(ScrollEvent event) {
    Double delta = Math.max(event.getDeltaX(), event.getDeltaY());
    if (delta == 0) delta = Math.min(event.getDeltaX(), event.getDeltaY());
    try {
      Group group = (Group) this.getParent().getParent();
      ScrollPane pane = (ScrollPane) this.getParent().getParent().getParent().getParent().getParent(); //long way down...
      
      
      Bounds groupBounds = group.getLayoutBounds();
      final Bounds viewportBounds = pane.getViewportBounds();
      
      // calculate pixel offsets from [0, 1] range
      double valX = pane.getHvalue() * (groupBounds.getWidth() - viewportBounds.getWidth());
      double valY = pane.getVvalue() * (groupBounds.getHeight() - viewportBounds.getHeight());
      
      // convert content coordinates to zoomTarget coordinates
      Point2D posInZoomTarget = this.parentToLocal(group.parentToLocal(new Point2D(event.getX(), event.getY())));
      
      // calculate adjustment of scroll position (pixels)
      Point2D adjustment = this.getLocalToParentTransform().deltaTransform(posInZoomTarget.multiply(this.getScaleFactor(delta > 0) - 1));
      
      // do the resizing
      this.scaleDelta(delta > 0);
      
      // refresh ScrollPane scroll positions & content bounds
      pane.layout();
      
      // convert back to [0, 1] range
      // (too large/small values are automatically corrected by ScrollPane)
      groupBounds = this.getLayoutBounds();
      pane.setHvalue((valX + adjustment.getX()) / (groupBounds.getWidth() - viewportBounds.getWidth()));
      pane.setVvalue((valY + adjustment.getY()) / (groupBounds.getHeight() - viewportBounds.getHeight()));
      
      
    } catch (ParserException e) {
      MessageBus.getInstance().send(new ErrorMessage(this.getClass(), e));
    }
  }
}

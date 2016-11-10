package de.thm.mni.mhpp11.control.icon.handlers;

import de.thm.mni.mhpp11.control.icon.MoDiagramGroup;
import de.thm.mni.mhpp11.control.icon.MoIconGroup;
import javafx.event.EventHandler;
import javafx.geometry.Point2D;
import javafx.scene.input.MouseEvent;
import javafx.scene.transform.Translate;
import lombok.Value;
import lombok.experimental.NonFinal;

/**
 * Created by hobbypunk on 08.11.16.
 */
//TODO: connections
@Value
public class MoveHandler implements EventHandler<MouseEvent> {
  @NonFinal Point2D startMousePos = null;
  @NonFinal Point2D startOrigin = null;
  Translate o;
  MoIconGroup src;
  MoDiagramGroup parent;
  
  public MoveHandler(MoDiagramGroup parent, MoIconGroup src) {
    this.src = src;
    this.parent = parent;
    this.o = src.getOrigin();
  }
  
  @Override
  public void handle(MouseEvent event) {
    if (event.getEventType().equals(MouseEvent.MOUSE_PRESSED)) {
      handlePressed(event);
    } else if (event.getEventType().equals(MouseEvent.MOUSE_RELEASED)) {
      handleRelease(event);
    } else {
      handleMove(event);
    }
  }
  
  private void handleMove(MouseEvent event) {
    if (o != null) {
      Point2D mousePos = parent.convertScenePointToDiagramPoint(event.getSceneX(), event.getSceneY());
      Point2D origin = mousePos.subtract(startMousePos).add(startOrigin);
      o.setX(origin.getX());
      o.setY(origin.getY());
      //TODO: update Connection, add a vertical and a horizontal point from on connection
    }
  }
  
  private void handlePressed(MouseEvent event) {
    src.setOpacity(0.8);
    FocusHandler.getInstance().setFocus(src);
    startMousePos = parent.convertScenePointToDiagramPoint(event.getSceneX(), event.getSceneY());
    startOrigin = new Point2D(o.getX(), o.getY());
  }
  
  private void handleRelease(MouseEvent event) {
    src.setOpacity(1.0);
  }
}

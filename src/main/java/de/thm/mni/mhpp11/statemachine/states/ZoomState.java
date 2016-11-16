package de.thm.mni.mhpp11.statemachine.states;

import de.thm.mni.mhpp11.control.icon.MoDiagramGroup;
import javafx.scene.input.ScrollEvent;

/**
 * Created by hobbypunk on 16.11.16.
 */
public class ZoomState extends State<ScrollEvent> {
  MoDiagramGroup source;
  
  public ZoomState(MoDiagramGroup source) {
    this.source = source;
  }
  
  @Override
  public void handle(ScrollEvent event) {
    Double delta = Math.max(event.getDeltaX(), event.getDeltaY());
    if (delta == 0) delta = Math.min(event.getDeltaX(), event.getDeltaY());
    source.scaleDelta(delta, delta);
  }
}

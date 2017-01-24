package de.thm.mni.mote.mode.uiactor.statemachine.states.diagram;

import de.thm.mni.mote.mode.uiactor.control.modelica.MoDiagramGroup;
import de.thm.mni.mote.mode.uiactor.statemachine.states.NoState;
import de.thm.mni.mote.mode.uiactor.statemachine.states.State;
import de.thm.mni.mote.mode.uiactor.statemachine.states.connection.ConnectionModifyState;
import de.thm.mni.mote.mode.uiactor.statemachine.states.model.ModelModifyState;
import de.thm.mni.mote.mode.uiactor.utilities.MyEvents;
import javafx.scene.input.ScrollEvent;

import java.util.Arrays;

/**
 * Created by hobbypunk on 16.11.16.
 */
public class DiagramZoomState extends State<ScrollEvent, MoDiagramGroup> {
  
  public DiagramZoomState(MoDiagramGroup source) {
    super(source);
  }
  
  @Override
  protected void initTransitions() {
    getTransitions().put(MyEvents.SCROLL_SHIFT, Arrays.asList(NoState.class, ModelModifyState.class, ConnectionModifyState.class));
  }
  
  @Override
  protected void handleScroll(ScrollEvent event) {
    Double delta = Math.max(event.getDeltaX(), event.getDeltaY());
    if (delta == 0) delta = Math.min(event.getDeltaX(), event.getDeltaY());
    getSource().scaleDelta(delta, delta);
    getMachine().switchToLastState();
  }
}

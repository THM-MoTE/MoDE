package de.thm.mni.mote.mode.uiactor.statemachine.states.model;

import de.thm.mni.mote.mode.parser.ParserException;
import de.thm.mni.mote.mode.uiactor.control.modelica.MoDiagramGroup;
import de.thm.mni.mote.mode.uiactor.control.modelica.MoIconGroup;
import de.thm.mni.mote.mode.uiactor.handlers.FocusHandler;
import de.thm.mni.mote.mode.uiactor.statemachine.states.NoState;
import de.thm.mni.mote.mode.uiactor.statemachine.states.State;
import de.thm.mni.mote.mode.uiactor.statemachine.states.connection.ConnectionCreateState;
import de.thm.mni.mote.mode.uiactor.statemachine.states.connection.ConnectionMoveState;
import de.thm.mni.mote.mode.uiactor.statemachine.states.diagram.DiagramZoomState;
import de.thm.mni.mote.mode.uiactor.utilities.MyEvents;
import javafx.scene.Cursor;
import javafx.scene.input.MouseEvent;
import lombok.AccessLevel;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;
import lombok.experimental.FieldDefaults;

import java.util.Arrays;

/**
 * Created by hobbypunk on 16.11.16.
 */

@Getter
@FieldDefaults(level = AccessLevel.PRIVATE)
@ToString
@EqualsAndHashCode(callSuper = true)
public class ModelModifyState extends State<MouseEvent, MoIconGroup> {
  
  private final MoDiagramGroup parent;
  
  public ModelModifyState(MoDiagramGroup parent, MoIconGroup source) {
    super(source);
    this.parent = parent;
  }
  
  @Override
  protected void initTransitions() {
    getTransitions().put(MyEvents.MOUSE_DOUBLE_CLICKED, Arrays.asList(ModelOpenState.class));
    getTransitions().put(MyEvents.MOUSE_CTRL_CLICKED, Arrays.asList(ModelDeleteState.class));
    getTransitions().put(MouseEvent.MOUSE_CLICKED, Arrays.asList(NoState.class, this.getClass(), ConnectionCreateState.class));
    getTransitions().put(MouseEvent.MOUSE_PRESSED, Arrays.asList(ModelMoveState.class, ConnectionMoveState.class));
    getTransitions().put(MyEvents.SCROLL_SHIFT, Arrays.asList(DiagramZoomState.class));
  }
  
  @Override
  public void enter() {
    try {
      FocusHandler.getInstance().setFocus(getSource());
    } catch (ParserException e) {
      e.printStackTrace(); //TODO send msg
    }
    this.getMachine().getScene().setCursor(Cursor.HAND);
  }
  
  @Override
  public void exit() {
    MoIconGroup source = getSource();
    FocusHandler.getInstance().clearFocus();
    if (source != null) source.setOpacity(1.0);
  }
}

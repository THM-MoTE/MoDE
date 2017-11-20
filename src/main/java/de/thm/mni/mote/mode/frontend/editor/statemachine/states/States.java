package de.thm.mni.mote.mode.frontend.editor.statemachine.states;

import de.thm.mni.mote.mode.frontend.editor.statemachine.states.impl.*;

/**
 * Created by Marcel Hoppe on 15.02.17.
 */
public class States {
  public static final State ACTION = new ActionState();
  public static final State DELETE = new DeleteState();
  public static final State MOVE = new MoveState();
  public static final State NONE = new NoneState();
  public static final State RESIZE = new ResizeState();
  public static final State ROTATE = new RotateState();
  public static final State ZOOM = new ZoomState();
}

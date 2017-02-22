package de.thm.mni.mote.mode.uiactor.editor.statemachine.states;

import lombok.AllArgsConstructor;
import lombok.ToString;

/**
 * Created by hobbypunk on 15.02.17.
 */
@AllArgsConstructor
@ToString
public class KeyState {
  public final static KeyState NONE = new KeyState("NONE");
  public final static KeyState SHORTCUT = new KeyState("SHORTCUT");
  public final static KeyState CTRL = new KeyState("CTRL");
  public final static KeyState ALT = new KeyState("ALT");
  public final static KeyState SHIFT = new KeyState("SHIFT");
  public final static KeyState META = new KeyState("META");
  
  private String value;
}

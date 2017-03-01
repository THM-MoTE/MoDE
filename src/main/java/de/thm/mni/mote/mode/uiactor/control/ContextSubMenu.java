package de.thm.mni.mote.mode.uiactor.control;

import javafx.scene.control.Menu;
import lombok.Getter;

/**
 * Created by hobbypunk on 22.11.16.
 */
@Getter
public class ContextSubMenu extends Menu implements HasAction {
  String action = "";
  
  public ContextSubMenu(String text, String action) {
    super(text);
    this.action = action;
  }
}

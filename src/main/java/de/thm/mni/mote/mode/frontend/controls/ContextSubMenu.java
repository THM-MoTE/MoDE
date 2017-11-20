package de.thm.mni.mote.mode.frontend.controls;

import javafx.scene.control.Menu;
import lombok.Getter;

/**
 * Created by Marcel Hoppe on 22.11.16.
 */
@Getter
class ContextSubMenu extends Menu implements HasAction {
  String action = "";
  
  ContextSubMenu(String text, String action) {
    super(text);
    this.action = action;
  }
}

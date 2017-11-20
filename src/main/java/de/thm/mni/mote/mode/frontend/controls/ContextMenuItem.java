package de.thm.mni.mote.mode.frontend.controls;

import javafx.scene.control.MenuItem;
import lombok.Getter;

/**
 * Created by Marcel Hoppe on 22.11.16.
 */
@Getter
public class ContextMenuItem extends MenuItem implements HasAction {
  String action = "";
  
  ContextMenuItem(String text, String action) {
    super(text);
    this.action = action;
  }
}

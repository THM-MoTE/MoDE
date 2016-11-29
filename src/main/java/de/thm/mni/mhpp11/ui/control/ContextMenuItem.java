package de.thm.mni.mhpp11.ui.control;

import javafx.scene.control.MenuItem;
import lombok.Getter;

/**
 * Created by hobbypunk on 22.11.16.
 */
@Getter
public class ContextMenuItem extends MenuItem {
  String action = "";
  
  public ContextMenuItem(String text, String action) {
    super(text);
    this.action = action;
  }
}

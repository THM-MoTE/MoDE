package de.thm.mni.mote.mode.uiactor.controller.fragments;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import lombok.Getter;
import org.kordamp.ikonli.javafx.FontIcon;

/**
 * Created by hobbypunk on 06.02.17.
 */
public class DialogStackButtonsController {
  @Getter @FXML private Button btnNext;
  @Getter @FXML private Button btnPrev;
  
  @FXML private FontIcon fiNext;
  
  public void isLastPage() {
    fiNext.setIconLiteral("gmi-done");
    fiNext.setIconSize(24);
  }
}

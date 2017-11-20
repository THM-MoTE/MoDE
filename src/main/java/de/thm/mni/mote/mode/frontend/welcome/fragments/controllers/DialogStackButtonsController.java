package de.thm.mni.mote.mode.frontend.welcome.fragments.controllers;

import de.thm.mni.mote.mode.frontend.controllers.IController;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import lombok.Getter;
import org.kordamp.ikonli.javafx.FontIcon;

import java.net.URL;
import java.util.ResourceBundle;

/**
 * Created by Marcel Hoppe on 06.02.17.
 */
public class DialogStackButtonsController implements IController {
  @Getter @FXML private Button btnNext;
  @Getter @FXML private Button btnPrev;
  
  @FXML private FontIcon fiNext;
  
  void isLastPage() {
    fiNext.setIconLiteral("gmi-done");
    fiNext.setIconSize(24);
  }
  
  @Override
  public void initialize(URL location, ResourceBundle resources) {}
}

package de.thm.mni.mote.mode.frontend.welcome.fragments.controllers;

import de.thm.mni.mhpp11.smbj.ui.utilities.UTF8ResourceBundleControl;
import de.thm.mni.mote.mode.config.model.Project;
import de.thm.mni.mote.mode.frontend.controllers.IController;
import de.thm.mni.mote.mode.frontend.handlers.EventHandler;
import javafx.animation.Animation;
import javafx.animation.Transition;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.scene.layout.*;
import javafx.util.Duration;
import lombok.Getter;
import lombok.Setter;

import java.io.IOException;
import java.net.URL;
import java.util.MissingResourceException;
import java.util.ResourceBundle;
import java.util.UUID;

/**
 * Created by hobbypunk on 26.01.17.
 */
public abstract class DialogStackController extends VBox implements IController {
  
  private final Boolean isLastPage;
  protected ResourceBundle i18n;
  
  private FXMLLoader loader;
  @Getter private UUID ID;
  @Getter private final StackPane stackPane;
  @Getter @Setter private EventHandler<Project> onFinishListener;
  
  @FXML protected DialogStackButtonsController dialogStackButtonsController;
  
  
  public DialogStackController(UUID id, StackPane stackPane, Boolean isLastPage) {
    super();
    this.ID = id;
    this.stackPane = stackPane;
    this.isLastPage = isLastPage;
    loader = new FXMLLoader();
    loader.setLocation(DialogStackController.class.getResource(getViewPath()));
    try {
      loader.setResources(ResourceBundle.getBundle(getBundlePath(), getLocale(), new UTF8ResourceBundleControl()));
    } catch (MissingResourceException e) {
      e.printStackTrace();
    }
    loader.setRoot(this);
    loader.setController(this);
    this.setBackground(new Background(new BackgroundFill(stackPane.getScene().getFill(), CornerRadii.EMPTY, Insets.EMPTY)));
    this.setPrefWidth(stackPane.getScene().getWidth());
    this.setPrefHeight(stackPane.getScene().getHeight());
  }
  
  @Override
  public String getBundlePath() {
    return "de/thm/mni/mote/mode/frontend/bundles/MoDEBundle";
  }
  
  protected void load() {
    try {
      loader.load();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
  
  @Override
  public void initialize(URL location, ResourceBundle resources) {
    this.i18n = resources;
    if (isLastPage) {
      dialogStackButtonsController.isLastPage();
    }
    stackPane.getChildren().add(this);
    final double startWidth = getPrefWidth() + 150;
    
    setTranslateX(startWidth);
    final Animation showAni = new Transition() {
      {
        setCycleDuration(Duration.millis(500));
      }
      
      protected void interpolate(double frac) {
        final double curWidth = startWidth * frac;
        setTranslateX(startWidth - curWidth);
      }
    };
    showAni.play();
  
    dialogStackButtonsController.getBtnNext().setOnAction(this::onBtnNext);
    dialogStackButtonsController.getBtnPrev().setOnAction(this::onBtnPrev);
  }
  
  protected abstract void onBtnNext(ActionEvent event);
  
  @FXML
  private void onBtnPrev(ActionEvent event) {
    final double startWidth = getWidth();
    final Animation hideAni = new Transition() {
      {
        setCycleDuration(Duration.millis(500));
      }
      
      protected void interpolate(double frac) {
        final double curWidth = startWidth * frac;
        setTranslateX(curWidth);
      }
    };
    hideAni.onFinishedProperty().set(e -> stackPane.getChildren().remove(this));
    hideAni.play();
  }
}

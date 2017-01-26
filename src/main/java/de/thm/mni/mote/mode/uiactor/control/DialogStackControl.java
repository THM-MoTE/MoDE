package de.thm.mni.mote.mode.uiactor.control;

import de.thm.mni.mote.mode.config.Settings;
import de.thm.mni.mote.mode.config.model.Project;
import de.thm.mni.mote.mode.uiactor.handlers.EventHandler;
import de.thm.mni.mote.mode.util.Utilities;
import javafx.animation.Animation;
import javafx.animation.Transition;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.layout.*;
import javafx.util.Duration;
import lombok.Getter;
import lombok.Setter;
import org.kordamp.ikonli.javafx.FontIcon;

import java.io.IOException;
import java.net.URL;
import java.util.MissingResourceException;
import java.util.ResourceBundle;

/**
 * Created by hobbypunk on 26.01.17.
 */
public abstract class DialogStackControl extends VBox implements Initializable {
  
  private final Boolean isLastPage;
  protected final ResourceBundle i18n;
  
  private FXMLLoader loader;
  @Getter private final StackPane stackPane;
  @Getter @Setter private EventHandler<Project> onFinishListener;
  
  @FXML private FontIcon fiNext;
  @FXML protected Button btnNext;
  
  public DialogStackControl(StackPane stackPane, String view, Boolean isLastPage) {
    this(stackPane, view, view, isLastPage);
  }
  
  public DialogStackControl(StackPane stackPane, String view, String resource, Boolean isLastPage) {
    super();
    this.stackPane = stackPane;
    this.isLastPage = isLastPage;
    loader = new FXMLLoader();
    loader.setLocation(Utilities.getControlView(view));
    ResourceBundle i18n;
    try {
      i18n = Utilities.getControlBundle(resource, Settings.load().getLang());
      loader.setResources(i18n);
    } catch (MissingResourceException e) {
      i18n = null;
    }
    this.i18n = i18n;
    loader.setRoot(this);
    loader.setController(this);
    this.setBackground(new Background(new BackgroundFill(stackPane.getScene().getFill(), CornerRadii.EMPTY, Insets.EMPTY)));
    this.setPrefWidth(stackPane.getScene().getWidth());
    this.setPrefHeight(stackPane.getScene().getHeight());
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
    if (isLastPage) {
      fiNext.setIconLiteral("gmi-done");
      fiNext.setIconSize(24);
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
  }
  
  @FXML
  protected abstract void onBtnNext();
  
  @FXML
  private void onBtnBack() {
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
    hideAni.onFinishedProperty().set(event -> stackPane.getChildren().remove(this));
    hideAni.play();
  }
}

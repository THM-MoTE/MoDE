package de.thm.mni.mhpp11;

import de.thm.mni.mhpp11.config.Settings;
import de.thm.mni.mhpp11.ui.controller.WelcomeController;
import de.thm.mni.mhpp11.util.Utilities;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.util.Locale;


/**
 * Created by hobbypunk on 10.09.16.
 */
public class MainApp extends Application {
  
  public MainApp() {
    Locale.setDefault(Settings.load().getLang());
  }
  
  @Override
  public void start(Stage primaryStage) throws Exception {
    String firstParam = "";
    if(this.getParameters().getUnnamed().size() > 0)
    firstParam = this.getParameters().getUnnamed().get(0);
    FXMLLoader loader = new FXMLLoader();
    loader.setLocation(Utilities.getView("Welcome"));
    loader.setResources(Utilities.getBundle("Welcome"));
    Pane rootLayout = loader.load();
    WelcomeController controller = loader.getController();
    // Show the scene containing the root layout.
    Scene scene = new Scene(rootLayout);
    controller.lateInitialize(primaryStage, scene);
    controller.show(firstParam);
  }
}

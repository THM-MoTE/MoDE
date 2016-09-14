package de.thm.mni.mhpp11;

import de.thm.mni.mhpp11.controller.NotifyController;
import de.thm.mni.mhpp11.util.UTF8ResourceBundleControl;
import de.thm.mni.mhpp11.util.config.Settings;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.util.Locale;
import java.util.ResourceBundle;


/**
 * Created by hobbypunk on 10.09.16.
 */
public class MainApp extends Application {
  
  private ResourceBundle i18n;
  private Settings settings;
  private FXMLLoader loader;
  
  public MainApp() {
    settings = Settings.load();
    i18n = ResourceBundle.getBundle("de/thm/mni/mhpp11/i18n/Welcome", settings.getLang(), new UTF8ResourceBundleControl());
    Locale.setDefault(settings.getLang());
  }
  
  @Override
  public void start(Stage primaryStage) throws Exception {
    primaryStage.setTitle(i18n.getString("title.title") + " " + Settings.NAME + " " + Settings.VERSION);
    loader = new FXMLLoader();
    loader.setLocation(getClass().getResource("view/Welcome.fxml"));
    loader.setResources(i18n);
    Pane rootLayout = loader.load();
    NotifyController controller = loader.getController();
    // Show the scene containing the root layout.
    Scene scene = new Scene(rootLayout);
    controller.lateInitialize(primaryStage, scene);
    primaryStage.setScene(scene);
    primaryStage.setResizable(false);
    primaryStage.centerOnScreen();
    primaryStage.show();
  }
  
  @Override
  public void stop() throws Exception {
    NotifyController controller = loader.getController();
    controller.deinitialize();
    settings.save();
    super.stop();
  }
}

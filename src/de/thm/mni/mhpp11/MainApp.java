package de.thm.mni.mhpp11;

import de.thm.mni.mhpp11.util.config.Settings;
import de.thm.mni.mhpp11.util.UTF8ResourceBundleControl;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

import java.util.ResourceBundle;


/**
 * Created by hobbypunk on 10.09.16.
 */
public class MainApp extends Application {
  
  private ResourceBundle i18n;
  private Settings settings;
  
  public MainApp() {
    try {
      settings = Settings.load();
    } catch(Exception e) {
      e.printStackTrace();
    }
    i18n = ResourceBundle.getBundle("de/thm/mni/mhpp11/i18n/Welcome", settings.getLang(), new UTF8ResourceBundleControl());
  }
  
  @Override
  public void start(Stage primaryStage) throws Exception {
    primaryStage.setTitle(i18n.getString("title.title"));
    
    HBox rootLayout = FXMLLoader.load(getClass().getResource("view/Welcome.fxml"), i18n);
    
    // Show the scene containing the root layout.
    Scene scene = new Scene(rootLayout);
    primaryStage.setScene(scene);
    primaryStage.setResizable(false);
    primaryStage.centerOnScreen();
    primaryStage.setOnCloseRequest(event -> settings.save());
    primaryStage.show();
  }
}

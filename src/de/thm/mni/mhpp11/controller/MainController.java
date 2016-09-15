package de.thm.mni.mhpp11.controller;

import de.thm.mni.mhpp11.MainApp;
import de.thm.mni.mhpp11.control.DragResizer;
import de.thm.mni.mhpp11.util.config.Settings;
import de.thm.mni.mhpp11.util.config.model.MainWindow;
import de.thm.mni.mhpp11.util.config.model.Project;
import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.control.Separator;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ResourceBundle;

/**
 * Created by hobbypunk on 15.09.16.
 */
public class MainController extends NotifyController {
  
  private Project project;
  
  
  @FXML private HBox hbLeft;
  @FXML private Separator sLeft;
  
  @FXML private HBox hbRight;
  @FXML private Separator sRight;
  
  @Override
  public void initialize(URL location, ResourceBundle resources) {
    super.initialize(location, resources);
    DragResizer.makeResizable(sLeft, hbLeft, DragResizer.LTR);
    DragResizer.makeResizable(sRight, hbRight, DragResizer.RTL);
  }
  
  public void lateInitialize(MainApp app, Stage stage, Scene scene, Project project) {
    super.lateInitialize(app, stage, scene);
    this.project = project;
  }
  
  @Override
  public void deinitialize() {
    super.deinitialize();
    MainWindow mw = settings.getMainwindow();
    mw.setPos((int)stage.getX(), (int)stage.getY());
    mw.setSize((int)stage.getWidth(), (int)stage.getHeight());
    mw.setWidthLeftPane((int)hbLeft.getPrefWidth());
    mw.setWidthRightPane((int)hbRight.getPrefWidth());
  }
  
  @Override
  public void show() {
    stage.hide();
    MainWindow mw = settings.getMainwindow();
    
    stage.setX(mw.getPos().getKey());
    stage.setY(mw.getPos().getValue());
    stage.setWidth(mw.getSize().getKey());
    stage.setHeight(mw.getSize().getValue());
  
    hbLeft.setPrefWidth(mw.getWidthLeftPane());
    hbRight.setPrefWidth(mw.getWidthRightPane());
    
    stage.setScene(scene);
    stage.setTitle(String.format("%1$s - %2$s %3$s", project.getName(), Settings.NAME, Settings.VERSION));
    stage.setResizable(true);
    stage.show();
  }
}

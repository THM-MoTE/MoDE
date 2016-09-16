package de.thm.mni.mhpp11.controller;

import de.thm.mni.mhpp11.control.DragResizer;
import de.thm.mni.mhpp11.util.config.Settings;
import de.thm.mni.mhpp11.util.config.model.MainWindow;
import de.thm.mni.mhpp11.util.config.model.Project;
import de.thm.mni.mhpp11.util.parser.PackageParser;
import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.control.Separator;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;
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
  
  @FXML private TreeView<String> tvLibrary;
  
  private TreeItem<String> tiBuiltin = new TreeItem<>("BuiltIn");
  private TreeItem<String> tiLibrary = new TreeItem<>("Library");
  private TreeItem<String> tiProjectlibs = new TreeItem<>("Project Libraries");
  private TreeItem<String> tiProject = new TreeItem<>("Project");
  
  @Override
  public void initialize(URL location, ResourceBundle resources) {
    super.initialize(location, resources);
    DragResizer.makeResizable(sLeft, hbLeft, DragResizer.LTR);
    DragResizer.makeResizable(sRight, hbRight, DragResizer.RTL);
  }
  
  public void lateInitialize(Stage stage, Scene scene, Project project) {
    super.lateInitialize(stage, scene);
    this.project = project;
    initTreeView();
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
    
    stage.setX(mw.getPos().getX());
    stage.setY(mw.getPos().getY());
    stage.setWidth(mw.getSize().getX());
    stage.setHeight(mw.getSize().getY());
  
    hbLeft.setPrefWidth(mw.getWidthLeftPane());
    hbRight.setPrefWidth(mw.getWidthRightPane());
    
    stage.setScene(scene);
    stage.setTitle(String.format("%1$s - %2$s %3$s", project.getName(), Settings.NAME, Settings.VERSION));
    stage.setResizable(true);
    stage.show();
  }
  
  private void initTreeView() {
    TreeItem<String> root = new TreeItem<>("");
    root.getChildren().add(tiBuiltin);
    root.getChildren().add(tiLibrary);
    root.getChildren().add(tiProjectlibs);
    root.getChildren().add(tiProject);
  
    tvLibrary.setRoot(root);
    tvLibrary.setShowRoot(false);
    
    initProject();
  }
  
  private void initProject() {
    Thread t = new Thread(() -> {
      PackageParser.getInstance().collectPackage(project.getFile());
    });
    t.start();
  }
}

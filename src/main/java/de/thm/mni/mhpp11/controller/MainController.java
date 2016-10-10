package de.thm.mni.mhpp11.controller;

import de.thm.mni.mhpp11.control.DragResizer;
import de.thm.mni.mhpp11.control.MoIconPane;
import de.thm.mni.mhpp11.util.config.Settings;
import de.thm.mni.mhpp11.util.config.model.MainWindow;
import de.thm.mni.mhpp11.util.config.model.Project;
import de.thm.mni.mhpp11.util.parser.PackageParser;
import de.thm.mni.mhpp11.util.parser.models.MoClass;
import de.thm.mni.mhpp11.util.parser.models.MoLater;
import de.thm.mni.mhpp11.util.parser.models.MoMisc.TYPE;
import de.thm.mni.mhpp11.util.parser.models.MoRoot;
import javafx.beans.binding.Bindings;
import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
import javafx.util.Callback;
import org.eclipse.fx.ui.controls.tree.FilterableTreeItem;
import org.eclipse.fx.ui.controls.tree.TreeItemPredicate;

import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.Observable;
import java.util.ResourceBundle;

/**
 * Created by hobbypunk on 15.09.16.
 */
public class MainController extends NotifyController {
  
  private Project project;
  
  @FXML private TextField tfLibFilter;
  
  @FXML private HBox hbLeft;
  @FXML private Separator sLeft;
  
  @FXML private HBox hbRight;
  @FXML private Separator sRight;
  
  @FXML private TreeView<MoClass> tvLibrary;
  
  private Map<TYPE, FilterableTreeItem<MoClass>> ftiMap = new HashMap<>();
  
  {
    ftiMap.put(TYPE.LIB, new FilterableTreeItem<>(new MoRoot("Libraries")));
    ftiMap.put(TYPE.PROJECTLIB, new FilterableTreeItem<>(new MoRoot("Project Libraries")));
    ftiMap.put(TYPE.PROJECT, new FilterableTreeItem<>(new MoRoot("Project")));
  }
  
  @Override
  public void initialize(URL location, ResourceBundle resources) {
    super.initialize(location, resources);
    PackageParser.getInstance().addObserver(this);
    
    DragResizer.makeResizable(sLeft, hbLeft, DragResizer.LTR);
    DragResizer.makeResizable(sRight, hbRight, DragResizer.RTL);
  }
  
  public void lateInitialize(Stage stage, Scene scene, Project project) {
    super.lateInitialize(stage, scene);
    this.project = project;
    initTreeView();
    initFilter();
  }
  
  @Override
  public void deinitialize() {
    super.deinitialize();
    
    PackageParser.getInstance().deleteObserver(this);
    
    MainWindow mw = settings.getMainwindow();
    mw.setPos((int) stage.getX(), (int) stage.getY());
    mw.setSize((int) stage.getWidth(), (int) stage.getHeight());
    mw.setWidthLeftPane((int) hbLeft.getPrefWidth());
    mw.setWidthRightPane((int) hbRight.getPrefWidth());
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
  
  private void initFilter() {
    //FROM: http://www.kware.net/?p=204#The_Predicate
    for (FilterableTreeItem<MoClass> fti : ftiMap.values()) {
      fti.predicateProperty().bind(Bindings.createObjectBinding(() -> {
        if (tfLibFilter.getText() == null || tfLibFilter.getText().isEmpty())
          return null;
        return TreeItemPredicate.create(name -> name.getSimpleName().toLowerCase().contains(tfLibFilter.getText().toLowerCase()));
      }, tfLibFilter.textProperty()));
    }
  }
  
  private void initTreeView() {
    FilterableTreeItem<MoClass> root = new FilterableTreeItem<>(new MoRoot("Root"));
    for (TYPE t : new TYPE[]{TYPE.LIB, TYPE.PROJECTLIB, TYPE.PROJECT}) {
      root.getInternalChildren().add(ftiMap.get(t));
      ftiMap.get(t).setExpanded(true);
    }
    tvLibrary.setRoot(root);
    tvLibrary.setShowRoot(false);
    tvLibrary.setCellFactory(new Callback<TreeView<MoClass>, TreeCell<MoClass>>() {
      @Override
      public TreeCell<MoClass> call(TreeView<MoClass> param) {
        return new TreeCell<MoClass>() {
          @Override
          protected void updateItem(MoClass item, boolean empty) {
            super.updateItem(item, empty);
            if (empty) {
              setText(null);
              setGraphic(null);
            } else {
              setText(item.getSimpleName());
              if (item.getIcon() != null)
                setGraphic(new MoIconPane(item.getIcon()));
            }
          }
        };
      }
    });
    initLibs();
    initProject();
  }
  
  private void initLibs() {
    Thread t = new Thread(() -> {
      PackageParser pp = PackageParser.getInstance();
      pp.collectSystemLibs(ftiMap.get(TYPE.LIB).getValue());
    });
    t.start();
  }
  
  private void initProject() {
    Thread t = new Thread(() -> {
      PackageParser pp = PackageParser.getInstance();
      pp.collectProjectLibs(ftiMap.get(TYPE.PROJECTLIB).getValue(), project.getFile());
      pp.collectProject(ftiMap.get(TYPE.PROJECT).getValue(), project.getFile());
    });
    t.start();
  }
  
  private void addClass(MoClass moClass) {
    FilterableTreeItem<MoClass> parent = (FilterableTreeItem<MoClass>) findTreeItem(moClass.getParent());
    if (parent == null) return;
    if (moClass instanceof MoLater) return;
    parent.getInternalChildren().add(new FilterableTreeItem<>(moClass));
    for (MoClass mc : moClass.getChildren()) {
      addClass(mc);
    }
  }
  
  
  private TreeItem<MoClass> findTreeItem(MoClass that) {
    if (that.getParent() == null) {
      for (TreeItem<MoClass> fti : ftiMap.values()) {
        if (fti.getValue().equals(that)) return fti;
      }
    }
    TreeItem<MoClass> parent = findTreeItem(that.getParent());
    if (parent == null) return null;
    for (TreeItem<MoClass> fti : parent.getChildren())
      if (fti.getValue().equals(that)) return fti;
    
    return null;
  }
  
  @Override
  public void update(Observable o, Object arg) {
    super.update(o, arg);
    if (arg instanceof MoClass) {
      addClass((MoClass) arg);
    }
  }
}

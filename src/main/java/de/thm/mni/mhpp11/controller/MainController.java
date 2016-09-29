package de.thm.mni.mhpp11.controller;

import de.thm.mni.mhpp11.control.DragResizer;
import de.thm.mni.mhpp11.util.config.Settings;
import de.thm.mni.mhpp11.util.config.model.MainWindow;
import de.thm.mni.mhpp11.util.config.model.Project;
import de.thm.mni.mhpp11.util.parser.PackageParser;
import de.thm.mni.mhpp11.util.parser.models.MoMisc.TYPE;
import javafx.beans.binding.Bindings;
import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.control.Separator;
import javafx.scene.control.TextField;
import javafx.scene.control.TreeView;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
import org.eclipse.fx.ui.controls.tree.FilterableTreeItem;
import org.eclipse.fx.ui.controls.tree.TreeItemPredicate;

import java.io.File;
import java.net.URL;
import java.util.*;

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
  
  @FXML private TreeView<String> tvLibrary;
  
  private Map<TYPE, FilterableTreeItem<String>> ftiMap = new HashMap<>();
  
  {
    ftiMap.put(TYPE.LIB, new FilterableTreeItem<>("Libraries"));
    ftiMap.put(TYPE.PROJECTLIB, new FilterableTreeItem<>("Project Libraries"));
    ftiMap.put(TYPE.PROJECT, new FilterableTreeItem<>("Project"));
  }
  
  private Map<TYPE, List<Object>> notPossibleYetMap = new HashMap<>();
  
  {
    notPossibleYetMap.put(TYPE.LIB, new ArrayList<>());
    notPossibleYetMap.put(TYPE.PROJECTLIB, new ArrayList<>());
    notPossibleYetMap.put(TYPE.PROJECT, new ArrayList<>());
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
    for (FilterableTreeItem<String> fti : ftiMap.values()) {
      fti.predicateProperty().bind(Bindings.createObjectBinding(() -> {
        if (tfLibFilter.getText() == null || tfLibFilter.getText().isEmpty())
          return null;
        return TreeItemPredicate.create(name -> name.toLowerCase().contains(tfLibFilter.getText().toLowerCase()));
      }, tfLibFilter.textProperty()));
    }
  }
  
  private void initTreeView() {
    FilterableTreeItem<String> root = new FilterableTreeItem<>("");
    for (TYPE t : new TYPE[]{TYPE.LIB, TYPE.PROJECTLIB, TYPE.PROJECT}) {
      root.getInternalChildren().add(ftiMap.get(t));
      ftiMap.get(t).setExpanded(true);
    }
    tvLibrary.setRoot(root);
    tvLibrary.setShowRoot(false);
  
    // initLibs();
    initProject();
  }

//  private void initLibs() {
//    Thread t = new Thread(() -> {
//      PackageParser pp = PackageParser.getInstance();
//      pp.collectLibs(settings.getModelica().getOmc(), TYPE.LIB, 0);
//    });
//    t.start();
//  }
  
  private void initProject() {
    Thread t = new Thread(() -> {
      PackageParser pp = PackageParser.getInstance();
      String name = project.getFile().getName().toLowerCase();
//      if (name.equals("package.mo"))
//        pp.collectDir(project.getFile().getParentFile(), TYPE.PROJECT, 0);
//      else
//        pp.collectFile(project.getFile(), TYPE.PROJECT, 0);
    });
    t.start();
  }
  
  private void addFile(File file) {
//    FilterableTreeItem<String> parent = null;
//    if (ftiMap.containsKey(file.getType())) parent = ftiMap.get(file.getType());
//    if (parent == null) return;
//
//    parent = searchNode(parent, file.getMoWithin(), file.getOrder(), 0);
//    List<MoFile> list = notPossibleYetMap.get(file.getType());
//
//    if (parent != null) {
//      FilterableTreeItem<String> tmp;
//      if (file.getMoPackage() != null) {
//        tmp = new FilterableTreeItem<>(file.getMoPackage().getName());
//        tmp.setExpanded(true);
//        parent.getInternalChildren().add(tmp);
//        parent = tmp;
//      }
//
//      for (MoClass moClass : file.getMoClass()) {
//        tmp = new FilterableTreeItem<>(moClass.getName());
//        tmp.setExpanded(true);
//        tmp.setGraphic(moClass.getIcon());
//        parent.getInternalChildren().add(tmp);
//      }
//      for (int i = 0; i < list.size(); i++) {
//        MoFile f = list.get(i--);
//        list.remove(f);
//        addFile(f);
//      }
//    } else {
//      list.add(file);
//    }
  }
  
  private FilterableTreeItem<String> searchNode(FilterableTreeItem<String> parent, Integer order, Integer pos) {
//    if (list.size() == 0) return parent;
//
//    for (TreeItem<String> ti : parent.getInternalChildren()) {
//      FilterableTreeItem<String> fti = (FilterableTreeItem<String>)ti;
//      if (ti.getValue().equals(list.get(pos))) {
//        if (list.size() == pos + 1) {
//          return fti;
//        }
//        return searchNode(fti, within, order, pos + 1);
//      }
//    }
    return null;
  }
  
  @Override
  public void update(Observable o, Object arg) {
    super.update(o, arg);
//    if (arg instanceof MoFile) {
//      addFile((MoFile) arg);
//    }
  }
}

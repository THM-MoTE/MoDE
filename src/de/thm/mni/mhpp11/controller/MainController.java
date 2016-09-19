package de.thm.mni.mhpp11.controller;

import de.thm.mni.mhpp11.control.DragResizer;
import de.thm.mni.mhpp11.util.config.Settings;
import de.thm.mni.mhpp11.util.config.model.MainWindow;
import de.thm.mni.mhpp11.util.config.model.Project;
import de.thm.mni.mhpp11.util.parser.PackageParser;
import de.thm.mni.mhpp11.util.parser.models.MoClass;
import de.thm.mni.mhpp11.util.parser.models.MoFile;
import de.thm.mni.mhpp11.util.parser.models.MoWithin;
import javafx.beans.binding.Bindings;
import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.control.Separator;
import javafx.scene.control.TextField;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
import org.eclipse.fx.ui.controls.tree.FilterableTreeItem;
import org.eclipse.fx.ui.controls.tree.TreeItemPredicate;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
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
  
  @FXML private TreeView<String> tvLibrary;
  
  private FilterableTreeItem<String> tiBuiltin = new FilterableTreeItem<>("BuiltIn");
  private FilterableTreeItem<String> tiLibrary = new FilterableTreeItem<>("Library");
  private FilterableTreeItem<String> tiProjectlibs = new FilterableTreeItem<>("Project Libraries");
  private FilterableTreeItem<String> tiProject = new FilterableTreeItem<>("Project");
  
  private List<MoFile> notPossibleYet = new ArrayList<>();
  
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
    
    //FROM: http://www.kware.net/?p=204#The_Predicate
    tiProject.predicateProperty().bind(Bindings.createObjectBinding(() -> {
      if(tfLibFilter.getText() == null || tfLibFilter.getText().isEmpty())
        return null;
      return TreeItemPredicate.create(name -> name.toLowerCase().contains(tfLibFilter.getText().toLowerCase()));
    }, tfLibFilter.textProperty()));
  
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
  
  private void initTreeView() {
    FilterableTreeItem<String> root = new FilterableTreeItem<>("");
    root.getInternalChildren().add(tiBuiltin);
    root.getInternalChildren().add(tiLibrary);
    root.getInternalChildren().add(tiProjectlibs);
    root.getInternalChildren().add(tiProject);
    tiProject.setExpanded(true);
    tvLibrary.setRoot(root);
    tvLibrary.setShowRoot(false);
    
    initProject();
  }
  
  private void initProject() {
    Thread t = new Thread(() -> {
      PackageParser pp = PackageParser.getInstance();
      String name = project.getFile().getName().toLowerCase();
      if (name.equals("package.mo"))
        pp.collectDir(project.getFile().getParentFile(), MoFile.TYPE.PROJECT);
      else
        pp.collectFile(project.getFile(), MoFile.TYPE.PROJECT);
    });
    t.start();
  }
  
  private void addFile(MoFile file) {
    FilterableTreeItem<String> parent = null;
    if (file.getType().equals(MoFile.TYPE.PROJECT)) {
      parent = tiProject;
    }
    if (parent == null) return;
    parent = searchNode(parent, file.getMoWithin(), 0);
    if (parent != null) {
      FilterableTreeItem<String> tmp;
      if (file.getMoPackage() != null) {
        tmp = new FilterableTreeItem<>(file.getMoPackage().getName());
        tmp.setExpanded(true);
        parent.getInternalChildren().add(tmp);
        parent = tmp;
      }
      
      for (MoClass moClass : file.getMoClass()) {
        tmp = new FilterableTreeItem<>(moClass.getName());
        tmp.setExpanded(true);
        tmp.setGraphic(moClass.getIcon());
        parent.getInternalChildren().add(tmp);
      }
      for (int i = 0; i < notPossibleYet.size(); i++) {
        MoFile f = notPossibleYet.get(i--);
        notPossibleYet.remove(f);
        addFile(f);
      }
    } else {
      notPossibleYet.add(file);
    }
  }
  
  private FilterableTreeItem<String> searchNode(FilterableTreeItem<String> parent, MoWithin within, Integer pos) {
    List<String> list = within.getPackages();
    if (list.size() == 0) return parent;
    for (TreeItem<String> ti : parent.getInternalChildren()) {
      FilterableTreeItem<String> fti = (FilterableTreeItem<String>)ti;
      if (ti.getValue().equals(list.get(pos))) {
        if (list.size() == pos + 1) return fti;
        return searchNode(fti, within, pos + 1);
      }
    }
    return null;
  }
  
  @Override
  public void update(Observable o, Object arg) {
    super.update(o, arg);
    if (arg instanceof MoFile) {
      addFile((MoFile) arg);
    }
  }
}

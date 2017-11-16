package de.thm.mni.mote.mode.frontend.welcome.fragments.controllers;

import de.thm.mni.mote.mode.config.Settings;
import de.thm.mni.mote.mode.config.model.Project;
import de.thm.mni.mote.mode.frontend.controllers.IController;
import de.thm.mni.mote.mode.parser.PackageParser;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.stage.FileChooser;

import java.io.File;
import java.net.URL;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

import static de.thm.mni.mote.mode.util.Translator.tr;

/**
 * Created by hobbypunk on 06.02.17.
 * /de/thm/mni/mote/mode/view/fragments/SelectProjectLibsView.fxml
 */
public class SelectProjectLibsController implements IController {
  
  private ObjectProperty<Path> pLibrary = new SimpleObjectProperty<>(Paths.get("."));
  @FXML private TextField tfLibrary;
  @FXML private Button btnSelect;
  @FXML private Button btnAdd;
  
  @FXML private TreeView<Path> tvLibraries;
  
  @Override
  public void initialize(URL location, ResourceBundle resources) {
    initTreeView();
    initListener();
  }
  
  private void initTreeView() {
    tvLibraries.setRoot(new TreeItem<>(null));
    tvLibraries.setShowRoot(false);
    tvLibraries.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
    tvLibraries.setCellFactory(param -> new TreeCell<Path>() {
      @Override
      protected void updateItem(Path item, boolean empty) {
        super.updateItem(item, empty);
        if (empty) {
          this.setGraphic(null);
          this.setText(null);
          this.setDisable(false);
        } else {
          this.setText(getName(item));
          this.setDisable(!(getTreeItem().getParent() != null && getTreeItem().getParent().getValue() == null));
        }
      }
    });
  }
  
  private void initListener() {
    pLibrary.addListener((observable, oldValue, newValue) -> {
      btnAdd.setDisable(newValue == null);
      if (newValue == null) {
        tfLibrary.setText("");
        btnSelect.setText(tr("MoDE", "dialog.new_project.select"));
      } else {
        tfLibrary.setText(getName(newValue));
        btnSelect.setText(tr("MoDE", "dialog.new_project.clear"));
      }
    });
    pLibrary.set(null);
  }
  
  @FXML
  private void onSelectLibrary(ActionEvent event) {
    if (pLibrary.get() != null) {
      pLibrary.set(null);
      return;
    }
    FileChooser fc = new FileChooser();
    fc.getExtensionFilters().addAll(
        new FileChooser.ExtensionFilter(tr("MoDE", "file.all_supported"), "*.mo", "*.mp"),
        new FileChooser.ExtensionFilter(tr("MoDE", "file.mode_project"), "*.mp"),
        new FileChooser.ExtensionFilter(tr("MoDE", "file.modelica"), "*.mo")
    );
    fc.setTitle(tr("MoDE", "dialog.new_project.select"));
    fc.setInitialFileName("package.mo");
    fc.setInitialDirectory(Settings.load().getRecent().getLastPath().toFile());
    File f = fc.showOpenDialog(btnSelect.getScene().getWindow());
    if (f != null && f.exists()) pLibrary.set(PackageParser.findBasePackage(f.toPath()));
  }
  
  @FXML
  private void onAddLibrary(ActionEvent event) {
    addEntry(pLibrary.get());
    pLibrary.set(null);
  }
  
  public void onRemoveLibraries(ActionEvent event) {
    tvLibraries.getRoot().getChildren().removeAll(tvLibraries.getSelectionModel().getSelectedItems());
  }
  
  public List<Path> getLibraries() {
    return collect(new ArrayList<>(), tvLibraries.getRoot());
  }
  
  private List<Path> collect(List<Path> list, TreeItem<Path> item) {
    if (item.getValue() != null) list.add(getMoFile(item.getValue()));
    item.getChildren().forEach(child -> collect(list, child));
    return list;
  }
  
  
  private String getName(Path path) {
    if (path.getFileName().toString().endsWith(".mp")) {
      try {
        path = Project.load(path).getMoFile();
      } catch (Exception e) {
        e.printStackTrace();
      }
    }
    
    if (path.getFileName().toString().toLowerCase().endsWith("package.mo")) return path.getParent().getFileName().toString();
    else return path.getFileName().toString().replaceAll("\\.mo$", "");
  }
  
  private Path getMoFile(Path path) {
    if (path.getFileName().toString().endsWith(".mp")) {
      try {
        return Project.load(path).getMoFile();
      } catch (Exception e) {
        e.printStackTrace();
      }
    }
    return path;
  }
  
  public void setLibraries(List<Path> libraries) {
    libraries.forEach(this::addEntry);
  }
  
  private void addEntry(Path path) {
    //TODO: add subdependencies as childs
    tvLibraries.getRoot().getChildren().add(new TreeItem<>(path));
  }
}

package de.thm.mni.mote.mode.uiactor.control;

import de.thm.mni.mote.mode.config.Settings;
import de.thm.mni.mote.mode.config.model.Project;
import de.thm.mni.mote.mode.parser.PackageParser;
import de.thm.mni.mote.mode.util.Utilities;
import javafx.beans.property.BooleanProperty;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.beans.value.ChangeListener;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.FileChooser;
import lombok.Getter;
import lombok.Setter;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.MissingResourceException;
import java.util.ResourceBundle;

import static de.thm.mni.mote.mode.util.Translator.tr;

/**
 * Created by hobbypunk on 26.01.17.
 */

public class ProjectFromSourceControl extends GridPane implements NewProject, Initializable {
  private ResourceBundle i18n = null;
  
  private final BooleanProperty isNameValidProperty = new SimpleBooleanProperty(false);
  private final BooleanProperty isPathValidProperty = new SimpleBooleanProperty(false);
  @Getter private final BooleanProperty isValidProperty = new SimpleBooleanProperty(false);
  @Setter private Project.ProjectBuilder projectBuilder = Project.builder();
  
  @FXML private TextField tfName;
  @FXML private TextField tfPath;
  @FXML private Button btnPath;
  
  
  ProjectFromSourceControl() {
    super();
    FXMLLoader loader = new FXMLLoader();
    loader.setLocation(Utilities.getControlView("ProjectFromSource"));
    try {
      i18n = Utilities.getControlBundle("NewProject", Settings.load().getLang());
      loader.setResources(i18n);
    } catch (MissingResourceException e) {
    }
    loader.setRoot(this);
    loader.setController(this);
    
    try {
      loader.load();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
  
  @Override
  public void initialize(URL location, ResourceBundle resources) {
    ChangeListener<Boolean> listener = (observable, oldValue, newValue) -> isValidProperty.set(isNameValidProperty.get() && isPathValidProperty.get());
    
    isNameValidProperty.addListener(listener);
    isPathValidProperty.addListener(listener);
    
    tfName.textProperty().addListener((observable, oldValue, newValue) -> {
      //todo check if already exists!
      if (newValue.isEmpty()) {
        getProjectBuilder().name(null);
        isNameValidProperty.set(false);
      } else {
        getProjectBuilder().name(newValue);
        isNameValidProperty.set(true);
      }
    });
    
    tfPath.textProperty().addListener((observable, oldValue, newValue) -> {
      isPathValidProperty.set(false);
      getProjectBuilder().moFile(null);
      Path oldPath = Paths.get(oldValue);
      Path newPath = Paths.get(newValue);
      if (oldPath.endsWith("package.mo")) oldPath = oldPath.getParent();
      if (newPath.endsWith("package.mo")) newPath = newPath.getParent();
      
      if (Files.exists(newPath)) {
        isPathValidProperty.set(true);
        getProjectBuilder().moFile(newPath);
        
        String oldName = oldPath.getFileName().toString().replaceAll("\\.mo$", "");
        if (tfName.getText().isEmpty() || tfName.getText().equals(oldName)) {
          tfName.setText(newPath.getFileName().toString().replaceAll("\\.mo$", ""));
          tfPath.positionCaret(tfName.getText().length() + 1);
        }
      }
    });
  }
  
  @FXML
  private void onChoosePathClick() {
    FileChooser fc = new FileChooser();
    fc.setTitle(tr(i18n, "project.choose.mo.file"));
    fc.setInitialDirectory(Settings.load().getRecent().getLastPath().toFile());
    fc.setInitialFileName("package.mo");
    fc.getExtensionFilters().add(new FileChooser.ExtensionFilter(tr(i18n, "project.modelica.file"), "*.mo"));
    File f = fc.showOpenDialog(this.getScene().getWindow());
    if (f == null) return;
    Path path = PackageParser.findBasePackage(f.toPath());
    tfPath.setText(path.toString());
    tfPath.positionCaret(tfPath.getText().length() + 1);
  }
  
  @Override
  public Project.ProjectBuilder getProjectBuilder() {
    Path path = Paths.get(tfPath.getText());
    String name = tfName.getText();
    Path projectPath = path.getParent().resolve(name + ".mp");
    
    this.projectBuilder.name(name).moFile(path).projectPath(projectPath);
    return projectBuilder;
  }
}

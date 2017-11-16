package de.thm.mni.mote.mode.frontend.dialogs.newproject.fragments.controllers;

import de.thm.mni.mhpp11.smbj.logging.messages.ErrorMessage;
import de.thm.mni.mhpp11.smbj.manager.ActorManager;
import de.thm.mni.mhpp11.smbj.ui.utilities.UTF8ResourceBundleControl;
import de.thm.mni.mote.mode.config.Settings;
import de.thm.mni.mote.mode.config.model.Project;
import de.thm.mni.mote.mode.frontend.controllers.IController;
import de.thm.mni.mote.mode.frontend.controls.NewProject;
import javafx.beans.property.BooleanProperty;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.beans.value.ChangeListener;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.DirectoryChooser;
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

public class EmptyProjectController extends GridPane implements NewProject, IController {
  private ResourceBundle i18n = null;
  
  private final BooleanProperty isNameValidProperty = new SimpleBooleanProperty(false);
  private final BooleanProperty isPathValidProperty = new SimpleBooleanProperty(false);
  @Getter private final BooleanProperty isValidProperty = new SimpleBooleanProperty(false);
  @Setter private Project.ProjectBuilder projectBuilder = Project.builder();
  
  @FXML private TextField tfName;
  @FXML private TextField tfPath;
  @FXML private TextField tfPathPreview;
  @FXML private TextField tfComment;
  @FXML private Button btnPath;
  @FXML private TextArea taDocumentation;
  
  public EmptyProjectController() {
    super();
    
    FXMLLoader loader = new FXMLLoader();
    loader.setLocation(EmptyProjectController.class.getResource(getViewPath()));
    try {
      loader.setResources(ResourceBundle.getBundle(getBundlePath(), getLocale(), new UTF8ResourceBundleControl()));
    } catch (MissingResourceException e) {
      ActorManager.getInstance().send(new ErrorMessage(this.getClass(), e));
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
  public String getBundlePath() {
    return "de/thm/mni/mote/mode/frontend/bundles/MoDEBundle";
  }
  
  @Override
  public void initialize(URL location, ResourceBundle resources) {
    this.i18n = resources;
    ChangeListener<Boolean> listener = (observable, oldValue, newValue) -> isValidProperty.set(isNameValidProperty.get() && isPathValidProperty.get());
    isNameValidProperty.addListener(listener);
    isPathValidProperty.addListener(listener);
    isValidProperty.addListener((observable, oldValue, newValue) -> {
      if (!newValue) return;
      updatePreview();
      updateBuilder();
    });
    
    tfComment.textProperty().addListener((observable, oldValue, newValue) -> this.projectBuilder.comment(newValue));
    taDocumentation.textProperty().addListener((observable, oldValue, newValue) -> this.projectBuilder.documentation(newValue));
    
    tfName.textProperty().addListener((observable, oldValue, newValue) -> {
      if (newValue.isEmpty()) {
        isNameValidProperty.set(false);
        tfPathPreview.setText("");
      } else {
        isNameValidProperty.set(true);
        updatePreview();
      }
    });
    
    tfPath.textProperty().addListener((observable, oldValue, newValue) -> {
      isPathValidProperty.set(false);
      tfPathPreview.setText("");
      Path newPath = Paths.get(newValue);
      
      if (Files.exists(newPath) && Files.isDirectory(newPath)) {
        isPathValidProperty.set(true);
        updatePreview();
      }
    });
    
    tfPathPreview.textProperty().addListener((observable, oldValue, newValue) -> {
      isPathValidProperty.set(!Files.exists(Paths.get(newValue)));
      if (isPathValidProperty.get())
        updateBuilder();
    });
  }
  
  private void updateBuilder() {
    Path path = Paths.get(tfPath.getText());
    this.projectBuilder.isNewProject(true)
        .moFile(Paths.get("./package.mo"))
        .name(tfName.getText())
        .projectPath(path.resolve(tfName.getText().replaceAll("\\s", "") + File.separator + tfName.getText() + ".mp"));
  }
  
  private void updatePreview() {
    tfPathPreview.setText(tfPath.getText() + File.separator + tfName.getText().replaceAll("\\s", "") + File.separator + "package.mo");
    tfPathPreview.positionCaret(tfPathPreview.getText().length());
  }
  
  @FXML
  private void onChoosePathClick() {
    DirectoryChooser dc = new DirectoryChooser();
    dc.setTitle(tr(i18n, "project.choose_dir"));
    dc.setInitialDirectory(Settings.load().getRecent().getLastPath().toFile());
    
    File f = dc.showDialog(this.getScene().getWindow());
    if (f == null || !f.exists()) return;
    tfPath.setText(f.toString());
    tfPath.positionCaret(tfPath.getText().length() + 1);
  }
}

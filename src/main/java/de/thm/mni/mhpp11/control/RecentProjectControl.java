package de.thm.mni.mhpp11.control;

import de.thm.mni.mhpp11.util.UTF8ResourceBundleControl;
import de.thm.mni.mhpp11.util.config.Settings;
import de.thm.mni.mhpp11.util.config.model.Project;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
import lombok.Getter;

import java.io.IOException;
import java.net.URL;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.ResourceBundle;

/**
 * Created by hobbypunk on 12.09.16.
 */
public class RecentProjectControl extends GridPane implements Initializable {
  @FXML private Label lName;
  @FXML private Label lDate;
  @FXML private Label lPath;
  @FXML private Button bClose;
  
  @Getter final private Project project;
  
  public void setOnClick(EventHandler<? super MouseEvent> value) {
    super.setOnMouseClicked(value);
  }
  
  public void setOnClose(EventHandler<ActionEvent> value) {
    bClose.setOnAction(value);
  }
  
  private FXMLLoader loader;
  
  public RecentProjectControl(Project project, Locale lang) {
    ResourceBundle i18n = ResourceBundle.getBundle("de.thm.mni.mhpp11.control.i18n.RecentProject", lang, new UTF8ResourceBundleControl());
    this.project = project;
    loader = new FXMLLoader();
    loader.setResources(i18n);
    loader.setLocation(RecentProjectControl.class.getResource("view/RecentProject.fxml"));
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
    if (this.project != null) {
      try {
        Settings s = Settings.load();
        lName.textProperty().set(project.getName());
        DateFormat df = SimpleDateFormat.getDateTimeInstance(DateFormat.SHORT, DateFormat.SHORT, s.getLang());
        lDate.textProperty().set(df.format(project.getLastOpened()));
        lPath.textProperty().set(project.getFile().toString());
      } catch (Exception e) {
        e.printStackTrace();
      }
    }
  }
}

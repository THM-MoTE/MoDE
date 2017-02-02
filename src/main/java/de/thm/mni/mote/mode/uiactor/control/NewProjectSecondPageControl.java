package de.thm.mni.mote.mode.uiactor.control;

import de.thm.mni.mote.mode.config.model.Project;
import javafx.beans.property.BooleanProperty;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.collections.FXCollections;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.SelectionMode;
import javafx.scene.layout.StackPane;
import lombok.Getter;
import lombok.Setter;
import org.kordamp.ikonli.javafx.FontIcon;

import java.net.URL;
import java.util.*;

/**
 * Created by hobbypunk on 26.01.17.
 */
public class NewProjectSecondPageControl extends DialogStackControl implements NewProject {
  
  private final List<String> libs;
  @Getter private final BooleanProperty isValidProperty = new SimpleBooleanProperty(true);
  @Setter private Project.ProjectBuilder projectBuilder = Project.builder();
  
  @FXML private ListView<String> lvAvailableLibs;
  @FXML private ListView<String> lvUsedLibs;
  
  public NewProjectSecondPageControl(UUID group, StackPane parent, List<String> libs) {
    super(group, parent, "NewProjectSecondPage", "NewProject", true);
    this.libs = libs;
    load();
  }
  
  @Override
  public void initialize(URL location, ResourceBundle resources) {
    super.initialize(location, resources);
    
    lvAvailableLibs.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
    lvAvailableLibs.setItems(FXCollections.observableArrayList(libs));
    lvUsedLibs.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
    lvUsedLibs.setItems(FXCollections.observableArrayList());
  }
  
  @FXML
  private void onPushAll(Event e) {
    ListView<String> src;
    ListView<String> target;
    if (((FontIcon) ((Button) e.getTarget()).getGraphic()).getIconLiteral().contains("right")) {
      src = lvAvailableLibs;
      target = lvUsedLibs;
    } else {
      src = lvUsedLibs;
      target = lvAvailableLibs;
    }
    
    target.getItems().addAll(src.getItems());
    target.getItems().sort(String::compareToIgnoreCase);
    src.getItems().clear();
  }
  
  @FXML
  private void onPushSelected(Event e) {
    ListView<String> src;
    ListView<String> target;
    if (((FontIcon) ((Button) e.getTarget()).getGraphic()).getIconLiteral().contains("right")) {
      src = lvAvailableLibs;
      target = lvUsedLibs;
    } else {
      src = lvUsedLibs;
      target = lvAvailableLibs;
    }
    
    List<Integer> poses = new ArrayList<>(src.getSelectionModel().getSelectedIndices());
    poses.sort(Comparator.reverseOrder());
    poses.forEach(elem -> {
      target.getItems().add(src.getItems().get(elem));
      src.getItems().remove(elem.intValue());
    });
    target.getItems().sort(String::compareToIgnoreCase);
  }
  
  
  @Override
  protected void onBtnNext() {
    //Todo: page 3, project libs
    getProjectBuilder().systemLibraries(lvUsedLibs.getItems());
    if (getOnFinishListener() != null) getOnFinishListener().handle(getProjectBuilder().build());
    getStackPane().getChildren().remove(this);
  }
  
  @Override
  public Project.ProjectBuilder getProjectBuilder() {
    return this.projectBuilder;
  }
}

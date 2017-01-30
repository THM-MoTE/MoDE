package de.thm.mni.mote.mode.uiactor.control;

import de.thm.mni.mote.mode.config.model.Project;
import javafx.beans.property.BooleanProperty;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.ListCell;
import javafx.scene.control.ListView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.kordamp.ikonli.javafx.FontIcon;

import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;

import static de.thm.mni.mote.mode.util.Translator.tr;

/**
 * Created by hobbypunk on 26.01.17.
 */
public class NewProjectFirstPageControl extends DialogStackControl implements NewProject {
  
  @Getter private final List<String> libs;
  @Getter private final BooleanProperty isValidProperty = new SimpleBooleanProperty(false);
  @Getter @Setter private Project.ProjectBuilder projectBuilder = Project.builder();
  
  @FXML private ListView<Option> lvOptionList;
  @FXML private AnchorPane apRoot;
  
  
  public NewProjectFirstPageControl(StackPane stackPane, List<String> libs) {
    super(stackPane, "NewProjectFirstPage", "NewProject", false);
    this.libs = libs;
    load();
  }
  
  @Override
  public void initialize(URL location, ResourceBundle resources) {
    super.initialize(location, resources);
    
    ObservableList<Option> options = FXCollections.observableArrayList();
    options.add(new Option(tr(i18n, "project.empty.project"), "mdi-creation", Color.DARKORANGE, Option.TYPE.EMPTY_PROJECT));
    options.add(new Option(tr(i18n, "project.project.from.source"), "gmi-folder-open", Color.CHOCOLATE, Option.TYPE.PROJECT_FROM_SOURCE));
    lvOptionList.setItems(options);
    lvOptionList.setCellFactory(param -> new ListCell<Option>() {
      private FontIcon icon = new FontIcon();
      
      @Override
      protected void updateItem(Option item, boolean empty) {
        super.updateItem(item, empty);
        if (empty) {
          setGraphic(null);
          this.setDisable(false);
          this.setText(null);
        } else {
          this.setDisable(item.getType().equals(Option.TYPE.EMPTY_PROJECT));
          icon.setIconLiteral(item.getFontIconLiteral());
          icon.setIconColor(item.getFontIconColor());
          this.setText(item.getText());
          this.setGraphic(icon);
        }
      }
    });
    lvOptionList.getSelectionModel().selectedItemProperty().addListener((observable, oldValue, newValue) -> {
      switch (newValue.getType()) {
        case EMPTY_PROJECT:
          break;
        case PROJECT_FROM_SOURCE:
          onProjectFromSource();
      }
    });
    this.btnNext.setDisable(true);
    
    //TODO: change to 0 when empty project works
    lvOptionList.getSelectionModel().select(1);
    getIsValidProperty().addListener((observable, oldValue, newValue) -> btnNext.setDisable(!newValue));
  }
  
  private void onProjectFromSource() {
    ProjectFromSourceControl tmp = new ProjectFromSourceControl();
    tmp.setProjectBuilder(this.getProjectBuilder());
    tmp.getIsValidProperty().addListener((observable, oldValue, newValue) -> getIsValidProperty().set(newValue));
    
    apRoot.getChildren().clear();
    apRoot.getChildren().add(tmp);
  }
  
  @Override
  protected void onBtnNext() {
    if (this.getIsValidProperty().get()) {
      NewProjectSecondPageControl page = new NewProjectSecondPageControl(this.getStackPane(), this.getLibs());
      page.setProjectBuilder(this.getProjectBuilder());
      page.setOnFinishListener(data -> {
        this.getOnFinishListener().handle(data);
        getStackPane().getChildren().remove(this);
      });
    }
  }
  
  
  @Getter
  @AllArgsConstructor
  private static class Option {
    enum TYPE {
      EMPTY_PROJECT,
      PROJECT_FROM_SOURCE
    }
    
    private final String text;
    private final String fontIconLiteral;
    private final Color fontIconColor;
    private final TYPE type;
  }
}

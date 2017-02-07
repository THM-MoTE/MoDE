package de.thm.mni.mote.mode.uiactor.controller.dialogs.newproject;

import de.thm.mni.mote.mode.config.model.Project;
import de.thm.mni.mote.mode.uiactor.controller.fragments.DialogStackController;
import de.thm.mni.mote.mode.uiactor.control.NewProject;
import de.thm.mni.mote.mode.uiactor.controller.fragments.ProjectFromSourceController;
import javafx.beans.property.BooleanProperty;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
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
import java.util.UUID;

import static de.thm.mni.mote.mode.util.Translator.tr;

/**
 * Created by hobbypunk on 26.01.17.
 */
public class FirstPageController extends DialogStackController implements NewProject {
  
  @Getter private final List<String> libs;
  @Getter private final BooleanProperty isValidProperty = new SimpleBooleanProperty(false);
  @Getter @Setter private Project.ProjectBuilder projectBuilder = Project.builder();
  
  @FXML private ListView<Option> lvOptionList;
  @FXML private AnchorPane apRoot;
  
  public FirstPageController(UUID group, StackPane stackPane, List<String> libs) {
    super(group, stackPane, "newproject/FirstPage", false);
    this.libs = libs;
    load();
  }
  
  @Override
  public void initialize(URL location, ResourceBundle resources) {
    super.initialize(location, resources);
    
    ObservableList<Option> options = FXCollections.observableArrayList();
    options.add(new Option(tr(i18n, "dialog.new_project.empty_project"), "mdi-creation", Color.DARKORANGE, Option.TYPE.EMPTY_PROJECT));
    options.add(new Option(tr(i18n, "dialog.new_project.project_from_source"), "gmi-folder-open", Color.CHOCOLATE, Option.TYPE.PROJECT_FROM_SOURCE));
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
    this.dialogStackButtonsController.getBtnNext().setDisable(true);
    
    //TODO: change to 0 when empty project works
    lvOptionList.getSelectionModel().select(1);
    getIsValidProperty().addListener((observable, oldValue, newValue) -> dialogStackButtonsController.getBtnNext().setDisable(!newValue));
  }
  
  private void onProjectFromSource() {
    ProjectFromSourceController tmp = new ProjectFromSourceController(getGroup());
    tmp.setProjectBuilder(this.getProjectBuilder());
    tmp.getIsValidProperty().addListener((observable, oldValue, newValue) -> getIsValidProperty().set(newValue));
    
    apRoot.getChildren().clear();
    apRoot.getChildren().add(tmp);
  }
  
  @Override
  protected void onBtnNext(ActionEvent event) {
    if (this.getIsValidProperty().get()) {
      SecondPageController page = new SecondPageController(getGroup(), this.getStackPane(), this.getLibs());
      page.setProjectBuilder(this.getProjectBuilder());
      System.out.println(this.getProjectBuilder());
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

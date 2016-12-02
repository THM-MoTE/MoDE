package de.thm.mni.mhpp11.ui.control;

import de.thm.mni.mhpp11.modelica.MoClass;
import de.thm.mni.mhpp11.ui.control.modelica.MoDiagramGroup;
import de.thm.mni.mhpp11.ui.control.modelica.MoGroup;
import de.thm.mni.mhpp11.ui.control.modelica.MoIconGroup;
import de.thm.mni.mhpp11.ui.handlers.StateHandler;
import de.thm.mni.mhpp11.util.Utilities;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.Tab;
import lombok.EqualsAndHashCode;
import lombok.Getter;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import static de.thm.mni.mhpp11.modelica.interfaces.Changeable.Change;

@Getter
@EqualsAndHashCode(callSuper = false, exclude = {"main", "loader"})
public class MainTabControl extends Tab implements Initializable {
  
  private final MoClass data;
  private final Boolean diagram;
  
  @FXML private ScrollPane main;
  private FXMLLoader loader;
  
  public MainTabControl(MoClass data, Boolean diagram) {
    this.data = data;
    this.diagram = diagram;
    loader = new FXMLLoader();
    loader.setLocation(Utilities.getControlView("MainTab"));
    loader.setRoot(this);
    loader.setController(this);
    try {
      loader.load();
    } catch (IOException e) {
      e.printStackTrace();
    }
  
    setOnSelectionChanged(event -> {
      if (MainTabControl.this.isSelected()) {
        System.out.println(event + " " + MainTabControl.this.getText());
        if (main.getContent() instanceof MoDiagramGroup)
          StateHandler.getInstance((MoDiagramGroup) main.getContent());
        else
          StateHandler.getInstance().setParent(null);
      }
    });
  }
  
  @Override
  public void initialize(URL location, ResourceBundle resources) {
    this.setClosable(true);
    //data.getUnsavedChanges().setValue(Change.NONE);
    MoGroup mp;
    this.setGraphic(new MoIconGroup(data).scaleToSize(20., 20.));
    if (diagram) mp = new MoDiagramGroup(data);
    else mp = new MoIconGroup(data, false);
  
    updateText(Change.NONE);
  
    mp.scaleToSize(600., 600.);
    mp.setLayoutX(100.);
    mp.setLayoutY(100.);
    mp.setInternalStyle("-fx-background-color: white;");
    main.setContent(mp);
  
    data.getUnsavedChanges().addListener((observable, oldValue, newValue) -> {
      updateText(newValue);
    });
  }
  
  private void updateText(Change unsavedChanges) {
    this.setText(data.getSimpleName() + ((diagram) ? "" : "(modelica)"));
    if (!unsavedChanges.equals(Change.NONE)) this.setText(this.getText() + "*");
    //TODO: text color
  }
  
  public Boolean isDiagram() {
    return diagram;
  }
}
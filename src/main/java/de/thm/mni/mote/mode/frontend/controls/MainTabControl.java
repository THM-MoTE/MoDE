package de.thm.mni.mote.mode.frontend.controls;

import de.thm.mni.mote.mode.frontend.controls.modelica.FXMoDiagramMoGroup;
import de.thm.mni.mote.mode.frontend.controls.modelica.FXMoGroup;
import de.thm.mni.mote.mode.frontend.controls.modelica.FXMoIconMoGroup;
import de.thm.mni.mote.mode.frontend.editor.MasterManager;
import de.thm.mni.mote.mode.frontend.editor.MenuManager;
import de.thm.mni.mote.mode.frontend.editor.elementmanager.elements.ManagedFXMoDiagramMoGroup;
import de.thm.mni.mote.mode.frontend.editor.statemachine.StateMachine;
import de.thm.mni.mote.mode.frontend.utilities.ScrollPaneHorizontalScroll;
import de.thm.mni.mote.mode.modelica.MoContainer;
import de.thm.mni.mote.mode.util.Utilities;
import javafx.application.Platform;
import javafx.beans.binding.Bindings;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.Tab;
import javafx.scene.input.InputEvent;
import javafx.scene.input.ScrollEvent;
import javafx.scene.layout.StackPane;
import lombok.EqualsAndHashCode;
import lombok.Getter;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import static de.thm.mni.mote.mode.modelica.interfaces.Changeable.Change;

@SuppressWarnings("DefaultAnnotationParam")
@Getter
@EqualsAndHashCode(exclude = {"main", "loader"}, callSuper = false)
public class MainTabControl extends Tab implements Initializable {
  
  private final MoContainer data;
  
  @FXML private StackPane main;
  @FXML private ScrollPane scroll;
  
  private FXMLLoader loader;
  
  public MainTabControl(MoContainer data) {
    this.data = data;
    loader = new FXMLLoader();
    loader.setLocation(Utilities.getControlView("MainTab"));
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
    ScrollPaneHorizontalScroll.modify(scroll);
    this.setClosable(true);
    //data.getUnsavedChanges().setValue(Change.NONE);
    FXMoGroup mp;
  
    this.setGraphic(new FXMoIconMoGroup(data).scaleToSize(20., 20.));
  
    mp = new ManagedFXMoDiagramMoGroup(data);
  
    updateText(Change.NONE);
  
    mp.scaleToSize(600., 600.);
    mp.setLayoutX(100.);
    mp.setLayoutY(100.);
    mp.setInternalStyle("-fx-background-color: white;");
    main.getChildren().add(mp);
  
    data.getElement().getUnsavedChanges().addListener((observable, oldValue, newValue) -> updateText(newValue));
  }
  
  private void updateText(Change unsavedChanges) {
    Platform.runLater(() -> {
      this.setText(data.getSimpleName());
      if (!unsavedChanges.equals(Change.NONE)) {
        this.setText(this.getText() + "*");
      }
      //TODO: text color
    });
  }
  
  public void lateInitialize(Scene scene) {
    MasterManager.getInstanceManager().create(scene, this, data);
    
    Node child = main.getChildren().get(0);
  
    StateMachine sm = StateMachine.getInstanceManager().get(data);
  
    if (child instanceof FXMoDiagramMoGroup) ((FXMoDiagramMoGroup) child).addHandler(sm);
  
    main.addEventHandler(InputEvent.ANY, sm);
    main.addEventFilter(ScrollEvent.ANY, sm);
    
    main.minWidthProperty().bind(Bindings.createDoubleBinding(() -> scroll.getViewportBounds().getWidth(), scroll.viewportBoundsProperty()));
  
    if(data.getElement().hasIcon()) {
      MenuManager.getInstanceManager().get(this.data).getShowIconProperty().addListener((observable, oldValue, newValue) -> {
        ManagedFXMoDiagramMoGroup fxDiagram = (ManagedFXMoDiagramMoGroup)main.getChildren().get(0);
        if(newValue) fxDiagram.setImageAsBackground();
        else fxDiagram.removeImageAsBackground();
      });
    }
    
    this.setOnSelectionChanged(event -> {
      if (MainTabControl.this.isSelected()) {
        MasterManager.getInstanceManager().activate(data);
      } else {
        MasterManager.getInstanceManager().deactivate();
      }
    });
  
    if (this.isSelected()) MasterManager.getInstanceManager().activate(data);
  
    this.setOnClosed(event -> MasterManager.getInstanceManager().remove(data));
  }
}
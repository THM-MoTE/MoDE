package de.thm.mni.mote.mode.uiactor.control;

import de.thm.mni.mote.mode.modelica.MoContainer;
import de.thm.mni.mote.mode.parser.ParserException;
import de.thm.mni.mote.mode.uiactor.control.modelica.MoDiagramGroup;
import de.thm.mni.mote.mode.uiactor.control.modelica.MoGroup;
import de.thm.mni.mote.mode.uiactor.control.modelica.MoIconGroup;
import de.thm.mni.mote.mode.uiactor.elementmanager.ElementManager;
import de.thm.mni.mote.mode.uiactor.handlers.StateHandler;
import de.thm.mni.mote.mode.uiactor.statemachine2.StateMachine2;
import de.thm.mni.mote.mode.uiactor.statemachine2.elements.ZoomableMoDiagramGroup;
import de.thm.mni.mote.mode.uiactor.utilities.ScrollPaneHorizontalScroll;
import de.thm.mni.mote.mode.util.Utilities;
import javafx.beans.binding.Bindings;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
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

@Getter
@EqualsAndHashCode(callSuper = false, exclude = {"main", "loader"})
public class MainTabControl extends Tab implements Initializable {
  
  private final MoContainer data;
  private final Boolean diagram;
  
  @FXML private StackPane main;
  @FXML private ScrollPane scroll;
  
  private FXMLLoader loader;
  
  public MainTabControl(MoContainer data, Boolean diagram) {
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
  
    ElementManager.getInstance(data);
  
    this.setOnClosed(event -> {
      ElementManager.removeInstance(data);
      StateMachine2.removeInstance(data);
    });
  }
  
  @Override
  public void initialize(URL location, ResourceBundle resources) {
    ScrollPaneHorizontalScroll.modify(scroll);
    this.setClosable(true);
    //data.getUnsavedChanges().setValue(Change.NONE);
    MoGroup mp;
  
    try {
      this.setGraphic(new MoIconGroup(data).scaleToSize(20., 20.));
    
      if (diagram) mp = new ZoomableMoDiagramGroup(data);
      else mp = new MoIconGroup(data, false);
  
      updateText(Change.NONE);
  
      mp.scaleToSize(600., 600.);
      mp.setLayoutX(100.);
      mp.setLayoutY(100.);
      mp.setInternalStyle("-fx-background-color: white;");
      if (mp instanceof MoDiagramGroup)
        ((MoDiagramGroup) mp).addHandler(StateMachine2.getInstance(this, data));
      main.getChildren().add(mp);
      main.addEventHandler(InputEvent.ANY, StateMachine2.getInstance(this, data));
      
    } catch (ParserException e) {
      e.printStackTrace();
    }
  
    data.getElement().getUnsavedChanges().addListener((observable, oldValue, newValue) -> updateText(newValue));
  }
  
  private void updateText(Change unsavedChanges) {
    this.setText(data.getSimpleName() + ((diagram) ? "" : "(icon)"));
    if (!unsavedChanges.equals(Change.NONE)) this.setText(this.getText() + "*");
    //TODO: text color
  }
  
  public Boolean isDiagram() {
    return diagram;
  }
  
  public void lateInitialize(Scene scene) {
    main.addEventFilter(ScrollEvent.ANY, StateMachine2.getInstance(MainTabControl.this, data));
    
    main.minWidthProperty().bind(Bindings.createDoubleBinding(() -> scroll.getViewportBounds().getWidth(), scroll.viewportBoundsProperty()));
    
    this.setOnSelectionChanged(event -> {
      if (MainTabControl.this.isSelected()) {
        StateMachine2.getInstance(data).enter(scene);
        if (main.getChildren().get(0) instanceof MoDiagramGroup) {
          StateHandler.getInstance((MoDiagramGroup) main.getChildren().get(0));
        } else {
          StateHandler.getInstance().setParent(null);
        }
      } else {
        StateMachine2.getInstance(data).leave(scene);
      }
    });
  }
}
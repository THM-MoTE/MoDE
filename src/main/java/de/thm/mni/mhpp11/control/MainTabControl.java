package de.thm.mni.mhpp11.control;

import de.thm.mni.mhpp11.control.icon.MoDiagramGroup;
import de.thm.mni.mhpp11.control.icon.MoGroup;
import de.thm.mni.mhpp11.control.icon.MoIconGroup;
import de.thm.mni.mhpp11.util.parser.models.MoClass;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.Tab;
import lombok.EqualsAndHashCode;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

@EqualsAndHashCode(exclude = {"main", "loader"})
public class MainTabControl extends Tab implements Initializable {
  
  private final MoClass data;
  private final Boolean diagram;
  
  @FXML private ScrollPane main;
  private FXMLLoader loader;
  
  public MainTabControl(MoClass data, Boolean diagram) {
    this.data = data;
    this.diagram = diagram;
    loader = new FXMLLoader();
    loader.setLocation(MainTabControl.class.getResource("view/MainTab.fxml"));
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
    this.setClosable(true);
    this.setText(data.getSimpleName());
    MoGroup mp;
    this.setGraphic(new MoIconGroup(data).scaleToSize(20., 20.));
    if (diagram) mp = new MoDiagramGroup(data);
    else {
      mp = new MoIconGroup(data, false);
      this.setText(this.getText() + " (icon)");
    }
    mp.scaleToSize(600., 600.);
    mp.setLayoutX(100.);
    mp.setLayoutY(100.);
    mp.setInternalStyle("-fx-background-color: white;");
    main.setContent(mp);
  }
}
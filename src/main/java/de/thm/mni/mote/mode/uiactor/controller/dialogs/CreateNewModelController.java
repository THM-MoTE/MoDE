package de.thm.mni.mote.mode.uiactor.controller.dialogs;

import de.thm.mni.mote.mode.modelica.graphics.Utilities;
import javafx.beans.property.BooleanProperty;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.fxml.FXML;
import javafx.geometry.Point2D;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.ResourceBundle;

/**
 * Created by hobbypunk on 03.02.17.
 * TODO: validation
 */
public class CreateNewModelController extends CreateNewController {
  private BooleanProperty isExtentValidProperty = new SimpleBooleanProperty(true);
  
  
  @FXML private TextField tfX1;
  @FXML private TextField tfY1;
  @FXML private TextField tfX2;
  @FXML private TextField tfY2;
  @FXML private TextField tfInitialScale;
  @FXML private CheckBox cbPreserveAspectRatio;
  @FXML private TextField tfSnapX;
  @FXML private TextField tfSnapY;
  
  
  @Override
  public void initialize(URL location, ResourceBundle resources) {
    super.initialize(location, resources);
    this.getIsValidProperty().bind(isExtentValidProperty.and(getIsNameValidProperty()));
  }
  
  private Double getX1() {
    return Double.parseDouble(tfX1.getText());
  }
  
  private Double getY1() {
    return Double.parseDouble(tfY1.getText());
  }
  
  private Double getX2() {
    return Double.parseDouble(tfX2.getText());
  }
  
  private Double getY2() {
    return Double.parseDouble(tfY2.getText());
  }
  
  private List<Point2D> getExtent() {
    List<Point2D> extent = new ArrayList<>(2);
    extent.add(new Point2D(getX1(), getY1()));
    extent.add(new Point2D(getX2(), getY2()));
    return extent;
  }
  
  @Override
  public Map<String, String> getData() {
    Map<String, String> data = super.getData();
    
    data.put("extent", Utilities.toString(getExtent()));
    data.put("preserveAspectRatio", "" + cbPreserveAspectRatio.isSelected());
    data.put("initialScale", tfInitialScale.getText());
    data.put("snapGrid", Utilities.toString(new Point2D(Double.parseDouble(tfSnapX.getText()), Double.parseDouble(tfSnapY.getText()))));
    return data;
  }
}

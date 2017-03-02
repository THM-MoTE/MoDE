package de.thm.mni.mote.mode.uiactor.controller.dialogs;

import javafx.beans.property.BooleanProperty;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ButtonType;
import javafx.scene.control.DialogPane;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import lombok.AccessLevel;
import lombok.Getter;

import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.ResourceBundle;

/**
 * Created by hobbypunk on 03.02.17.
 */
@Getter(AccessLevel.PROTECTED)
public abstract class CreateNewController implements Initializable {
  private BooleanProperty isValidProperty = new SimpleBooleanProperty(false);
  private BooleanProperty isNameValidProperty = new SimpleBooleanProperty(false);
  
  @FXML private DialogPane dialog;
  
  @FXML private TextField tfPath;
  @FXML private TextField tfName;
  @FXML private TextField tfComment;
  @FXML private TextArea taDocumentation;
  
  @Override
  public void initialize(URL location, ResourceBundle resources) {
    dialog.lookupButton(ButtonType.FINISH).disableProperty().bind(isValidProperty.not());
    tfName.textProperty().addListener((observable, oldValue, newValue) -> isNameValidProperty.set(!(newValue.isEmpty() || newValue.contains(" ") || newValue.matches("^\\d.*"))));
    isValidProperty.bind(isNameValidProperty);
  }
  
  private String getName() {
    return tfName.getText();
  }
  
  public void setPath(String path) {
    tfPath.setText(path);
  }
  
  private String getComment() {
    return tfComment.getText();
  }
  
  private String getDocumentation() {
    return taDocumentation.getText();
  }
  
  public Map<String, String> getData() {
    Map<String, String> data = new HashMap<>();
    data.put("path", tfPath.getText());
    data.put("name", getName());
    data.put("comment", getComment());
    data.put("docu", getDocumentation());
    return data;
  }
}

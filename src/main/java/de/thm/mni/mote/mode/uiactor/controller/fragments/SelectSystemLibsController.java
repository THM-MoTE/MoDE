package de.thm.mni.mote.mode.uiactor.controller.fragments;

import javafx.collections.FXCollections;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.SelectionMode;
import javafx.scene.layout.VBox;
import org.kordamp.ikonli.javafx.FontIcon;

import java.net.URL;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.ResourceBundle;

/**
 * Created by hobbypunk on 26.01.17.
 */
public class SelectSystemLibsController<T extends Comparable<T>> extends VBox implements Initializable {
  
  @FXML private ListView<T> lvAvailable;
  @FXML private ListView<T> lvSelected;
  
  @Override
  public void initialize(URL location, ResourceBundle resources) {
    lvAvailable.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
    lvSelected.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
    lvSelected.setItems(FXCollections.observableArrayList());
  }
  
  public void setList(List<T> list) {
    list.sort(Comparable::compareTo);
    lvAvailable.setItems(FXCollections.observableArrayList(list));
    lvSelected.setItems(FXCollections.observableArrayList());
  }
  
  public void setLists(List<T> available, List<T> selected) {
    available.sort(Comparable::compareTo);
    selected.sort(Comparable::compareTo);
    available.removeAll(selected);
    
    lvAvailable.setItems(FXCollections.observableArrayList(available));
    lvSelected.setItems(FXCollections.observableArrayList(selected));
  }
  
  @FXML
  private void onPushAll(Event e) {
    ListView<T> src;
    ListView<T> target;
    if (((FontIcon) ((Button) e.getTarget()).getGraphic()).getIconLiteral().contains("right")) {
      src = lvAvailable;
      target = lvSelected;
    } else {
      src = lvSelected;
      target = lvAvailable;
    }
    
    target.getItems().addAll(src.getItems());
    target.getItems().sort(Comparable::compareTo);
    src.getItems().clear();
  }
  
  @FXML
  private void onPushSelected(Event e) {
    ListView<T> src;
    ListView<T> target;
    if (((FontIcon) ((Button) e.getTarget()).getGraphic()).getIconLiteral().contains("right")) {
      src = lvAvailable;
      target = lvSelected;
    } else {
      src = lvSelected;
      target = lvAvailable;
    }
    
    List<Integer> poses = new ArrayList<>(src.getSelectionModel().getSelectedIndices());
    poses.sort(Comparator.reverseOrder());
    poses.forEach(elem -> {
      target.getItems().add(src.getItems().get(elem));
      src.getItems().remove(elem.intValue());
    });
    target.getItems().sort(Comparable::compareTo);
  }
  
  public List<T> getSelected() {
    return lvSelected.getItems();
  }
  
  public List<T> getAvailable() {
    return lvAvailable.getItems();
  }
  
}

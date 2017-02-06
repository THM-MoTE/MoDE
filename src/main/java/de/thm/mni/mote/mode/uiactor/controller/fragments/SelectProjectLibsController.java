package de.thm.mni.mote.mode.uiactor.controller.fragments;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;

import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by hobbypunk on 06.02.17.
 */
public class SelectProjectLibsController {
  
  @FXML private TextField tfLibrary;
  @FXML private Button btnSelect;
  @FXML private Button btnAdd;
  
  @FXML private TreeView<Path> tvLibraries;
  
  public List<Path> getLibraries() {
    return collect(new ArrayList<>(), tvLibraries.getRoot());
  }
  
  private List<Path> collect(List<Path> list, TreeItem<Path> item) {
    if (item.getValue() != null) list.add(item.getValue());
    item.getChildren().forEach(child -> collect(list, child));
    return list;
  }
}

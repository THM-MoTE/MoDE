package de.thm.mni.mote.mode.uiactor.editor.interfaces;

import javafx.application.Platform;
import javafx.beans.property.ReadOnlyProperty;
import javafx.collections.ListChangeListener;
import javafx.collections.ObservableList;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.Parent;

/**
 * Created by hobbypunk on 22.02.17.
 */
public interface Childable {
  
  ObservableList<Node> getChildren();
  
  default void initParentListener() {
    parentProperty().addListener((observable, oldValue, newValue) -> {
      Platform.runLater(() -> { //Possible Bug in jfx? no remove of children in Listener possible.
        getChildren().forEach(child -> {
          if (oldValue instanceof Group && ((Group) oldValue).getChildren().contains(child))
            ((Group) oldValue).getChildren().remove(child);
          if (newValue instanceof Group && !((Group) newValue).getChildren().contains(child))
            ((Group) newValue).getChildren().add(2, child);
        });
      });
    });
    
    getChildren().addListener((ListChangeListener<? super Node>) c -> {
      while (c.next()) {
        c.getAddedSubList().forEach(child -> {
          if (getParent() != null && getParent() instanceof Group && !((Group) getParent()).getChildren().contains(child))
            ((Group) getParent()).getChildren().add(2, child);
        });
        
        c.getRemoved().forEach(child -> {
          if (getParent() != null && getParent() instanceof Group && ((Group) getParent()).getChildren().contains(child))
            ((Group) getParent()).getChildren().remove(child);
        });
      }
    });
  }
  
  ReadOnlyProperty<Parent> parentProperty();
  
  Parent getParent();
}

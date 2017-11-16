package de.thm.mni.mote.mode.frontend.controls.modelica;

import javafx.beans.property.ObjectProperty;
import javafx.collections.ObservableList;
import javafx.geometry.Point2D;
import javafx.scene.Node;

public interface CalculateLocalCenterOnDiagram {
  
  FXMoDiagramMoGroup getMoDiagram();
  ObservableList<Node> getChildren();
  ObjectProperty<Point2D> getCenterOnDiagramProperty();
  
  Point2D convertFrom(Point2D p);
  
  default Point2D getCenterOnDiagram() {
    return getCenterOnDiagramProperty().get();
  }
  
  default void init() {
    calculateLocalCenterOnDiagram();
    getCenterOnDiagramProperty().addListener((observable, oldValue, newValue) -> getChildren().stream().filter(node -> node instanceof CalculateLocalCenterOnDiagram).forEach(node -> ((CalculateLocalCenterOnDiagram)node).calculateLocalCenterOnDiagram()));
  }
  
  default void calculateLocalCenterOnDiagram() {
    Point2D p = getMoDiagram().convertTo(this.convertFrom(new Point2D(0,0)));
    if(getCenterOnDiagram() != null && getCenterOnDiagram().equals(p)) {
      getChildren().stream().filter(node -> node instanceof CalculateLocalCenterOnDiagram).forEach(node -> ((CalculateLocalCenterOnDiagram)node).calculateLocalCenterOnDiagram());
    }
    getCenterOnDiagramProperty().set(p);
  }
}

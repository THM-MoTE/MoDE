package de.thm.mni.mote.mode.uiactor.editor.elementmanager.elements;

import de.thm.mni.mote.mode.modelica.graphics.MoLine;
import de.thm.mni.mote.mode.uiactor.control.modelica.FXMoParentGroup;
import de.thm.mni.mote.mode.uiactor.editor.elementmanager.interfaces.Hoverable;
import de.thm.mni.mote.mode.uiactor.editor.elementmanager.interfaces.Selectable;
import de.thm.mni.mote.mode.uiactor.editor.statemachine.elements.ModifyableLine;
import javafx.collections.ListChangeListener;
import javafx.geometry.Point2D;
import javafx.scene.Node;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import lombok.Getter;
import lombok.NonNull;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by hobbypunk on 13.02.17.
 */
@Getter
public class ManagedLine extends ModifyableLine implements Hoverable, Selectable {
  
  private Boolean isSelected = false;
  
  public ManagedLine(@NonNull FXMoParentGroup parent, @NonNull MoLine data) {
    super(parent, data);
    //initParentListener();
    
    getData().getPoints().addListener((ListChangeListener<Point2D>) c -> {
      removePointNodes();
      if (getIsSelected()) addPointNodes();
    });
  }
  
  @Override
  public void toFront() {
    super.toFront();
  }
  
  @Override
  public void init() {
    super.init();
  }
  
  @Override
  public void enterHover() {
    this.setStroke(Color.LIGHTCORAL);
  }
  
  @Override
  public void leaveHover() {
    this.setStroke(getData().getColorProperty().get());
  }
  
  @Override
  public void enterSelection() {
    this.setStroke(Color.RED);
    isSelected = true;
    addPointNodes();
  }
  
  @Override
  public void leaveSelection() {
    isSelected = false;
    removePointNodes();
    this.setStroke(getData().getColorProperty().get());
  }
  
  private void addPointNodes() {
    List<Point2D> points = getData().getPoints();
    for (int i = 1, pointsSize = points.size() - 1; i < pointsSize; i++) {
      Point2D p = points.get(i);
      Circle c = new Circle(p.getX(), p.getY(), 1);
      c.setFill(Color.RED);
      c.setStrokeWidth(0);
      this.getChildren().add(0, c);
    }
  }
  
  private void removePointNodes() {
    List<Node> list = this.getChildren().stream().filter(node -> node instanceof Circle).collect(Collectors.toList());
    this.getChildren().removeAll(list);
  }
}

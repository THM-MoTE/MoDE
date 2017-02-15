package de.thm.mni.mote.mode.uiactor.elementmanager.elements;

import de.thm.mni.mote.mode.modelica.graphics.MoLine;
import de.thm.mni.mote.mode.uiactor.control.modelica.MoGroup;
import de.thm.mni.mote.mode.uiactor.elementmanager.interfaces.Hoverable;
import de.thm.mni.mote.mode.uiactor.elementmanager.interfaces.Selectable;
import de.thm.mni.mote.mode.uiactor.shape.Line;
import javafx.collections.ListChangeListener;
import javafx.geometry.Point2D;
import javafx.scene.paint.Color;
import javafx.scene.shape.LineTo;
import javafx.scene.shape.MoveTo;
import lombok.NonNull;

import java.util.List;

/**
 * Created by hobbypunk on 13.02.17.
 */
public class ManagedLine extends Line implements Hoverable, Selectable {
  
  private ManagedLine realLine = null;
  
  public ManagedLine(@NonNull MoGroup parent, @NonNull MoLine data) {
    super(parent, data);
    realLine = new ManagedLine(this, data);
    realLine.strokeWidthProperty().addListener((observable, oldValue, newValue) -> {
      if (!oldValue.equals(newValue)) ManagedLine.this.setStrokeWidth(ManagedLine.this.getStrokeWidth() + ((newValue.doubleValue() < 3) ? 2 : 0));
    });
    
    realLine.init();
    parent.getBasis().getChildren().add(1, realLine);
    this.setStroke(Color.TRANSPARENT);
  }
  
  
  private ManagedLine(@NonNull ManagedLine parent, @NonNull MoLine data) {
    super(parent.getMoParent(), data);
    getData().getPoints().addListener((ListChangeListener<? super Point2D>) c -> calcCrosses());
  }
  
  
  @Override
  public void enterHover() {
    if (realLine != null) realLine.enterHover();
    else this.setStroke(Color.LIGHTCORAL);
  }
  
  @Override
  public void leaveHover() {
    if (realLine != null) realLine.leaveHover();
    else this.setStroke(getData().getColor().get());
  }
  
  @Override
  public void enterSelection() {
    if (realLine != null) realLine.enterSelection();
    else {
      this.setStroke(Color.RED);
      calcCrosses();
    }
  }
  
  @Override
  public void leaveSelection() {
    if (realLine != null) realLine.leaveSelection();
    else {
      calcElements(getData().getPoints());
      this.setStroke(getData().getColor().get());
    }
  }
  
  private void calcCrosses() {
    List<Point2D> points = getData().getPoints();
    for (int i = 1, pointsSize = points.size() - 1; i < pointsSize; i++) {
      Point2D p = points.get(i);
      this.getElements().add(new MoveTo(p.getX() - 1, p.getY() - 1));
      this.getElements().add(new LineTo(p.getX() + 1, p.getY() + 1));
      this.getElements().add(new MoveTo(p.getX() - 1, p.getY() + 1));
      this.getElements().add(new LineTo(p.getX() + 1, p.getY() - 1));
    }
  }
}

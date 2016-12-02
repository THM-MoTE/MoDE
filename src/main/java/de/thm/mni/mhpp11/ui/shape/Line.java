package de.thm.mni.mhpp11.ui.shape;

import de.thm.mni.mhpp11.modelica.graphics.MoLine;
import de.thm.mni.mhpp11.modelica.graphics.Utilities;
import de.thm.mni.mhpp11.ui.control.modelica.MoGroup;
import de.thm.mni.mhpp11.ui.shape.interfaces.CalculatePathElements;
import de.thm.mni.mhpp11.ui.shape.interfaces.Element;
import de.thm.mni.mhpp11.ui.shape.interfaces.Focusable;
import de.thm.mni.mhpp11.ui.shape.interfaces.HasInitialStroke;
import javafx.collections.ListChangeListener;
import javafx.geometry.Point2D;
import javafx.scene.paint.Color;
import javafx.scene.shape.LineTo;
import javafx.scene.shape.MoveTo;
import javafx.scene.shape.Path;
import javafx.scene.transform.Rotate;
import javafx.scene.transform.Transform;
import javafx.scene.transform.Translate;
import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;

import java.util.List;

/**
 * Created by hobbypunk on 02.11.16.
 */

@Getter
@Setter
public class Line extends Path implements Element, HasInitialStroke, CalculatePathElements, Focusable {
  private final MoGroup moParent;
  private final MoLine data;
  @Getter private Boolean hasFocus = false;
  
  private final Translate origin = Transform.translate(0., 0.);
  private final Rotate rotation = Transform.rotate(0., 0., 0.);
  
  Double initialStrokeWidth = 1.;
  
  public Line(@NonNull MoGroup parent, @NonNull MoLine data) {
    this.moParent = parent;
    this.data = data;
    data.getPoints().addListener(new ListChangeListener<Point2D>() {
      @Override
      public void onChanged(Change<? extends Point2D> c) {
        calcElements(getData().getPoints());
        if (hasFocus) calcFocus();
      }
    });
    init();
  }
  
  public void setInitialStrokeWidth(Double value) {
    initialStrokeWidth = value;
    setStrokeWidth(value);
  }
  
  public void init() {
    Element.super.init();
    
    calcElements(getData().getPoints());
    this.getStrokeDashArray().clear();
    this.getStrokeDashArray().addAll(Utilities.getLinePattern(getData().getLinePattern().get()));
    this.setInitialStrokeWidth(getData().getThickness());
    this.setStroke(getData().getColor().get());
  }
  
  @Override
  public void setFocus() {
    hasFocus = true;
    this.setStroke(Color.RED);
    calcFocus();
  }
  
  private void calcFocus() {
    List<Point2D> points = getData().getPoints();
    for (int i = 1, pointsSize = points.size() - 1; i < pointsSize; i++) {
      Point2D p = points.get(i);
      this.getElements().add(new MoveTo(p.getX() - 1, p.getY() - 1));
      this.getElements().add(new LineTo(p.getX() + 1, p.getY() + 1));
      this.getElements().add(new MoveTo(p.getX() - 1, p.getY() + 1));
      this.getElements().add(new LineTo(p.getX() + 1, p.getY() - 1));
    }
  }
  
  
  @Override
  public void clearFocus() {
    calcElements(getData().getPoints());
    this.setStroke(Color.BLACK);
    hasFocus = false;
  }
}

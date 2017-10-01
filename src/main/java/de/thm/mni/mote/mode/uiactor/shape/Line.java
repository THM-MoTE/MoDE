package de.thm.mni.mote.mode.uiactor.shape;

import de.thm.mni.mote.mode.modelica.graphics.MoLine;
import de.thm.mni.mote.mode.modelica.graphics.Utilities;
import de.thm.mni.mote.mode.uiactor.control.modelica.FXMoGroup;
import de.thm.mni.mote.mode.uiactor.shape.interfaces.CalculatePathElements;
import de.thm.mni.mote.mode.uiactor.shape.interfaces.Element;
import de.thm.mni.mote.mode.uiactor.shape.interfaces.HasStrokeWidth;
import javafx.collections.ListChangeListener;
import javafx.geometry.Point2D;
import javafx.scene.shape.Path;
import javafx.scene.transform.Rotate;
import javafx.scene.transform.Transform;
import javafx.scene.transform.Translate;
import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;

/**
 * Created by hobbypunk on 02.11.16.
 */

@Getter
@Setter
public class Line extends Path implements Element, HasStrokeWidth, CalculatePathElements {
  private final FXMoGroup moParent;
  private final MoLine data;
  
  private final Translate origin = Transform.translate(0., 0.);
  private final Rotate rotation = Transform.rotate(0., 0., 0.);
  
  Double initialStrokeWidth = 1.;
  
  public Line(@NonNull FXMoGroup parent, @NonNull MoLine data) {
    this.moParent = parent;
    this.data = data;
    data.getPoints().addListener((ListChangeListener<Point2D>) c -> calcElements(getData().getPoints()));
    init();
  }
  
  public void setInitialStrokeWidth(Double value) {
    initialStrokeWidth = value;
    setOwnStrokeWidth(value);
  }
  
  public void init() {
    Element.super.init();
    
    calcElements(getData().getPoints());
    this.getStrokeDashArray().clear();
    this.getStrokeDashArray().addAll(Utilities.getLinePattern(getData().getLinePattern().get()));
    this.setInitialStrokeWidth(getData().getThickness());
    this.setStroke(getData().getColor().get());
  }
}

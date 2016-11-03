package de.thm.mni.mhpp11.shape;

import de.thm.mni.mhpp11.control.icon.MoGroup;
import de.thm.mni.mhpp11.shape.interfaces.CalculatePathElements;
import de.thm.mni.mhpp11.shape.interfaces.Element;
import de.thm.mni.mhpp11.shape.interfaces.HasInitialStroke;
import de.thm.mni.mhpp11.util.parser.models.graphics.MoLine;
import de.thm.mni.mhpp11.util.parser.models.graphics.Utilities;
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
public class Line extends Path implements Element, HasInitialStroke, CalculatePathElements {
  private final MoGroup moParent;
  private final MoLine data;
  
  private final Translate origin = Transform.translate(0., 0.);
  private final Rotate rotation = Transform.rotate(0., 0., 0.);
  
  Double initialStrokeWidth = 1.;
  
  public Line(@NonNull MoGroup parent, @NonNull MoLine data) {
    this.moParent = parent;
    this.data = data;
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
    this.getStrokeDashArray().addAll(Utilities.getLinePattern(getData().getLinePattern()));
    this.setInitialStrokeWidth(getData().getThickness());
    this.setStroke(getData().getColor());
  }
  
}

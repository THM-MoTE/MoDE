package de.thm.mni.mote.mode.frontend.shape;

import de.thm.mni.mote.mode.modelica.graphics.MoLine;
import de.thm.mni.mote.mode.frontend.controls.modelica.FXMoParentGroup;
import de.thm.mni.mote.mode.frontend.shape.interfaces.HasStrokeWidth;
import javafx.beans.property.DoubleProperty;
import javafx.scene.Group;
import javafx.scene.paint.Paint;
import lombok.Getter;
import lombok.NonNull;

@Getter
public class Line extends Group implements HasStrokeWidth {
  
  private final FXMoParentGroup moParent;
  private final MoLine data;
  
  private final InternalLine line;
  private final Arrow startArrow;
  private final Arrow endArrow;
  
  public Line(@NonNull FXMoParentGroup parent, @NonNull MoLine data) {
    this.moParent = parent;
    this.data = data;
    this.line = new InternalLine(data);
    this.startArrow = new StartArrow(data);
    this.endArrow = new EndArrow(data);
    if(this.getClass() == Line.class) init();
  }
  
  public void init() {
    this.getChildren().add(this.line);
    this.getChildren().add(this.startArrow);
    this.getChildren().add(this.endArrow);
  }
  
  @Override
  public DoubleProperty getInitialStrokeWidthProperty() {
    return this.line.getInitialStrokeWidthProperty();
  }
  
  public void setStrokeWidth(double value) {
    this.line.setStrokeWidth(value);
  }
  
  protected void setStroke(Paint p) {
    this.line.setStroke(p);
    this.startArrow.setColor(p);
    this.endArrow.setColor(p);
  }
  
}

package de.thm.mni.mote.mode.uiactor.shape;

import de.thm.mni.mote.mode.modelica.graphics.MoLine;
import de.thm.mni.mote.mode.uiactor.control.modelica.FXMoParentGroup;
import de.thm.mni.mote.mode.uiactor.shape.interfaces.HasStrokeWidth;
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
  
  public Line(@NonNull FXMoParentGroup parent, @NonNull MoLine data) {
    this.moParent = parent;
    this.data = data;
    this.line = new InternalLine(data);
    if(this.getClass() == Line.class) init();
  }
  
  public void init() {
    this.getChildren().add(this.line);
    this.getChildren().add(new StartArrow(this));
    this.getChildren().add(new EndArrow(this));
  }
  
  @Override
  public Double getInitialStrokeWidth() {
    return this.line.getInitialStrokeWidth();
  }
  
  @Override
  public void setInitialStrokeWidth(Double value) {
    this.line.setInitialStrokeWidth(value);
  }
  
  public DoubleProperty strokeWidthProperty() {
    return this.line.strokeWidthProperty();
  }
  
  public void setStrokeWidth(double value) {
    this.line.setStrokeWidth(value);
  }
  
  protected void setStroke(Paint p) {
    this.line.setStroke(p);
  }
  
}

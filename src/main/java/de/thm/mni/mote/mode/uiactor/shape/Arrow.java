package de.thm.mni.mote.mode.uiactor.shape;

import de.thm.mni.mote.mode.modelica.graphics.MoLine;
import javafx.geometry.Point2D;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Polygon;
import javafx.scene.transform.Rotate;
import lombok.Getter;

//From: https://stackoverflow.com/questions/26702519/javafx-line-curve-with-arrow-head
abstract class Arrow extends Polygon {
  
  public double rotate;
  public float t = 0;
  @Getter private final MoLine data;
  private Rotate rz;
  
  abstract Point2D getStartPoint();
  abstract Point2D getNextPoint();
  
  public Arrow(MoLine data) {
    super();
    this.data = data;
    init();
  }
  
  private void init() {
  }

  public void setColor(Paint p) {
    this.setStroke(p);
    this.setFill(p);
  }
}

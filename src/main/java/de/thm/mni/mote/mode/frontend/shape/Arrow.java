package de.thm.mni.mote.mode.frontend.shape;

import de.thm.mni.mote.mode.modelica.graphics.MoLine;
import de.thm.mni.mote.mode.frontend.shape.interfaces.Element;
import de.thm.mni.mote.mode.frontend.shape.interfaces.HasStrokeWidth;
import javafx.beans.property.DoubleProperty;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.geometry.Point2D;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.scene.shape.LineTo;
import javafx.scene.shape.MoveTo;
import javafx.scene.shape.Path;
import javafx.scene.transform.Rotate;
import javafx.scene.transform.Transform;
import javafx.scene.transform.Translate;
import lombok.Getter;

@Getter
abstract class Arrow extends Path implements Element, HasStrokeWidth {
  
  private final Translate origin = Transform.translate(0., 0.);
  private final Rotate rotation = Transform.rotate(0., 0., 0.);
  
  DoubleProperty initialStrokeWidthProperty = new SimpleDoubleProperty(1.);
  
  @Getter private final MoLine data;
  
  abstract ObjectProperty<Point2D> getStartPointProperty();
  abstract ObjectProperty<Point2D> getNextPointProperty();
  abstract ObjectProperty<MoLine.Arrow> getArrowProperty();
  
  public Arrow(MoLine data) {
    super();
    this.data = data;
    init();
  }
  
  public void init() {
    Element.super.init();
  
    setColor(data.getColorProperty().get());
    getStartPointProperty().addListener((observable, oldValue, newValue) -> redraw());
    getNextPointProperty().addListener((observable, oldValue, newValue) -> redraw());
    getArrowProperty().addListener((observable, oldValue, newValue) -> redraw());
    redraw();
  }
  
  private void redraw() {
    getElements().clear();
    if(getArrow() != MoLine.Arrow.NONE) {
      Point2D p2 = getStartPoint();
      Point2D p1 = getNextPoint();
  
      //From: https://gist.github.com/kn0412/2086581e98a32c8dfa1f69772f14bca4
      //Line
      getElements().add(new MoveTo(p2.getX(), p2.getY()));
  
      double arrowHeadSize = getData().getArrowSizeProperty().get();
      //ArrowHead
      double angle = Math.atan2((p2.getY() - p1.getY()), (p2.getX() - p1.getX())) - Math.PI / 2.0;
      double sin = Math.sin(angle);
      double cos = Math.cos(angle);
      //point1
      double x1 = (-1.0 / 2.0 * cos + Math.sqrt(3) / 2 * sin) * arrowHeadSize + p2.getX();
      double y1 = (-1.0 / 2.0 * sin - Math.sqrt(3) / 2 * cos) * arrowHeadSize + p2.getY();
      //point2
      double x2 = (1.0 / 2.0 * cos + Math.sqrt(3) / 2 * sin) * arrowHeadSize + p2.getX();
      double y2 = (1.0 / 2.0 * sin - Math.sqrt(3) / 2 * cos) * arrowHeadSize + p2.getY();
  
      getElements().add(new LineTo(x1, y1));
      if(getArrow() == MoLine.Arrow.HALF)
        getElements().add(new MoveTo(x2, y2));
      else
        getElements().add(new LineTo(x2, y2));
      getElements().add(new LineTo(p2.getX(), p2.getY()));
    }
  }
  
  public void setInitialStrokeWidth(Double value) {
    HasStrokeWidth.super.setInitialStrokeWidth(value);
    setOwnStrokeWidth(value);
  }
  
  public void setColor(Paint p) {
    this.setStroke((getArrow() == MoLine.Arrow.NONE) ? Color.TRANSPARENT : p);
    this.setFill((getArrow() == MoLine.Arrow.FILLED) ? p : Color.TRANSPARENT);
  }
  
  private Point2D getStartPoint() {
    return getStartPointProperty().get();
  }
  
  private Point2D getNextPoint() {
    return getNextPointProperty().get();
  }
  
  private MoLine.Arrow getArrow() {
    return getArrowProperty().get();
  }
}

package de.thm.mni.mhpp11.control;

import de.thm.mni.mhpp11.util.config.model.Point;
import de.thm.mni.mhpp11.util.parser.models.annotations.MoIcon;
import de.thm.mni.mhpp11.util.parser.models.graphics.*;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.scene.transform.Transform;

/**
 * Created by hobbypunk on 19.09.16.
 */
public class MoIconPane extends Pane {
  
  private MoIcon icon;
  
  private Double moveX = 100.0;
  private Double moveY = 100.0;
  
  private Double width = 200.0;
  private Double height = 200.0;
  
  private Double initialScale = 1.0;
  private Boolean preserveAspectRatio = true;
  
  public MoIconPane(MoIcon icon) {
    this.icon = icon;
    initCoordinateSystem();
    initImage();
    this.scaleTo(100., 100.);
  }
  
  public void scaleTo(Double width, Double height) {
    Double scaleX = width / this.width;
    Double scaleY = height / this.height;
    this.getTransforms().addAll(Transform.scale(scaleX, scaleY));
    this.setPrefHeight(height);
    this.setPrefWidth(width);
  }
  
  private void initCoordinateSystem() {
    MoCoordinateSystem mcs = icon.getMoCoordinateSystem();
    if (mcs.getExtent() != null) {
      Point<Double, Double>[] extent = mcs.getExtent();
    
      Double tlx = extent[(extent[0].getX() < extent[1].getX()) ? 0 : 1].getX();
      Double tly = moveY = extent[(extent[0].getY() > extent[1].getY()) ? 0 : 1].getY();
    
      Double brx = moveX = extent[(extent[0].getX() > extent[1].getX()) ? 0 : 1].getX();
      Double bry = extent[(extent[0].getY() < extent[1].getY()) ? 0 : 1].getY();
    
      width = brx - tlx;
      height = tly - bry;
    }
    
    if (mcs.getPreserveAspectRatio() != null) this.preserveAspectRatio = mcs.getPreserveAspectRatio();
    if (mcs.getInitialScale() != null) this.initialScale = mcs.getInitialScale();
  
    this.setPrefWidth(width);
    this.setPrefHeight(height);
  }
  
  private void initImage() {
    for (MoGraphic mg : icon.getMoGraphics()) {
      initImage(mg);
    }
  }
  
  private void initImage(MoGraphic mg) {
    Shape shape = null;
    if (mg instanceof MoText) {
      shape = createText((MoText) mg);
    }else if (mg instanceof MoRectangle) {
      shape = createRectangle((MoRectangle) mg);
    } else if(mg instanceof MoEllipse) {
      shape = createEllipse((MoEllipse) mg);
    } else if (mg instanceof MoLine) {
      shape = createLine((MoLine) mg);
    } else if (mg instanceof MoPolygon) {
      shape = createPolygon((MoPolygon) mg);
    }
    
    if (shape != null) {
      if (mg instanceof MoFilledShape) {
        shape = setFilledShape((MoFilledShape) mg, shape);
      }
  
      shape.getTransforms().add(Transform.translate(mg.getOrigin().getX(), -mg.getOrigin().getY()));
      shape.getTransforms().add(Transform.rotate(mg.getRotation(), 0, 0));
      shape.getTransforms().add(Transform.translate(moveX, moveY));
  
      this.getChildren().add(shape);
    }
  }
  
  private Shape setFilledShape(MoFilledShape mfs, Shape shape) {
    if (!(mfs instanceof MoText) && mfs.getFillPattern() == MoFilledShape.FillPattern.SOLID) {
      shape.setFill(mfs.getFillColor());
    } else if (!(mfs instanceof MoText) && mfs.getFillPattern() == MoFilledShape.FillPattern.NONE) {
      shape.setFill(Color.TRANSPARENT);
    }
    shape.setStrokeWidth(mfs.getLineThickness());
  
    if (!(mfs instanceof MoText) && mfs.getPattern() == MoGraphic.Utilities.LinePattern.SOLID) {
      shape.setStroke(mfs.getLineColor());
    } else if (!(mfs instanceof MoText) && mfs.getPattern() == MoGraphic.Utilities.LinePattern.NONE) {
      shape.setStroke(Color.TRANSPARENT);
    }
    
    return shape;
  }
  
  private Text createText(MoText mt) {
    Text text = new Text();
    Point<Double, Double>[] extent = mt.getExtent();
    Font f;
    if (mt.getFontSize() != 0) {
      f = Font.font(mt.getFontName(), mt.getFontSize());
    } else {
      f = Font.font(mt.getFontName(), 20);
      f = Font.font(f.getFamily(), MoGraphic.Utilities.calculateMaxFontSize(f, mt.getTextString(), Math.abs(-extent[0].getX() + extent[1].getX()), Math.abs(-extent[0].getY() + extent[1].getY())));
    }
    
    text.setFont(f);
    text.setText(mt.getTextString());
    text.setUnderline(MoText.TextStyle.isUnterline(mt.getTextStyle()));
  
    Double tlx = extent[(extent[0].getX() < extent[1].getX()) ? 0 : 1].getX();
    Double tly = extent[(extent[0].getY() > extent[1].getY()) ? 0 : 1].getY();
  
    Double brx = extent[(extent[0].getX() > extent[1].getX()) ? 0 : 1].getX();
    Double bry = extent[(extent[0].getY() < extent[1].getY()) ? 0 : 1].getY();
  
    Double w1 = brx - tlx;
    Double h1 = tly - bry;
    Double h2 = MoGraphic.Utilities.calculateFontHeight(f);
    Double w2 = MoGraphic.Utilities.calculateStringWidth(f, mt.getTextString());
  
    text.setY(((h1 - h2) / 2));
    if (mt.getHorizontalAlignment() == MoText.TextAlignment.LEFT) {
      text.setX(0);
    } else if (mt.getHorizontalAlignment() == MoText.TextAlignment.RIGHT) {
      text.setX(w1 - w2);
    } else if (mt.getHorizontalAlignment() == MoText.TextAlignment.CENTER) {
      text.setX(((w1 - w2) / 2));
    }
  
    text.setFill((mt.getTextColor() != null) ? mt.getTextColor() : mt.getLineColor());
    text.getTransforms().add(Transform.translate(tlx, tly));
    return text;
  }
  
  private Rectangle createRectangle(MoRectangle mr) {
    Rectangle rect = new Rectangle();
    Point<Double, Double>[] r = mr.getExtent();
    rect.setX(r[0].getX());
    rect.setY(-r[0].getY());
    rect.setWidth(r[0].getX() - r[1].getX());
    rect.setHeight(r[0].getY() - r[1].getY());
    
    return rect;
  }
  
  private Shape createEllipse(MoEllipse me) {
    Point<Double, Double>[] extent = me.getExtent();
    
    Double tlx = extent[(extent[0].getX() < extent[1].getX()) ? 0 : 1].getX();
    Double tly = extent[(extent[0].getY() > extent[1].getY()) ? 0 : 1].getY();
    
    Double brx = extent[(extent[0].getX() > extent[1].getX()) ? 0 : 1].getX();
    Double bry = extent[(extent[0].getY() < extent[1].getY()) ? 0 : 1].getY();
    
    Double w1 = brx - tlx;
    Double h1 = tly - bry;
    
    if (me.getEndAngle() + me.getStartAngle() == 360) {
      Ellipse e = new Ellipse();
      e.setCenterX((tlx + brx) / 2);
      e.setCenterY((tly + bry) / 2);
      e.setRadiusX(w1 / 2);
      e.setRadiusY(h1 / 2);
      
      return e;
    } else {
      Arc a = new Arc();
      a.setCenterX((tlx + brx) / 2);
      a.setCenterY((tly + bry) / 2);
      a.setRadiusX(w1 / 2);
      a.setRadiusY(h1 / 2);
      
      a.setStartAngle(me.getStartAngle());
      a.setLength(me.getEndAngle() - me.getStartAngle());
      a.setType(ArcType.ROUND);
      return a;
    }
  }
  
  private Polyline createLine(MoLine ml) {
    Polyline line = new Polyline();
    for (Point<Double, Double> p : ml.getPoints()) {
      line.getPoints().addAll(p.getX(), -p.getY());
    }
    
    return line;
  }
  
  private Polygon createPolygon(MoPolygon mp) {
    Polygon polygon = new Polygon();
    for (Point<Double, Double> p : mp.getPoints()) {
      polygon.getPoints().addAll(p.getX(), -p.getY());
    }
    
    return polygon;
  }
}

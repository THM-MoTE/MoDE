package de.thm.mni.mhpp11.control;

import de.thm.mni.mhpp11.util.config.model.Point;
import de.thm.mni.mhpp11.util.parser.models.MoIcon;
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
  
  private Double w = 200.0;
  private Double h = 200.0;
  
  private Double initialScale = 1.0;
  private Boolean preserveAspectRatio = true;
  
  public MoIconPane(MoIcon icon) {
    this.icon = icon;
    initCoordinateSystem();
    initImage();
    this.getTransforms().add(Transform.translate(moveX, moveY));
    //this.scaleTo(25.0, 25.0);
  }
  
  public void scaleTo(Double width, Double height) {
    Double scaleX = width / w;
    Double scaleY = height / h;
    this.getTransforms().addAll(Transform.scale(scaleX, scaleY), Transform.translate(-(width / 2), -(height / 2)));
    this.setPrefHeight(height);
    this.setPrefWidth(width);
  }
  
  private void initCoordinateSystem() {
    MoCoordinateSystem mcs = icon.getMoCoordinateSystem();
    if (mcs.getExtent() != null && mcs.getExtent().size() > 0) {
      Boolean minFirst = mcs.getExtent().get(0).get(0) < mcs.getExtent().get(1).get(0);
      
      Double minX = mcs.getExtent().get((minFirst) ? 0 : 1).get(0);
      Double maxX = moveX = mcs.getExtent().get((minFirst) ? 1 : 0).get(0);
      
      minFirst = mcs.getExtent().get(0).get(1) < mcs.getExtent().get(1).get(1);
      
      Double minY = mcs.getExtent().get((minFirst) ? 0 : 1).get(1);
      Double maxY = moveY = mcs.getExtent().get((minFirst) ? 1 : 0).get(1);
      
      w = Math.abs(minX - maxX);
      h = Math.abs(minY - maxY);
    }
    
    if (mcs.getPreserveAspectRatio() != null) this.preserveAspectRatio = mcs.getPreserveAspectRatio();
    if (mcs.getInitialScale() != null) this.initialScale = mcs.getInitialScale();
  
    this.setPrefWidth(w);
    this.setPrefHeight(h);
    this.setMinWidth(w);
    this.setMinHeight(h);
    this.setMaxWidth(w);
    this.setMaxHeight(h);
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
      this.getChildren().add(shape);
    }
  }
  
  private Shape setFilledShape(MoFilledShape mfs, Shape shape) {
    if (mfs.getFillPattern() == MoFilledShape.FillPattern.SOLID) {
      shape.setFill(mfs.getFillColor());
    } else if (mfs.getFillPattern() == MoFilledShape.FillPattern.NONE) {
      shape.setFill(Color.TRANSPARENT);
    }
    shape.setStrokeWidth(mfs.getLineThickness());
    
    if (mfs.getPattern() == MoGraphic.Utilities.LinePattern.SOLID) {
      shape.setStroke(mfs.getLineColor());
    } else if (mfs.getPattern() == MoGraphic.Utilities.LinePattern.NONE) {
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
      f = Font.font(f.getFamily(), MoGraphic.Utilities.calculateMaxFontSize(f, mt.getTextString(), Math.abs(-extent[0].getX() + extent[1].getX()) - 10, Math.abs(-extent[0].getY() + extent[1].getY()) - 10));
    }
    
    text.setFont(f);
    text.setText(mt.getTextString());
    text.setUnderline(MoText.TextStyle.isUnterline(mt.getTextStyle()));
    
    Double h = MoGraphic.Utilities.calculateFontHeight(f);
    Double w = MoGraphic.Utilities.calculateStringWidth(f, mt.getTextString());
    
    text.setX(extent[0].getX());
    text.setY(h + (h * 0.5));
    
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
  
  private Shape createEllipse(MoEllipse me) {
    Point<Double, Double>[] r = me.getExtent();
    if (me.getEndAngle() + me.getStartAngle() == 360) {
      Ellipse e = new Ellipse();
      e.setCenterX(0);
      e.setCenterY(0);
      e.setRadiusX(Math.abs(r[0].getX() - r[1].getX()) / 2);
      e.setRadiusY(Math.abs(r[0].getY() - r[1].getY()) / 2);
      return e;
    } else {
      Arc a = new Arc();
      a.setCenterX(0);
      a.setCenterY(0);
      a.setRadiusX(Math.abs(r[0].getX() - r[1].getX()) / 2);
      a.setRadiusY(Math.abs(r[0].getY() - r[1].getY()) / 2);
      a.setStartAngle(me.getStartAngle());
      a.setLength(me.getEndAngle() - me.getStartAngle());
      a.setType(ArcType.ROUND);
      return a;
    }
  }
}

package de.thm.mni.mhpp11.control.icon;

import de.thm.mni.mhpp11.util.config.model.Point;
import de.thm.mni.mhpp11.util.parser.models.MoClass;
import de.thm.mni.mhpp11.util.parser.models.graphics.*;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.scene.transform.Transform;

/**
 * Created by hobbypunk on 19.09.16.
 */
public class MoIconPane extends MoPane {
  private final Boolean iconOnly;
  
  public MoIconPane(MoClass moClass) {
    this(moClass, true);
  }
  
  public MoIconPane(MoClass moClass, Boolean iconOnly) {
    super(moClass);
    this.iconOnly = iconOnly;
    init();
  }
  
  protected void initImage() {
    this.getMoClass().getIcon().getMoGraphics().stream().filter(mg -> !iconOnly || (!(mg instanceof MoText))).forEach(this::initImage);
    if (!iconOnly)
      initConnectors();
  }
  
  private void initConnectors() {
    getMoClass().getConnectorVariables().forEach(super::initVariable);
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
      this.add(shape);
      shape.getTransforms().add(Transform.rotate(mg.getRotation(), mg.getOrigin().getX(), mg.getOrigin().getY()));
      shape.getTransforms().add(Transform.translate(mg.getOrigin().getX(), mg.getOrigin().getY()));
    }
  }
  
  private Shape setFilledShape(MoFilledShape mfs, Shape shape) {
    shape.setFill(Utilities.getFill(mfs.getFillPattern(), mfs.getFillColor(), mfs.getLineColor()));
  
  
    if (!(mfs instanceof MoText) && mfs.getPattern() == Utilities.LinePattern.SOLID) {
      shape.setStroke(mfs.getLineColor());
    } else if (!(mfs instanceof MoText) && mfs.getPattern() == Utilities.LinePattern.NONE) {
      shape.setStroke(Color.TRANSPARENT);
    }
    //LinePattern:
    shape.setStrokeWidth(mfs.getLineThickness());
    shape.getStrokeDashArray().addAll(Utilities.getLinePattern(mfs.getPattern()));
    
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
      f = Font.font(f.getFamily(), Utilities.calculateMaxFontSize(f, mt.getString(), Math.abs(-extent[0].getX() + extent[1].getX()), Math.abs(-extent[0].getY() + extent[1].getY())));
    }
    
    text.setFont(f);
    text.setText(mt.getString());
    text.setUnderline(MoText.TextStyle.isUnterline(mt.getTextStyle()));
  
  
    Double tlx = Math.min(extent[0].getX(), extent[1].getX());
    Double tly = Math.min(extent[0].getY(), extent[1].getY());
  
    Double widthExtent = Math.abs(extent[0].getX() - extent[1].getX());
    Double heightExtent = Math.abs(extent[0].getY() - extent[1].getY());
  
    Double widthText = Utilities.calculateStringWidth(f, mt.getString());
    Double heightText = Utilities.calculateFontHeight(f);
  
    text.setY(((heightExtent - heightText) / 2));
    
    if (mt.getHorizontalAlignment() == MoText.TextAlignment.LEFT) {
      text.setX(0);
    } else if (mt.getHorizontalAlignment() == MoText.TextAlignment.RIGHT) {
      text.setX(widthExtent - widthText);
    } else if (mt.getHorizontalAlignment() == MoText.TextAlignment.CENTER) {
      text.setX(((widthExtent - widthText) / 2));
    }
    //translate the text
    text.getTransforms().add(Transform.translate(tlx, tly));
  
    Double textCenterX = mt.getOrigin().getX() + tlx + (widthExtent / 2);
    Double textCenterY = mt.getOrigin().getY() + tly + heightExtent / 1.3; //TODO add textHeight
    if (getFlippedX()) {
      text.getTransforms().add(Transform.scale(-1., 1., textCenterX, textCenterY));
    }
    if (!getFlippedY()) {
      text.getTransforms().add(Transform.scale(1., -1., textCenterX, textCenterY));
    }
    return text;
  }
  
  private Rectangle createRectangle(MoRectangle mr) {
    Rectangle rect = new Rectangle();
    Point<Double, Double>[] extent = mr.getExtent();
    rect.setX(Math.min(extent[0].getX(), extent[1].getX()));
    rect.setY(Math.min(extent[0].getY(), extent[1].getY()));
    rect.setWidth(Math.abs(extent[0].getX() - extent[1].getX()));
    rect.setHeight(Math.abs(extent[0].getY() - extent[1].getY()));
    rect.setArcHeight(mr.getRadius() * 2);
    rect.setArcWidth(mr.getRadius() * 2);
    
    return rect;
  }
  
  private Shape createEllipse(MoEllipse me) {
    Point<Double, Double>[] extent = me.getExtent();
  
    Double minX = Math.min(extent[0].getX(), extent[1].getX());
    Double minY = Math.min(extent[0].getY(), extent[1].getY());
  
    Double radiusX = Math.abs(extent[0].getX() - extent[1].getX()) / 2;
    Double radiusY = Math.abs(extent[0].getY() - extent[1].getY()) / 2;
    
    if (me.getEndAngle() + me.getStartAngle() == 360) {
      Ellipse e = new Ellipse();
      e.setCenterX(minX + radiusX);
      e.setCenterY(minY + radiusY);
      e.setRadiusX(radiusX);
      e.setRadiusY(radiusY);
      
      return e;
    } else {
      Arc a = new Arc();
      a.setCenterX(minX + radiusX);
      a.setCenterY(minY + radiusY);
      a.setRadiusX(radiusX);
      a.setRadiusY(radiusY);
      
      a.setStartAngle(me.getStartAngle());
      a.setLength(me.getEndAngle() - me.getStartAngle());
      a.setType(ArcType.ROUND);
      return a;
    }
  }
  
  private Polyline createLine(MoLine ml) {
    Polyline line = new Polyline();
    for (Point<Double, Double> p : ml.getPoints()) {
      line.getPoints().addAll(p.getX(), p.getY());
    }
    
    return line;
  }
  
  private Polygon createPolygon(MoPolygon mp) {
    Polygon polygon = new Polygon();
    for (Point<Double, Double> p : mp.getPoints()) {
      polygon.getPoints().addAll(p.getX(), p.getY());
    }
    
    return polygon;
  }
}

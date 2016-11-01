package de.thm.mni.mhpp11.control.icon;

import de.thm.mni.mhpp11.util.config.model.Point;
import de.thm.mni.mhpp11.util.parser.models.MoClass;
import de.thm.mni.mhpp11.util.parser.models.MoVariable;
import de.thm.mni.mhpp11.util.parser.models.graphics.*;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.scene.transform.Scale;
import javafx.scene.transform.Transform;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by hobbypunk on 26.10.16.
 */

@Getter(AccessLevel.PROTECTED)
@Setter(AccessLevel.PROTECTED)
public abstract class MoPane extends Group {
  private final Pane basis = new Pane();
  
  private final MoClass moClass;
  
  private Map<MoVariable, MoIconPane> data = new HashMap<>();
  
  private Double moveX = 100.0;
  private Double moveY = 100.0;
  
  private Double initialScale = 1.0;
  private Boolean preserveAspectRatio = true;
  
  private Scale scale = Transform.scale(1., 1.);
  
  private List<Transform> transformList = new ArrayList<>();
  
  private Boolean flippedX = false; //X axis is flipped
  private Boolean flippedY = false; //Y axis is flipped
  
  MoPane(@NonNull MoClass moClass) {
    this.moClass = moClass;
    basis.getTransforms().add(scale);
    this.getChildren().add(basis);
    //TODO: prevent scaling of stroke!
//    ChangeListener<Number> listener = (observable, oldValue, newValue) -> preventScaling(oldValue.doubleValue(), newValue.doubleValue());
//    this.scale.xProperty().addListener(listener);
  }
  
  final void init() {
    if (moClass.getIcon() != null) {
      initCoordinateSystem();
      initImage();
    }
  }
  
  private void preventScaling(Double oldValue, Double newValue) {
    getBasis().getChildren().forEach(node -> {
      if (node instanceof MoPane) ((MoPane) node).preventScaling(oldValue, newValue);
      else if (node instanceof Shape) {
        Shape s = (Shape) node;
        s.setStrokeWidth((oldValue / newValue) * s.getStrokeWidth());
      }
    });
  }
  
  public MoPane scaleTo(Double width, Double height) {
    Point<Double, Double>[] extent = this.getMoClass().getIcon().getMoCoordinateSystem().getExtent();
    Double defaultWidth = Math.max(extent[0].getX(), extent[1].getX()) - Math.min(extent[0].getX(), extent[1].getX());
    Double defaultHeight = Math.max(extent[0].getY(), extent[1].getY()) - Math.min(extent[0].getY(), extent[1].getY());
    
    scale.setX(width / defaultWidth);
    scale.setY(height / defaultHeight);
    return this;
  }
  
  private void initCoordinateSystem() {
    MoCoordinateSystem mcs = this.getMoClass().getIcon().getMoCoordinateSystem();
    
    Point<Double, Double>[] extent = mcs.getExtent();
    Double minX = Math.min(extent[0].getX(), extent[1].getX());
    Double minY = Math.min(extent[0].getY(), extent[1].getY());
    Double width = Math.max(extent[0].getX(), extent[1].getX()) - Math.min(extent[0].getX(), extent[1].getX());
    Double height = Math.max(extent[0].getY(), extent[1].getY()) - Math.min(extent[0].getY(), extent[1].getY());
    
    transformList.add(Transform.translate(0, height));
    transformList.add(Transform.scale(1., -1.));
    
    if (extent[1].getX() < extent[0].getX()) {
      transformList.add(Transform.translate(width, 0));
      transformList.add(Transform.scale(-1., 1.));
      flippedX = true;
    }
    
    if (extent[1].getY() < extent[0].getY()) {
      transformList.add(Transform.translate(0, height));
      transformList.add(Transform.scale(1., -1.));
      flippedY = true;
    }
    transformList.add(Transform.translate(-minX, -minY));
    
    
    if (mcs.getPreserveAspectRatio() != null) this.setPreserveAspectRatio(mcs.getPreserveAspectRatio());
    if (mcs.getInitialScale() != null) this.setInitialScale(mcs.getInitialScale());
  }
  
  void initVariable(MoVariable mv) {
    if (mv.getPlacement() == null) return;
    MoIconPane mip = new MoIconPane(mv.getType(), false);
    
    MoTransformation mt = null;
    if (this instanceof MoIconPane) mt = mv.getPlacement().getIconTransformation();
    if (mt == null) mt = mv.getPlacement().getDiagramTransformation();
    if (mt == null) return;
    
    Point<Double, Double> origin = mt.getOrigin();
    Point<Double, Double>[] extent = mt.getExtent();
    mip.setLayoutX(origin.getX());
    mip.setLayoutY(-origin.getY());
    Double width = Math.max(extent[0].getX(), extent[1].getX()) - Math.min(extent[0].getX(), extent[1].getX());
    Double height = Math.max(extent[0].getY(), extent[1].getY()) - Math.min(extent[0].getY(), extent[1].getY());
    
    mip.scaleTo(width, height);
    
    if (getFlippedX()) {
      mip.getTransforms().add(Transform.translate(width, 0));
      mip.getTransforms().add(Transform.scale(-1, 1));
    }
    
    mip.getTransforms().add(Transform.translate(0, height));
    mip.getTransforms().add(Transform.scale(1, -1));
    
    data.put(mv, mip);
    this.add(mip);
  }
  
  protected abstract void initImage();
  
  public void add(Node node) {
    node.getTransforms().addAll(0, transformList);
    basis.getChildren().add(node);
  
  }
  
  void initImage(MoGraphic mg) {
    initImage(mg, mg.getOrigin());
  }
  
  private void initImage(MoGraphic mg, Point<Double, Double> origin) {
    Shape shape = null;
    if (mg instanceof MoText) {
      shape = createText((MoText) mg);
    } else if (mg instanceof MoRectangle) {
      shape = createRectangle((MoRectangle) mg);
    } else if (mg instanceof MoEllipse) {
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
      shape.getTransforms().add(Transform.rotate(mg.getRotation(), origin.getX(), origin.getY()));
      shape.getTransforms().add(Transform.translate(origin.getX(), origin.getY()));
    }
  }
  
  private Shape setFilledShape(MoFilledShape mfs, Shape shape) {
    shape.setStyle(shape.getStyle() + " " + Utilities.getFillCSS(mfs.getFillPattern(), mfs.getFillColor(), mfs.getLineColor()));
    
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
    line.getStrokeDashArray().addAll(Utilities.getLinePattern(ml.getLinePattern()));
    line.setStrokeWidth(ml.getThickness());
    line.setStroke(ml.getColor());
    
    return line;
  }
  
  private Polygon createPolygon(MoPolygon mp) {
    Polygon polygon = new Polygon();
    for (Point<Double, Double> p : mp.getPoints()) {
      polygon.getPoints().addAll(p.getX(), p.getY());
    }
    
    return polygon;
  }
  
  public void setInternalStyle(String style) {
    basis.setStyle(style);
  }
  
}

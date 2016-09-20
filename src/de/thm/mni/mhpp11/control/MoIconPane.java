package de.thm.mni.mhpp11.control;

import de.thm.mni.mhpp11.util.config.model.Point;
import de.thm.mni.mhpp11.util.parser.models.MoIcon;
import de.thm.mni.mhpp11.util.parser.models.graphics.*;
import javafx.scene.layout.Pane;
import javafx.scene.shape.*;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.scene.transform.Transform;

import java.util.List;

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
  }
  
  private void initImage() {
    for (MoGraphic mg : icon.getMoGraphics()) {
      initImage(mg);
    }
  }
  
  private void initImage(MoGraphic mg) {
    Shape shape = null;
    if (mg instanceof MoText) {
      shape = new Text();
      Point<Double, Double>[] r = ((MoText)mg).getExtent();
      ((Text)shape).setFont(Font.font(((MoText)mg).getFontName(), ((MoText)mg).getFontSize()));
      ((Text)shape).setText(((MoText) mg).getTextString());
      ((Text)shape).setUnderline(MoText.TextStyle.isUnterline(((MoText)mg).getTextStyle()));
      ((Text)shape).setX(r[0].getX());
      ((Text)shape).setY(r[0].getY());
    }else if (mg instanceof MoRectangle) {
      shape = new Rectangle();
      Point<Double, Double>[] r = ((MoRectangle) mg).getExtent();
      ((Rectangle) shape).setX(r[0].getX());
      ((Rectangle) shape).setY(r[0].getY());
      ((Rectangle) shape).setWidth(r[0].getX() - r[1].getX());
      ((Rectangle) shape).setHeight(r[0].getY() - r[1].getY());
    } else if(mg instanceof MoEllipse) {
      shape = new Arc();
      Point<Double, Double>[] r = ((MoEllipse) mg).getExtent();
      ((Arc) shape).setCenterX(0);
      ((Arc) shape).setCenterY(0);
      ((Arc) shape).setRadiusX(Math.abs(r[0].getX() - r[1].getX())/2);
      ((Arc) shape).setRadiusY(Math.abs(r[0].getY() - r[1].getY())/2);
      ((Arc) shape).setStartAngle(((MoEllipse)mg).getStartAngle());
      ((Arc) shape).setLength(((MoEllipse)mg).getEndAngle() - ((MoEllipse)mg).getStartAngle());
      ((Arc) shape).setType(ArcType.ROUND);
    } else if (mg instanceof MoLine) {
      shape = new Polyline();
      List<Point<Double, Double>> points = ((MoLine) mg).getPoints();
      for (Point<Double, Double> p : points) {
        ((Polyline) shape).getPoints().addAll(p.getX(), p.getY());
      }
    } else if (mg instanceof MoPolygon) {
      shape = new Polygon();
      List<Point<Double, Double>> points = ((MoPolygon) mg).getPoints();
      for (Point<Double, Double> p : points) {
        ((Polygon) shape).getPoints().addAll(p.getX(), p.getY());
      }
      
    }
    
    if (shape != null) {
      if (mg instanceof MoFilledShape) {
        shape.fillProperty().setValue(((MoFilledShape) mg).getFillColor());
      }
      shape.getTransforms().addAll(Transform.scale(1, -1), Transform.translate(0, -h), Transform.translate(moveX, moveY), Transform.translate(mg.getOrigin().getX(), mg.getOrigin().getY()));
      this.getChildren().add(shape);
    }
  }
  
  private Point<Double, Double> convertTo(Point<Double, Double> origin, Point<Double, Double> point) {
    point.setX(point.getX() + moveX);
    point.setY(point.getY() + moveY);
    return point;
  }
  
  private Point<Double, Double> moveBaseline(Point<Double, Double> moPoint) {
    moPoint.setX(moPoint.getX() + moveX);
    moPoint.setY(moPoint.getY() + moveY);
    return moPoint;
  }
  
  private Double flipY(Double y) {
    return h - y;
  }
}

package de.thm.mni.mote.mode.frontend.shape.interfaces;

import de.thm.mni.mote.mode.modelica.graphics.HasSmoothOption;
import de.thm.mni.mote.mode.modelica.graphics.Utilities;
import javafx.collections.ObservableList;
import javafx.geometry.Point2D;
import javafx.scene.shape.LineTo;
import javafx.scene.shape.MoveTo;
import javafx.scene.shape.PathElement;
import javafx.scene.shape.QuadCurveTo;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Marcel Hoppe on 03.11.16.
 */
public interface CalculatePathElements {
  
  HasSmoothOption getData();
  
  ObservableList<PathElement> getElements();
  
  default Boolean isBezier() {
    return getData().getSmoothProperty().get().equals(Utilities.Smooth.BEZIER);
  }
  
  default void calcElements(List<Point2D> points) {
    getElements().clear();
    Boolean closed = (points.size() > 3 && points.get(0).equals(points.get(points.size() - 1)));
    
    if (isBezier() && points.size() > 2) {
      getElements().addAll(calcBezierElements(points));
    } else {
      for (Point2D p : points) {
        if (getElements().size() == 0) getElements().add(new MoveTo(p.getX(), p.getY()));
        else getElements().add(new LineTo(p.getX(), p.getY()));
      }
    }
  }
  
  default List<PathElement> calcBezierElements(List<Point2D> points) {
    List<PathElement> elements = new ArrayList<>();
    Point2D controlPoint;
    
    for (int i = 0; i < points.size(); i++) {
      Point2D p1 = points.get(i);
      Point2D p2 = (points.size() > i + 1) ? points.get(i + 1) : null;
      
      if (p2 != null) {
        controlPoint = calcMiddle(p1, p2);
        if (elements.isEmpty()) {
          elements.add(new MoveTo(p1.getX(), p1.getY()));
          elements.add(new LineTo(controlPoint.getX(), controlPoint.getY()));
        } else {
          elements.add(new QuadCurveTo(p1.getX(), p1.getY(), controlPoint.getX(), controlPoint.getY()));
        }
      } else {
        elements.add(new LineTo(p1.getX(), p1.getY()));
      }
    }
    
    return elements;
  }
  
  default Point2D calcMiddle(Point2D p1, Point2D p2) {
    return new Point2D((p1.getX() + p2.getX()) / 2, (p1.getY() + p2.getY()) / 2);
  }
}

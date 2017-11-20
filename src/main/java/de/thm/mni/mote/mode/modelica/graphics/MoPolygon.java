package de.thm.mni.mote.mode.modelica.graphics;

import de.thm.mni.mote.mode.parser.modelica.AnnotationParser.PointContext;
import de.thm.mni.mote.mode.parser.modelica.AnnotationParser.PolygonContext;
import de.thm.mni.mote.mode.parser.modelica.AnnotationParser.PolygonDataContext;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.geometry.Point2D;
import lombok.Builder;
import lombok.Getter;
import lombok.Singular;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Marcel Hoppe on 19.09.16.
 */
@Getter
public class MoPolygon extends MoFilledShape implements HasSmoothOption {
  
  List<Point2D> points = new ArrayList<>();
  ObjectProperty<Utilities.Smooth> smoothProperty = new SimpleObjectProperty<>(Utilities.Smooth.NONE);
  
  @Builder(builderMethodName = "polygonBuilder")
  MoPolygon(MoFilledShape mfs, @Singular List<Point2D> points, Utilities.Smooth smooth) {
    super(mfs);
    this.points = points;
    if (smooth != null) this.smoothProperty.set(smooth);
  
    initChangeListeners();
  }
  
  public static MoPolygon parse(PolygonContext elem) {
    MoGraphicBuilder mgb = builder();
    MoFilledShapeBuilder mfsb = filledShapeBuilder();
    MoPolygonBuilder mb = polygonBuilder();
    
    for (PolygonDataContext data : elem.data) {
      if (data.graphicItem() != null) {
        parse(mgb, data.graphicItem());
      } else if (data.filledShape() != null) {
        parse(mfsb, data.filledShape());
      } else if (data.smooth() != null) {
        mb.smooth(Utilities.Smooth.valueOf(data.smooth().type.getText().toUpperCase()));
      } else if (data.points() != null) {
        for (PointContext point : data.points().pointList().point()) {
          mb.point(new Point2D(Double.parseDouble(point.x.getText()), Double.parseDouble(point.y.getText())));
        }
      }
    }
    
    return mb.mfs(
        mfsb.mg(
            mgb.build()
        ).build()
    ).build();
  }
}

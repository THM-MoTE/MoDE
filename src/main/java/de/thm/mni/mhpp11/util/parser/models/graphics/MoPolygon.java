package de.thm.mni.mhpp11.util.parser.models.graphics;

import de.thm.mni.mhpp11.parser.modelica.AnnotationParser.PointContext;
import de.thm.mni.mhpp11.parser.modelica.AnnotationParser.PolygonContext;
import de.thm.mni.mhpp11.parser.modelica.AnnotationParser.PolygonDataContext;
import de.thm.mni.mhpp11.util.parser.models.graphics.Utilities.Smooth;
import javafx.geometry.Point2D;
import lombok.Builder;
import lombok.Getter;
import lombok.Singular;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by hobbypunk on 19.09.16.
 */
@Getter
public class MoPolygon extends MoFilledShape implements HasSmoothOption {
  
  List<Point2D> points = new ArrayList<>();
  Smooth smooth = Smooth.NONE;
  
  @Builder(builderMethodName = "polygonBuilder")
  MoPolygon(MoFilledShape mfs, @Singular List<Point2D> points, Smooth smooth) {
    super(mfs);
    this.points = points;
    if (smooth != null) this.smooth = smooth;
  }
  
  public static MoPolygon parse(PolygonContext elem) {
    MoGraphicBuilder mgb = builder();
    MoFilledShapeBuilder mfsb = filledShapeBuilder();
    MoPolygonBuilder mb = polygonBuilder();
    
    for (PolygonDataContext data : elem.data) {
      if (data.graphicItem() != null) {
        MoGraphic.parse(mgb, data.graphicItem());
      } else if (data.filledShape() != null) {
        MoFilledShape.parse(mfsb, data.filledShape());
      } else if (data.smooth() != null) {
        mb.smooth(Smooth.valueOf(data.smooth().type.getText().toUpperCase()));
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

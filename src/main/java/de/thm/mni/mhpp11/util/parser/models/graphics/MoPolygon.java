package de.thm.mni.mhpp11.util.parser.models.graphics;

import de.thm.mni.mhpp11.parser.modelica.AnnotationParser.PointContext;
import de.thm.mni.mhpp11.parser.modelica.AnnotationParser.PolygonContext;
import de.thm.mni.mhpp11.parser.modelica.AnnotationParser.PolygonDataContext;
import de.thm.mni.mhpp11.util.config.model.Point;
import lombok.Builder;
import lombok.Getter;
import lombok.Singular;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by hobbypunk on 19.09.16.
 */
@Getter
public class MoPolygon extends MoFilledShape {
  
  List<Point<Double, Double>> points = new ArrayList<>();
  Utilities.Smooth smooth = Utilities.Smooth.NONE;
  
  @Builder(builderMethodName = "polygonBuilder")
  MoPolygon(MoFilledShape mfs, @Singular List<Point<Double, Double>> points, Utilities.Smooth smooth) {
    super(mfs);
    this.points = points;
    this.smooth = smooth;
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
        mb.smooth(Utilities.Smooth.valueOf(data.smooth().type.getText().toUpperCase()));
      } else if (data.points() != null) {
        for (PointContext point : data.points().pointList().point()) {
          mb.point(new Point<>(Double.parseDouble(point.x.getText()), Double.parseDouble(point.y.getText())));
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

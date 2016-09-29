package de.thm.mni.mhpp11.util.parser.models.graphics;

import de.thm.mni.mhpp11.parser.ModelicaIconParser;
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
  
  public static MoPolygon parse(ModelicaIconParser.PolygonContext ctx) {
    MoPolygonBuilder mb = polygonBuilder();
    
    mb.mfs(MoFilledShape.parse(ctx.filledShape()));
    
    for (ModelicaIconParser.PointContext point : ctx.points().point()) {
      mb.point(new Point<>(Double.parseDouble(point.x.getText()), Double.parseDouble(point.y.getText())));
    }
    
    mb.smooth(Utilities.Smooth.valueOf(ctx.smooth().type.getText().toUpperCase()));
  
    return mb.build();
  }
}

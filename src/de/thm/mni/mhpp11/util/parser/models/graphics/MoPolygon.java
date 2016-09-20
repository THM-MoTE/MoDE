package de.thm.mni.mhpp11.util.parser.models.graphics;

import de.thm.mni.mhpp11.util.config.model.Point;
import de.thm.mni.mhpp11.util.parser.models.MoFunction;
import javafx.util.Pair;
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
  
  public static MoPolygon parse(MoFunction mf) {
    MoPolygonBuilder mb = polygonBuilder();
    
    mb.mfs(MoFilledShape.parse(mf));
  
    for (Object o : mf.getParams()) {
      if (!(o instanceof Pair)) continue;
      Pair<String, Object> p = (Pair<String, Object>) o;
      String key = p.getKey().toLowerCase();
      Object val = p.getValue();
      switch (key) {
        case "points":
          List<List<Double>> list = (List<List<Double>>) val;
          for (Object obj : list) {
            List<Double> point = (List<Double>) obj;
            mb.point(new Point<>(point.get(0), point.get(1)));
          }
          break;
        case "smooth": {
          List<String> l = (List<String>) val;
          mb.smooth(Utilities.Smooth.valueOf(l.get(1).toUpperCase()));
          break;
        }
      }
    }
  
  
    return mb.build();
  }
}

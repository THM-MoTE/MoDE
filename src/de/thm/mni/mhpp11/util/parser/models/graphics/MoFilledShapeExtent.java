package de.thm.mni.mhpp11.util.parser.models.graphics;

import de.thm.mni.mhpp11.util.config.model.Point;
import de.thm.mni.mhpp11.util.parser.models.MoFunction;
import javafx.util.Pair;
import lombok.Builder;
import lombok.Getter;

import java.util.List;

/**
 * Created by hobbypunk on 20.09.16.
 */
@Getter
public class MoFilledShapeExtent extends MoFilledShape {
  
  Point<Double, Double>[] extent = (Point<Double, Double>[]) new Point[2];
  
  MoFilledShapeExtent(MoFilledShapeExtent mfse) {
    super(mfse);
    this.extent = mfse.extent;
  }
  
  @Builder(builderMethodName = "filledShapeExtentBuilder")
  MoFilledShapeExtent(MoFilledShape mfs, Point<Double, Double> first, Point<Double, Double> second) {
    super(mfs);
    this.extent[0] = first;
    this.extent[1] = second;
  }
  
  public static MoFilledShapeExtent parse(MoFunction mf) {
    MoFilledShapeExtentBuilder mb = filledShapeExtentBuilder();
    mb.mfs(MoFilledShape.parse(mf));
    
    for (Object o : mf.getParams()) {
      if (!(o instanceof Pair)) continue;
      Pair<String, Object> p = (Pair<String, Object>) o;
      String key = p.getKey().toLowerCase();
      Object val = p.getValue();
      
      if (key.equals("extent")) {
        List<List<Double>> list = (List<List<Double>>) val;
        mb.first(new Point<>(list.get(0).get(0), list.get(0).get(1)));
        mb.second(new Point<>(list.get(1).get(0), list.get(1).get(1)));
        break;
      }
    }
    return mb.build();
  }
}
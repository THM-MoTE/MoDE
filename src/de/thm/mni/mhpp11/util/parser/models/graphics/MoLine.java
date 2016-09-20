package de.thm.mni.mhpp11.util.parser.models.graphics;

import de.thm.mni.mhpp11.util.config.model.Point;
import de.thm.mni.mhpp11.util.parser.models.MoFunction;
import javafx.scene.paint.Color;
import javafx.util.Pair;
import lombok.Builder;
import lombok.Getter;
import lombok.Singular;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by hobbypunk on 19.09.16.
 */
@SuppressWarnings("unchecked")
@Getter
public class MoLine extends MoGraphic {
  
  
  enum Arrow {
    NONE,
    OPEN,
    FILLED,
    HALF
  }
  
  
  List<Point<Double, Double>> points = new ArrayList<>();
  Color color = Color.BLACK;
  Utilities.LinePattern linePattern = Utilities.LinePattern.SOLID;
  Double thickness = 1.0;
  Arrow[] arrows = new Arrow[2];
  Double arrowSize = 3.0;
  Utilities.Smooth smooth = Utilities.Smooth.NONE;
  
  @Builder(builderMethodName = "lineBuilder")
  MoLine(MoGraphic mg, @Singular List<Point<Double, Double>> points, Color color, Utilities.LinePattern linePattern, Double thickness, Arrow start, Arrow end, Double arrowSize, Utilities.Smooth smooth) {
    super(mg);
    this.points = points;
    this.color = color;
    this.linePattern = linePattern;
    this.thickness = thickness;
    this.arrows[0] = start;
    this.arrows[1] = end;
    this.arrowSize = arrowSize;
    this.smooth = smooth;
  }
  
  public static MoLine parse(MoFunction mf) {
    MoLineBuilder mb = lineBuilder();
    mb.mg(MoGraphic.parse(mf));
    
    for (Object o : mf.getParams()) {
      if (!(o instanceof Pair)) continue;
      Pair<String, Object> p = (Pair<String, Object>) o;
      String key = p.getKey().toLowerCase();
      Object val = p.getValue();
      switch (key) {
        case "thickness":
          mb.thickness((Double) p.getValue());
          break;
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
        case "color":
          mb.color(Utilities.convertColor(val));
          break;
        case "pattern":
          mb.linePattern(Utilities.LinePattern.valueOf(((List<String>) val).get(1).toUpperCase()));
          break;
        case "arrow": {
          List<List<String>> l = (List<List<String>>) val;
          mb.start(Arrow.valueOf(l.get(0).get(1).toUpperCase()));
          mb.end(Arrow.valueOf(l.get(1).get(1).toUpperCase()));
          break;
        }
        case "arrowSize":
          mb.arrowSize((Double) p.getValue());
          break;
      }
    }
    
    return mb.build();
  }
}

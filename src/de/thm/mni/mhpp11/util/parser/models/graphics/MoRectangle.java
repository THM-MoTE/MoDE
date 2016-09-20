package de.thm.mni.mhpp11.util.parser.models.graphics;

import de.thm.mni.mhpp11.util.parser.models.MoFunction;
import javafx.util.Pair;
import lombok.Builder;

import java.util.List;

/**
 * Created by hobbypunk on 19.09.16.
 */
public class MoRectangle extends MoFilledShapeExtent {
  
  private BorderPattern borderPattern = BorderPattern.NONE;
  private Double radius = 0.0;
  
  enum BorderPattern {
    NONE,
    RAISED,
    SUNKEN,
    ENGRAVED
  }
  
  @Builder(builderMethodName = "rectangleBuilder")
  MoRectangle(MoFilledShapeExtent mfse, BorderPattern borderPattern, Double radius) {
    super(mfse);
    this.borderPattern = borderPattern;
    this.radius = radius;
  }
  
  public static MoRectangle parse(MoFunction mf) {
    MoRectangleBuilder mb = rectangleBuilder();
    
    mb.mfse(MoFilledShapeExtent.parse(mf));
    
    for (Object o : mf.getParams()) {
      if (!(o instanceof Pair)) continue;
      Pair<String, Object> p = (Pair<String, Object>) o;
      String key = p.getKey().toLowerCase();
      Object val = p.getValue();
      switch (key) {
        case "borderpattern": {
          List<String> l = (List<String>) val;
          mb.borderPattern(BorderPattern.valueOf(l.get(1).toUpperCase()));
          break;
        }
        case "radius": {
          mb.radius((Double)val);
          break;
        }
      }
    }
    
    
    return mb.build();
  }
}

package de.thm.mni.mhpp11.util.parser.models.graphics;

import de.thm.mni.mhpp11.util.parser.models.MoFunction;
import javafx.util.Pair;
import lombok.Builder;
import lombok.Getter;

/**
 * Created by hobbypunk on 19.09.16.
 */
@Getter
public class MoEllipse extends MoFilledShapeExtent {
  
  private Double startAngle = 0.0;
  private Double endAngle = 360.0;
  
  @Builder(builderMethodName = "ellipseBuilder")
  MoEllipse(MoFilledShapeExtent mfse, Double startAngle, Double endAngle) {
    super(mfse);
    if(startAngle != null) this.startAngle = startAngle;
    if(endAngle != null) this.endAngle = endAngle;
  }
  
  public static MoEllipse parse(MoFunction mf) {
    MoEllipseBuilder mb = ellipseBuilder();
    
    mb.mfse(MoFilledShapeExtent.parse(mf));
    
    for (Object o : mf.getParams()) {
      if (!(o instanceof Pair)) continue;
      Pair<String, Object> p = (Pair<String, Object>) o;
      String key = p.getKey().toLowerCase();
      Object val = p.getValue();
      switch (key) {
        case "startangle": {
          mb.startAngle((Double)val);
          break;
        }
        case "endangle": {
          mb.endAngle((Double)val);
          break;
        }
      }
    }
    
    return mb.build();
  }
}

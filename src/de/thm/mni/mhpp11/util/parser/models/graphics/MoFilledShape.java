package de.thm.mni.mhpp11.util.parser.models.graphics;

import de.thm.mni.mhpp11.util.parser.models.MoFunction;
import javafx.scene.paint.Color;
import javafx.util.Pair;
import lombok.Builder;
import lombok.Getter;

import java.util.List;

/**
 * Created by hobbypunk on 20.09.16.
 */
@Getter
public class MoFilledShape extends MoGraphic {
  
  enum FillPattern {
    NONE,
    SOLID,
    HORIZONTAL,
    VERTICAL,
    CROSS,
    FORWARD,
    BACKWARD,
    CROSSDIAG,
    HORIZONTALCYLINDER,
    VERTICALCYLINDER,
    SPHERE
  }
  
  Color lineColor = Color.BLACK;
  Color fillColor = Color.BLACK;
  Utilities.LinePattern pattern = Utilities.LinePattern.SOLID;
  FillPattern fillPattern = FillPattern.NONE;
  Double lineThickness = 0.25;
  
  MoFilledShape(MoFilledShape mfs) {
    super(mfs);
    this.lineColor = mfs.lineColor;
    this.fillColor = mfs.fillColor;
    this.pattern = mfs.pattern;
    this.fillPattern = mfs.fillPattern;
    this.lineThickness = mfs.lineThickness;
  }
  
  @Builder(builderMethodName = "filledShapeBuilder")
  MoFilledShape(MoGraphic mg, Color lineColor, Color fillColor, Utilities.LinePattern pattern, FillPattern fillPattern, Double lineThickness) {
    super(mg);
    this.lineColor = lineColor;
    this.fillColor = fillColor;
    this.pattern = pattern;
    this.fillPattern = fillPattern;
    this.lineThickness = lineThickness;
  }
  
  public static MoFilledShape parse(MoFunction mf) {
    MoFilledShapeBuilder mb = filledShapeBuilder();
    mb.mg(MoGraphic.parse(mf));
  
    for(Object o: mf.getParams()) {
      if (!(o instanceof Pair)) continue;
      Pair<String, Object> p = (Pair<String, Object>) o;
      String key = p.getKey().toLowerCase();
      Object val = p.getValue();
  
      switch (key) {
        case "linecolor":
          mb.lineColor(Utilities.convertColor(val));
          break;
        case "fillcolor":
          mb.fillColor(Utilities.convertColor(val));
          break;
        case "pattern":
          mb.pattern(Utilities.LinePattern.valueOf(((List<String>) val).get(1).toUpperCase()));
          break;
        case "fillpattern":
          mb.fillPattern(FillPattern.valueOf(((List<String>) val).get(1).toUpperCase()));
          break;
        case "linethickness":
          mb.lineThickness((Double) val);
          break;
      }
    }
        
    return mb.build();
  }
}

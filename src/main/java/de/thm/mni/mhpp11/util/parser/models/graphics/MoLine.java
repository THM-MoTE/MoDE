package de.thm.mni.mhpp11.util.parser.models.graphics;

import de.thm.mni.mhpp11.parser.modelica.AnnotationParser.LineContext;
import de.thm.mni.mhpp11.parser.modelica.AnnotationParser.LineDataContext;
import de.thm.mni.mhpp11.parser.modelica.AnnotationParser.PointContext;
import de.thm.mni.mhpp11.util.config.model.Point;
import javafx.scene.paint.Color;
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
  
  public static MoLine parse(LineContext elem) {
    MoGraphicBuilder mgb = builder();
    MoLineBuilder mb = lineBuilder();
    
    for (LineDataContext data : elem.data) {
      if (data.graphicItem() != null) {
        MoGraphic.parse(mgb, data.graphicItem());
      } else if (data.color() != null) {
        mb.color(Utilities.convertColor(data.color().val));
      } else if (data.linePattern() != null) {
        mb.linePattern(Utilities.LinePattern.valueOf(data.linePattern().type.getText().toUpperCase()));
      } else if (data.arrowSize() != null) {
        mb.arrowSize(Double.parseDouble(data.arrowSize().val.getText()));
      } else if (data.thickness() != null) {
        mb.thickness(Double.parseDouble(data.thickness().val.getText()));
      } else if (data.smooth() != null) {
        mb.smooth(Utilities.Smooth.valueOf(data.smooth().type.getText().toUpperCase()));
      } else if (data.arrows() != null) {
        if (data.arrows().a1 != null) mb.start(Arrow.valueOf(data.arrows().a1.type.getText().toUpperCase()));
        if (data.arrows().a2 != null) mb.end(Arrow.valueOf(data.arrows().a2.type.getText().toUpperCase()));
      } else if (data.points() != null) {
        for (PointContext point : data.points().pointList().point()) {
          mb.point(new Point<>(Double.parseDouble(point.x.getText()), Double.parseDouble(point.y.getText())));
        }
      }
    }
    
    return mb.mg(
        mgb.build()
    ).build();
  }
}

package de.thm.mni.mhpp11.util.parser.models.graphics;

import de.thm.mni.mhpp11.parser.ModelicaIconParser;
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
  
  public static MoLine parse(ModelicaIconParser.LineContext ctx) {
    MoLineBuilder mb = lineBuilder();
    mb.mg(MoGraphic.parse(ctx.graphicItem()));
    mb.thickness(Double.parseDouble(ctx.lineThickness.getText()));
    for (ModelicaIconParser.PointContext point : ctx.points().point()) {
      mb.point(new Point<>(Double.parseDouble(point.x.getText()), Double.parseDouble(point.y.getText())));
    }
    
    mb.smooth(Utilities.Smooth.valueOf(ctx.smooth().type.getText().toUpperCase()));
    mb.color(Utilities.convertColor(ctx.lineColor));
    mb.linePattern(Utilities.LinePattern.valueOf(ctx.linePattern().type.getText().toUpperCase()));
    mb.start(Arrow.valueOf(ctx.arrows().a1.type.getText().toUpperCase()));
    mb.end(Arrow.valueOf(ctx.arrows().a2.type.getText().toUpperCase()));
    mb.arrowSize(Double.parseDouble(ctx.as.getText()));
    
    return mb.build();
  }
}

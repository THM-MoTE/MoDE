package de.thm.mni.mhpp11.util.parser.models.graphics;

import de.thm.mni.mhpp11.parser.modelica.AnnotationParser.RectangleContext;
import de.thm.mni.mhpp11.parser.modelica.AnnotationParser.RectangleDataContext;
import de.thm.mni.mhpp11.util.config.model.Point;
import lombok.Builder;
import lombok.Getter;

/**
 * Created by hobbypunk on 19.09.16.
 */
@Getter
public class MoRectangle extends MoFilledShape implements MoExtent {
  
  private Point<Double, Double>[] extent = (Point<Double, Double>[]) new Point[2];
  private BorderPattern borderPattern = BorderPattern.NONE;
  private Double radius = 0.0;
  
  enum BorderPattern {
    NONE,
    RAISED,
    SUNKEN,
    ENGRAVED
  }
  
  @Builder(builderMethodName = "rectangleBuilder")
  MoRectangle(MoFilledShape mfs, Point<Double, Double> first, Point<Double, Double> second, BorderPattern borderPattern, Double radius) {
    super(mfs);
    this.extent[0] = first;
    this.extent[1] = second;
    this.borderPattern = borderPattern;
    this.radius = radius;
  }
  
  public static MoRectangle parse(RectangleContext elem) {
    MoGraphicBuilder mgb = builder();
    MoFilledShapeBuilder mfsb = filledShapeBuilder();
    MoRectangleBuilder mb = rectangleBuilder();
    
    for (RectangleDataContext data : elem.data) {
      if (data.graphicItem() != null) {
        MoGraphic.parse(mgb, data.graphicItem());
      } else if (data.filledShape() != null) {
        MoFilledShape.parse(mfsb, data.filledShape());
      } else if (data.extent() != null) {
        mb.first(new Point<>(Double.parseDouble(data.extent().p1.x.getText()), Double.parseDouble(data.extent().p1.y.getText())));
        mb.second(new Point<>(Double.parseDouble(data.extent().p2.x.getText()), Double.parseDouble(data.extent().p2.y.getText())));
      } else if (data.borderPattern() != null) {
        mb.borderPattern(BorderPattern.valueOf(data.borderPattern().type.getText().toUpperCase()));
      } else if (data.radius() != null) {
        mb.radius(Double.parseDouble(data.radius().val.getText()));
      }
    }
    
    return mb.mfs(
        mfsb.mg(
            mgb.build()
        ).build()
    ).build();
  }
}

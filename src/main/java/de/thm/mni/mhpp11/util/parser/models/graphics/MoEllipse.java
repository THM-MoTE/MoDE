package de.thm.mni.mhpp11.util.parser.models.graphics;

import de.thm.mni.mhpp11.parser.modelica.AnnotationParser.EllipseContext;
import de.thm.mni.mhpp11.parser.modelica.AnnotationParser.EllipseDataContext;
import de.thm.mni.mhpp11.util.config.model.Point;
import de.thm.mni.mhpp11.util.parser.models.interfaces.MoExtent;
import lombok.Builder;
import lombok.Getter;

/**
 * Created by hobbypunk on 19.09.16.
 */
@Getter
public class MoEllipse extends MoFilledShape implements MoExtent {
  
  Point<Double, Double>[] extent = (Point<Double, Double>[]) new Point[2];
  private Double startAngle = 0.0;
  private Double endAngle = 360.0;
  
  @Builder(builderMethodName = "ellipseBuilder")
  MoEllipse(MoFilledShape mfs, Point<Double, Double> first, Point<Double, Double> second, Double startAngle, Double endAngle) {
    super(mfs);
    this.extent[0] = first;
    this.extent[1] = second;
    if(startAngle != null) this.startAngle = startAngle;
    if(endAngle != null) this.endAngle = endAngle;
  }
  
  public static MoEllipse parse(EllipseContext elem) {
    MoGraphicBuilder mgb = builder();
    MoFilledShapeBuilder mfsb = filledShapeBuilder();
    MoEllipseBuilder mb = ellipseBuilder();
    
    for (EllipseDataContext data : elem.data) {
      if (data.graphicItem() != null) {
        MoGraphic.parse(mgb, data.graphicItem());
      } else if (data.filledShape() != null) {
        MoFilledShape.parse(mfsb, data.filledShape());
      } else if (data.extent() != null) {
        mb.first(new Point<>(Double.parseDouble(data.extent().p1.x.getText()), Double.parseDouble(data.extent().p1.y.getText())));
        mb.second(new Point<>(Double.parseDouble(data.extent().p2.x.getText()), Double.parseDouble(data.extent().p2.y.getText())));
      } else if (data.startAngle() != null) {
        mb.startAngle(Double.parseDouble(data.startAngle().val.getText()));
      } else if (data.endAngle() != null) {
        mb.endAngle(Double.parseDouble(data.endAngle().val.getText()));
      }
    }
    
    return mb.mfs(
        mfsb.mg(
            mgb.build()
        ).build()
    ).build();
  }
}

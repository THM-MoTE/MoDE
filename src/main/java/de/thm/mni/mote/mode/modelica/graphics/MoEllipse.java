package de.thm.mni.mote.mode.modelica.graphics;

import de.thm.mni.mote.mode.modelica.interfaces.HasExtent;
import de.thm.mni.mote.mode.parser.modelica.AnnotationParser.EllipseContext;
import de.thm.mni.mote.mode.parser.modelica.AnnotationParser.EllipseDataContext;
import javafx.geometry.Point2D;
import lombok.Builder;
import lombok.Getter;

/**
 * Created by hobbypunk on 19.09.16.
 */
@Getter
public class MoEllipse extends MoFilledShape implements HasExtent {
  
  private final MoExtent extent;
  
  private Double startAngle = 0.0;
  private Double endAngle = 360.0;
  
  MoEllipse(MoFilledShape mfs, Point2D p1, Point2D p2) {
    this(mfs, p1, p2, null, null);
  }
  
  @Builder(builderMethodName = "ellipseBuilder")
  private MoEllipse(MoFilledShape mfs, Point2D p1, Point2D p2, Double startAngle, Double endAngle) {
    super(mfs);
    extent = new MoSimpleExtent(p1, p2);
    if (startAngle != null) this.startAngle = startAngle;
    if (endAngle != null) this.endAngle = endAngle;
  }
  
  public static MoEllipse parse(EllipseContext elem) {
    MoGraphicBuilder mgb = builder();
    MoFilledShapeBuilder mfsb = filledShapeBuilder();
    MoEllipseBuilder mb = ellipseBuilder();
    
    for (EllipseDataContext data : elem.data) {
      if (data.graphicItem() != null) {
        parse(mgb, data.graphicItem());
      } else if (data.filledShape() != null) {
        parse(mfsb, data.filledShape());
      } else if (data.extent() != null) {
        mb.p1(new Point2D(Double.parseDouble(data.extent().p1.x.getText()), Double.parseDouble(data.extent().p1.y.getText())));
        mb.p2(new Point2D(Double.parseDouble(data.extent().p2.x.getText()), Double.parseDouble(data.extent().p2.y.getText())));
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

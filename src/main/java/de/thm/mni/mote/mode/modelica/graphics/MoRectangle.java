package de.thm.mni.mote.mode.modelica.graphics;

import de.thm.mni.mote.mode.modelica.interfaces.HasExtent;
import de.thm.mni.mote.mode.parser.modelica.AnnotationParser.RectangleContext;
import de.thm.mni.mote.mode.parser.modelica.AnnotationParser.RectangleDataContext;
import javafx.geometry.Point2D;
import lombok.Builder;
import lombok.Getter;

/**
 * Created by Marcel Hoppe on 19.09.16.
 */
@Getter
public class MoRectangle extends MoFilledShape implements HasExtent {
  
  private final MoExtent extent;
  
  private BorderPattern borderPattern = BorderPattern.NONE;
  private Double radius = 0.0;
  
  enum BorderPattern {
    NONE,
    RAISED,
    SUNKEN,
    ENGRAVED
  }
  
  @Builder(builderMethodName = "rectangleBuilder")
  MoRectangle(MoFilledShape mfs, Point2D p1, Point2D p2, BorderPattern borderPattern, Double radius) {
    super(mfs);
    extent = new MoSimpleExtent(p1, p2);
    if (borderPattern != null) this.borderPattern = borderPattern;
    if (radius != null) this.radius = radius;
  
    initChangeListeners();
  }
  
  public static MoRectangle parse(RectangleContext elem) {
    MoGraphicBuilder mgb = builder();
    MoFilledShapeBuilder mfsb = filledShapeBuilder();
    MoRectangleBuilder mb = rectangleBuilder();
    
    for (RectangleDataContext data : elem.data) {
      if (data.graphicItem() != null) {
        parse(mgb, data.graphicItem());
      } else if (data.filledShape() != null) {
        parse(mfsb, data.filledShape());
      } else if (data.extent() != null) {
        mb.p1(new Point2D(Double.parseDouble(data.extent().p1.x.getText()), Double.parseDouble(data.extent().p1.y.getText())));
        mb.p2(new Point2D(Double.parseDouble(data.extent().p2.x.getText()), Double.parseDouble(data.extent().p2.y.getText())));
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

package de.thm.mni.mhpp11.modelica.graphics;

import de.thm.mni.mhpp11.modelica.interfaces.MoExtent;
import de.thm.mni.mhpp11.parser.modelica.AnnotationParser.EllipseContext;
import de.thm.mni.mhpp11.parser.modelica.AnnotationParser.EllipseDataContext;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.geometry.Point2D;
import lombok.Builder;
import lombok.Getter;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by hobbypunk on 19.09.16.
 */
@Getter
public class MoEllipse extends MoFilledShape implements MoExtent {
  
  private final List<ObjectProperty<Point2D>> extent = Collections.unmodifiableList(Arrays.asList(new SimpleObjectProperty<>(), new SimpleObjectProperty<>()));
  
  private Double startAngle = 0.0;
  private Double endAngle = 360.0;
  
  @Builder(builderMethodName = "ellipseBuilder")
  MoEllipse(MoFilledShape mfs, Point2D first, Point2D second, Double startAngle, Double endAngle) {
    super(mfs);
    extent.get(0).setValue(first);
    extent.get(1).setValue(second);
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
        mb.first(new Point2D(Double.parseDouble(data.extent().p1.x.getText()), Double.parseDouble(data.extent().p1.y.getText())));
        mb.second(new Point2D(Double.parseDouble(data.extent().p2.x.getText()), Double.parseDouble(data.extent().p2.y.getText())));
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

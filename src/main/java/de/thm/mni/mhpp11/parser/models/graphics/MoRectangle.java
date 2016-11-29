package de.thm.mni.mhpp11.parser.models.graphics;

import de.thm.mni.mhpp11.parser.modelica.AnnotationParser.RectangleContext;
import de.thm.mni.mhpp11.parser.modelica.AnnotationParser.RectangleDataContext;
import de.thm.mni.mhpp11.parser.models.interfaces.MoExtent;
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
public class MoRectangle extends MoFilledShape implements MoExtent {
  
  private final List<ObjectProperty<Point2D>> extent = Collections.unmodifiableList(Arrays.asList(new SimpleObjectProperty<>(), new SimpleObjectProperty<>()));

  private BorderPattern borderPattern = BorderPattern.NONE;
  private Double radius = 0.0;
  
  enum BorderPattern {
    NONE,
    RAISED,
    SUNKEN,
    ENGRAVED
  }
  
  @Builder(builderMethodName = "rectangleBuilder")
  MoRectangle(MoFilledShape mfs, Point2D first, Point2D second, BorderPattern borderPattern, Double radius) {
    super(mfs);
    extent.get(0).setValue(first);
    extent.get(1).setValue(second);
    if (borderPattern != null) this.borderPattern = borderPattern;
    if (radius != null) this.radius = radius;
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
        mb.first(new Point2D(Double.parseDouble(data.extent().p1.x.getText()), Double.parseDouble(data.extent().p1.y.getText())));
        mb.second(new Point2D(Double.parseDouble(data.extent().p2.x.getText()), Double.parseDouble(data.extent().p2.y.getText())));
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

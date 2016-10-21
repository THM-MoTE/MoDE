package de.thm.mni.mhpp11.util.parser.models.graphics;

import de.thm.mni.mhpp11.parser.modelica.AnnotationParser.TransformationContentContext;
import de.thm.mni.mhpp11.parser.modelica.AnnotationParser.TransformationContext;
import de.thm.mni.mhpp11.util.config.model.Point;
import de.thm.mni.mhpp11.util.parser.models.interfaces.MoExtent;
import lombok.Builder;
import lombok.Getter;

/**
 * Created by hobbypunk on 21.10.16.
 */
@Getter
public class MoTransformation implements MoExtent {
  
  private Point<Double, Double>[] extent = (Point<Double, Double>[]) new Point[2];
  private Point<Double, Double> origin = new Point<>(0.0, 0.0); //Ursprung des Elements
  private Double rotation = 0.0;
  
  @Builder
  private MoTransformation(Point<Double, Double> first, Point<Double, Double> second, Point<Double, Double> origin, Double rotation) {
    extent[0] = first;
    extent[1] = second;
    if (origin != null) this.origin = origin;
    if (rotation != null) this.rotation = rotation;
  }
  
  
  public static MoTransformation parse(TransformationContext val) {
    MoTransformationBuilder mb = builder();
    
    for (TransformationContentContext data : val.transformationContent()) {
      if (data.extent() != null) {
        mb.first(new Point<>(Double.parseDouble(data.extent().p1.x.getText()), Double.parseDouble(data.extent().p1.y.getText())));
        mb.second(new Point<>(Double.parseDouble(data.extent().p2.x.getText()), Double.parseDouble(data.extent().p2.y.getText())));
      } else if (data.origin() != null) {
        mb.origin(new Point<>(Double.parseDouble(data.origin().point().x.getText()), Double.parseDouble(data.origin().point().y.getText())));
      } else if (data.rotation() != null) {
        mb.rotation(Double.parseDouble(data.rotation().val.getText()));
      }
    }
    
    return mb.build();
  }
}

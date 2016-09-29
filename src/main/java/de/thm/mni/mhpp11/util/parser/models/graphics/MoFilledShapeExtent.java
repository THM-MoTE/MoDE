package de.thm.mni.mhpp11.util.parser.models.graphics;

import de.thm.mni.mhpp11.parser.ModelicaIconParser;
import de.thm.mni.mhpp11.util.config.model.Point;
import lombok.Builder;
import lombok.Getter;

/**
 * Created by hobbypunk on 20.09.16.
 */
@Getter
public class MoFilledShapeExtent extends MoFilledShape implements MoExtent {
  
  Point<Double, Double>[] extent = (Point<Double, Double>[]) new Point[2];
  
  MoFilledShapeExtent(MoFilledShapeExtent mfse) {
    super(mfse);
    this.extent = mfse.extent;
  }
  
  @Builder(builderMethodName = "filledShapeExtentBuilder")
  MoFilledShapeExtent(MoFilledShape mfs, Point<Double, Double> first, Point<Double, Double> second) {
    super(mfs);
    this.extent[0] = first;
    this.extent[1] = second;
  }
  
  public static MoFilledShapeExtent parse(ModelicaIconParser.FilledShapeContext ctx, ModelicaIconParser.ExtentContext extent) {
    MoFilledShapeExtentBuilder mb = filledShapeExtentBuilder();
    mb.mfs(MoFilledShape.parse(ctx));
    mb.first(new Point<>(Double.parseDouble(extent.p1.x.getText()), Double.parseDouble(extent.p1.y.getText())));
    mb.second(new Point<>(Double.parseDouble(extent.p2.x.getText()), Double.parseDouble(extent.p2.y.getText())));
  
    return mb.build();
  }
}
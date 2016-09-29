package de.thm.mni.mhpp11.util.parser.models.graphics;

import de.thm.mni.mhpp11.parser.ModelicaIconParser;
import lombok.Builder;

/**
 * Created by hobbypunk on 19.09.16.
 */
public class MoRectangle extends MoFilledShapeExtent {
  
  private BorderPattern borderPattern = BorderPattern.NONE;
  private Double radius = 0.0;
  
  enum BorderPattern {
    NONE,
    RAISED,
    SUNKEN,
    ENGRAVED
  }
  
  @Builder(builderMethodName = "rectangleBuilder")
  MoRectangle(MoFilledShapeExtent mfse, BorderPattern borderPattern, Double radius) {
    super(mfse);
    this.borderPattern = borderPattern;
    this.radius = radius;
  }
  
  public static MoRectangle parse(ModelicaIconParser.RectangleContext ctx) {
    MoRectangleBuilder mb = rectangleBuilder();
    
    mb.mfse(MoFilledShapeExtent.parse(ctx.filledShape(), ctx.extent()));
    
    mb.borderPattern(BorderPattern.valueOf(ctx.bp.type.getText().toUpperCase()));
    mb.radius(Double.parseDouble(ctx.r.getText()));
    
    return mb.build();
  }
}

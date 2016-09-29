package de.thm.mni.mhpp11.util.parser.models.graphics;

import de.thm.mni.mhpp11.parser.ModelicaIconParser;
import lombok.Builder;
import lombok.Getter;

/**
 * Created by hobbypunk on 19.09.16.
 */
@Getter
public class MoEllipse extends MoFilledShapeExtent {
  
  private Double startAngle = 0.0;
  private Double endAngle = 360.0;
  
  @Builder(builderMethodName = "ellipseBuilder")
  MoEllipse(MoFilledShapeExtent mfse, Double startAngle, Double endAngle) {
    super(mfse);
    if(startAngle != null) this.startAngle = startAngle;
    if(endAngle != null) this.endAngle = endAngle;
  }
  
  public static MoEllipse parse(ModelicaIconParser.EllipseContext ctx) {
    MoEllipseBuilder mb = ellipseBuilder();
    
    mb.mfse(MoFilledShapeExtent.parse(ctx.filledShape(), ctx.extent()));
    
    mb.startAngle(Double.parseDouble(ctx.sa.getText()));
    mb.endAngle(Double.parseDouble(ctx.ea.getText()));
    
    return mb.build();
  }
}

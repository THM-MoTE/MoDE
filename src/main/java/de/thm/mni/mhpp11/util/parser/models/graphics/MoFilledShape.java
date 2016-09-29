package de.thm.mni.mhpp11.util.parser.models.graphics;

import de.thm.mni.mhpp11.parser.ModelicaIconParser;
import javafx.scene.paint.Color;
import lombok.Builder;
import lombok.Getter;

/**
 * Created by hobbypunk on 20.09.16.
 */
@Getter
public class MoFilledShape extends MoGraphic {
  
  public enum FillPattern {
    NONE,
    SOLID,
    HORIZONTAL,
    VERTICAL,
    CROSS,
    FORWARD,
    BACKWARD,
    CROSSDIAG,
    HORIZONTALCYLINDER,
    VERTICALCYLINDER,
    SPHERE
  }
  
  Color lineColor = Color.BLACK;
  Color fillColor = Color.BLACK;
  Utilities.LinePattern pattern = Utilities.LinePattern.SOLID;
  FillPattern fillPattern = FillPattern.NONE;
  Double lineThickness = 0.25;
  
  MoFilledShape(MoFilledShape mfs) {
    super(mfs);
    this.lineColor = mfs.lineColor;
    this.fillColor = mfs.fillColor;
    this.pattern = mfs.pattern;
    this.fillPattern = mfs.fillPattern;
    this.lineThickness = mfs.lineThickness;
  }
  
  @Builder(builderMethodName = "filledShapeBuilder")
  MoFilledShape(MoGraphic mg, Color lineColor, Color fillColor, Utilities.LinePattern pattern, FillPattern fillPattern, Double lineThickness) {
    super(mg);
    if (lineColor != null) this.lineColor = lineColor;
    if (fillColor != null) this.fillColor = fillColor;
    if (pattern != null) this.pattern = pattern;
    if (fillPattern != null) this.fillPattern = fillPattern;
    if (lineThickness != null) this.lineThickness = lineThickness;
  }
  
  public static MoFilledShape parse(ModelicaIconParser.FilledShapeContext ctx) {
    MoFilledShapeBuilder mb = filledShapeBuilder();
    mb.mg(MoGraphic.parse(ctx.gi));
    
    mb.lineColor(Utilities.convertColor(ctx.lineColor));
    mb.fillColor(Utilities.convertColor(ctx.fillColor));
    mb.pattern(Utilities.LinePattern.valueOf(ctx.linePattern().type.getText().toUpperCase()));
    mb.fillPattern(FillPattern.valueOf(ctx.fillPattern().type.getText().toUpperCase()));
    mb.lineThickness(Double.parseDouble(ctx.lineThickness.getText()));
        
    return mb.build();
  }
}

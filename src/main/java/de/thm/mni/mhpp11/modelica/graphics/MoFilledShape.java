package de.thm.mni.mhpp11.modelica.graphics;

import de.thm.mni.mhpp11.parser.modelica.AnnotationParser.FilledShapeContext;
import javafx.scene.paint.Color;
import lombok.Builder;
import lombok.Getter;

/**
 * Created by hobbypunk on 20.09.16.
 */
@Getter
public class MoFilledShape extends MoGraphic {
  
  Color lineColor = Color.BLACK;
  Color fillColor = Color.BLACK;
  de.thm.mni.mhpp11.modelica.graphics.Utilities.LinePattern pattern = de.thm.mni.mhpp11.modelica.graphics.Utilities.LinePattern.SOLID;
  de.thm.mni.mhpp11.modelica.graphics.Utilities.FillPattern fillPattern = de.thm.mni.mhpp11.modelica.graphics.Utilities.FillPattern.NONE;
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
  MoFilledShape(MoGraphic mg, Color lineColor, Color fillColor, de.thm.mni.mhpp11.modelica.graphics.Utilities.LinePattern pattern, de.thm.mni.mhpp11.modelica.graphics.Utilities.FillPattern fillPattern, Double lineThickness) {
    super(mg);
    if (lineColor != null) this.lineColor = lineColor;
    if (fillColor != null) this.fillColor = fillColor;
    if (pattern != null) this.pattern = pattern;
    if (fillPattern != null) this.fillPattern = fillPattern;
    if (lineThickness != null) this.lineThickness = lineThickness;
  }
  
  static void parse(MoFilledShapeBuilder mfsb, FilledShapeContext ctx) {
    if (ctx.fillColor() != null) {
      mfsb.fillColor(de.thm.mni.mhpp11.modelica.graphics.Utilities.convertColor(ctx.fillColor().val));
    } else if (ctx.lineColor() != null) {
      mfsb.lineColor(de.thm.mni.mhpp11.modelica.graphics.Utilities.convertColor(ctx.lineColor().val));
    } else if (ctx.linePattern() != null) {
      mfsb.pattern(de.thm.mni.mhpp11.modelica.graphics.Utilities.LinePattern.valueOf(ctx.linePattern().type.getText().toUpperCase()));
    } else if (ctx.fillPattern() != null) {
      mfsb.fillPattern(de.thm.mni.mhpp11.modelica.graphics.Utilities.FillPattern.valueOf(ctx.fillPattern().type.getText().toUpperCase()));
    } else if (ctx.lineThickness() != null) {
      mfsb.lineThickness(Double.parseDouble(ctx.lineThickness().getText()));
    }
  }
}

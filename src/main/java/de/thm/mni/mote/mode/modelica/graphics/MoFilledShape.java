package de.thm.mni.mote.mode.modelica.graphics;

import de.thm.mni.mote.mode.parser.modelica.AnnotationParser.FilledShapeContext;
import javafx.beans.property.DoubleProperty;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.scene.paint.Color;
import lombok.Builder;
import lombok.Getter;

/**
 * Created by Marcel Hoppe on 20.09.16.
 */
@Getter
public class MoFilledShape extends MoGraphic {
  
  ObjectProperty<Color> lineColorProperty = new SimpleObjectProperty<>(Color.BLACK);
  ObjectProperty<Color> fillColorProperty = new SimpleObjectProperty<>(Color.BLACK);
  ObjectProperty<Utilities.LinePattern> patternProperty = new SimpleObjectProperty<>(Utilities.LinePattern.SOLID);
  ObjectProperty<Utilities.FillPattern> fillPatternProperty = new SimpleObjectProperty<>(Utilities.FillPattern.NONE);
  DoubleProperty lineThicknessProperty = new SimpleDoubleProperty(0.25);
  
  MoFilledShape(MoFilledShape mfs) {
    this(mfs, mfs.lineColorProperty.get(), mfs.fillColorProperty.get(), mfs.patternProperty.get(), mfs.fillPatternProperty.get(), mfs.lineThicknessProperty.get());
  }
  
  @Builder(builderMethodName = "filledShapeBuilder")
  MoFilledShape(MoGraphic mg, Color lineColor, Color fillColor, Utilities.LinePattern pattern, Utilities.FillPattern fillPattern, Double lineThickness) {
    super(mg);
    if (lineColor != null) this.lineColorProperty.set(lineColor);
    if (fillColor != null) this.fillColorProperty.set(fillColor);
    if (pattern != null) this.patternProperty.set(pattern);
    if (fillPattern != null) this.fillPatternProperty.set(fillPattern);
    if (lineThickness != null) this.lineThicknessProperty.set(lineThickness);
    
    initChangeListeners();
  }
  
  static void parse(MoFilledShapeBuilder mfsb, FilledShapeContext ctx) {
    if (ctx.fillColor() != null) {
      mfsb.fillColor(Utilities.convertColor(ctx.fillColor().val));
    } else if (ctx.lineColor() != null) {
      mfsb.lineColor(Utilities.convertColor(ctx.lineColor().val));
    } else if (ctx.linePattern() != null) {
      mfsb.pattern(Utilities.LinePattern.valueOf(ctx.linePattern().type.getText().toUpperCase()));
    } else if (ctx.fillPattern() != null) {
      mfsb.fillPattern(Utilities.FillPattern.valueOf(ctx.fillPattern().type.getText().toUpperCase()));
    } else if (ctx.lineThickness() != null) {
      mfsb.lineThickness(Double.parseDouble(ctx.lineThickness().val.getText()));
    }
  }
}

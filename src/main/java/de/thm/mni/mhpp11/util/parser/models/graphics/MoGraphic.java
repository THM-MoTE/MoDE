package de.thm.mni.mhpp11.util.parser.models.graphics;

import de.thm.mni.mhpp11.parser.modelica.AnnotationParser.*;
import de.thm.mni.mhpp11.util.config.model.Point;
import de.thm.mni.mhpp11.util.parser.OMCompiler;
import lombok.Builder;
import lombok.Getter;
import org.antlr.v4.runtime.ParserRuleContext;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by hobbypunk on 16.09.16.
 */
@Getter
public class MoGraphic {
  
  Boolean visible = true;
  Point<Double, Double> origin = new Point<>(0.0,0.0); //Ursprung des Elements
  Double rotation = 0.0;
  
  public MoGraphic(MoGraphic mg) {
    this.visible = mg.visible;
    this.origin = mg.origin;
    this.rotation = mg.rotation;
  }
  
  @Builder
  public MoGraphic(Boolean visible, Point<Double, Double> origin, Double rotation) {
    if(visible != null) this.visible = visible;
    if(origin != null) this.origin = origin;
    if(rotation != null) this.rotation = rotation;
  }
  
  public static List<MoGraphic> parse(OMCompiler omc, List<ElementContext> elements) {
    List<MoGraphic> l = new ArrayList<>();
    for (ElementContext item : elements) {
      l.add(parse(omc, item));
    }
    return l;
  }
  
  public static MoGraphic parse(OMCompiler omc, ElementContext item) {
    ParserRuleContext elem = (ParserRuleContext) item.children.get(0);
    
    switch (elem.getClass().getSimpleName()) {
      case "TextContext":
        return MoText.parse((TextContext) elem);
      case "RectangleContext":
        return MoRectangle.parse((RectangleContext) elem);
      case "EllipseContext":
        return MoEllipse.parse((EllipseContext) elem);
      case "LineContext":
        return MoLine.parse((LineContext) elem);
      case "PolygonContext":
        return MoPolygon.parse((PolygonContext) elem);
      case "BitmapContext":
        return MoBitmap.parse(omc, (BitmapContext) elem);
    }
    
    return null;
  }
  
  static void parse(MoGraphicBuilder mb, GraphicItemContext ctx) {
    if (ctx.visible() != null) mb.visible(Boolean.parseBoolean(ctx.visible().val.getText()));
    else if (ctx.origin() != null) mb.origin(new Point<>(Double.parseDouble(ctx.origin().val.x.getText()), Double.parseDouble(ctx.origin().val.y.getText())));
    else if (ctx.rotation() != null) mb.rotation(Double.parseDouble(ctx.rotation().val.getText()));
  }
}

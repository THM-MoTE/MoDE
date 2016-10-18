package de.thm.mni.mhpp11.util.parser.models.graphics;

import com.sun.javafx.tk.FontLoader;
import com.sun.javafx.tk.FontMetrics;
import com.sun.javafx.tk.Toolkit;
import de.thm.mni.mhpp11.parser.modelica.AnnotationParser.*;
import de.thm.mni.mhpp11.util.config.Settings;
import de.thm.mni.mhpp11.util.config.model.Point;
import de.thm.mni.mhpp11.util.parser.OMCompiler;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
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
  
  public static class Utilities {
    public enum LinePattern {
      NONE,
      SOLID,
      DASH,
      DOT,
      DASHDOT,
      DASHDOTDOT
    }
  
    public enum Smooth {
      NONE,
      BEZIER
    }
  
  
    public static Color convertColor(Object val) {
      if (val instanceof String) return Color.valueOf(((String) val).toUpperCase());
      else if (val instanceof ColorTypeContext) {
        ColorTypeContext ctx = (ColorTypeContext) val;
        return Color.rgb(Integer.parseInt(ctx.r.getText()), Integer.parseInt(ctx.g.getText()), Integer.parseInt(ctx.b.getText()));
      } else {
        Settings.load().getLogger().debug("MoLine", "color: Not implemented");
      }
      return Color.BLACK;
    }
  
    /**
     * Calculates the largest size of the given font for which the given string
     * will fit into the given size.
     * <p>
     * From: http://www.java2s.com/Code/Java/Swing-JFC/GetMaxFittingFontSize.htm
     */
    public static Double calculateMaxFontSize(Font font, String string, Double width, Double height) {
      width = Math.abs(width);
      height = Math.abs(height);
      FontLoader fl = Toolkit.getToolkit().getFontLoader();
      Double minSize = 0.;
      Double maxSize = 288.;
      Double curSize = font.getSize();
    
      while (maxSize - minSize > 2) {
      
        FontMetrics fm = fl.getFontMetrics(Font.font(font.getName(), curSize));
        Double fontWidth = calculateStringWidth(fl, Font.font(font.getName(), curSize), string);
        Double fontHeight = calculateFontHeight(fl, Font.font(font.getName(), curSize));
      
        if ((fontWidth > width) || (fontHeight > height)) {
          maxSize = curSize;
          curSize = (maxSize + minSize) / 2;
        } else {
          minSize = curSize;
          curSize = (minSize + maxSize) / 2;
        }
      }
    
      return curSize;
    }
  
    public static Double calculateFontHeight(Font font) {
      return calculateFontHeightWithoutDescent(Toolkit.getToolkit().getFontLoader(), font);
    }
  
    public static Double calculateStringWidth(Font font, String string) {
      return calculateStringWidth(Toolkit.getToolkit().getFontLoader(), font, string);
    }
  
    private static Double calculateFontHeightWithoutDescent(FontLoader fl, Font font) {
      FontMetrics fm = fl.getFontMetrics(font);
      return (double) (fm.getLeading() + fm.getMaxAscent() + fm.getMaxDescent());
    }
  
    private static Double calculateFontHeight(FontLoader fl, Font font) {
      return (double) (calculateFontHeightWithoutDescent(fl, font) + fl.getFontMetrics(font).getMaxDescent());
    }
  
    private static Double calculateStringWidth(FontLoader fl, Font font, String string) {
      return (double) fl.getFontMetrics(font).computeStringWidth(string);
    }
  }
}

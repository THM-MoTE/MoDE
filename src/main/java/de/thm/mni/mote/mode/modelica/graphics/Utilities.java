package de.thm.mni.mote.mode.modelica.graphics;

import com.sun.javafx.tk.FontLoader;
import com.sun.javafx.tk.FontMetrics;
import com.sun.javafx.tk.Toolkit;
import de.thm.mni.mhpp11.smbj.manager.ActorManager;
import de.thm.mni.mhpp11.smbj.logging.messages.DebugMessage;
import de.thm.mni.mote.mode.parser.modelica.AnnotationParser;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Point2D;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import lombok.experimental.UtilityClass;

import java.text.NumberFormat;
import java.util.List;
import java.util.function.Consumer;

import static javafx.scene.paint.Color.BLACK;

/**
 * Created by Marcel Hoppe on 31.10.16.
 */
@UtilityClass
public class Utilities {
  
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
  
  public static String getFillCSS(FillPattern pattern, Color fillColor, Color lineColor) {
    String s = "-fx-fill: ";
    switch (pattern) {
      case NONE:
        return s + "transparent;";
      case SOLID:
        return s + fillColor.toString().replace("0x", "#") + ";";
      case HORIZONTALCYLINDER:
        return s + "linear-gradient(to bottom, " +
                   lineColor.toString().replace("0x", "#") + " 0%, " +
                   fillColor.toString().replace("0x", "#") + " 50%, " +
                   lineColor.toString().replace("0x", "#") + " 100%);";
      case VERTICALCYLINDER:
        return s + "linear-gradient(to right, " +
                   lineColor.toString().replace("0x", "#") + " 0%, " +
                   fillColor.toString().replace("0x", "#") + " 50%, " +
                   lineColor.toString().replace("0x", "#") + " 100%);";
      case SPHERE:
        return s + "radial-gradient(center 50% 50%, " +
                   "radius 100%, " +
                   fillColor.toString().replace("0x", "#") + ", " +
                   lineColor.toString().replace("0x", "#") + ");";
    }
    return "";
  }
  
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
  
  public ObservableList<Double> getLinePattern(LinePattern pattern) {
    ObservableList<Double> list = FXCollections.observableArrayList();
    switch (pattern) {
      case NONE:
        list.addAll(0., 10.);
        break;
      case SOLID:
        list.addAll(10., 0.);
        break;
      case DASH:
        list.addAll(25., 10.);
        break;
      case DOT:
        list.addAll(2., 10.);
        break;
      case DASHDOT:
        list.addAll(25., 10., 2., 10.);
        break;
      case DASHDOTDOT:
        list.addAll(25., 10., 2., 10., 2., 10.);
        break;
    }
    return list;
  }
  
  public Color convertColor(Object val) {
    if (val instanceof String) return Color.valueOf(((String) val).toUpperCase());
    else if (val instanceof AnnotationParser.ColorTypeContext) {
      AnnotationParser.ColorTypeContext ctx = (AnnotationParser.ColorTypeContext) val;
      return Color.rgb(Integer.parseInt(ctx.r.getText()), Integer.parseInt(ctx.g.getText()), Integer.parseInt(ctx.b.getText()));
    } else {
      ActorManager.getInstance().send(new DebugMessage(Utilities.class, "MoLine", "color: Not implemented"));
    }
    return BLACK;
  }
  
  public String convertColor(Color col) {
    if (col.equals(BLACK)) return "Black";
    int r = (int) Math.round(col.getRed() * 255.0);
    int g = (int) Math.round(col.getGreen() * 255.0);
    int b = (int) Math.round(col.getBlue() * 255.0);
    return "{" + r + ", " + g + ", " + b + "}";
  }
  
  /**
   * Calculates the largest size of the given font for which the given string
   * will fit into the given size.
   * <p>
   * From: http://www.java2s.com/Code/Java/Swing-JFC/GetMaxFittingFontSize.htm
   */
  public Double calculateMaxFontSize(Font font, String string, Double width, Double height) {
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
  
  public Double calculateFontHeight(Font font) {
    return calculateFontHeightWithoutDescent(Toolkit.getToolkit().getFontLoader(), font);
  }
  
  public Double calculateStringWidth(Font font, String string) {
    return calculateStringWidth(Toolkit.getToolkit().getFontLoader(), font, string);
  }
  
  private Double calculateFontHeightWithoutDescent(FontLoader fl, Font font) {
    FontMetrics fm = fl.getFontMetrics(font);
    return (double) (fm.getLeading() + fm.getMaxAscent() + fm.getMaxDescent());
  }
  
  private Double calculateFontHeight(FontLoader fl, Font font) {
    return calculateFontHeightWithoutDescent(fl, font) + fl.getFontMetrics(font).getMaxDescent();
  }
  
  private Double calculateStringWidth(FontLoader fl, Font font, String string) {
    return (double) fl.getFontMetrics(font).computeStringWidth(string);
  }
  
  public String toString(Point2D point) {
    NumberFormat fmt = de.thm.mni.mote.mode.util.Utilities.getFormatter();
    if (point == null) return "null";
      return String.format("{%s, %s}", fmt.format(point.getX()), fmt.format(point.getY()));
  }
  
  public static String toString(List<Point2D> points) {
    StringBuilder sb = new StringBuilder();
    
    points.forEach(new Consumer<Point2D>() {
      Boolean first = true;
      
      @Override
      public void accept(Point2D point) {
        if (first) {
          sb.append("{");
          first = false;
        } else sb.append(", ");
        sb.append(Utilities.toString(point));
      }
    });
    
    return sb.append("}").toString();
  }
  
}

package de.thm.mni.mhpp11.util.parser.models.graphics;

import de.thm.mni.mhpp11.parser.modelica.AnnotationParser.TextContext;
import de.thm.mni.mhpp11.parser.modelica.AnnotationParser.TextDataContext;
import de.thm.mni.mhpp11.util.config.model.Point;
import de.thm.mni.mhpp11.util.parser.models.interfaces.MoExtent;
import javafx.scene.paint.Color;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

import java.util.regex.Pattern;

/**
 * Created by hobbypunk on 19.09.16.
 */
@Getter
public class MoText extends MoFilledShape implements MoExtent {
  
  private static final Pattern COMPILE = Pattern.compile("(^[\\\\\\\"]+)|([\\\\\\\"]+$)");
  private Point<Double, Double>[] extent = (Point<Double, Double>[]) new Point[2];
  public enum TextAlignment {
    LEFT,
    CENTER,
    RIGHT
  }
  
  @AllArgsConstructor
  public static enum TextStyle {
    BOLD(1<<0),
    ITALIC(1<<1),
    UNTERLINE(1<<2);
    final int val;
    
    public static Boolean isBold(Integer val) {
      return (val & BOLD.val) == BOLD.val;
    }
    public static Boolean isItalic(Integer val) {
      return (val & ITALIC.val) == ITALIC.val;
    }
    public static Boolean isUnterline(Integer val) {
      return (val & UNTERLINE.val) == UNTERLINE.val;
    }
  }
  
  String string = "";
  Double fontSize = 0.0;
  String fontName = "";
  Integer textStyle = 0;
  @Getter(AccessLevel.PRIVATE) Color textColor = this.lineColor;
  TextAlignment horizontalAlignment = TextAlignment.CENTER;
  Integer index = 1;
  
  @Builder(builderMethodName = "textBuilder")
  MoText(MoFilledShape mfs, Point<Double, Double> first, Point<Double, Double> second, String string, Double fontSize, String fontName, Integer textStyle, Color textColor, TextAlignment horizontalAlignment, Integer index) {
    super(mfs);
    if (first != null) this.extent[0] = first;
    if (second != null) this.extent[1] = second;
    if (string != null) this.string = string;
    if(fontSize != null) this.fontSize = fontSize;
    if(fontName != null) this.fontName = fontName;
    if(textStyle != null) this.textStyle = textStyle;
    if(horizontalAlignment != null) this.horizontalAlignment = horizontalAlignment;
    this.textColor = (textColor != null)?textColor:this.lineColor;
    if (index != null) this.index = index;
  }
  
  public Color getFillColor() {
    return (this.textColor != null) ? this.textColor : super.getLineColor();
  }
  
  public Color getLineColor() {
    return Color.TRANSPARENT;
  }
  
  public static MoText parse(TextContext elem) {
    MoGraphicBuilder mgb = builder();
    MoFilledShapeBuilder mfsb = filledShapeBuilder();
    MoTextBuilder mb = textBuilder();
    
    Integer style = 0;
    
    for (TextDataContext data : elem.data) {
      if (data.graphicItem() != null) {
        MoGraphic.parse(mgb, data.graphicItem());
      } else if (data.filledShape() != null) {
        MoFilledShape.parse(mfsb, data.filledShape());
      } else if (data.extent() != null) {
        mb.first(new Point<>(Double.parseDouble(data.extent().p1.x.getText()), Double.parseDouble(data.extent().p1.y.getText())));
        mb.second(new Point<>(Double.parseDouble(data.extent().p2.x.getText()), Double.parseDouble(data.extent().p2.y.getText())));
      } else if (data.textString() != null) {
        mb.string(COMPILE.matcher(data.textString().val.getText()).replaceAll(""));
      } else if (data.fontName() != null) {
        mb.fontName(data.fontName().val.getText());
      } else if (data.fontSize() != null) {
        mb.fontSize(Double.parseDouble(data.fontSize().val.getText()));
      } else if (data.horizontalAlignment() != null) {
        mb.horizontalAlignment(TextAlignment.valueOf(data.horizontalAlignment().val.type.getText().toUpperCase()));
      } else if (data.textStyle() != null) {
        //TODO textStyle
        style += TextStyle.valueOf(data.textStyle().type.getText().toUpperCase()).val;
      } else if (data.index() != null) { //only for connect Annotations
        mb.index(Integer.parseInt(data.index().val.getText()));
      }
    }
    
    return mb.mfs(
        mfsb.mg(
            mgb.build()
        ).build()
    ).build();
  }
}

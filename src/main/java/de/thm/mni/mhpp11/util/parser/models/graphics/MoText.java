package de.thm.mni.mhpp11.util.parser.models.graphics;

import de.thm.mni.mhpp11.parser.ModelicaIconParser;
import javafx.scene.paint.Color;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

/**
 * Created by hobbypunk on 19.09.16.
 */
@Getter
public class MoText extends MoFilledShapeExtent {
  
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
  
  String textString = "";
  Double fontSize = 0.0;
  String fontName = "";
  Integer textStyle = 0;
  Color textColor = this.lineColor;
  TextAlignment horizontalAlignment = TextAlignment.CENTER;
  
  
  @Builder(builderMethodName = "textBuilder")
  MoText(MoFilledShapeExtent mfse, String textString, Double fontSize, String fontName, Integer textStyle, Color textColor, TextAlignment horizontalAlignment) {
    super(mfse);
    if(textString != null) this.textString = textString;
    if(fontSize != null) this.fontSize = fontSize;
    if(fontName != null) this.fontName = fontName;
    if(textStyle != null) this.textStyle = textStyle;
    if(horizontalAlignment != null) this.horizontalAlignment = horizontalAlignment;
    this.textColor = (textColor != null)?textColor:this.lineColor;
  }
  
  public static MoText parse(ModelicaIconParser.TextContext ctx) {
    MoTextBuilder mb = textBuilder();
    
    mb.mfse(MoFilledShapeExtent.parse(ctx.filledShape(), ctx.extent()));
    
    mb.textString(ctx.t.getText());
    mb.fontSize(Double.parseDouble(ctx.fs.getText()));
    if (ctx.f != null) mb.fontName(ctx.f.getText());
    Integer style = 0;
    for (ModelicaIconParser.TextStyleContext tsc : ctx.ts) {
      style += TextStyle.valueOf(tsc.type.getText().toUpperCase()).val;
    }
    mb.textStyle(style);
    mb.horizontalAlignment(TextAlignment.valueOf(ctx.ta.type.getText().toUpperCase()));
    
    return mb.build();
  }
}

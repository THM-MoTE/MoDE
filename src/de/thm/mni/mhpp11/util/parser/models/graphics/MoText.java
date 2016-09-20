package de.thm.mni.mhpp11.util.parser.models.graphics;

import de.thm.mni.mhpp11.util.parser.models.MoFunction;
import javafx.scene.paint.Color;
import javafx.util.Pair;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

import java.util.List;

/**
 * Created by hobbypunk on 19.09.16.
 */
@Getter
public class MoText extends MoFilledShapeExtent {
  
  enum TextAlignment {
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
  
  public static MoText parse(MoFunction mf) {
    MoTextBuilder mb = textBuilder();
    
    mb.mfse(MoFilledShapeExtent.parse(mf));
    
    for (Object o : mf.getParams()) {
      if (!(o instanceof Pair)) continue;
      Pair<String, Object> p = (Pair<String, Object>) o;
      String key = p.getKey().toLowerCase();
      Object val = p.getValue();
      switch (key) {
        case "textstring": {
          mb.textString((String)val);
          break;
        }
        case "fontsize": {
          mb.fontSize((Double)val);
          break;
        }
        case "fontname": {
          mb.fontName((String)val);
          break;
        }
        case "textstyle": {
          List<String> list = (List<String>)val;
          Integer style = 0;
          for(String s: list) {
            style += TextStyle.valueOf(s.toUpperCase()).val;
          }
          mb.textStyle(style);
          break;
        }
        case "textcolor": {
          mb.textColor(Utilities.convertColor(val));
        }
        case "horizontalalignment": {
          mb.horizontalAlignment(TextAlignment.valueOf(((String)val).toUpperCase()));
        }
      }
    }
    
    return mb.build();
  }
}

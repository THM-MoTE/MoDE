package de.thm.mni.mote.mode.modelica.graphics;

import de.thm.mni.mote.mode.modelica.MoVariable;
import de.thm.mni.mote.mode.modelica.interfaces.HasExtent;
import de.thm.mni.mote.mode.parser.modelica.AnnotationParser.TextContext;
import de.thm.mni.mote.mode.parser.modelica.AnnotationParser.TextDataContext;
import javafx.beans.property.*;
import javafx.geometry.Point2D;
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
public class MoText extends MoFilledShape implements HasExtent {
  
  private static final Pattern COMPILE = Pattern.compile("(^[\\\\\"]+)|([\\\\\"]+$)");
  private final MoExtent extent;
  private Boolean showAlways;
  private String replaceClazz = null;
  private String replaceName = null;
  
  private MoVariable moVarForParams;
  
  public enum TextAlignment {
    LEFT,
    CENTER,
    RIGHT
  }
  
  @AllArgsConstructor
  public enum TextStyle {
    BOLD(1),
    ITALIC(1 << 1),
    UNTERLINE(1 << 2);
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
  
  StringProperty stringProperty = new SimpleStringProperty("");
  DoubleProperty fontSizeProperty = new SimpleDoubleProperty(0.0);
  StringProperty fontNameProperty = new SimpleStringProperty("");
  IntegerProperty textStyleProperty = new SimpleIntegerProperty(0);
  @Getter(AccessLevel.PRIVATE) ObjectProperty<Color> textColorProperty = this.lineColorProperty;
  ObjectProperty<TextAlignment> horizontalAlignmentProperty = new SimpleObjectProperty<>(TextAlignment.CENTER);
  IntegerProperty indexProperty = new SimpleIntegerProperty(1);
  
  MoText(MoFilledShape mfs, Point2D p1, Point2D p2, String string) {
    this(mfs, p1, p2, string, null, null, null, null, null, null);
    this.showAlways = true;
  }
  
  @Builder(builderMethodName = "textBuilder")
  private MoText(MoFilledShape mfs, Point2D p1, Point2D p2, String string, Double fontSize, String fontName, Integer textStyle, Color textColor, TextAlignment horizontalAlignment, Integer index) {
    super(mfs);
    extent = new MoSimpleExtent(p1, p2);
    if (string != null) this.stringProperty.set(string);
    if (fontSize != null) this.fontSizeProperty.set(fontSize);
    if (fontName != null) this.fontNameProperty.set(fontName);
    if (textStyle != null) this.textStyleProperty.set(textStyle);
    if (horizontalAlignment != null) this.horizontalAlignmentProperty.set(horizontalAlignment);
    if (textColor != null) this.textColorProperty.set(textColor);
    if (index != null) this.indexProperty.set(index);
    this.showAlways = false;
    
    initChangeListeners();
  }
  
  public Color getFillColor() {
    return this.textColorProperty.get();
  }
  
  public Color getLineColor() {
    return Color.TRANSPARENT;
  }
  
  public void initReplaceText(MoVariable that) {
    this.moVarForParams = that;
  }
  
  
  public String getString() {
    String str = stringProperty.get();
    
    if (moVarForParams != null && str.contains("%")) {
      str = str.replaceAll("%name", moVarForParams.getSimpleName());
      str = str.replaceAll("%class", moVarForParams.getType().getName());
      for (MoVariable param : moVarForParams.getParameters()) {
        if (moVarForParams.getParamValues().containsKey(param)) {
          str = str.replaceAll("%" + param.getSimpleName(), moVarForParams.getParamValues().get(param));
        } else if (!param.getValue().isEmpty()) {
          str = str.replaceAll("%" + param.getSimpleName(), param.getValue());
        }
      }
    }
    
    str = str.replaceAll("%%", "%");
    
    return str;
  }
  
  public static MoText parse(TextContext elem) {
    MoGraphicBuilder mgb = builder();
    MoFilledShapeBuilder mfsb = filledShapeBuilder();
    MoTextBuilder mb = textBuilder();
    
    Integer style = 0;
    
    for (TextDataContext data : elem.data) {
      if (data.graphicItem() != null) {
        parse(mgb, data.graphicItem());
      } else if (data.filledShape() != null) {
        parse(mfsb, data.filledShape());
      } else if (data.extent() != null) {
        mb.p1(new Point2D(Double.parseDouble(data.extent().p1.x.getText()), Double.parseDouble(data.extent().p1.y.getText())));
        mb.p2(new Point2D(Double.parseDouble(data.extent().p2.x.getText()), Double.parseDouble(data.extent().p2.y.getText())));
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

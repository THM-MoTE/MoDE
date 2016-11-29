package de.thm.mni.mhpp11.util.parser.models.graphics;

import de.thm.mni.mhpp11.parser.modelica.AnnotationParser.*;
import de.thm.mni.mhpp11.util.parser.OMCompiler;
import de.thm.mni.mhpp11.util.parser.models.interfaces.Changeable;
import javafx.beans.property.*;
import javafx.geometry.Point2D;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import org.antlr.v4.runtime.ParserRuleContext;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by hobbypunk on 16.09.16.
 */
@Getter
public class MoGraphic implements Changeable {
  @Setter private ChangeListener internalChangeListener = null;
  
  BooleanProperty visible = new SimpleBooleanProperty(true);
  ObjectProperty<Point2D> origin = new SimpleObjectProperty<>(new Point2D(0.0, 0.0)); //Ursprung des Elements
  DoubleProperty rotation = new SimpleDoubleProperty(0.0);
  
  public MoGraphic() {
    initChangeListeners();
  }
  
  public MoGraphic(MoGraphic mg) {
    this(mg.visible.getValue(), mg.getOrigin().getValue(), mg.rotation.getValue());
  }
  
  @Builder
  public MoGraphic(Boolean visible, Point2D origin, Double rotation) {
    if (visible != null) this.visible.setValue(visible);
    if (origin != null) this.origin.setValue(origin);
    if (rotation != null) this.rotation.setValue(rotation);
  }
  
  
  protected void initChangeListeners() {
    visible.addListener((observable, oldValue, newValue) -> changed());
    origin.addListener((observable, oldValue, newValue) -> changed());
    rotation.addListener((observable, oldValue, newValue) -> changed());
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
    else if (ctx.origin() != null) mb.origin(new Point2D(Double.parseDouble(ctx.origin().val.x.getText()), Double.parseDouble(ctx.origin().val.y.getText())));
    else if (ctx.rotation() != null) mb.rotation(Double.parseDouble(ctx.rotation().val.getText()));
  }
}

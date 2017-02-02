package de.thm.mni.mote.mode.modelica.graphics;

import de.thm.mni.mote.mode.modelica.interfaces.Changeable;
import de.thm.mni.mote.mode.omcactor.OMCompiler;
import de.thm.mni.mote.mode.parser.modelica.AnnotationParser.*;
import de.thm.mni.mote.mode.util.StringBuilderUtilities;
import javafx.beans.property.*;
import javafx.geometry.Point2D;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import org.antlr.v4.runtime.ParserRuleContext;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by hobbypunk on 16.09.16.
 */
@Getter
public class MoGraphic implements Changeable {
  @Setter private Changeable changeParent = null;
  
  private static Boolean DEFAULT_VISIBLE = true;
  private static Point2D DEFAULT_ORIGIN = new Point2D(0.0, 0.0);
  private static Double DEFAULT_ROTATION = 0.;
  
  
  private final ObjectProperty<Change> unsavedChanges = new SimpleObjectProperty<>(Change.NONE);
  
  BooleanProperty visible = new SimpleBooleanProperty(null, "visible", DEFAULT_VISIBLE);
  ObjectProperty<Point2D> origin = new SimpleObjectProperty<>(null, "origin", DEFAULT_ORIGIN); //Ursprung des Elements
  DoubleProperty rotation = new SimpleDoubleProperty(null, "rotation", DEFAULT_ROTATION);
  
  public MoGraphic() {
    initChangeListeners();
  }
  
  public MoGraphic(MoGraphic mg) {
    this(mg.visible.getValue(), mg.getOrigin().getValue(), mg.rotation.getValue());
    initChangeListeners();
  }
  
  @Builder
  public MoGraphic(Boolean visible, Point2D origin, Double rotation) {
    if (visible != null) this.visible.setValue(visible);
    if (origin != null) this.origin.setValue(origin);
    if (rotation != null) this.rotation.setValue(rotation);
  }
  
  
  @SuppressWarnings("unchecked")
  @Override
  public List<Changeable> getChangeChildren() {
    return Collections.EMPTY_LIST;
  }
  
  protected void initChangeListeners() {
    initChangeListener();
    visible.addListener((observable, oldValue, newValue) -> changed());
    origin.addListener((observable, oldValue, newValue) -> changed());
    rotation.addListener((observable, oldValue, newValue) -> changed());
  }
  
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    if (!DEFAULT_VISIBLE.equals(this.visible.get())) StringBuilderUtilities.addProperty(sb, this.visible);
    if (!DEFAULT_ORIGIN.equals(this.origin.get())) StringBuilderUtilities.addProperty(sb, this.origin);
    if (!DEFAULT_ROTATION.equals(this.rotation.get())) StringBuilderUtilities.addProperty(sb, this.rotation);
    
    return sb.toString().replaceAll(", $", "");
  }
  
  public static String toString(List<MoGraphic> moGraphics) {
    String str = "";
    for (MoGraphic moGraphic : moGraphics) {
      str += ((str.isEmpty()) ? "" : ",") + moGraphic.toString();
    }
    
    return "annotation(" + str + ")";
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

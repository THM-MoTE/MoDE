package de.thm.mni.mote.mode.modelica.graphics;

import de.thm.mni.mote.mode.modelica.graphics.Utilities.LinePattern;
import de.thm.mni.mote.mode.modelica.graphics.Utilities.Smooth;
import de.thm.mni.mote.mode.parser.modelica.AnnotationParser;
import de.thm.mni.mote.mode.parser.modelica.AnnotationParser.LineDataContext;
import de.thm.mni.mote.mode.parser.modelica.AnnotationParser.PointContext;
import de.thm.mni.mote.mode.util.StringBuilderUtilities;
import javafx.beans.property.DoubleProperty;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.collections.FXCollections;
import javafx.collections.ListChangeListener;
import javafx.collections.ObservableList;
import javafx.geometry.Point2D;
import javafx.scene.paint.Color;
import lombok.Builder;
import lombok.Getter;
import lombok.Singular;

import java.util.List;


/**
 * Created by Marcel Hoppe on 19.09.16.
 */
@SuppressWarnings("unchecked")
@Getter
public class MoLine extends MoGraphic implements HasSmoothOption {
  private static final Arrow DEFAULT_START_ARROW = Arrow.NONE;
  private static final Arrow DEFAULT_END_ARROW = Arrow.NONE;
  private static final Smooth DEFAULT_SMOOTH = Smooth.NONE;
  private static final Color DEFAULT_COLOR = Color.BLACK;
  private static final LinePattern DEFAULT_LINE_PATTERN = LinePattern.SOLID;
  
  
  public enum Arrow {
    NONE,
    OPEN,
    FILLED,
    HALF
  }
  
  ObservableList<Point2D> points = FXCollections.observableArrayList();
  ObjectProperty<Color> colorProperty = new SimpleObjectProperty<>(DEFAULT_COLOR);
  ObjectProperty<LinePattern> linePatternProperty = new SimpleObjectProperty<>(DEFAULT_LINE_PATTERN);
  ObjectProperty<Arrow> startArrowProperty = new SimpleObjectProperty<>(DEFAULT_START_ARROW);
  ObjectProperty<Arrow> endArrowProperty = new SimpleObjectProperty<>(DEFAULT_END_ARROW);
  ObjectProperty<Smooth> smoothProperty = new SimpleObjectProperty<>(DEFAULT_SMOOTH);
  
  DoubleProperty thicknessProperty = new SimpleDoubleProperty(1.0);
  DoubleProperty arrowSizeProperty = new SimpleDoubleProperty(3.0);
  
  
  ObjectProperty<Point2D> firstPointProperty = new SimpleObjectProperty<>();
  ObjectProperty<Point2D> secondPointProperty = new SimpleObjectProperty<>();
  
  ObjectProperty<Point2D> secondLastPointProperty = new SimpleObjectProperty<>();
  ObjectProperty<Point2D> lastPointProperty = new SimpleObjectProperty<>();
  
  public MoLine(Point2D start) {
    super();
    this.points.add(start);
    initChangeListeners();
  }
  
  @Builder(builderMethodName = "lineBuilder")
  MoLine(MoGraphic mg, @Singular List<Point2D> points, Color color, LinePattern linePattern, Double thickness, Arrow start, Arrow end, Double arrowSize, Smooth smooth) {
    super(mg);
    this.points.addAll(points);
    if(start != null) startArrowProperty.set(start);
    if(end != null) endArrowProperty.set(end);
    if (color != null) this.colorProperty.set(color);
    if (linePattern != null) this.linePatternProperty.set(linePattern);
    if (thickness != null) this.thicknessProperty.set(thickness);
    if (arrowSize != null) this.arrowSizeProperty.set(arrowSize);
    if (smooth != null) this.smoothProperty.set(smooth);
    initChangeListeners();
  }
  
  @SuppressWarnings("WeakerAccess")
  @Override
  protected void initChangeListeners() {
    if (this.points == null || this.points.size() <= 1) return;
    initPointProperties();
    super.initChangeListeners();
    this.points.addListener((ListChangeListener<? super Point2D>) c -> changed());
  
    this.points.addListener((ListChangeListener<? super Point2D>) c -> updatePointProperties());
  }
  private void initPointProperties() {
    Point2D p = this.points.get(0);
    if(p != this.firstPointProperty.get()) this.firstPointProperty.set(p);
    p = this.points.get(this.points.size()-1);
    if(p != this.lastPointProperty.get()) this.lastPointProperty.set(p);
  
    this.firstPointProperty.addListener((observable, oldValue, newValue) -> this.points.set(0, newValue));
    this.lastPointProperty.addListener((observable, oldValue, newValue) -> this.points.set(this.points.size()-1, newValue));
  
    updatePointProperties();
  }
  private void updatePointProperties() {
    Point2D p = this.points.get(1);
    if(p != this.secondPointProperty.get()) this.secondPointProperty.set(p);
    p = this.points.get(this.points.size()-2);
    if(p != this.secondLastPointProperty.get()) this.secondLastPointProperty.set(p);
  }
  
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("Line(");
    sb.append(super.toString());
    StringBuilderUtilities.addString(sb, "points = " + Utilities.toString(points), "Line\\(");
    if (!DEFAULT_COLOR.equals(this.colorProperty.get())) StringBuilderUtilities.addProperty(sb, this.colorProperty);
    if (!DEFAULT_LINE_PATTERN.equals(this.linePatternProperty.get())) StringBuilderUtilities.addProperty(sb, this.linePatternProperty, "LinePattern.");
    
    return sb.append(')').toString();
  }
  
  public static MoLine parse(AnnotationParser.LineContext elem) {
    MoGraphicBuilder mgb = builder();
    MoLineBuilder mb = lineBuilder();
    
    for (LineDataContext data : elem.data) {
      if (data.graphicItem() != null) {
        parse(mgb, data.graphicItem());
      } else if (data.color() != null) {
        mb.color(Utilities.convertColor(data.color().val));
      } else if (data.linePattern() != null) {
        mb.linePattern(LinePattern.valueOf(data.linePattern().type.getText().toUpperCase()));
      } else if (data.arrowSize() != null) {
        mb.arrowSize(Double.parseDouble(data.arrowSize().val.getText()));
      } else if (data.thickness() != null) {
        mb.thickness(Double.parseDouble(data.thickness().val.getText()));
      } else if (data.smooth() != null) {
        mb.smooth(Smooth.valueOf(data.smooth().type.getText().toUpperCase()));
      } else if (data.arrows() != null) {
        if (data.arrows().a1 != null) mb.start(Arrow.valueOf(data.arrows().a1.type.getText().toUpperCase()));
        if (data.arrows().a2 != null) mb.end(Arrow.valueOf(data.arrows().a2.type.getText().toUpperCase()));
      } else if (data.points() != null) {
        for (PointContext point : data.points().pointList().point()) {
          mb.point(new Point2D(Double.parseDouble(point.x.getText()), Double.parseDouble(point.y.getText())));
        }
      }
    }
    
    return mb.mg(
        mgb.build()
    ).build();
  }
}

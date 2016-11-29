package de.thm.mni.mhpp11.parser.models.graphics;

import de.thm.mni.mhpp11.parser.modelica.AnnotationParser;
import de.thm.mni.mhpp11.parser.modelica.AnnotationParser.LineDataContext;
import de.thm.mni.mhpp11.parser.modelica.AnnotationParser.PointContext;
import de.thm.mni.mhpp11.parser.models.graphics.Utilities.LinePattern;
import de.thm.mni.mhpp11.parser.models.graphics.Utilities.Smooth;
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
 * Created by hobbypunk on 19.09.16.
 */
@SuppressWarnings("unchecked")
@Getter
public class MoLine extends MoGraphic implements HasSmoothOption {
  
  enum Arrow {
    NONE,
    OPEN,
    FILLED,
    HALF
  }
  
  ObservableList<Point2D> points = FXCollections.observableArrayList();
  Color color = Color.BLACK;
  LinePattern linePattern = LinePattern.SOLID;
  Double thickness = 1.0;
  Arrow[] arrows = new Arrow[2];
  Double arrowSize = 3.0;
  Smooth smooth = Smooth.NONE;
  
  public MoLine(Point2D start, Point2D end) {
    super();
    this.points.addAll(start, end);
    initChangeListeners();
  }
  
  @Builder(builderMethodName = "lineBuilder")
  MoLine(MoGraphic mg, @Singular List<Point2D> points, Color color, LinePattern linePattern, Double thickness, Arrow start, Arrow end, Double arrowSize, Smooth smooth) {
    super(mg);
    this.points.addAll(points);
    this.arrows[0] = start;
    this.arrows[1] = end;
  
    if (color != null) this.color = color;
    if (linePattern != null) this.linePattern = linePattern;
    if (thickness != null) this.thickness = thickness;
    if (arrowSize != null) this.arrowSize = arrowSize;
    if (smooth != null) this.smooth = smooth;
    initChangeListeners();
  }
  
  @Override
  protected void initChangeListeners() {
    super.initChangeListeners();
    this.points.addListener((ListChangeListener<? super Point2D>) c -> {
      changed();
    });
  }
  
  public static MoLine parse(AnnotationParser.LineContext elem) {
    MoGraphicBuilder mgb = builder();
    MoLineBuilder mb = lineBuilder();
    
    for (LineDataContext data : elem.data) {
      if (data.graphicItem() != null) {
        MoGraphic.parse(mgb, data.graphicItem());
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

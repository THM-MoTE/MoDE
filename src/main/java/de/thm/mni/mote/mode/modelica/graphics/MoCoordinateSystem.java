package de.thm.mni.mote.mode.modelica.graphics;

import de.thm.mni.mote.mode.parser.modelica.AnnotationParser.CoordinateSystemContext;
import de.thm.mni.mote.mode.parser.modelica.AnnotationParser.CoordinateSystem_dataContext;
import javafx.beans.property.*;
import javafx.geometry.Point2D;
import lombok.Builder;
import lombok.Getter;

/**
 * Created by Marcel Hoppe on 16.09.16.
 */

@Getter
public class MoCoordinateSystem {
  
  private final MoExtent extent;
  private final BooleanProperty preserveAspectRatio = new SimpleBooleanProperty(true);
  private final DoubleProperty initialScale = new SimpleDoubleProperty(0.1);
  private final ObjectProperty<Point2D> grid = new SimpleObjectProperty<>(new Point2D(2., 2.));
  
  public MoCoordinateSystem() {
    extent = new MoSimpleExtent(new Point2D(-100, -100), new Point2D(100, 100));
  }
  
  @Builder
  private MoCoordinateSystem(Point2D p1, Point2D p2, Boolean preserveAspectRatio, Double initialScale, Point2D grid) {
    extent = new MoSimpleExtent(p1, p2);
    if (preserveAspectRatio != null) this.preserveAspectRatio.set(preserveAspectRatio);
    if (initialScale != null) this.initialScale.set(initialScale);
    if (grid != null) this.grid.set(grid);
  }
  
  private MoCoordinateSystem(MoCoordinateSystem that) {
    extent = new MoSimpleExtent(that.extent.getP1(), that.extent.getP2());
    this.preserveAspectRatio.set(that.preserveAspectRatio.get());
    this.initialScale.set(that.initialScale.get());
    this.grid.set(that.grid.get());
  }
  
  public static MoCoordinateSystem parse(CoordinateSystemContext system) {
    MoCoordinateSystemBuilder mb = builder();
    
    for (CoordinateSystem_dataContext data : system.data)
      if (data.extent() != null) {
        mb.p1(new Point2D(Double.parseDouble(data.extent().p1.x.getText()), Double.parseDouble(data.extent().p1.y.getText())));
        mb.p2(new Point2D(Double.parseDouble(data.extent().p2.x.getText()), Double.parseDouble(data.extent().p2.y.getText())));
      } else if (data.preserveAspectRatio() != null) {
        mb.preserveAspectRatio(Boolean.parseBoolean(data.preserveAspectRatio().getText()));
      } else if (data.initialScale() != null) {
        mb.initialScale(Double.parseDouble(data.initialScale().val.getText()));
      } else if (data.grid() != null) {
        mb.grid(new Point2D(Double.parseDouble(data.grid().val.x.getText()), Double.parseDouble(data.grid().val.y.getText())));
      }
  
    return mb.build();
  }
  
  public MoCoordinateSystem copy() {
    return new MoCoordinateSystem(this);
  }
}

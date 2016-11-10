package de.thm.mni.mhpp11.util.parser.models.graphics;

import de.thm.mni.mhpp11.parser.modelica.AnnotationParser.CoordinateSystemContext;
import de.thm.mni.mhpp11.parser.modelica.AnnotationParser.CoordinateSystem_dataContext;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.geometry.Point2D;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by hobbypunk on 16.09.16.
 */
@NoArgsConstructor
@Getter
public class MoCoordinateSystem {
  
  private final List<ObjectProperty<Point2D>> extent = Collections.unmodifiableList(Arrays.asList(new SimpleObjectProperty<>(), new SimpleObjectProperty<>()));
  {
    extent.get(0).setValue(new Point2D(-100., -100.));
    extent.get(1).setValue(new Point2D(100., 100.));
  }
  
  private Boolean preserveAspectRatio = true;
  private Double initialScale = 0.1;
  private Point2D grid = new Point2D(2., 2.);
  
  @Builder
  private MoCoordinateSystem(Point2D first, Point2D second, Boolean preserveAspectRatio, Double initialScale, Point2D grid) {
    if (first != null) extent.get(0).setValue(first);
    if (second != null) extent.get(1).setValue(second);
    if (preserveAspectRatio != null) this.preserveAspectRatio = preserveAspectRatio;
    if (initialScale != null) this.initialScale = initialScale;
    if (grid != null) this.grid = grid;
  }
  
  private MoCoordinateSystem(MoCoordinateSystem that) {
    this.extent.get(0).setValue(that.extent.get(0).getValue());
    this.extent.get(1).setValue(that.extent.get(1).getValue());
    this.preserveAspectRatio = that.preserveAspectRatio;
    this.initialScale = that.initialScale;
    this.grid = that.grid;
  }
  
  public static MoCoordinateSystem parse(CoordinateSystemContext system) {
    MoCoordinateSystemBuilder mb = builder();
    
    for (CoordinateSystem_dataContext data : system.data)
      if (data.extent() != null) {
        mb.first(new Point2D(Double.parseDouble(data.extent().p1.x.getText()), Double.parseDouble(data.extent().p1.y.getText())));
        mb.second(new Point2D(Double.parseDouble(data.extent().p2.x.getText()), Double.parseDouble(data.extent().p2.y.getText())));
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

package de.thm.mni.mhpp11.util.parser.models.graphics;

import de.thm.mni.mhpp11.parser.modelica.AnnotationParser.CoordinateSystemContext;
import de.thm.mni.mhpp11.parser.modelica.AnnotationParser.CoordinateSystem_dataContext;
import de.thm.mni.mhpp11.util.config.model.Point;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

/**
 * Created by hobbypunk on 16.09.16.
 */
@NoArgsConstructor
@Getter
public class MoCoordinateSystem {
  
  private Point<Double, Double>[] extent = (Point<Double, Double>[]) new Point[2];
  
  {
    this.extent[0] = new Point<>(-100., -100.);
    this.extent[1] = new Point<>(100., 100.);
  }
  private Boolean preserveAspectRatio = true;
  private Double initialScale = 0.1;
  private Point<Double, Double> grid = new Point<>(2., 2.);
  
  @Builder
  private MoCoordinateSystem(Point<Double, Double> first, Point<Double, Double> second, Boolean preserveAspectRatio, Double initialScale, Point<Double, Double> grid) {
    this.extent[0] = (first != null) ? first : new Point<>(-100., 100.);
    this.extent[1] = (second != null) ? second : new Point<>(100., -100.);
    if (preserveAspectRatio != null) this.preserveAspectRatio = preserveAspectRatio;
    if (initialScale != null) this.initialScale = initialScale;
    if (grid != null) this.grid = grid;
  }
  
  private MoCoordinateSystem(MoCoordinateSystem that) {
    this.extent[0] = that.extent[0];
    this.extent[1] = that.extent[1];
    this.preserveAspectRatio = that.preserveAspectRatio;
    this.initialScale = that.initialScale;
    this.grid = that.grid;
  }
  
  public static MoCoordinateSystem parse(CoordinateSystemContext system) {
    MoCoordinateSystemBuilder mb = builder();
    
    for (CoordinateSystem_dataContext data : system.data)
      if (data.extent() != null) {
        mb.first(new Point<>(Double.parseDouble(data.extent().p1.x.getText()), Double.parseDouble(data.extent().p1.y.getText())));
        mb.second(new Point<>(Double.parseDouble(data.extent().p2.x.getText()), Double.parseDouble(data.extent().p2.y.getText())));
      } else if (data.preserveAspectRatio() != null) {
        mb.preserveAspectRatio(Boolean.parseBoolean(data.preserveAspectRatio().getText()));
      } else if (data.initialScale() != null) {
        mb.initialScale(Double.parseDouble(data.initialScale().val.getText()));
      } else if (data.grid() != null) {
        mb.grid(new Point<>(Double.parseDouble(data.grid().val.x.getText()), Double.parseDouble(data.grid().val.y.getText())));
      }
  
    return mb.build();
  }
  
  public MoCoordinateSystem copy() {
    return new MoCoordinateSystem(this);
  }
}

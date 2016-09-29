package de.thm.mni.mhpp11.util.parser.models.graphics;

import de.thm.mni.mhpp11.parser.ModelicaIconParser;
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
    this.extent[0] = new Point<>(-100., 100.);
    this.extent[1] = new Point<>(100., -100.);
  }
  private Boolean preserveAspectRatio = true;
  private Double initialScale = 0.1;
  private Point<Double, Double> grid = new Point<>(2., 2.);
  
  @Builder
  public MoCoordinateSystem(Point<Double, Double> first, Point<Double, Double> second, Boolean preserveAspectRatio, Double initialScale, Point<Double, Double> grid) {
    this.extent[0] = (first != null) ? first : new Point<>(-100., 100.);
    this.extent[1] = (second != null) ? second : new Point<>(100., -100.);
    if (preserveAspectRatio != null) this.preserveAspectRatio = preserveAspectRatio;
    if (initialScale != null) this.initialScale = initialScale;
    if (grid != null) this.grid = grid;
  }
  
  public static MoCoordinateSystem parse(ModelicaIconParser.CoordinateSystemContext system) {
    MoCoordinateSystemBuilder mb = builder();
    
    mb.first(new Point<>(Double.parseDouble(system.p1.x.getText()), Double.parseDouble(system.p1.y.getText())));
    mb.second(new Point<>(Double.parseDouble(system.p2.x.getText()), Double.parseDouble(system.p2.y.getText())));
    mb.preserveAspectRatio(Boolean.parseBoolean(system.preserveAspectRatio.getText()));
    mb.initialScale(Double.parseDouble(system.initialScale.getText()));
    mb.grid(new Point<>(Double.parseDouble(system.grid.x.getText()), Double.parseDouble(system.grid.y.getText())));
  
    return mb.build();
  }
}

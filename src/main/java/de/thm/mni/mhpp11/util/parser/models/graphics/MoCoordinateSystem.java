package de.thm.mni.mhpp11.util.parser.models.graphics;

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
  
  public static MoCoordinateSystem parse(String[] system) {
    MoCoordinateSystemBuilder mb = builder();
    
    mb.first(new Point<>(Double.parseDouble(system[0]), Double.parseDouble(system[1])));
    mb.second(new Point<>(Double.parseDouble(system[2]), Double.parseDouble(system[3])));
    mb.preserveAspectRatio(Boolean.parseBoolean(system[4]));
    mb.initialScale(Double.parseDouble(system[5]));
    mb.grid(new Point<>(Double.parseDouble(system[6]), Double.parseDouble(system[7])));
  
    return mb.build();
  }
}

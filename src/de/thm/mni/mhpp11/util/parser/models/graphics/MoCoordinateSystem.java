package de.thm.mni.mhpp11.util.parser.models.graphics;

import de.thm.mni.mhpp11.util.config.model.Point;
import de.thm.mni.mhpp11.util.parser.models.MoExp;
import lombok.Builder;
import lombok.Getter;
import org.jmodelica.modelica.compiler.ComponentModification;
import org.jmodelica.modelica.compiler.Exp;
import org.jmodelica.modelica.compiler.ValueModification;

import java.util.List;

/**
 * Created by hobbypunk on 16.09.16.
 */
@Getter
public class MoCoordinateSystem {
  
  private Point<Double, Double>[] extent = (Point<Double, Double>[]) new Point[2];
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
  
  
  public static MoCoordinateSystem parse(org.jmodelica.modelica.compiler.List<ComponentModification> list) {
    MoCoordinateSystemBuilder mb = builder();
    
    for (ComponentModification cm : list) {
      String type = cm.getName().asID().toLowerCase();
      Exp exp = ((ValueModification)cm.getChild(3).getChild(0)).getExp();

      switch (type) {
        case "grid": {
          List<Double> l = (List<Double>) MoExp.parse(exp);
          mb.grid(new Point<>(l.get(0), l.get(1)));
          break;
        }
        case "extent": {
          List<List<Double>> l = (List<List<Double>>) MoExp.parse(exp);
          mb.first(new Point<>(l.get(0).get(0), l.get(0).get(1)));
          mb.second(new Point<>(l.get(1).get(0), l.get(1).get(1)));
          break;
        }
        case "initialscale":
          mb.initialScale((Double) MoExp.parse(exp));
          break;
        case "preserveaspectratio":
          mb.preserveAspectRatio((Boolean) MoExp.parse(exp));
          break;
      }
    }
    return mb.build();
  }
}

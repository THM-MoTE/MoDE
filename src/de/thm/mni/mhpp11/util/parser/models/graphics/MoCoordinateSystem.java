package de.thm.mni.mhpp11.util.parser.models.graphics;

import de.thm.mni.mhpp11.util.parser.models.MoExp;
import lombok.Getter;
import lombok.Setter;
import org.jmodelica.modelica.compiler.ComponentModification;
import org.jmodelica.modelica.compiler.Exp;
import org.jmodelica.modelica.compiler.ValueModification;

import java.util.List;

/**
 * Created by hobbypunk on 16.09.16.
 */
@Getter
@Setter
public class MoCoordinateSystem extends MoGraphic {
  
  private List<List<Integer>> extent;
  private Boolean preserveAspectRatio;
  private Double initialScale;
  private List<Integer> grid;
  
  private MoCoordinateSystem(List<List<Integer>> extent, Boolean preserveAspectRatio, Double initialScale, List<Integer> grid) {
    this.extent = extent;
    this.preserveAspectRatio = preserveAspectRatio;
    this.initialScale = initialScale;
    this.grid = grid;
  }
  
  
  public static MoCoordinateSystem parse(org.jmodelica.modelica.compiler.List<ComponentModification> list) {
    List<List<Integer>> extent = null;
    Boolean preserveAspectRatio = null;
    Double initialScale = 0.1;
    List<Integer> grid = null;
    
    for (ComponentModification cm : list) {
      String type = cm.getName().asID().toLowerCase();
      Exp exp = ((ValueModification)cm.getChild(3).getChild(0)).getExp();

      switch (type) {
        case "grid": grid = (List<Integer>) MoExp.parse(exp); break;
        case "extent": extent = (List<List<Integer>>) MoExp.parse(exp); break;
        case "initialscale": initialScale = (Double) MoExp.parse(exp); break;
        case "preserveaspectratio": preserveAspectRatio = (Boolean) MoExp.parse(exp); break;
      }
    }
    return new MoCoordinateSystem(extent, preserveAspectRatio, initialScale, grid);
  }
}

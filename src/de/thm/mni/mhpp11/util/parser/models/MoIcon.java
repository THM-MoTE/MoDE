package de.thm.mni.mhpp11.util.parser.models;

import de.thm.mni.mhpp11.util.parser.models.graphics.MoCoordinateSystem;
import de.thm.mni.mhpp11.util.parser.models.graphics.MoGraphic;
import lombok.Builder;
import lombok.Getter;
import org.jmodelica.modelica.compiler.Argument;
import org.jmodelica.modelica.compiler.ComponentModification;
import org.jmodelica.modelica.compiler.Exp;
import org.jmodelica.modelica.compiler.List;

import java.util.ArrayList;

/**
 * Created by hobbypunk on 16.09.16.
 */
@Getter
public class MoIcon extends MoAnnotation {
  
  private MoCoordinateSystem moCoordinateSystem = new MoCoordinateSystem();
  private java.util.List<MoGraphic> moGraphics = new ArrayList<>();
  
  @Builder
  private MoIcon(MoCoordinateSystem moCoordinateSystem, java.util.List<MoGraphic> moGraphics) {
    if (moCoordinateSystem != null) this.moCoordinateSystem = moCoordinateSystem;
    if (moGraphics != null) this.moGraphics = moGraphics;
  }
  
  public static MoIcon parse(List<Argument> list) {
    MoIconBuilder mb = builder();
    for(Argument a : list) {
      ComponentModification cm = (ComponentModification) a;
      String type = cm.getName().asID().toLowerCase();
      if(type.equals("coordinatesystem")) {
        mb.moCoordinateSystem(MoCoordinateSystem.parse((List<ComponentModification>) cm.getModificationOpt().getChild(0).getChild(0).getChild(0)));
      } else if(type.equals("graphics")) {
        if (cm.getModificationOpt().getNumChild() > 0)
          mb.moGraphics(MoGraphic.parse((Exp) cm.getModificationOpt().getChild(0).getChild(0)));
      }
    }
  
    return mb.build();
  }
}

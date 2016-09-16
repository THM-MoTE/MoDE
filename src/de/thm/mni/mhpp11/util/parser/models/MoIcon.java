package de.thm.mni.mhpp11.util.parser.models;

import de.thm.mni.mhpp11.util.parser.models.graphics.MoCoordinateSystem;
import de.thm.mni.mhpp11.util.parser.models.graphics.MoGraphic;
import lombok.Getter;
import org.jmodelica.modelica.compiler.*;
import org.jmodelica.modelica.compiler.List;

import java.util.*;

/**
 * Created by hobbypunk on 16.09.16.
 */
@Getter
public class MoIcon extends MoAnnotation {
  
  private MoCoordinateSystem moCoordinateSystem;
  private final java.util.List<MoGraphic> moGraphics;
  
  private MoIcon(MoCoordinateSystem moCoordinateSystem, java.util.List<MoGraphic> moGraphics) {
    this.moCoordinateSystem = moCoordinateSystem;
    this.moGraphics = moGraphics;
  }
  
  public static MoIcon parse(List<Argument> list) {
    MoCoordinateSystem mcs = null;
    java.util.List<MoGraphic> l = new ArrayList<>();
    for(Argument a : list) {
      ComponentModification cm = (ComponentModification) a;
      String type = cm.getName().asID().toLowerCase();
      if(type.equals("coordinatesystem")) {
        mcs = MoCoordinateSystem.parse((List<ComponentModification>) cm.getModificationOpt().getChild(0).getChild(0).getChild(0));
      } else if(type.equals("graphics")) {
        l = (java.util.List<MoGraphic>)MoExp.parse((Exp)cm.getModificationOpt().getChild(0).getChild(0));
      }
    }
    
    return new MoIcon(mcs, l);
  }
}

package de.thm.mni.mhpp11.util.parser.models.annotations;

import de.thm.mni.mhpp11.util.parser.OMCompiler;
import de.thm.mni.mhpp11.util.parser.models.graphics.MoCoordinateSystem;
import de.thm.mni.mhpp11.util.parser.models.graphics.MoGraphic;
import lombok.Builder;
import lombok.Getter;
import org.jmodelica.modelica.compiler.Argument;
import org.jmodelica.modelica.compiler.ComponentModification;
import org.jmodelica.modelica.compiler.Exp;
import org.jmodelica.modelica.compiler.List;

import java.util.ArrayList;
import java.util.Arrays;

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
      } else if(type.equals("graphics")) {
        if (cm.getModificationOpt().getNumChild() > 0)
          mb.moGraphics(MoGraphic.parse((Exp) cm.getModificationOpt().getChild(0).getChild(0)));
      }
    }
  
    return mb.build();
  }
  
  public static MoIcon parse(OMCompiler omc, String name) {
    MoIconBuilder mb = builder();
    String s = omc.getIcon(name);
    String[] ss = s.split(",", 9);
    mb.moCoordinateSystem(MoCoordinateSystem.parse(Arrays.copyOfRange(ss, 0, 8)));
    mb.moGraphics(MoGraphic.parse(ss[8].replaceAll("(^\\{)|(\\}$)", "")));
    return null;
  }
}

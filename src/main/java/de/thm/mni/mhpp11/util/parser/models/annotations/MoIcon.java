package de.thm.mni.mhpp11.util.parser.models.annotations;

import de.thm.mni.mhpp11.parser.modelica.AnnotationParser.IconContentContext;
import de.thm.mni.mhpp11.parser.modelica.AnnotationParser.IconContext;
import de.thm.mni.mhpp11.util.parser.OMCompiler;
import de.thm.mni.mhpp11.util.parser.models.graphics.MoCoordinateSystem;
import de.thm.mni.mhpp11.util.parser.models.graphics.MoGraphic;
import lombok.Builder;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by hobbypunk on 16.09.16.
 */
@Getter
public class MoIcon extends MoAnnotation {
  
  private MoCoordinateSystem moCoordinateSystem = new MoCoordinateSystem();
  private List<MoGraphic> moGraphics = new ArrayList<>();
  
  @Builder
  public MoIcon(MoCoordinateSystem moCoordinateSystem, List<MoGraphic> moGraphics) {
    if (moCoordinateSystem != null) this.moCoordinateSystem = moCoordinateSystem;
    if (moGraphics != null) this.moGraphics = moGraphics;
  }
  
  public static MoIcon parse(OMCompiler omc, IconContext icon) {
    MoIconBuilder mb = builder();
    for (IconContentContext icc : icon.iconContent()) {
      if (icc.coordinateSystem() != null) mb.moCoordinateSystem(MoCoordinateSystem.parse(icc.coordinateSystem()));
      if (icc.graphics() != null) mb.moGraphics(MoGraphic.parse(omc, icc.graphics().element()));
    }
    return mb.build();
  }
}

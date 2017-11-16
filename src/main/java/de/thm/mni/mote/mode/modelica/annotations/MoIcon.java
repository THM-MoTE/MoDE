package de.thm.mni.mote.mode.modelica.annotations;

import de.thm.mni.mote.mode.modelica.graphics.MoCoordinateSystem;
import de.thm.mni.mote.mode.modelica.graphics.MoGraphic;
import de.thm.mni.mote.mode.backend.omc.OMCompiler;
import de.thm.mni.mote.mode.parser.modelica.AnnotationParser.IconContentContext;
import de.thm.mni.mote.mode.parser.modelica.AnnotationParser.IconContext;
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
  
  private MoIcon(MoIcon that) {
    this.moCoordinateSystem = that.moCoordinateSystem.copy();
    this.moGraphics.addAll(that.moGraphics); //TODO perhaps cloning of elements
  }
  
  public static MoIcon parse(OMCompiler omc, IconContext icon) {
    MoIconBuilder mb = builder();
    for (IconContentContext icc : icon.iconContent()) {
      if (icc.coordinateSystem() != null) mb.moCoordinateSystem(MoCoordinateSystem.parse(icc.coordinateSystem()));
      if (icc.graphics() != null) mb.moGraphics(MoGraphic.parse(omc, icc.graphics().element()));
    }
    return mb.build();
  }
  
  public MoIcon copy() {
    return new MoIcon(this);
  }
}

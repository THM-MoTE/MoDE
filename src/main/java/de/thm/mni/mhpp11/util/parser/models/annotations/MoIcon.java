package de.thm.mni.mhpp11.util.parser.models.annotations;

import de.thm.mni.mhpp11.parser.ModelicaIconLexer;
import de.thm.mni.mhpp11.parser.ModelicaIconParser;
import de.thm.mni.mhpp11.util.parser.OMCompiler;
import de.thm.mni.mhpp11.util.parser.models.graphics.MoCoordinateSystem;
import de.thm.mni.mhpp11.util.parser.models.graphics.MoGraphic;
import lombok.Builder;
import lombok.Getter;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;

import java.io.ByteArrayInputStream;
import java.io.IOException;
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
  
  public static MoIcon parse(OMCompiler omc, String name) {
    MoIconBuilder mb = builder();
    String s = omc.getIcon(name);
    if (s == null || s.isEmpty() || s.startsWith("annotation")) return null;
    System.out.println(name + ": " + s);
    try {
      ANTLRInputStream is = new ANTLRInputStream(new ByteArrayInputStream(s.getBytes()));
      ModelicaIconParser p = new ModelicaIconParser(new CommonTokenStream(new ModelicaIconLexer(is)));
      ModelicaIconParser.IconContext ic = p.icon();
      mb.moCoordinateSystem(MoCoordinateSystem.parse(ic.coordinateSystem()));
      if (ic.l != null) mb.moGraphics(MoGraphic.parse(ic.l));
    } catch (IOException e) {
      e.printStackTrace();
    }
    
    return null;
  }
}

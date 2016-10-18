package de.thm.mni.mhpp11.util.parser.models.graphics;

import de.thm.mni.mhpp11.util.config.model.Point;
import de.thm.mni.mhpp11.util.parser.models.annotations.MoIcon;
import javafx.scene.paint.Color;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by hobbypunk on 11.10.16.
 */
public class MoDefaults {
  
  private static MoGraphic getMoGraphic() {
    return new MoGraphic(null, null, null);
  }
  
  private static MoFilledShape getMoFilledShape(Color c) {
    return new MoFilledShape(getMoGraphic(), c, Color.TRANSPARENT, MoGraphic.Utilities.LinePattern.SOLID, MoFilledShape.FillPattern.NONE, 2.);
  }
  
  
  public static MoIcon newPackage() {
    MoCoordinateSystem mcs = new MoCoordinateSystem();
    List<MoGraphic> list = new ArrayList<>();
    
    list.add(new MoRectangle(getMoFilledShape(Color.DARKRED), new Point<>(-100., 100.), new Point<>(100., -100.), MoRectangle.BorderPattern.NONE, 0.));
    list.add(new MoText(getMoFilledShape(Color.DARKRED), new Point<>(-100., 100.), new Point<>(100., -100.), "P", 0., "", MoText.TextStyle.BOLD.val, Color.DARKRED, null));
    return new MoIcon(mcs, list);
  }
}
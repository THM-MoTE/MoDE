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
  
  private static MoIcon moPackage = null;
  private static MoIcon moModel = null;
  private static MoIcon moFunction = null;
  
  private static MoGraphic getMoGraphic() {
    return new MoGraphic(null, null, null);
  }
  
  private static MoFilledShape getMoFilledShape(Color c) {
    return new MoFilledShape(getMoGraphic(), c, Color.TRANSPARENT, MoGraphic.Utilities.LinePattern.SOLID, MoFilledShape.FillPattern.NONE, 2.);
  }
  
  private static MoIcon newAnything(Color c, String text) {
    MoCoordinateSystem mcs = new MoCoordinateSystem();
    List<MoGraphic> list = new ArrayList<>();
    
    list.add(new MoRectangle(getMoFilledShape(c), new Point<>(-100., 100.), new Point<>(100., -100.), MoRectangle.BorderPattern.NONE, 0.));
    list.add(new MoText(getMoFilledShape(c), new Point<>(-100., 100.), new Point<>(100., -100.), text, 0., "", MoText.TextStyle.BOLD.val, c, null));
    return new MoIcon(mcs, list);
    
  }
  
  public static MoIcon newPackage() {
    if (moPackage == null) moPackage = newAnything(Color.DARKRED, "P");
    return moPackage;
  }
  
  public static MoIcon newModel() {
    if (moModel == null) moModel = newAnything(Color.BLUE, "M");
    return moModel;
  }
  
  public static MoIcon newFunction() {
    if (moFunction == null) moFunction = newAnything(Color.GREEN, "F");
    return moFunction;
  }
}
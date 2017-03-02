package de.thm.mni.mote.mode.modelica.graphics;

import de.thm.mni.mote.mode.modelica.annotations.MoIcon;
import javafx.geometry.Point2D;
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
  private static MoIcon moEmpty = null;
  
  private static MoGraphic getMoGraphic() {
    return new MoGraphic(null, null, null);
  }
  
  private static MoFilledShape getMoFilledShape(Color fillColor, Color borderColor) {
    return new MoFilledShape(getMoGraphic(), fillColor, borderColor, Utilities.LinePattern.SOLID, Utilities.FillPattern.SOLID, 2.);
  }
  
  private static MoIcon newAnything(Color c, String character) {
    MoCoordinateSystem mcs = new MoCoordinateSystem();
    List<MoGraphic> list = new ArrayList<>();
    
    list.add(new MoEllipse(getMoFilledShape(c, c), new Point2D(-100., 100.), new Point2D(100., -100.)));
    list.add(new MoText(getMoFilledShape(Color.BLACK, Color.BLACK), new Point2D(-100., -80.), new Point2D(100., 100.), character));
    return new MoIcon(mcs, list);
    
  }
  
  public static MoIcon newPackage() {
    if (moPackage == null) {
      moPackage = newAnything(Color.LIGHTGRAY, "P");
    }
    return moPackage;
  }
  
  public static MoIcon newModel() {
    if (moModel == null) {
      moModel = newAnything(Color.LIGHTBLUE, "M");
    }
    return moModel;
  }
  
  public static MoIcon newFunction() {
    if (moFunction == null) moFunction = newAnything(Color.LIGHTGREEN, "F");
    return moFunction;
  }
  
  public static MoIcon newEmpty() {
    if (moEmpty == null) moEmpty = newAnything(Color.LIGHTCORAL, "E");
    return moEmpty;
  }
}
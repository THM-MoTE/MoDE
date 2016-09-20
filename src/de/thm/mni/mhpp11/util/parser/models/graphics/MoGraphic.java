package de.thm.mni.mhpp11.util.parser.models.graphics;

import de.thm.mni.mhpp11.util.config.Settings;
import de.thm.mni.mhpp11.util.config.model.Point;
import de.thm.mni.mhpp11.util.parser.models.MoExp;
import de.thm.mni.mhpp11.util.parser.models.MoFunction;
import javafx.scene.paint.Color;
import javafx.util.Pair;
import lombok.Builder;
import lombok.Getter;
import org.jmodelica.modelica.compiler.Exp;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by hobbypunk on 16.09.16.
 */
@Getter
public class MoGraphic {
  
  Boolean visible = true;
  Point<Double, Double> origin = new Point<>(0.0,0.0); //Ursprung des Elements
  Double rotation = 0.0;
  
  public MoGraphic(MoGraphic mg) {
    this.visible = mg.visible;
    this.origin = mg.origin;
    this.rotation = mg.rotation;
  }
  
  @Builder
  public MoGraphic(Boolean visible, Point<Double, Double> origin, Double rotation) {
    if(visible != null) this.visible = visible;
    if(origin != null) this.origin = origin;
    if(rotation != null) this.rotation = rotation;
  }
  
  public static List<MoGraphic> parse(Exp exp) {
    List<MoGraphic> mgs = new ArrayList<>();
    List<MoFunction> list = (List<MoFunction>)MoExp.parse(exp);
    for(MoFunction mf : list) {
      switch (mf.getName()) {
        case "Polygon" : mgs.add(MoPolygon.parse(mf)); break;
        case "Rectangle" : mgs.add(MoRectangle.parse(mf)); break;
        case "Ellipse" : mgs.add(MoEllipse.parse(mf)); break;
        case "Line" : mgs.add(MoLine.parse(mf)); break;
        case "Text" : mgs.add(MoText.parse(mf)); break;
      }
    }
    return mgs;
  }
  
  public static MoGraphic parse(MoFunction mf) {
    MoGraphicBuilder mb = builder();
    
    for(Object o: mf.getParams()) {
      if(!(o instanceof Pair)) continue;
      Pair<String, Object> p = (Pair<String, Object>) o;
      if(p.getKey().equals("origin")) {
        List<Double> l = (List<Double>)p.getValue();
        mb.origin(new Point<>(l.get(0), l.get(1)));
      } else if(p.getKey().equals("visible")) {
        mb.visible((Boolean) p.getValue());
      } else if(p.getKey().equals("rotation")) {
        mb.rotation((Double) p.getValue());
      }
    }
    
    return mb.build();
  }
  
  public static class Utilities {
    enum LinePattern {
      NONE,
      SOLID,
      DASH,
      DOT,
      DASHDOT,
      DASHDOTDOT
    }
  
    public enum Smooth {
      NONE,
      BEZIER
    }
  
  
    public static Color convertColor(Object val) {
      if (val instanceof String) return Color.valueOf(((String) val).toUpperCase());
      else if (val instanceof List) {
        List<Double> l = (List<Double>) val;
        return Color.rgb(l.get(0).intValue(), l.get(1).intValue(), l.get(2).intValue());
      } else {
        Settings.load().getLogger().debug("MoLine", "color: Not implemented");
      }
      return Color.BLACK;
    }
  }
}

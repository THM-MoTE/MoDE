package de.thm.mni.mhpp11.util.parser.models.graphics;

import de.thm.mni.mhpp11.util.config.model.Point;
import de.thm.mni.mhpp11.util.parser.models.MoExp;
import de.thm.mni.mhpp11.util.parser.models.MoFunction;
import javafx.util.Pair;
import lombok.AllArgsConstructor;
import lombok.Getter;
import org.jmodelica.modelica.compiler.Exp;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by hobbypunk on 16.09.16.
 */
@AllArgsConstructor
@Getter
public class MoGraphic {
  
  Point<Double, Double> origin; //Ursprung des Elements
  
   
  public static List<MoGraphic> parse(Exp exp) {
    List<MoGraphic> mgs = new ArrayList<>();
    List<MoFunction> list = (List<MoFunction>)MoExp.parse(exp);
    for(MoFunction mf : list) {
      switch (mf.getName()) {
        case "Polygon" : mgs.add(MoPolygon.parse(mf)); break;
        case "Ellipse" : mgs.add(MoEllipse.parse(mf)); break;
        case "Line" : mgs.add(MoLine.parse(mf)); break;
        case "Text" : mgs.add(MoText.parse(mf)); break;
      }
    }
    return mgs;
  }
  
  public static MoGraphic parse(MoFunction mf) {
    Point<Double, Double> origin = new Point<>(0.0,0.0);
    
    for(Object o: mf.getParams()) {
      if(!(o instanceof Pair)) continue;
      Pair<String, Object> p = (Pair<String, Object>) o;
      if(p.getKey().equals("origin")) {
        List<Double> l = (List<Double>)p.getValue();
        origin = new Point<>(l.get(0), l.get(1));
      }
    }
    
    return new MoGraphic(origin);
  }
}

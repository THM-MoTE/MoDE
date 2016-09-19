package de.thm.mni.mhpp11.util.parser.models.graphics;

import de.thm.mni.mhpp11.util.config.model.Point;
import de.thm.mni.mhpp11.util.parser.models.MoFunction;
import javafx.util.Pair;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by hobbypunk on 19.09.16.
 */

public class MoLine extends MoGraphic {
  
  enum Smooth {
    None,
    Bezier
  }
  
  protected Smooth smooth = Smooth.None;
  protected Double thickness = 1.0;
  protected List<Point<Double, Double>> points = new ArrayList<>();
  
  MoLine(Point<Double, Double> origin, List<Point<Double, Double>>points, Double thickness, Smooth smooth) {
    super(origin);
    this.points = points;
    this.thickness = thickness;
    this.smooth = smooth;
  }
  
  public static MoLine parse(MoFunction mf) {
    MoGraphic mg = MoGraphic.parse(mf);
    Smooth smooth = Smooth.None;
    Double thickness = 1.0;
    List<Object> list = null;
    List<Point<Double, Double>> points = new ArrayList<>();
    
    for(Object o: mf.getParams()) {
      if(!(o instanceof Pair)) continue;
      Pair<String, Object> p = (Pair<String, Object>) o;
      if(p.getKey().equals("thickness")) thickness = (Double) p.getValue();
      if(p.getKey().equals("points")) list = (List<Object>) p.getValue();
      if(p.getKey().equals("smooth")) {
        List<String> l = (List<String>)p.getValue();
        if(l.get(1).equals("Bezier")) smooth = Smooth.Bezier;
      }
    }
    
    if(list != null ) {
      for(Object o : list) {
        List<Double> p = (List<Double>) o;
        points.add(new Point<>(p.get(0), p.get(1)));
      }
    }
  
    return new MoLine(mg.origin, points, thickness, smooth);
  }
}

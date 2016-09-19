package de.thm.mni.mhpp11.util.parser.models.graphics;

import de.thm.mni.mhpp11.util.config.model.Point;

/**
 * Created by hobbypunk on 19.09.16.
 */
public class MoPolygon extends MoLine {
  public MoPolygon(Point<Double, Double> origin, Smooth smooth) {
    super(origin, null, null, smooth);
  }
}

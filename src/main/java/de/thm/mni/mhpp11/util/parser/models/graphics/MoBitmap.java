package de.thm.mni.mhpp11.util.parser.models.graphics;

import de.thm.mni.mhpp11.parser.ModelicaIconParser;
import de.thm.mni.mhpp11.util.config.model.Point;
import lombok.Builder;
import lombok.Getter;

/**
 * Created by hobbypunk on 29.09.16.
 */
@Getter
public class MoBitmap extends MoGraphic implements MoExtent {
  
  Point<Double, Double>[] extent = (Point<Double, Double>[]) new Point[2];
  String path = "";
  String base64 = "";
  
  @Builder(builderMethodName = "bitmapBuilder")
  public MoBitmap(MoGraphic mg, Point<Double, Double> first, Point<Double, Double> second, String path, String base64) {
    super(mg);
    this.extent[0] = first;
    this.extent[1] = second;
    this.path = path;
    this.base64 = base64;
  }
  
  public static MoBitmap parse(ModelicaIconParser.BitmapContext elem) {
    MoBitmapBuilder mb = bitmapBuilder();
    mb.mg(MoGraphic.parse(elem.graphicItem()));
    
    mb.first(new Point<>(Double.parseDouble(elem.extent().p1.x.getText()), Double.parseDouble(elem.extent().p1.y.getText())));
    mb.second(new Point<>(Double.parseDouble(elem.extent().p2.x.getText()), Double.parseDouble(elem.extent().p2.y.getText())));
    
    if (elem.path != null) mb.path(elem.path.getText());
    if (elem.source != null) mb.base64(elem.source.getText());
    
    return mb.build();
  }
}

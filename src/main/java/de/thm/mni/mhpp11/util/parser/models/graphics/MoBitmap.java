package de.thm.mni.mhpp11.util.parser.models.graphics;

import de.thm.mni.mhpp11.parser.modelica.AnnotationParser.BitmapContext;
import de.thm.mni.mhpp11.parser.modelica.AnnotationParser.BitmapDataContext;
import de.thm.mni.mhpp11.util.config.model.Point;
import de.thm.mni.mhpp11.util.parser.OMCompiler;
import lombok.Builder;
import lombok.Getter;

import java.nio.file.Path;

/**
 * Created by hobbypunk on 29.09.16.
 */
@Getter
public class MoBitmap extends MoGraphic implements MoExtent {
  
  Point<Double, Double>[] extent = (Point<Double, Double>[]) new Point[2];
  Path fileName = null;
  String imageSource = "";
  
  @Builder(builderMethodName = "bitmapBuilder")
  public MoBitmap(MoGraphic mg, Point<Double, Double> first, Point<Double, Double> second, Path fileName, String imageSource) {
    super(mg);
    this.extent[0] = first;
    this.extent[1] = second;
    this.fileName = fileName;
    this.imageSource = imageSource;
  }
  
  public static MoBitmap parse(OMCompiler omc, BitmapContext elem) {
    MoGraphicBuilder mgb = builder();
    MoBitmapBuilder mb = bitmapBuilder();
    
    for (BitmapDataContext data : elem.data) {
      if (data.graphicItem() != null) {
        MoGraphic.parse(mgb, data.graphicItem());
      } else if (data.extent() != null) {
        mb.first(new Point<>(Double.parseDouble(data.extent().p1.x.getText()), Double.parseDouble(data.extent().p1.y.getText())));
        mb.second(new Point<>(Double.parseDouble(data.extent().p2.x.getText()), Double.parseDouble(data.extent().p2.y.getText())));
      } else if (data.fileName() != null) {
        mb.fileName(omc.getPath(data.fileName().getText()));
      } else if (data.imageSource() != null) {
        mb.imageSource(data.imageSource().getText());
      }
    }
    
    return mb.mg(mgb.build()).build();
  }
}

package de.thm.mni.mote.mode.modelica.graphics;

import de.thm.mni.mote.mode.modelica.interfaces.HasExtent;
import de.thm.mni.mote.mode.backend.omc.OMCompiler;
import de.thm.mni.mote.mode.parser.modelica.AnnotationParser.BitmapContext;
import de.thm.mni.mote.mode.parser.modelica.AnnotationParser.BitmapDataContext;
import javafx.geometry.Point2D;
import lombok.Builder;
import lombok.Getter;

import java.nio.file.Path;

/**
 * Created by Marcel Hoppe on 29.09.16.
 */
@Getter
public class MoBitmap extends MoGraphic implements HasExtent {
  
  private final MoExtent extent;
  
  Path fileName = null;
  String imageSource = "";
  
  @Builder(builderMethodName = "bitmapBuilder")
  public MoBitmap(MoGraphic mg, Point2D p1, Point2D p2, Path fileName, String imageSource) {
    super(mg);
    extent = new MoSimpleExtent(p1, p2);
    this.fileName = fileName;
    this.imageSource = imageSource;
  
    initChangeListeners();
  }
  
  public static MoBitmap parse(OMCompiler omc, BitmapContext elem) {
    MoGraphicBuilder mgb = builder();
    MoBitmapBuilder mb = bitmapBuilder();
    
    for (BitmapDataContext data : elem.data) {
      if (data.graphicItem() != null) {
        parse(mgb, data.graphicItem());
      } else if (data.extent() != null) {
        mb.p1(new Point2D(Double.parseDouble(data.extent().p1.x.getText()), Double.parseDouble(data.extent().p1.y.getText())));
        mb.p2(new Point2D(Double.parseDouble(data.extent().p2.x.getText()), Double.parseDouble(data.extent().p2.y.getText())));
      } else if (data.fileName() != null) {
        mb.fileName(omc.getPath(data.fileName().getText()));
      } else if (data.imageSource() != null) {
        mb.imageSource(data.imageSource().getText());
      }
    }
    
    return mb.mg(mgb.build()).build();
  }
}

package de.thm.mni.mote.mode.modelica.graphics;

import de.thm.mni.mote.mode.modelica.interfaces.MoExtent;
import de.thm.mni.mote.mode.omcactor.OMCompiler;
import de.thm.mni.mote.mode.parser.modelica.AnnotationParser.BitmapContext;
import de.thm.mni.mote.mode.parser.modelica.AnnotationParser.BitmapDataContext;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.geometry.Point2D;
import lombok.Builder;
import lombok.Getter;

import java.nio.file.Path;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by hobbypunk on 29.09.16.
 */
@Getter
public class MoBitmap extends MoGraphic implements MoExtent {
  
  private final List<ObjectProperty<Point2D>> extent = Collections.unmodifiableList(Arrays.asList(new SimpleObjectProperty<>(), new SimpleObjectProperty<>()));
  
  Path fileName = null;
  String imageSource = "";
  
  @Builder(builderMethodName = "bitmapBuilder")
  public MoBitmap(MoGraphic mg, Point2D first, Point2D second, Path fileName, String imageSource) {
    super(mg);
    extent.get(0).setValue(first);
    extent.get(1).setValue(second);
    this.fileName = fileName;
    this.imageSource = imageSource;
  }
  
  public static MoBitmap parse(OMCompiler omc, BitmapContext elem) {
    MoGraphicBuilder mgb = builder();
    MoBitmapBuilder mb = bitmapBuilder();
    
    for (BitmapDataContext data : elem.data) {
      if (data.graphicItem() != null) {
        parse(mgb, data.graphicItem());
      } else if (data.extent() != null) {
        mb.first(new Point2D(Double.parseDouble(data.extent().p1.x.getText()), Double.parseDouble(data.extent().p1.y.getText())));
        mb.second(new Point2D(Double.parseDouble(data.extent().p2.x.getText()), Double.parseDouble(data.extent().p2.y.getText())));
      } else if (data.fileName() != null) {
        mb.fileName(omc.getPath(data.fileName().getText()));
      } else if (data.imageSource() != null) {
        mb.imageSource(data.imageSource().getText());
      }
    }
    
    return mb.mg(mgb.build()).build();
  }
}

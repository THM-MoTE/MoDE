package de.thm.mni.mhpp11.util.parser.models.graphics;

import de.thm.mni.mhpp11.parser.modelica.AnnotationParser.TransformationContentContext;
import de.thm.mni.mhpp11.parser.modelica.AnnotationParser.TransformationContext;
import de.thm.mni.mhpp11.util.parser.models.interfaces.Changeable;
import de.thm.mni.mhpp11.util.parser.models.interfaces.MoExtent;
import javafx.beans.property.DoubleProperty;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.geometry.Point2D;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by hobbypunk on 21.10.16.
 */
@Getter
public class MoTransformation implements MoExtent, Changeable {
  
  @Setter private ChangeListener internalChangeListener = null;
  
  private final List<ObjectProperty<Point2D>> extent = Collections.unmodifiableList(Arrays.asList(new SimpleObjectProperty<>(), new SimpleObjectProperty<>()));
  
  ObjectProperty<Point2D> origin = new SimpleObjectProperty<>(new Point2D(0.0, 0.0)); //Ursprung des Elements
  DoubleProperty rotation = new SimpleDoubleProperty(0.0);
  
  @Builder
  public MoTransformation(Point2D first, Point2D second, Point2D origin, Double rotation) {
    extent.get(0).setValue(first);
    extent.get(1).setValue(second);
    if (origin != null) {
      this.origin.setValue(origin);
    }
    if (rotation != null) this.rotation.setValue(rotation);
  
    initListeners();
  }
  
  private void initListeners() {
    origin.addListener((observable, oldValue, newValue) -> changed());
    rotation.addListener((observable, oldValue, newValue) -> changed());
    extent.get(0).addListener((observable, oldValue, newValue) -> changed());
    extent.get(1).addListener((observable, oldValue, newValue) -> changed());
  }
  
  public static MoTransformation parse(TransformationContext val) {
    MoTransformationBuilder mb = builder();
    
    for (TransformationContentContext data : val.transformationContent()) {
      if (data.extent() != null) {
        mb.first(new Point2D(Double.parseDouble(data.extent().p1.x.getText()), Double.parseDouble(data.extent().p1.y.getText())));
        mb.second(new Point2D(Double.parseDouble(data.extent().p2.x.getText()), Double.parseDouble(data.extent().p2.y.getText())));
      } else if (data.origin() != null) {
        mb.origin(new Point2D(Double.parseDouble(data.origin().point().x.getText()), Double.parseDouble(data.origin().point().y.getText())));
      } else if (data.rotation() != null) {
        mb.rotation(Double.parseDouble(data.rotation().val.getText()));
      }
    }
    
    return mb.build();
  }
  
}

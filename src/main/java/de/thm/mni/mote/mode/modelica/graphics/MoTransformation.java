package de.thm.mni.mote.mode.modelica.graphics;

import de.thm.mni.mote.mode.modelica.interfaces.Changeable;
import de.thm.mni.mote.mode.modelica.interfaces.HasExtent;
import de.thm.mni.mote.mode.parser.modelica.AnnotationParser.TransformationContentContext;
import de.thm.mni.mote.mode.parser.modelica.AnnotationParser.TransformationContext;
import javafx.beans.property.DoubleProperty;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.geometry.Point2D;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.text.NumberFormat;
import java.util.Collections;
import java.util.List;

/**
 * Created by hobbypunk on 21.10.16.
 */
@Getter
public class MoTransformation implements HasExtent, Changeable {
  @Setter private Changeable changeParent = null;
  private final ObjectProperty<Change> unsavedChanges = new SimpleObjectProperty<>(Change.NONE);
  
  private final MoTransformationExtent extent;
  
  ObjectProperty<Point2D> origin = new SimpleObjectProperty<>(new Point2D(0.0, 0.0)); //Ursprung des Elements
  DoubleProperty rotation = new SimpleDoubleProperty(0.0);
  
  @Builder
  public MoTransformation(Point2D origin, Point2D p1, Point2D p2, Double rotation) {
    if (origin != null) this.origin.set(origin);
    if (rotation != null) this.rotation.set(rotation);
  
    extent = new MoTransformationExtent(p1, p2);
  
    initListeners();
  }
  
  public MoTransformation(Point2D origin, MoSimpleExtent iconExtent, Double initialScale, Double rotation) {
  
    extent = new MoTransformationExtent(iconExtent.getP1().multiply(initialScale), iconExtent.getP2().multiply(initialScale));
    if (origin != null) this.origin.set(origin);
    if (rotation != null) this.rotation.set(rotation);
  
    initListeners();
  }
  
  @SuppressWarnings("unchecked")
  @Override
  public List<Changeable> getChangeChildren() {
    return Collections.singletonList(extent);
  }
  
  private void initListeners() {
    initChangeListener();
    origin.addListener((observable, oldValue, newValue) -> changed());
    rotation.addListener((observable, oldValue, newValue) -> changed());
    extent.setChangeParent(this);
  }
  
  public static MoTransformation parse(TransformationContext val) {
    MoTransformationBuilder mb = builder();
    
    for (TransformationContentContext data : val.transformationContent()) {
      if (data.extent() != null) {
        mb.p1(new Point2D(Double.parseDouble(data.extent().p1.x.getText()), Double.parseDouble(data.extent().p1.y.getText())));
        mb.p2(new Point2D(Double.parseDouble(data.extent().p2.x.getText()), Double.parseDouble(data.extent().p2.y.getText())));
      } else if (data.origin() != null) {
        mb.origin(new Point2D(Double.parseDouble(data.origin().point().x.getText()), Double.parseDouble(data.origin().point().y.getText())));
      } else if (data.rotation() != null) {
        mb.rotation(Double.parseDouble(data.rotation().val.getText()));
      }
    }
    
    return mb.build();
  }
  
  public String toString(boolean isIcon) {
    NumberFormat fmt = de.thm.mni.mote.mode.util.Utilities.getFormatter();
  
    return ((isIcon) ? "iconT" : "t") +
               String.format("ransformation(origin = %s, extent = {%s}, rotation = %s)",
                   Utilities.toString(origin.get()),
                   extent,
                   fmt.format(rotation.get())
               );
  }
}

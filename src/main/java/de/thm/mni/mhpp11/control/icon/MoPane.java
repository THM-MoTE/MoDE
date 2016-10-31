package de.thm.mni.mhpp11.control.icon;

import de.thm.mni.mhpp11.util.config.model.Point;
import de.thm.mni.mhpp11.util.parser.models.MoClass;
import de.thm.mni.mhpp11.util.parser.models.MoVariable;
import de.thm.mni.mhpp11.util.parser.models.graphics.MoCoordinateSystem;
import de.thm.mni.mhpp11.util.parser.models.graphics.MoTransformation;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.layout.Pane;
import javafx.scene.transform.Scale;
import javafx.scene.transform.Transform;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by hobbypunk on 26.10.16.
 */

@Getter(AccessLevel.PROTECTED)
@Setter(AccessLevel.PROTECTED)
public abstract class MoPane extends Group {
  private final Pane basis = new Pane();
  
  private final MoClass moClass;
  
  private Map<MoVariable, MoIconPane> data = new HashMap<>();
  
  private Double moveX = 100.0;
  private Double moveY = 100.0;
  
  private Double initialScale = 1.0;
  private Boolean preserveAspectRatio = true;
  
  private Scale scale = Transform.scale(1., 1.);
  
  private List<Transform> transformList = new ArrayList<>();
  
  private Boolean flippedX = false; //X axis is flipped
  private Boolean flippedY = false; //Y axis is flipped
  
  MoPane(@NonNull MoClass moClass) {
    this.moClass = moClass;
    basis.getTransforms().add(scale);
    this.getChildren().add(basis);
  }
  
  final void init() {
    if (moClass.getIcon() != null) {
      initCoordinateSystem();
      initImage();
    }
  }
  
  public MoPane scaleTo(Double width, Double height) {
    Point<Double, Double>[] extent = this.getMoClass().getIcon().getMoCoordinateSystem().getExtent();
    Double defaultWidth = Math.max(extent[0].getX(), extent[1].getX()) - Math.min(extent[0].getX(), extent[1].getX());
    Double defaultHeight = Math.max(extent[0].getY(), extent[1].getY()) - Math.min(extent[0].getY(), extent[1].getY());
    
    scale.setX(width / defaultWidth);
    scale.setY(height / defaultHeight);
    return this;
  }
  
  private void initCoordinateSystem() {
    MoCoordinateSystem mcs = this.getMoClass().getIcon().getMoCoordinateSystem();
    
    Point<Double, Double>[] extent = mcs.getExtent();
    Double minX = Math.min(extent[0].getX(), extent[1].getX());
    Double minY = Math.min(extent[0].getY(), extent[1].getY());
    Double width = Math.max(extent[0].getX(), extent[1].getX()) - Math.min(extent[0].getX(), extent[1].getX());
    Double height = Math.max(extent[0].getY(), extent[1].getY()) - Math.min(extent[0].getY(), extent[1].getY());
    
    transformList.add(Transform.translate(0, height));
    transformList.add(Transform.scale(1., -1.));
    
    if (extent[1].getX() < extent[0].getX()) {
      transformList.add(Transform.translate(width, 0));
      transformList.add(Transform.scale(-1., 1.));
      flippedX = true;
    }
    
    if (extent[1].getY() < extent[0].getY()) {
      transformList.add(Transform.translate(0, height));
      transformList.add(Transform.scale(1., -1.));
      flippedY = true;
    }
    transformList.add(Transform.translate(-minX, -minY));
    
    
    if (mcs.getPreserveAspectRatio() != null) this.setPreserveAspectRatio(mcs.getPreserveAspectRatio());
    if (mcs.getInitialScale() != null) this.setInitialScale(mcs.getInitialScale());
  }
  
  void initVariable(MoVariable mv) {
    if (mv.getPlacement() == null) return;
    MoIconPane mip = new MoIconPane(mv.getType(), false);
    
    MoTransformation mt = null;
    if (this instanceof MoIconPane) mt = mv.getPlacement().getIconTransformation();
    if (mt == null) mt = mv.getPlacement().getDiagramTransformation();
    if (mt == null) return;
    
    Point<Double, Double> origin = mt.getOrigin();
    Point<Double, Double>[] extent = mt.getExtent();
    mip.setLayoutX(origin.getX());
    mip.setLayoutY(-origin.getY());
    Double width = Math.max(extent[0].getX(), extent[1].getX()) - Math.min(extent[0].getX(), extent[1].getX());
    Double height = Math.max(extent[0].getY(), extent[1].getY()) - Math.min(extent[0].getY(), extent[1].getY());
    
    mip.scaleTo(width, height);
    
    if (getFlippedX()) {
      mip.getTransforms().add(Transform.translate(width, 0));
      mip.getTransforms().add(Transform.scale(-1, 1));
    }
    
    mip.getTransforms().add(Transform.translate(0, height));
    mip.getTransforms().add(Transform.scale(1, -1));
    
    data.put(mv, mip);
    this.add(mip);
  }
  
  protected abstract void initImage();
  
  public void add(Node node) {
    node.getTransforms().addAll(0, transformList);
    basis.getChildren().add(node);
    
  }
  
  public void setInternalStyle(String style) {
    basis.setStyle(style);
  }
}

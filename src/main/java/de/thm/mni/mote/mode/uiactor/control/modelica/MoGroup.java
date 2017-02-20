package de.thm.mni.mote.mode.uiactor.control.modelica;

import de.thm.mni.mote.mode.modelica.MoClass;
import de.thm.mni.mote.mode.modelica.MoContainer;
import de.thm.mni.mote.mode.modelica.MoVariable;
import de.thm.mni.mote.mode.modelica.graphics.*;
import de.thm.mni.mote.mode.parser.ParserException;
import de.thm.mni.mote.mode.uiactor.elementmanager.elements.ManagedLine;
import de.thm.mni.mote.mode.uiactor.shape.*;
import de.thm.mni.mote.mode.uiactor.shape.interfaces.Element;
import de.thm.mni.mote.mode.uiactor.shape.interfaces.HasStrokeWidth;
import de.thm.mni.mote.mode.uiactor.statemachine.interfaces.Deletable;
import javafx.geometry.Point2D;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.paint.Color;
import javafx.scene.transform.Affine;
import javafx.scene.transform.Scale;
import javafx.scene.transform.Transform;
import javafx.scene.transform.Translate;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by hobbypunk on 26.10.16.
 */

@SuppressWarnings("MismatchedQueryAndUpdateOfCollection")
@Getter(AccessLevel.PROTECTED)
@Setter(AccessLevel.PROTECTED)
public abstract class MoGroup extends Group {
  protected static final double ZOOMFACTOR = 1.2;
  @Getter private final Group basis = new Group();
  javafx.scene.shape.Rectangle coordianteSystem = null; //TODO: add InitialStroke Interface
  @Getter private final MoContainer container;
  
  private Map<MoVariable, MoIconGroup> data = new HashMap<>();
  
  private Double moveX = 100.0;
  private Double moveY = 100.0;
  
  private Double initialScale = 1.0;
  private Boolean preserveAspectRatio = true;
  
  @Getter private Scale scale = new Scale();
  @Getter private Affine flipping = new Affine();
  @Getter private Translate position = new Translate();
  
  @Getter private Boolean flippedX = false; //X axis is flipped
  @Getter private Boolean flippedY = false; //Y axis is flipped
  
  MoGroup(@NonNull MoContainer container) {
    this.container = container;
    this.getChildren().add(basis);
    basis.getTransforms().addAll(scale, flipping, position);
    this.setFocusTraversable(true);
  }
  
  final void init() throws ParserException {
    if (this.container.getElement().getIcon() != null) {
      initCoordinateSystem();
      initImage();
    }
  }
  
  //TODO: prevent scaling of stroke!
  private void preventScaling(Double scaleX, Double scaleY) {
    getBasis().getChildren().forEach(node -> {
      if (node instanceof MoGroup) ((MoGroup) node).preventScaling(scaleX * scale.getX(), scaleY * scale.getY());
      else if (node instanceof HasStrokeWidth) {
        HasStrokeWidth s = (HasStrokeWidth) node;
        Double factor = Math.max(scaleX * scale.getX(), scaleY * scale.getY());
        factor = (factor < 1.) ? 1. : factor; //dirty hack
        s.setOwnStrokeWidth(s.getInitialStrokeWidth() * (1 / factor));
      }
    });
  }
  
  protected Double getScaleFactor(Boolean scaleUp) {
    return (scaleUp) ? ZOOMFACTOR : (1 / ZOOMFACTOR);
  }
  
  protected MoGroup scaleDelta(Boolean scaleUp) throws ParserException {
    return scaleToFactor(scale.getX() * getScaleFactor(scaleUp), scale.getY() * getScaleFactor(scaleUp), false);
  }
  
  
  public MoGroup scaleToSize(Double newWidth, Double newHeight) throws ParserException {
    Point2D extent0 = this.getMoClass().getIcon().getMoCoordinateSystem().getExtent().get(0).getValue();
    Point2D extent1 = this.getMoClass().getIcon().getMoCoordinateSystem().getExtent().get(1).getValue();
  
  
    Double oldWidth = Math.max(extent0.getX(), extent1.getX()) - Math.min(extent0.getX(), extent1.getX());
    Double oldHeight = Math.max(extent0.getY(), extent1.getY()) - Math.min(extent0.getY(), extent1.getY());
  
    return scaleToFactor(scale.getX() * newWidth / oldWidth, scale.getY() * newHeight / oldHeight, true);
  }
  
  private MoGroup scaleToFactor(Double factorX, Double factorY, Boolean force) {
    if (force || factorX > 0.25) {
      scale.setX(factorX);
      scale.setY(factorY);
      preventScaling(1., 1.);
    }
    return this;
  }
  
  
  private void initCoordinateSystem() throws ParserException {
  
    MoCoordinateSystem mcs;
    if (this instanceof MoIconGroup) mcs = this.getMoClass().getIconCoordinateSystem();
    else mcs = this.getMoClass().getDiagramCoordinateSystem();
  
    Point2D extent0 = mcs.getExtent().get(0).getValue();
    Point2D extent1 = mcs.getExtent().get(1).getValue();
  
    Double minX = Math.min(extent0.getX(), extent1.getX());
    Double minY = Math.min(extent0.getY(), extent1.getY());
    Double width = Math.max(extent0.getX(), extent1.getX()) - Math.min(extent0.getX(), extent1.getX());
    Double height = Math.max(extent0.getY(), extent1.getY()) - Math.min(extent0.getY(), extent1.getY());
  
    coordianteSystem = new javafx.scene.shape.Rectangle(minX, minY, width, height);
//    coordianteSystem.setOwnStrokeWidth(1.);
//    coordianteSystem.setStroke(Color.BLACK);
    coordianteSystem.setFill(Color.TRANSPARENT);
//    coordianteSystem.setOpacity(.1);
    basis.getChildren().add(coordianteSystem);
  
  
    flipping.append(Transform.scale(1., -1.));
    flipping.append(Transform.translate(0, -height));
  
    extentChange(extent0, extent1);
  
    position.setX(-minX);
    position.setY(-minY);
  
    if (mcs.getPreserveAspectRatio() != null) this.setPreserveAspectRatio(mcs.getPreserveAspectRatio());
    if (mcs.getInitialScale() != null) this.setInitialScale(mcs.getInitialScale());
  
  }
  
  private void extentChange(Point2D extent0, Point2D extent1) {
    if (!flippedX && extent1.getX() < extent0.getX()) {
      flipping.append(Transform.scale(-1., 1.));
      flipping.append(Transform.translate(coordianteSystem.getWidth(), 0));
      flippedX = true;
    } else if (flippedX && extent0.getX() < extent1.getX()) {
      flipping.append(Transform.scale(-1., 1.));
      flipping.append(Transform.translate(coordianteSystem.getWidth(), 0).createInverse());
      flippedX = false;
    }
    
    if (!flippedY && extent1.getY() < extent0.getY()) {
      flipping.append(Transform.scale(1., -1.));
      flipping.append(Transform.translate(0, -coordianteSystem.getHeight()));
      flippedY = true;
    } else if (flippedY && extent0.getY() < extent1.getY()) {
      flipping.append(Transform.scale(1., -1.));
      flipping.append(Transform.translate(0, -coordianteSystem.getHeight()).createInverse());
      flippedY = false;
    }
  }
  
  protected abstract void initImage() throws ParserException;
  
  public void add(Node node) {
    if (node instanceof ManagedLine || node instanceof Line) basis.getChildren().add(1, node);
    else basis.getChildren().add(node);
  }
  
  public void remove(Node node) {
    basis.getChildren().remove(node);
  }
  
  public void remove(MoGraphic mg) {
    for (int i = 0, size = basis.getChildren().size(); i < size; i++) {
      if (basis.getChildren().get(i) instanceof Element) {
        Element child = (Element) basis.getChildren().get(i);
        if (child.getData().equals(mg) && child instanceof Deletable) {
          basis.getChildren().remove(child);
          return;
        }
      }
    }
  }
  
  public void remove(MoVariable mv) {
    for (int i = 0, size = basis.getChildren().size(); i < size; i++) {
      if (basis.getChildren().get(i) instanceof MoIconGroup) {
        MoIconGroup child = (MoIconGroup) basis.getChildren().get(i);
        if (child.getVariable().equals(mv)) {
          basis.getChildren().remove(i);
          return;
        }
      }
    }
  }
  
  void initImage(MoGraphic mg) {
    if (mg instanceof MoText) this.add(new Text(this, (MoText) mg));
    else if (mg instanceof MoRectangle) {
      this.add(new Rectangle(this, (MoRectangle) mg));
    } else if (mg instanceof MoEllipse) {
      MoEllipse me = (MoEllipse) mg;
      if (me.getEndAngle() + me.getStartAngle() == 360) this.add(new Ellipse(this, me));
      else this.add(new Arc(this, me));
    } else if (mg instanceof MoLine) {
      if (this instanceof MoDiagramGroup) this.add(new ManagedLine(this, (MoLine) mg));
      else this.add(new Line(this, (MoLine) mg));
    } else if (mg instanceof MoPolygon) {
      this.add(new Polygon(this, (MoPolygon) mg));
    }
  
    preventScaling(1., 1.);
  }
  
  public void setInternalStyle(String style) {
    basis.setStyle(style);
  }
  
  public MoClass getMoClass() throws ParserException {
    return this.container.getElement();
  }
}

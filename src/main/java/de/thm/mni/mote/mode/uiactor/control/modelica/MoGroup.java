package de.thm.mni.mote.mode.uiactor.control.modelica;

import de.thm.mni.mote.mode.modelica.MoClass;
import de.thm.mni.mote.mode.modelica.MoContainer;
import de.thm.mni.mote.mode.modelica.MoVariable;
import de.thm.mni.mote.mode.modelica.graphics.*;
import de.thm.mni.mote.mode.parser.ParserException;
import de.thm.mni.mote.mode.uiactor.editor.actionmanager.elements.ModifyableMoClass;
import de.thm.mni.mote.mode.uiactor.editor.elementmanager.elements.ManagedLine;
import de.thm.mni.mote.mode.uiactor.editor.statemachine.interfaces.Deletable;
import de.thm.mni.mote.mode.uiactor.shape.*;
import de.thm.mni.mote.mode.uiactor.shape.interfaces.Element;
import de.thm.mni.mote.mode.uiactor.shape.interfaces.HasStrokeWidth;
import javafx.beans.property.BooleanProperty;
import javafx.beans.property.DoubleProperty;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.collections.ObservableList;
import javafx.geometry.Point2D;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.paint.Color;
import javafx.scene.transform.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;

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
  @Getter private final MoContainer that;
  
  private Double moveX = 100.0;
  private Double moveY = 100.0;
  
  private final DoubleProperty initialScale = new SimpleDoubleProperty(0.1);
  private final BooleanProperty preserveAspectRatio = new SimpleBooleanProperty(true);
  
  @Getter private Scale scale = new Scale();
  @Getter private Affine flipping = new Affine();
  @Getter private Affine position = new Affine();
  
  @Getter private final BooleanProperty flippedXProperty = new SimpleBooleanProperty(false);
  @Getter private final BooleanProperty flippedYProperty = new SimpleBooleanProperty(false);
  
  MoGroup(@NonNull MoContainer that) {
    this.that = that;
    super.getChildren().add(basis);
    basis.getTransforms().addAll(scale, flipping, position);
    this.setFocusTraversable(true);
  }
  
  protected void init() {
    if (this instanceof MoIconGroup || this.that.getElement().getIcon() != null) {
      initCoordinateSystem();
      initImage();
    }
  }
  
  //TODO: prevent scaling of stroke!
  private void preventScaling(Double scaleX, Double scaleY) {
    getChildren().forEach(node -> {
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
  
  
  public MoGroup scaleToSize(Double newWidth, Double newHeight) {
    Point2D extent0;
    Point2D extent1;
    if (this instanceof MoIconGroup) {
      extent0 = ((MoIconGroup) this).getImage().getMoCoordinateSystem().getExtent().getP1();
      extent1 = ((MoIconGroup) this).getImage().getMoCoordinateSystem().getExtent().getP2();
    } else {
      extent0 = this.getMoClass().getIcon().getMoCoordinateSystem().getExtent().getP1();
      extent1 = this.getMoClass().getIcon().getMoCoordinateSystem().getExtent().getP2();
    }
  
  
    Double oldWidth = Math.max(extent0.getX(), extent1.getX()) - Math.min(extent0.getX(), extent1.getX());
    Double oldHeight = Math.max(extent0.getY(), extent1.getY()) - Math.min(extent0.getY(), extent1.getY());
  
    return scaleToFactor(scale.getX() * newWidth / oldWidth, scale.getY() * newHeight / oldHeight, true);
  }
  
  protected MoGroup scaleToFactor(Double factorX, Double factorY, Boolean force) {
    if (force || factorX > 0.25) {
      scale.setX(factorX);
      scale.setY(factorY);
      preventScaling(1., 1.);
    }
    return this;
  }
  
  
  private void initCoordinateSystem() {
    if (this instanceof MoIconGroup) initCoordinateSystem(((MoIconGroup) this).getImage().getMoCoordinateSystem());
    else initCoordinateSystem(this.getMoClass().getDiagramCoordinateSystem());
  }
  
  protected void initCoordinateSystem(MoCoordinateSystem mcs) {
  
    Point2D extent0 = mcs.getExtent().getP1();
    Point2D extent1 = mcs.getExtent().getP2();
  
    coordianteSystem = new javafx.scene.shape.Rectangle(extent0.getX(), extent0.getY(), mcs.getExtent().getWidth(), mcs.getExtent().getHeight());
    coordianteSystem.setFill(Color.TRANSPARENT);
    getChildren().add(coordianteSystem);
  
    //Flips to coordinate system - Modelica is bottom to top!
    flipping.append(Transform.scale(1., -1.));
    flipping.append(Transform.translate(0, -mcs.getExtent().getHeight()));
  
    position.append(new Translate(-extent0.getX(), -extent0.getY()));
  
    this.preserveAspectRatio.bind(mcs.getPreserveAspectRatio());
    this.initialScale.bind(mcs.getInitialScale());
  }
  
  protected abstract void initImage();
  
  @Override
  public ObservableList<Node> getChildren() {
    return this.getBasis().getChildren();
  }
  
  public ObservableList<Node> getOwnChildren() {
    return super.getChildren();
  }
  
  public void add(Node node) {
    if (node instanceof ManagedLine || node instanceof Line) getChildren().add(1, node);
    else getChildren().add(node);
  }
  
  public void remove(Node node) {
    getChildren().remove(node);
  }
  
  public void remove(MoGraphic mg) {
    for (int i = 0, size = getChildren().size(); i < size; i++) {
      if (getChildren().get(i) instanceof Element) {
        Element child = (Element) getChildren().get(i);
        if (child.getData().equals(mg) && child instanceof Deletable) {
          getChildren().remove(child);
          return;
        }
      }
    }
  }
  
  public void remove(MoVariable mv) {
    for (int i = 0, size = getChildren().size(); i < size; i++) {
      if (getChildren().get(i) instanceof MoVariableIconGroup) {
        MoVariableIconGroup child = (MoVariableIconGroup) getChildren().get(i);
        if (child.getVariable().equals(mv)) {
          getChildren().remove(i);
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
  
  public MoClass getMoClass() {
    return this.that.getElement();
  }
  
  public ModifyableMoClass getModifyableMoClass() {
    return new ModifyableMoClass(this.getMoClass());
  }
  
  public Point2D convertTo(Point2D scenePoint) {
    try {
      Point2D p = this.sceneToLocal(scenePoint);
      p = getScale().inverseDeltaTransform(p.getX(), p.getY());
      p = getFlipping().deltaTransform(p);
      
      Double x, y;
      
      x = -getPosition().getTx() + p.getX();
      y = getPosition().getTy() + p.getY();
      
      return new Point2D(x, y);
    } catch (NonInvertibleTransformException e) {
      System.out.println("Should never called...");
    }
    return null;
  }
  
  public Point2D convertFrom(Point2D p) {
    
    try {
      Double x, y;
      x = getPosition().getTx() + p.getX();
      y = -getPosition().getTy() + p.getY();
      
      p = getScale().deltaTransform(new Point2D(x, y));
      p = getFlipping().inverseDeltaTransform(p);
      
      return this.localToScene(p);
      
    } catch (NonInvertibleTransformException e) {
      System.out.println("Should never called...");
    }
    return null;
  }
}

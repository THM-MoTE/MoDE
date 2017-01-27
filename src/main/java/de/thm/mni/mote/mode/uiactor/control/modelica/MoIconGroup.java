package de.thm.mni.mote.mode.uiactor.control.modelica;

import de.thm.mni.mote.mode.modelica.MoConnector;
import de.thm.mni.mote.mode.modelica.MoContainer;
import de.thm.mni.mote.mode.modelica.MoVariable;
import de.thm.mni.mote.mode.modelica.graphics.MoText;
import de.thm.mni.mote.mode.modelica.graphics.MoTransformation;
import de.thm.mni.mote.mode.parser.ParserException;
import de.thm.mni.mote.mode.uiactor.shape.interfaces.Focusable;
import javafx.beans.property.ObjectProperty;
import javafx.geometry.Point2D;
import javafx.scene.paint.Color;
import javafx.scene.transform.Affine;
import javafx.scene.transform.Rotate;
import javafx.scene.transform.Transform;
import javafx.scene.transform.Translate;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.experimental.FieldDefaults;

/**
 * Created by hobbypunk on 19.09.16.
 */
@Getter
@FieldDefaults(makeFinal = true, level = AccessLevel.PRIVATE)
public class MoIconGroup extends MoGroup implements Focusable {
  Translate origin = new Translate();
  Rotate rotation = new Rotate();
  Affine transformation = new Affine();
  
  Boolean iconOnly;
  MoVariable variable;
  
  public MoIconGroup(MoContainer parent) {
    this(parent, null, true);
  }
  
  public MoIconGroup(MoContainer parent, Boolean iconOnly) {
    this(parent, null, iconOnly);
  }
  
  MoIconGroup(MoVariable variable, Boolean iconOnly) throws ParserException {
    this(variable.getType(), variable, iconOnly);
  }
  
  private MoIconGroup(MoContainer parent, MoVariable variable, Boolean iconOnly) {
    super(parent);
    this.variable = variable;
    this.iconOnly = iconOnly;
    try {
      init();
    } catch (ParserException e) {
      e.printStackTrace(); //TODO send msg
    }
  }
  
  protected void initImage() throws ParserException {
    this.getMoClass().getIcon().getMoGraphics().stream().filter(mg -> !iconOnly || (!(mg instanceof MoText))).forEach(this::initImage);
    if (!iconOnly)
      initConnectors();
    if (variable != null) initTransformation();
  }
  
  private void initConnectors() throws ParserException {
    getMoClass().getConnectorVariables().forEach((mv) -> {
      try {
        super.initVariable(mv);
      } catch (ParserException e) {
        e.printStackTrace(); //TODO: send msg
      }
    });
  }
  
  private void initTransformation() throws ParserException {
    MoTransformation mt;
    mt = getVariable().getPlacement().getIconTransformation();
    if (mt == null) mt = getVariable().getPlacement().getDiagramTransformation();
    if (mt == null) return;
  
    //TODO: https://docs.oracle.com/javase/8/javafx/api/javafx/beans/binding/ObjectBinding.html
    ObjectProperty<Point2D> origin = mt.getOrigin();
    origin.addListener((observable, oldValue, newValue) -> {
      if (getOrigin().getX() == newValue.getX()) getOrigin().setX(newValue.getX());
      if (getOrigin().getY() == newValue.getY()) getOrigin().setY(newValue.getY());
    });
  
    getOrigin().xProperty().addListener((observable, oldValue, newValue) -> {
      if (origin.get().getX() != newValue.doubleValue())
        origin.set(new Point2D(newValue.doubleValue(), origin.get().getY()));
    });
  
    getOrigin().yProperty().addListener((observable, oldValue, newValue) -> {
      if (origin.get().getY() != newValue.doubleValue())
        origin.set(new Point2D(origin.get().getX(), newValue.doubleValue()));
    });
  
    getOrigin().setX(origin.get().getX());
    getOrigin().setY(origin.get().getY());
  
    Point2D extent0 = mt.getExtent().get(0).getValue();
    Point2D extent1 = mt.getExtent().get(1).getValue();
  
    Double newVariableWidth = Math.max(extent0.getX(), extent1.getX()) - Math.min(extent0.getX(), extent1.getX());
    Double newVariableHeight = Math.max(extent0.getY(), extent1.getY()) - Math.min(extent0.getY(), extent1.getY());
  
    this.scaleToSize(newVariableWidth, newVariableHeight);
  
    this.getTransforms().addAll(this.origin, this.rotation, this.transformation);
    this.transformation.append(Transform.translate(Math.min(extent0.getX(), extent1.getX()), Math.min(extent0.getY(), extent1.getY())));
    if (getFlippedX()) {
      this.transformation.append(Transform.translate(newVariableWidth, 0));
      this.transformation.append(Transform.scale(-1, 1));
    }
  
    this.transformation.append(Transform.translate(0, newVariableHeight));
    this.transformation.append(Transform.scale(1, -1));
  }
  
  @Override
  public void setFocus() throws ParserException {
    Color color = (getMoClass() instanceof MoConnector) ? Color.RED : Color.CORNFLOWERBLUE;
    //this.setEffect(new DropShadow(5., color));
    this.getCoordianteSystem().setStroke(color);
    this.getCoordianteSystem().setOpacity(1);
  }
  
  @Override
  public void clearFocus() {
    this.setEffect(null);
    this.getCoordianteSystem().setStroke(null);
  }
}

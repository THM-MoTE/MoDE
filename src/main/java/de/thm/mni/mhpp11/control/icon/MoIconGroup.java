package de.thm.mni.mhpp11.control.icon;

import de.thm.mni.mhpp11.shape.interfaces.Focusable;
import de.thm.mni.mhpp11.util.parser.models.MoClass;
import de.thm.mni.mhpp11.util.parser.models.MoConnector;
import de.thm.mni.mhpp11.util.parser.models.MoVariable;
import de.thm.mni.mhpp11.util.parser.models.graphics.MoText;
import de.thm.mni.mhpp11.util.parser.models.graphics.MoTransformation;
import javafx.beans.property.ObjectProperty;
import javafx.geometry.Point2D;
import javafx.scene.effect.DropShadow;
import javafx.scene.paint.Color;
import javafx.scene.transform.Affine;
import javafx.scene.transform.Rotate;
import javafx.scene.transform.Transform;
import javafx.scene.transform.Translate;
import lombok.Getter;

/**
 * Created by hobbypunk on 19.09.16.
 */
@Getter
public class MoIconGroup extends MoGroup implements Focusable {
  private final Translate origin = new Translate();
  private final Rotate rotation = new Rotate();
  private final Affine transformation = new Affine();

  private final Boolean iconOnly;
  private final MoVariable variable;
  
  public MoIconGroup(MoClass parent) {
    this(parent, null, true);
  }
  
  public MoIconGroup(MoClass parent, Boolean iconOnly) {
    this(parent, null, iconOnly);
  }
  
  MoIconGroup(MoVariable variable, Boolean iconOnly) {
    this(variable.getType(), variable, iconOnly);
  }
  
  private MoIconGroup(MoClass parent, MoVariable variable, Boolean iconOnly) {
    super(parent);
    this.variable = variable;
    this.iconOnly = iconOnly;
    init();
  }
  
  protected void initImage() {
    this.getMoClass().getIcon().getMoGraphics().stream().filter(mg -> !iconOnly || (!(mg instanceof MoText))).forEach(this::initImage);
    if (!iconOnly)
      initConnectors();
    if (variable != null) initTransformation();
  }
  
  private void initConnectors() {
    getMoClass().getConnectorVariables().forEach(super::initVariable);
    getBasis().getChildren().stream().filter(node -> node instanceof MoIconGroup).forEach(node -> {
      MoIconGroup mip = (MoIconGroup) node;
      mip.setOnMouseClicked(event -> {
        System.out.println(mip.getMoClass());
        event.consume();
      });
      if (mip.getMoClass() instanceof MoConnector) {
        mip.setOnMouseDragged(event -> {
          System.out.println("detect drag...");
          event.consume();
        });
      }
    });
  }
  
  private void initTransformation() {
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
    
    this.scaleTo(newVariableWidth, newVariableHeight);
  
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
  public void setFocus() {
    this.setEffect(new DropShadow(2., Color.CORNFLOWERBLUE));
  }
  
  @Override
  public void clearFocus() {
    this.setEffect(null);
  }
}

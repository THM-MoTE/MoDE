package de.thm.mni.mhpp11.control.icon;

import de.thm.mni.mhpp11.util.config.model.Point;
import de.thm.mni.mhpp11.util.parser.models.MoClass;
import de.thm.mni.mhpp11.util.parser.models.MoConnector;
import de.thm.mni.mhpp11.util.parser.models.MoVariable;
import de.thm.mni.mhpp11.util.parser.models.graphics.MoText;
import de.thm.mni.mhpp11.util.parser.models.graphics.MoTransformation;
import javafx.beans.property.DoubleProperty;
import javafx.scene.transform.Rotate;
import javafx.scene.transform.Transform;
import javafx.scene.transform.Translate;
import lombok.Getter;

/**
 * Created by hobbypunk on 19.09.16.
 */
@Getter
public class MoIconGroup extends MoGroup {
  private final Translate origin = Transform.translate(0., 0.);
  private final Rotate rotation = Transform.rotate(0., 0., 0.);

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
    
    Point<DoubleProperty, DoubleProperty> origin = mt.getOrigin().get();
    getOrigin().xProperty().bindBidirectional(origin.getX());
    getOrigin().yProperty().bindBidirectional(origin.getY());
    
    Point<Double, Double>[] extent = mt.getExtent();
    
    Double newVariableWidth = Math.max(extent[0].getX(), extent[1].getX()) - Math.min(extent[0].getX(), extent[1].getX());
    Double newVariableHeight = Math.max(extent[0].getY(), extent[1].getY()) - Math.min(extent[0].getY(), extent[1].getY());
    
    this.scaleTo(newVariableWidth, newVariableHeight);
    //TODO remove extra tranforms...
    this.getTransforms().add(getOrigin());
    this.getTransforms().add(Transform.translate(Math.min(extent[0].getX(), extent[1].getX()), Math.min(extent[0].getY(), extent[1].getY())));
    if (getFlippedX()) {
      this.getTransforms().add(Transform.translate(newVariableWidth, 0));
      this.getTransforms().add(Transform.scale(-1, 1));
    }
    
    this.getTransforms().add(Transform.translate(0, newVariableHeight));
    this.getTransforms().add(Transform.scale(1, -1));
  }
}

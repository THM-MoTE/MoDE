package de.thm.mni.mote.mode.uiactor.control.modelica;

import de.thm.mni.mote.mode.modelica.MoContainer;
import de.thm.mni.mote.mode.modelica.MoVariable;
import de.thm.mni.mote.mode.modelica.graphics.MoText;
import de.thm.mni.mote.mode.modelica.graphics.MoTransformation;
import de.thm.mni.mote.mode.parser.ParserException;
import de.thm.mni.mote.mode.uiactor.editor.elementmanager.elements.ManagedMoIconConnectorGroup;
import javafx.beans.binding.DoubleBinding;
import javafx.beans.property.ObjectProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Point2D;
import javafx.scene.Node;
import javafx.scene.transform.Affine;
import javafx.scene.transform.Rotate;
import javafx.scene.transform.Transform;
import javafx.scene.transform.Translate;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.experimental.FieldDefaults;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by hobbypunk on 19.09.16.
 */
@Getter
@FieldDefaults(makeFinal = true, level = AccessLevel.PRIVATE)
public class MoIconGroup extends MoGroup {
  Translate origin = new Translate();
  Rotate rotation = new Rotate();
  Affine transformation = new Affine();
  
  private final MoDiagramGroup moParent;
  Boolean iconOnly;
  MoVariable variable;
  
  public MoIconGroup(MoContainer parent) {
    this(null, parent, null, true);
  }
  
  public MoIconGroup(MoContainer parent, Boolean iconOnly) {
    this(null, parent, null, iconOnly);
  }
  
  protected MoIconGroup(MoDiagramGroup diagramParent, MoVariable variable, Boolean iconOnly) throws ParserException {
    this(diagramParent, variable.getType(), variable, iconOnly);
  }
  
  protected MoIconGroup(MoDiagramGroup diagramParent, MoContainer parent, MoVariable variable, Boolean iconOnly) {
    super(parent);
    this.moParent = diagramParent;
    this.variable = variable;
    this.iconOnly = iconOnly;
    init();
  }
  
  protected List<MoVariable> getVariables() {
    return getVariables(this, new ArrayList<>());
  }
  
  private List<MoVariable> getVariables(Node parent, List<MoVariable> list) {
    if (parent instanceof MoDiagramGroup) return list;
    if (parent instanceof MoIconGroup) {
      list.add(0, ((MoIconGroup) parent).getVariable());
    }
    return getVariables(parent.getParent(), list);
  }
  
  protected void initImage() {
    this.getMoClass().getIcon().getMoGraphics().stream().filter(mg -> !iconOnly || (!(mg instanceof MoText))).forEach(this::initImage);
    if (!iconOnly)
      initConnectors();
    if (variable != null) initTransformation();
  }
  
  private void initConnectors() {
    getMoClass().getConnectorVariables().forEach(this::initConnector);
  }
  
  private void initConnector(MoVariable mv) {
    if (mv.getPlacement() == null || (mv.getPlacement().getIconTransformation() == null && mv.getPlacement().getDiagramTransformation() == null)) return;
    MoIconGroup mip = new ManagedMoIconConnectorGroup(getMoParent(), mv, false);
    getData().put(mv, mip);
    this.add(mip);
  }
  
  private void initTransformation() {
    MoTransformation mt;
    mt = getVariable().getPlacement().getIconTransformation();
    if (mt == null) mt = getVariable().getPlacement().getDiagramTransformation();
    if (mt == null) return;
  
    final ObjectProperty<Point2D> origin = mt.getOrigin();
  
    getOrigin().xProperty().bind(new DoubleBinding() {
      {
        super.bind(origin);
      }
    
      @Override
      protected double computeValue() {
        return origin.get().getX();
      }
    
      @Override
      public ObservableList<?> getDependencies() {
        return FXCollections.singletonObservableList(origin);
      }
    
      @Override
      public void dispose() {
        super.unbind(origin);
      }
    });
    getOrigin().yProperty().bind(new DoubleBinding() {
      {
        super.bind(origin);
      }
    
      @Override
      protected double computeValue() {
        return origin.get().getY();
      }
    
      @Override
      public ObservableList<?> getDependencies() {
        return FXCollections.singletonObservableList(origin);
      }
    
      @Override
      public void dispose() {
        super.unbind(origin);
      }
    });
    
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
}

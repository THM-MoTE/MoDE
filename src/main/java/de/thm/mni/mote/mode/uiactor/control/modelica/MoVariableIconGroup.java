package de.thm.mni.mote.mode.uiactor.control.modelica;

import de.thm.mni.mote.mode.modelica.MoContainer;
import de.thm.mni.mote.mode.modelica.MoVariable;
import de.thm.mni.mote.mode.modelica.graphics.MoSimpleExtent;
import de.thm.mni.mote.mode.modelica.graphics.MoTransformation;
import de.thm.mni.mote.mode.uiactor.editor.elementmanager.elements.ManagedMoIconConnectorGroup;
import de.thm.mni.mote.mode.uiactor.editor.statemachine.elements.ModifyableMoIconConnectorGroup;
import javafx.beans.binding.DoubleBinding;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Point2D;
import javafx.scene.transform.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NonNull;
import lombok.experimental.FieldDefaults;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by hobbypunk on 19.09.16.
 */
@Getter
@FieldDefaults(makeFinal = true, level = AccessLevel.PRIVATE)
public class MoVariableIconGroup extends MoGroup {
  private Map<MoVariable, ModifyableMoIconConnectorGroup> data = new HashMap<>();
  
  Translate origin = new Translate();
  Rotate rotation = new Rotate();
  Affine transformation = new Affine();
  
  private final MoDiagramGroup moDiagram;
  @NonNull MoVariable variable;
  
  protected MoVariableIconGroup(MoDiagramGroup moDiagram, MoContainer parent, MoVariable variable) {
    super(parent);
    this.moDiagram = moDiagram;
    this.variable = variable;
    init();
  }
  
  protected void initImage() {
    this.getMoClass().getIcon().getMoGraphics().forEach(this::initImage);
    initConnectors();
    initTransformation();
  }
  
  private void initConnectors() {
    getMoClass().getConnectorVariables().forEach(this::initConnector);
  }
  
  private void initConnector(MoVariable mv) {
    if (mv.getPlacement() == null || (mv.getPlacement().getIconTransformation() == null && mv.getPlacement().getDiagramTransformation() == null)) return;
    ModifyableMoIconConnectorGroup mip = new ManagedMoIconConnectorGroup(this, mv);
    getData().put(mv, mip);
    this.add(mip);
  }
  
  private void initTransformation() {
    MoTransformation mt = getVariable().getPlacement().getIconTransformation();
    if (mt == null) mt = getVariable().getPlacement().getDiagramTransformation();
    if (mt == null) return;
    initTransformation(mt);
  }
  
  private void initTransformation(final MoTransformation mt) {
    mt.getExtent().setIconExtent((MoSimpleExtent) this.getMoClass().getIconCoordinateSystem().getExtent());
  
    this.getFlippedXProperty().bind(mt.getExtent().getFlippedXProperty());
    this.getFlippedYProperty().bind(mt.getExtent().getFlippedYProperty());
  
    this.origin.xProperty().bind(new DoubleBinding() {
      {
        super.bind(mt.getOrigin());
      }
      
      @Override
      protected double computeValue() {
        return mt.getOrigin().get().getX();
      }
      
      @Override
      public ObservableList<?> getDependencies() {
        return FXCollections.singletonObservableList(mt.getOrigin());
      }
      
      @Override
      public void dispose() {
        super.unbind(mt.getOrigin());
      }
    });
    this.origin.yProperty().bind(new DoubleBinding() {
      {
        super.bind(mt.getOrigin());
      }
      
      @Override
      protected double computeValue() {
        return mt.getOrigin().get().getY();
      }
      
      @Override
      public ObservableList<?> getDependencies() {
        return FXCollections.singletonObservableList(mt.getOrigin());
      }
      
      @Override
      public void dispose() {
        super.unbind(mt.getOrigin());
      }
    });
    
    this.transformation.append(Transform.scale(1, -1));
  
    Translate offset = new Translate(0, 0);
  
    offset.xProperty().bind(new DoubleBinding() {
      {
        super.bind(mt.getExtent().getOffsetProperty());
      }
    
      @Override
      protected double computeValue() {
        return mt.getExtent().getOffsetProperty().get().getX();
      }
    
      @Override
      public ObservableList<?> getDependencies() {
        return FXCollections.singletonObservableList(mt.getExtent().getOffsetProperty());
      }
    
      @Override
      public void dispose() {
        super.unbind(mt.getExtent().getOffsetProperty());
      }
    });
    offset.yProperty().bind(new DoubleBinding() {
      {
        super.bind(mt.getExtent().getOffsetProperty());
      }
    
      @Override
      protected double computeValue() {
        return mt.getExtent().getOffsetProperty().get().getY();
      }
    
      @Override
      public ObservableList<?> getDependencies() {
        return FXCollections.singletonObservableList(mt.getExtent().getOffsetProperty());
      }
    
      @Override
      public void dispose() {
        super.unbind(mt.getExtent().getOffsetProperty());
      }
    });
  
    this.transformation.append(offset);
    
    this.getScale().xProperty().bind(mt.getExtent().getScaleXProperty());
    this.getScale().yProperty().bind(mt.getExtent().getScaleYProperty());
    
    this.rotation.angleProperty().bind(mt.getRotation());
  
    this.getTransforms().addAll(this.origin, this.rotation, this.transformation);
  }
  
  
  public Point2D convertVariablePointToDiagramPoint(Point2D p) {
    p = this.rotation.inverseDeltaTransform(p.getX(), p.getY());
    try {
      p = this.transformation.inverseDeltaTransform(p.getX(), p.getY());
    } catch (NonInvertibleTransformException e) {
      System.err.println("should never call");
    }
    return p;
  }
  
  public Point2D convertDiagramPointToVariablePoint(Point2D p) {
    p = this.rotation.deltaTransform(p.getX(), p.getY());
    p = this.transformation.deltaTransform(p.getX(), p.getY());
    return p;
  }
}

package de.thm.mni.mote.mode.uiactor.control.modelica;

import de.thm.mni.mote.mode.modelica.MoConnection;
import de.thm.mni.mote.mode.modelica.MoContainer;
import de.thm.mni.mote.mode.modelica.MoVariable;
import de.thm.mni.mote.mode.modelica.graphics.MoSimpleExtent;
import de.thm.mni.mote.mode.modelica.graphics.MoTransformation;
import de.thm.mni.mote.mode.uiactor.editor.elementmanager.elements.ManagedFXMoConnectorIconMoGroup;
import de.thm.mni.mote.mode.uiactor.editor.statemachine.elements.ModifyableFXMoConnectorIconMoGroup;
import javafx.beans.binding.DoubleBinding;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Point2D;
import javafx.scene.transform.Affine;
import javafx.scene.transform.Rotate;
import javafx.scene.transform.Transform;
import javafx.scene.transform.Translate;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NonNull;
import lombok.experimental.FieldDefaults;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by hobbypunk on 19.09.16.
 */
@Getter
@FieldDefaults(makeFinal = true, level = AccessLevel.PRIVATE)
public class FXMoVariableIconMoGroup extends FXMoGroup implements CalculateLocalCenterOnDiagram {
  private Map<MoVariable, ModifyableFXMoConnectorIconMoGroup> data = new HashMap<>();
  
  Translate offset = new Translate();
  Translate origin = new Translate();
  Rotate rotation = new Rotate();
  Affine transformation = new Affine();
  
  private final FXMoDiagramMoGroup moDiagram;
  @NonNull MoVariable variable;
  
  ObjectProperty<Point2D> centerOnDiagramProperty = new SimpleObjectProperty<>();
  
  protected FXMoVariableIconMoGroup(FXMoDiagramMoGroup moDiagram, MoContainer parent, MoVariable variable) {
    super(parent);
    this.moDiagram = moDiagram;
    this.variable = variable;
    init();
  }
  
  @Override
  public void init() {
    super.init();
    CalculateLocalCenterOnDiagram.super.init();
  }
  
  protected void initImage() {
    this.getMoClass().getIcon().getMoGraphics().forEach(this::initImage);
    initTransformation();
    initConnectors();
  }
  
  private void initConnectors() {
    List<MoConnection> to = this.getVariable().getToConnections();
    List<MoConnection> from = this.getVariable().getFromConnections();
    
    getMoClass().getConnectorVariables().forEach(moVariable -> this.initConnector(moVariable, to, from));
  }
  
  private void initConnector(MoVariable mv, List<MoConnection> to, List<MoConnection> from) {
    if (mv.getPlacement() == null || (mv.getPlacement().getIconTransformation() == null && mv.getPlacement().getDiagramTransformation() == null)) return;
    ModifyableFXMoConnectorIconMoGroup mip = new ManagedFXMoConnectorIconMoGroup(this, mv, to, from);
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
  
    this.offset.xProperty().bind(new DoubleBinding() {
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
    this.offset.yProperty().bind(new DoubleBinding() {
      {
        super.bind(mt.getExtent().getOffsetProperty());
      }
    
      @Override
      protected double computeValue() {
        return -mt.getExtent().getOffsetProperty().get().getY();
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
    
    this.getScale().xProperty().bind(mt.getExtent().getScaleXProperty());
    this.getScale().yProperty().bind(mt.getExtent().getScaleYProperty());
    
    this.rotation.angleProperty().bind(mt.getRotation());
  
    this.getTransforms().addAll(this.origin, this.rotation, this.offset, this.transformation);
  }
  
  
  @Override
  public Point2D convertTo(Point2D scenePoint) {
    Point2D point = super.convertTo(scenePoint);
    point = this.origin.inverseTransform(point.getX(), point.getY());
    point = this.rotation.inverseTransform(point.getX(), point.getY());
    point = this.offset.inverseTransform(point.getX(), point.getY());
    return point;
  }
  
  @Override
  public String toString() {
    return getVariable().getName();
  }
}

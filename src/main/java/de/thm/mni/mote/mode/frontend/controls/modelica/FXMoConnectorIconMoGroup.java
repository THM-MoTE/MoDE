package de.thm.mni.mote.mode.frontend.controls.modelica;

import de.thm.mni.mote.mode.modelica.MoConnection;
import de.thm.mni.mote.mode.modelica.MoVariable;
import de.thm.mni.mote.mode.modelica.graphics.MoSimpleExtent;
import de.thm.mni.mote.mode.modelica.graphics.MoText;
import de.thm.mni.mote.mode.modelica.graphics.MoTransformation;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.collections.ListChangeListener;
import javafx.collections.transformation.FilteredList;
import javafx.geometry.Point2D;
import javafx.scene.Node;
import javafx.scene.transform.Affine;
import javafx.scene.transform.Rotate;
import javafx.scene.transform.Transform;
import javafx.scene.transform.Translate;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NonNull;
import lombok.experimental.FieldDefaults;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Marcel Hoppe on 19.09.16.
 */
@Getter
@FieldDefaults(makeFinal = true, level = AccessLevel.PRIVATE)
public class FXMoConnectorIconMoGroup extends FXMoGroup implements CalculateLocalCenterOnDiagram {
  
  Translate origin = new Translate();
  Rotate rotation = new Rotate();
  Affine transformation = new Affine();
  
  @NonNull FXMoVariableIconMoGroup moParent;
  @NonNull MoVariable variable;
  
  ObjectProperty<Point2D> centerOnDiagramProperty = new SimpleObjectProperty<>();
  FilteredList<MoConnection> from;
  FilteredList<MoConnection> to;
  
  protected FXMoConnectorIconMoGroup(FXMoVariableIconMoGroup moParent, MoVariable variable, FilteredList<MoConnection> to, FilteredList<MoConnection> from) {
    super(variable.getType());
    this.moParent = moParent;
    this.variable = variable;
    init();
    this.from = from.filtered(conn -> conn.fromContains(this.variable));
    this.to = to.filtered(conn -> conn.toContains(this.variable));
  
    this.from.forEach(this::addFromBinding);
    this.to.forEach(this::addToBinding);
    
    this.from.addListener((ListChangeListener<MoConnection>) c -> {
      while(c.next()) {
        c.getAddedSubList().forEach(this::addFromBinding);
        c.getRemoved().forEach(this::removeFromBinding);
      }
    });
  
    this.to.addListener((ListChangeListener<MoConnection>) c -> {
      while(c.next()) {
        c.getAddedSubList().forEach(this::addToBinding);
        c.getRemoved().forEach(this::removeToBinding);
      }
    });
  }
  
  private void addFromBinding(MoConnection conn) {
    conn.getStartPointProperty().bind(centerOnDiagramProperty);
  }
  
  private void addToBinding(MoConnection conn) {
    conn.getEndPointProperty().bind(centerOnDiagramProperty);
  }
  
  private void removeFromBinding(MoConnection conn) {
    conn.getStartPointProperty().bind(centerOnDiagramProperty);
  }
  
  private void removeToBinding(MoConnection conn) {
    conn.getEndPointProperty().bind(centerOnDiagramProperty);
  }
  
  @Override
  public void init() {
    super.init();
    CalculateLocalCenterOnDiagram.super.init();
  }
  
  protected void initImage() {
    this.getMoClass().getIcon().getMoGraphics().stream().filter(mg -> !(mg instanceof MoText)).forEach(this::initImage);
    initTransformation();
  }
  
  private void initTransformation() {
    MoTransformation mt;
    if(getVariable().getPlacement() == null) return;
    
    mt = this.variable.getPlacement().getIconTransformation();
    if (mt == null) mt = this.variable.getPlacement().getDiagramTransformation();
    if (mt == null) return;
    
    mt.getExtent().setIconExtent((MoSimpleExtent) this.getMoClass().getIconCoordinateSystem().getExtent());
    
    final ObjectProperty<Point2D> origin = mt.getOrigin();
    
    this.origin.setX(origin.get().getX());
    this.origin.setY(origin.get().getY());
    
    this.scaleToFactor(mt.getExtent().getScaleX(), mt.getExtent().getScaleY(), true);
    
    this.getTransforms().addAll(this.origin, this.rotation, this.transformation);
    
    this.transformation.append(Transform.translate(Math.min(mt.getExtent().getP1().getX(), mt.getExtent().getP2().getX()), Math.min(mt.getExtent().getP1().getY(), mt.getExtent().getP2().getY())));
    
    if (mt.getExtent().isFlipX()) {
      this.transformation.append(Transform.translate(mt.getExtent().getWidth(), 0));
      this.transformation.append(Transform.scale(-1, 1));
    }
    
    this.transformation.append(Transform.translate(0, mt.getExtent().getHeight()));
    this.transformation.append(Transform.scale(1, -1));
    
    this.rotation.setAngle(mt.getRotation().get());
  }
  
  public List<MoVariable> getVariables() {
    List<MoVariable> list = new ArrayList<>();
    list.add(this.variable);
    return getVariables(this.moParent, list);
  }
  
  private List<MoVariable> getVariables(Node that, List<MoVariable> list) {
    if (that instanceof FXMoDiagramMoGroup) return list;
    if (that instanceof FXMoVariableIconMoGroup) list.add(0, ((FXMoVariableIconMoGroup) that).getVariable());
    return getVariables(that.getParent(), list);
  }
  
  @Override
  public FXMoDiagramMoGroup getMoDiagram() {
    return this.moParent.getMoDiagram();
  }
  
  @Override
  public String toString() {
    return getVariable().getName();
  }
}

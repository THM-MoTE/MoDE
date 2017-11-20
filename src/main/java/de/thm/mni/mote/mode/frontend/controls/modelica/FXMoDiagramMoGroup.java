package de.thm.mni.mote.mode.frontend.controls.modelica;

import de.thm.mni.mote.mode.frontend.editor.elementmanager.elements.ManagedFXMoVariableIconMoGroup;
import de.thm.mni.mote.mode.modelica.MoConnection;
import de.thm.mni.mote.mode.modelica.MoContainer;
import de.thm.mni.mote.mode.modelica.MoVariable;
import de.thm.mni.mote.mode.modelica.graphics.MoGraphic;
import javafx.collections.ListChangeListener;
import javafx.event.EventHandler;
import javafx.scene.Node;
import javafx.scene.input.InputEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Marcel Hoppe on 19.09.16.
 */
public class FXMoDiagramMoGroup extends FXMoGroup {
  
  @SuppressWarnings("MismatchedQueryAndUpdateOfCollection")
  private final Map<MoVariable, FXMoVariableIconMoGroup> variables = new HashMap<>();
  @SuppressWarnings("MismatchedQueryAndUpdateOfCollection")
  private final Map<MoConnection, FXMoConnectionGroup> connections = new HashMap<>();
  
  protected FXMoDiagramMoGroup(MoContainer container) {
    super(container);
    init();
    this.setId(container.getName().replaceAll("\\.", "_"));
  }
  
  @Override
  protected void initImage() {
    initVariables();
    initConnections();
    if (this.getMoClass().getDiagram() != null) this.getMoClass().getDiagram().getMoGraphics().forEach(this::initImage);
    coordinateSystem.setFill(Color.WHITE);
  }
  
  public void setImageAsBackground() {
    if(this.getMoClass().hasIcon()) {
      List<MoGraphic> list = this.getMoClass().getIcon().getMoGraphics();
      Collections.reverse(list);
      list.forEach(node -> this.initImage(node, true));
    }
  }
  
  public void removeImageAsBackground() {
    this.getMoClass().getIcon().getMoGraphics().forEach(node -> this.remove(node, true));
  }
  
  private void addListener(FXMoGroup group, EventHandler<InputEvent> eventHandler) {
    if (group.equals(this)) {
      group.addEventHandler(MouseEvent.ANY, eventHandler);
      group.getBasis().getChildren().forEach(node -> this.addGroupListener(node, eventHandler));
  
    } else if (group instanceof FXMoVariableIconMoGroup) group.getBasis().getChildren().forEach(node -> this.addIconListener(node, eventHandler));
  
    group.getBasis().getChildren().addListener((ListChangeListener<Node>) c -> {
      while (c.next()) {
        c.getAddedSubList().forEach(n -> {
          if (group.equals(FXMoDiagramMoGroup.this)) addGroupListener(n, eventHandler);
          else if (group instanceof FXMoVariableIconMoGroup) addIconListener(n, eventHandler);
        });
        c.getRemoved().forEach(n -> this.removeListeners(n, eventHandler));
      }
    });
  }
  
  private void addIconListener(Node node, EventHandler<InputEvent> eventHandler) {
    if (node instanceof FXMoConnectorIconMoGroup) {
      node.addEventHandler(MouseEvent.ANY, eventHandler);
    }
  }
  
  private void addGroupListener(Node node, EventHandler<InputEvent> eventHandler) {
    if ((node instanceof FXMoVariableIconMoGroup) && ((FXMoVariableIconMoGroup) node).getVariable() == null) return;
    
    node.addEventHandler(MouseEvent.ANY, eventHandler);
  
    if ((node instanceof FXMoVariableIconMoGroup)) {
      addListener((FXMoVariableIconMoGroup) node, eventHandler);
    }
  }
  
  private void removeListeners(Node node, EventHandler<InputEvent> eventHandler) {
    node.removeEventHandler(InputEvent.ANY, eventHandler);
    
    if (node instanceof FXMoGroup) ((FXMoGroup) node).getBasis().getChildren().forEach(n -> this.removeListeners(n, eventHandler));
  }
  
  public void addHandler(final EventHandler<InputEvent> eventHandler) {
    addListener(this, eventHandler);
  }
  
  public void removeHandler(final EventHandler<InputEvent> eventHandler) {
    this.removeListeners(this, eventHandler);
  }
  
  private void initVariables() {
    this.getMoClass().getVariables().forEach(this::initVariable);
  
    this.getMoClass().getVariables().addListener((ListChangeListener<MoVariable>) c -> {
      while (c.next()) {
        c.getAddedSubList().forEach(this::initVariable);
        c.getRemoved().forEach(FXMoDiagramMoGroup.this::remove);
      }
    });
  }
  
  private void initVariable(MoVariable mv) {
    if (mv.getPlacement() == null || (mv.getPlacement().getIconTransformation() == null && mv.getPlacement().getDiagramTransformation() == null)) return;
    mv.initReplaceText();
    FXMoVariableIconMoGroup mip = new ManagedFXMoVariableIconMoGroup(this, mv);
    variables.put(mv, mip);
    this.add(mip);
    mip.calculateLocalCenterOnDiagram();
  }
  
  private void initConnections() {
    this.getMoClass().getConnections().forEach(this::initConnection);
    this.getMoClass().getConnections().addListener((ListChangeListener<MoConnection>) c -> {
      while (c.next()) {
        c.getAddedSubList().forEach(FXMoDiagramMoGroup.this::initConnection);
        c.getRemoved().forEach(FXMoDiagramMoGroup.this::remove);
      }
    });
  }
  
  private void initConnection(MoConnection mc) {
  //  mc.getMoGraphics().forEach(super::initImage);
    FXMoConnectionGroup mcg = new FXMoConnectionGroup(this, mc);
    connections.put(mc, mcg);
    this.add(1, mcg);
    mcg.preventScaling(getScale().getX(), getScale().getY());
  }
  
  private void remove(MoConnection mc) {
    for (int i = 0, size = getChildren().size(); i < size; i++) {
      if (getChildren().get(i) instanceof FXMoConnectionGroup) {
        FXMoConnectionGroup child = (FXMoConnectionGroup) getChildren().get(i);
        if (child.getConnection().equals(mc)) {
          getChildren().remove(i);
          return;
        }
      }
    }
  }
}

package de.thm.mni.mote.mode.uiactor.control.modelica;

import de.thm.mni.mote.mode.modelica.MoConnection;
import de.thm.mni.mote.mode.modelica.MoConnector;
import de.thm.mni.mote.mode.modelica.MoContainer;
import de.thm.mni.mote.mode.modelica.MoVariable;
import de.thm.mni.mote.mode.parser.ParserException;
import de.thm.mni.mote.mode.uiactor.editor.elementmanager.elements.ManagedMoVariableIconGroup;
import javafx.collections.ListChangeListener;
import javafx.event.EventHandler;
import javafx.scene.Node;
import javafx.scene.input.InputEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;

/**
 * Created by hobbypunk on 19.09.16.
 */
public class MoDiagramGroup extends MoGroup {
  
  private Map<MoVariable, MoVariableIconGroup> data = new HashMap<>();
  
  public MoDiagramGroup(MoContainer container) throws ParserException {
    super(container);
    init();
  }
  
  @Override
  protected void initImage() {
    initVariables();
    initConnections();
    if (this.getMoClass().getDiagram() != null) this.getMoClass().getDiagram().getMoGraphics().forEach(this::initImage);
    coordianteSystem.setFill(Color.WHITE);
  }
  
  private void addListener(MoGroup group, EventHandler<InputEvent> eventHandler) {
    if (group.equals(this)) {
      group.addEventHandler(MouseEvent.ANY, eventHandler);
      group.getBasis().getChildren().forEach(node -> this.addGroupListener(node, eventHandler));
  
    } else if (group instanceof MoVariableIconGroup) group.getBasis().getChildren().forEach(node -> this.addIconListener(node, eventHandler));
  
    group.getBasis().getChildren().addListener((ListChangeListener<Node>) c -> {
      while (c.next()) {
        c.getAddedSubList().forEach(n -> {
          if (group.equals(MoDiagramGroup.this)) addGroupListener(n, eventHandler);
          else if (group instanceof MoVariableIconGroup) addIconListener(n, eventHandler);
        });
        c.getRemoved().forEach(n -> this.removeListeners(n, eventHandler));
      }
    });
  }
  
  private void addIconListener(Node node, EventHandler<InputEvent> eventHandler) {
    if (node instanceof MoVariableIconGroup && ((MoVariableIconGroup) node).getMoClass() instanceof MoConnector) {
      node.addEventHandler(MouseEvent.ANY, eventHandler);
    }
  }
  
  private void addGroupListener(Node node, EventHandler<InputEvent> eventHandler) {
    if ((node instanceof MoVariableIconGroup) && ((MoVariableIconGroup) node).getVariable() == null) return;
    
    node.addEventHandler(MouseEvent.ANY, eventHandler);
  
    if ((node instanceof MoVariableIconGroup)) {
      addListener((MoVariableIconGroup) node, eventHandler);
    }
  }
  
  private void removeListeners(Node node, EventHandler<InputEvent> eventHandler) {
    node.removeEventHandler(InputEvent.ANY, eventHandler);
    
    if (node instanceof MoGroup) ((MoGroup) node).getBasis().getChildren().forEach(n -> this.removeListeners(n, eventHandler));
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
        c.getRemoved().forEach(MoDiagramGroup.this::remove);
      }
    });
  }
  
  private void initVariable(MoVariable mv) {
    if (mv.getPlacement() == null || (mv.getPlacement().getIconTransformation() == null && mv.getPlacement().getDiagramTransformation() == null)) return;
    MoVariableIconGroup mip = new ManagedMoVariableIconGroup(this, mv);
    data.put(mv, mip);
    this.add(mip);
  }
  
  private void initConnections() {
    this.getMoClass().getConnections().forEach(this::initConnection);
    this.getMoClass().getConnections().addListener((ListChangeListener<MoConnection>) c -> {
      while (c.next()) {
        c.getAddedSubList().forEach(MoDiagramGroup.this::initConnection);
        c.getRemoved().forEach((Consumer<MoConnection>) connection -> connection.getMoGraphics().forEach(MoDiagramGroup.this::remove));
      }
    });
  }
  
  private void initConnection(MoConnection connection) {
    connection.getMoGraphics().forEach(super::initImage);
  }
}

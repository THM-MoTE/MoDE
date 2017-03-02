package de.thm.mni.mote.mode.uiactor.editor.elementmanager.elements;

import de.thm.mni.mote.mode.modelica.MoClass;
import de.thm.mni.mote.mode.modelica.MoConnector;
import de.thm.mni.mote.mode.modelica.MoContainer;
import de.thm.mni.mote.mode.modelica.MoVariable;
import de.thm.mni.mote.mode.parser.ParserException;
import de.thm.mni.mote.mode.uiactor.editor.elementmanager.ElementManager;
import de.thm.mni.mote.mode.uiactor.editor.elementmanager.interfaces.Highlightable;
import de.thm.mni.mote.mode.uiactor.editor.statemachine.elements.ModifyableMoConnectorIconGroup;
import de.thm.mni.mote.mode.uiactor.editor.statemachine.elements.ModifyableMoDiagramGroup;
import javafx.scene.Node;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by hobbypunk on 02.03.17.
 */
public class ManagedMoDiagramGroup extends ModifyableMoDiagramGroup {
  
  public ManagedMoDiagramGroup(MoContainer container) throws ParserException {
    super(container);
  }
  
  public void highlightConnectors(ModifyableMoConnectorIconGroup connector) {
    List<ManagedMoConnectorIconGroup> connectors = collectConnectors();
    connectors.remove(connector);
    ElementManager.getInstance(this.getThat()).setHighlightedElements(connectors.stream().filter(c -> isConnectableTo(connector.getVariables(), c.getVariables())).collect(Collectors.toList()).toArray(new Highlightable[]{}));
  }
  
  private List<ManagedMoConnectorIconGroup> collectConnectors() {
    List<ManagedMoConnectorIconGroup> connectors = new ArrayList<>();
    for (Node child : getChildren()) {
      if (child instanceof ManagedMoVariableIconGroup)
        connectors.addAll(((ManagedMoVariableIconGroup) child).collectConnectors());
    }
    return connectors;
  }
  
  public void clearHighlight() {
    ElementManager.getInstance(this.getThat()).clearHighlightedElements();
  }
  
  public Boolean isConnectableTo(List<MoVariable> from, List<MoVariable> to) {
    if (isConnectedTo(from, to)) return false;
    return isConnectableTo(from.get(from.size() - 1), to.get(to.size() - 1));
  }
  
  private Boolean isConnectableTo(MoVariable from, MoVariable to) {
    return isConnectableTo(from, to, !(from.getType().getElement() instanceof MoConnector));
  }
  
  private Boolean isConnectableTo(MoVariable from, MoVariable to, boolean compare) {
    if (compare) {
      if (!from.getName().equals(to.getName())) return false;
      if (from.getKind().equals(MoVariable.Specification.FLOW) && !from.getKind().equals(to.getKind())) return false;
      if (from.getKind().equals(MoVariable.Specification.INPUT) && !to.getKind().equals(MoVariable.Specification.OUTPUT)) return false;
      if (from.getKind().equals(MoVariable.Specification.OUTPUT) && !to.getKind().equals(MoVariable.Specification.INPUT)) return false;
      if (from.getKind().equals(MoVariable.Specification.NONE) && !to.getKind().equals(MoVariable.Specification.NONE)) return false;
    }
    
    return isConnectableTo(from.getType().getElement(), to.getType().getElement());
  }
  
  private Boolean isConnectableTo(MoClass from, MoClass to) {
    if (!from.getClass().equals(to.getClass())) return false;
    if (from instanceof MoConnector && to instanceof MoConnector) {
      if (from.getVariables().size() != to.getVariables().size()) return false;
      for (int i = 0; i < from.getVariables().size(); i++) {
        Boolean hasMatchingOpposite = false;
        for (int j = 0; j < to.getVariables().size(); j++) {
          if (isConnectableTo(from.getVariables().get(i), to.getVariables().get(j))) {
            hasMatchingOpposite = true;
            break;
          }
        }
        if (!hasMatchingOpposite) return false;
      }
    } else {
      if (from != to) return false;
    }
    
    return true;
  }
  
  private Boolean isConnectedTo(List<MoVariable> from, List<MoVariable> to) {
    return getMoClass().getConnections().stream().filter(moConnection -> moConnection.contains(from) && moConnection.contains(to)).count() >= 1;
  }
}

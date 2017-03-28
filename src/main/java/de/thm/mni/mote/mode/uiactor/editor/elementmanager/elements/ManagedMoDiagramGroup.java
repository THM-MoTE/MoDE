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
import java.util.Collections;
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
    ElementManager.getInstance(this.getThat()).setHighlightedElements(connectors.stream().filter(c -> c != connector).map(c -> {
      c.getHighlightExtra().setAll(getConnectableToMessages(connector.getVariables(), c.getVariables()));
      return c;
    }).collect(Collectors.toList()).toArray(new Highlightable[]{}));
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
  
  public Boolean isConnectAbleTo(List<MoVariable> from, List<MoVariable> to) {
    return this.getConnectableToMessages(from, to).isEmpty();
  }
  
  public List<String> getConnectableToMessages(List<MoVariable> from, List<MoVariable> to) {
    if (isConnectedTo(from, to)) return Collections.singletonList("editor.connectors.already_connected");
    return getConnectableToMessages(from.get(from.size() - 1), to.get(to.size() - 1));
  }
  
  private List<String> getConnectableToMessages(MoVariable from, MoVariable to) {
    return getConnectableToMessages(from, to, !(from.getType().getElement() instanceof MoConnector));
  }
  
  private List<String> getConnectableToMessages(MoVariable from, MoVariable to, boolean compare) {
    if (compare) {
      if (!from.getName().equals(to.getName())) return Collections.singletonList("editor.connectors.no_matching_name|" + from.getName());
      if (from.getKind().equals(MoVariable.Specification.FLOW) && !from.getKind().equals(to.getKind())) return Collections.singletonList("editor.connectors.no_matching_modifier");
      if (from.getKind().equals(MoVariable.Specification.INPUT) && !to.getKind().equals(MoVariable.Specification.OUTPUT)) return Collections.singletonList("editor.connectors.no_matching_modifier");
      if (from.getKind().equals(MoVariable.Specification.OUTPUT) && !to.getKind().equals(MoVariable.Specification.INPUT)) return Collections.singletonList("editor.connectors.no_matching_modifier");
      if (from.getKind().equals(MoVariable.Specification.NONE) && !to.getKind().equals(MoVariable.Specification.NONE)) return Collections.singletonList("editor.connectors.no_matching_modifier");
    }
    
    return getConnectableToMessages(from.getType().getElement(), to.getType().getElement());
  }
  
  private List<String> getConnectableToMessages(MoClass from, MoClass to) {
    if (!from.getClass().equals(to.getClass())) return Collections.singletonList("editor.connectors.no_matching_type|" + from.getName() + "|" + to.getName());
    
    if (from instanceof MoConnector && to instanceof MoConnector) {
      if (from.getVariables().size() != to.getVariables().size()) return Collections.singletonList("editor.connectors.no_matching_variable_count");
      for (int i = 0; i < from.getVariables().size(); i++) {
        List<String> list = Collections.EMPTY_LIST;
        Boolean hasMatchingOpposite = false;
        for (int j = 0; j < to.getVariables().size(); j++) {
          list = getConnectableToMessages(from.getVariables().get(i), to.getVariables().get(j));
          if (list.isEmpty()) {
            hasMatchingOpposite = true;
            break;
          }
        }
        if (!hasMatchingOpposite) {
          final int pos = i;
          return list.stream().map(s -> s + "|" + from.getVariables().get(pos).getName()).collect(Collectors.toList());
        }
      }
    } else {
      if (from != to) return Collections.singletonList("editor.connectors.no_matching_type|" + from.getName() + "|" + to.getName());
    }
    
    return Collections.EMPTY_LIST;
  }
  
  private Boolean isConnectedTo(List<MoVariable> from, List<MoVariable> to) {
    return getMoClass().getConnections().stream().filter(moConnection -> moConnection.contains(from) && moConnection.contains(to)).count() >= 1;
  }
}

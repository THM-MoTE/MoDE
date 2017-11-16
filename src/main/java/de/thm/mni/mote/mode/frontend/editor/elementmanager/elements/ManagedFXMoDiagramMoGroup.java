package de.thm.mni.mote.mode.frontend.editor.elementmanager.elements;

import de.thm.mni.mote.mode.modelica.MoClass;
import de.thm.mni.mote.mode.modelica.MoConnector;
import de.thm.mni.mote.mode.modelica.MoContainer;
import de.thm.mni.mote.mode.modelica.MoVariable;
import de.thm.mni.mote.mode.parser.ParserException;
import de.thm.mni.mote.mode.frontend.editor.elementmanager.ElementManager;
import de.thm.mni.mote.mode.frontend.editor.elementmanager.interfaces.Highlightable;
import de.thm.mni.mote.mode.frontend.editor.statemachine.elements.ModifyableFXMoConnectorIconMoGroup;
import de.thm.mni.mote.mode.frontend.editor.statemachine.elements.ModifyableFXMoDiagramMoGroup;
import javafx.scene.Node;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by hobbypunk on 02.03.17.
 */
public class ManagedFXMoDiagramMoGroup extends ModifyableFXMoDiagramMoGroup {
  
  public ManagedFXMoDiagramMoGroup(MoContainer container) throws ParserException {
    super(container);
  }
  
  public void highlightConnectors(ModifyableFXMoConnectorIconMoGroup connector) {
    List<ManagedFXMoConnectorIconMoGroup> connectors = collectConnectors();
    ElementManager.getInstance(this.getThat()).setHighlightedElements(connectors.stream().filter(c -> c != connector).peek(c -> c.getHighlightExtra().setAll(getConnectableToMessages(connector.getVariables(), c.getVariables()))).collect(Collectors.toList()).toArray(new Highlightable[]{}));
  }
  
  private List<ManagedFXMoConnectorIconMoGroup> collectConnectors() {
    List<ManagedFXMoConnectorIconMoGroup> connectors = new ArrayList<>();
    for (Node child : getChildren()) {
      if (child instanceof ManagedFXMoVariableIconMoGroup)
        connectors.addAll(((ManagedFXMoVariableIconMoGroup) child).collectConnectors());
    }
    return connectors;
  }
  
  public void clearHighlight() {
    ElementManager.getInstance(this.getThat()).clearHighlightedElements();
  }
  
  public Boolean isConnectAbleTo(List<MoVariable> from, List<MoVariable> to) {
    return this.getConnectableToMessages(from, to).isEmpty();
  }
  
  private List<String> getConnectableToMessages(List<MoVariable> from, List<MoVariable> to) {
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
        List<String> list = new ArrayList<>();
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
    
    return new ArrayList<>();
  }
  
  private Boolean isConnectedTo(List<MoVariable> from, List<MoVariable> to) {
    return getMoClass().getConnections().stream().filter(moConnection -> moConnection.contains(from) && moConnection.contains(to)).count() >= 1;
  }
}

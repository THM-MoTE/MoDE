package de.thm.mni.mhpp11.control.icon.handlers;

import de.thm.mni.mhpp11.control.icon.MoDiagramGroup;
import de.thm.mni.mhpp11.statemachine.states.ConnectionModifyState;
import javafx.scene.input.MouseEvent;
import lombok.Value;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by hobbypunk on 10.11.16.
 */
@Value
public class ModifyConnectionHandler extends StateHandler<MouseEvent> {
  static private Map<MoDiagramGroup, ModifyConnectionHandler> INSTANCES = new HashMap<>();
  
  
  public static ModifyConnectionHandler getInstance(MoDiagramGroup parent) {
    if (!INSTANCES.containsKey(parent)) {
      INSTANCES.put(parent, new ModifyConnectionHandler(parent));
    }
    return INSTANCES.get(parent);
  }
  
  
  private ModifyConnectionHandler(MoDiagramGroup parent) {
    super(new ConnectionModifyState(parent));
  }
}

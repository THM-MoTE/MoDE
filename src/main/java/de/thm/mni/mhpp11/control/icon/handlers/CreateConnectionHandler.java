package de.thm.mni.mhpp11.control.icon.handlers;

import de.thm.mni.mhpp11.control.icon.MoDiagramGroup;
import de.thm.mni.mhpp11.statemachine.states.ConnectionNewState;
import javafx.scene.input.MouseEvent;
import lombok.Value;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by hobbypunk on 14.11.16.
 */

@Value
public class CreateConnectionHandler extends StateHandler<MouseEvent> {
  static private Map<MoDiagramGroup, CreateConnectionHandler> INSTANCES = new HashMap<>();
  
  public static CreateConnectionHandler getInstance(MoDiagramGroup parent) {
    if (!INSTANCES.containsKey(parent)) {
      INSTANCES.put(parent, new CreateConnectionHandler(parent));
    }
    return INSTANCES.get(parent);
  }
  
  private CreateConnectionHandler(MoDiagramGroup parent) {
    super(new ConnectionNewState(parent));
  }
}

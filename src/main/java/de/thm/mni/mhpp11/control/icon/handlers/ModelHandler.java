package de.thm.mni.mhpp11.control.icon.handlers;

import de.thm.mni.mhpp11.control.MainTabControl;
import de.thm.mni.mhpp11.control.icon.MoDiagramGroup;
import de.thm.mni.mhpp11.control.icon.MoIconGroup;
import de.thm.mni.mhpp11.statemachine.states.ModelMoveState;
import de.thm.mni.mhpp11.util.parser.models.MoClass;
import javafx.scene.control.TabPane;
import javafx.scene.input.MouseEvent;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by hobbypunk on 08.11.16.
 */
public class ModelHandler extends StateHandler<MouseEvent> {
  MoDiagramGroup parent;
  static private Map<MoDiagramGroup, ModelHandler> INSTANCES = new HashMap<>();
  
  public static ModelHandler getInstance(MoDiagramGroup parent) {
    if (!INSTANCES.containsKey(parent)) {
      INSTANCES.put(parent, new ModelHandler(parent));
    }
    return INSTANCES.get(parent);
  }
  
  
  private ModelHandler(MoDiagramGroup parent) {
    super(new ModelMoveState(parent));
    this.parent = parent;
  }
  
  @Override
  public void handle(MouseEvent event) {
    if (event.getEventType().equals(MouseEvent.MOUSE_CLICKED) && event.getClickCount() % 2 == 0) {
      MoClass mc = ((MoIconGroup) event.getSource()).getMoClass();
      if (mc.hasDiagram()) {
        TabPane tb = (TabPane) this.parent.getParent().getParent().getParent().getParent().getParent().getParent();
        tb.getTabs().add(new MainTabControl(mc, true));
      }
    } else super.handle(event);
  }
}

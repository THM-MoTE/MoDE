package de.thm.mni.mote.mode.ui.statemachine.states.model;

import de.thm.mni.mote.mode.modelica.MoClass;
import de.thm.mni.mote.mode.ui.control.MainTabControl;
import de.thm.mni.mote.mode.ui.control.modelica.MoDiagramGroup;
import de.thm.mni.mote.mode.ui.control.modelica.MoIconGroup;
import de.thm.mni.mote.mode.ui.statemachine.states.State;
import javafx.scene.Parent;
import javafx.scene.control.TabPane;
import javafx.scene.input.MouseEvent;
import lombok.Getter;

/**
 * Created by hobbypunk on 18.11.16.
 */
@Getter
public class ModelOpenState extends State<MouseEvent, MoIconGroup> {
  
  private final MoDiagramGroup parent;
  
  public ModelOpenState(MoDiagramGroup parent, MoIconGroup src) {
    super(src);
    this.parent = parent;
  }
  
  @Override
  protected void initTransitions() {}
  
  @Override
  protected void handleClicked(MouseEvent event) {
    if (event.getClickCount() % 2 == 0) {
      MoClass mc = ((MoIconGroup) event.getSource()).getMoClass();
      if (mc.hasDiagram()) {
        TabPane tb = findTabPane(this.getSource());
        if (tb != null) tb.getTabs().add(new MainTabControl(mc, true));
      }
      getMachine().switchToState(new ModelModifyState(getParent(), getSource()));
    }
  }
  
  private TabPane findTabPane(Parent parent) {
    if (parent instanceof TabPane) return (TabPane) parent;
    if (parent.getParent() == null) return null;
    return findTabPane(parent.getParent());
  }
}

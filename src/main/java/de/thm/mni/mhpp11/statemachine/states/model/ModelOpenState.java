package de.thm.mni.mhpp11.statemachine.states.model;

import de.thm.mni.mhpp11.control.MainTabControl;
import de.thm.mni.mhpp11.control.icon.MoIconGroup;
import de.thm.mni.mhpp11.statemachine.states.State;
import de.thm.mni.mhpp11.util.parser.models.MoClass;
import javafx.scene.Parent;
import javafx.scene.control.TabPane;
import javafx.scene.input.MouseEvent;

/**
 * Created by hobbypunk on 18.11.16.
 */
public class ModelOpenState extends State<MouseEvent, MoIconGroup> {
  
  public ModelOpenState(MoIconGroup src) {
    super(src);
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
      getMachine().switchToState(new ModelModifyState(getSource()));
    }
  }
  
  private TabPane findTabPane(Parent parent) {
    if (parent instanceof TabPane) return (TabPane) parent;
    if (parent.getParent() == null) return null;
    return findTabPane(parent.getParent());
  }
}

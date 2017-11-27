package de.thm.mni.mote.mode.frontend.editor;

import de.thm.mni.mote.mode.frontend.controls.MainTabControl;
import de.thm.mni.mote.mode.frontend.editor.actionmanager.ActionManager;
import de.thm.mni.mote.mode.frontend.editor.elementmanager.ElementManager;
import de.thm.mni.mote.mode.frontend.editor.statemachine.StateMachine;
import de.thm.mni.mote.mode.frontend.utilities.ActiveInstance;
import de.thm.mni.mote.mode.frontend.utilities.ActiveInstanceManager;
import de.thm.mni.mote.mode.modelica.MoContainer;
import javafx.scene.Scene;
import lombok.Getter;

public class MasterManager extends ActiveInstance {
  @Getter
  private static ActiveInstanceManager<MasterManager> instanceManager = new ActiveInstanceManager<MasterManager>() {
    
    @Override
    public void create(Scene scene, MainTabControl tab, MoContainer container) {
      MasterManager.getInstanceManager().create(container);
      ActionManager.getInstanceManager().create(container);
      
      MenuManager.getInstanceManager().create(container);
      StateMachine.getInstanceManager().create(scene, tab, container);
      ElementManager.getInstanceManager().create(container);
    }
  
    @Override
    protected MasterManager createInstance(MoContainer container) {
      return new MasterManager(container);
    }
  };
  
  private final MoContainer container;
  
  private MasterManager(MoContainer container) {
    this.container = container;
  }
  
  @Override
  protected void onActivation() {
    MenuManager.getInstanceManager().activate(container);
    StateMachine.getInstanceManager().activate(container);
    ActionManager.getInstanceManager().activate(container);
    ElementManager.getInstanceManager().activate(container);
  }
  
  @Override
  protected void onDeactivation() {
    ElementManager.getInstanceManager().deactivate();
    ActionManager.getInstanceManager().deactivate();
    StateMachine.getInstanceManager().deactivate();
    MenuManager.getInstanceManager().deactivate();
  }
  
  @Override
  protected void onDestroy() {
    ElementManager.getInstanceManager().remove(container);
    ActionManager.getInstanceManager().remove(container);
    StateMachine.getInstanceManager().remove(container);
    MenuManager.getInstanceManager().remove(container);
  }
}

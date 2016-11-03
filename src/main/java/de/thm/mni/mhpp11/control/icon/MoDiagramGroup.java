package de.thm.mni.mhpp11.control.icon;

import de.thm.mni.mhpp11.util.parser.models.MoClass;
import de.thm.mni.mhpp11.util.parser.models.MoConnection;
import javafx.event.EventHandler;
import javafx.scene.input.MouseEvent;
import javafx.scene.transform.Translate;

/**
 * Created by hobbypunk on 19.09.16.
 */
public class MoDiagramGroup extends MoGroup {
  
  public MoDiagramGroup(MoClass moClass) {
    super(moClass);
    init();
  }
  
  @Override
  protected void initImage() {
    initVariables();
    initConnections();
  }
  
  private void initVariables() {
    this.getMoClass().getVariables().forEach(super::initVariable);
    EventHandler<MouseEvent> handler = new EventHandler<MouseEvent>() {
      Double orgSceneX = 0., orgSceneY = 0.;
      Double orgOriginX = 0., orgOriginY = 0.;
      Translate o = null;
    
      @Override
      public void handle(MouseEvent event) {
        if (event.getEventType().equals(MouseEvent.MOUSE_PRESSED)) {
          o = ((MoIconGroup) event.getSource()).getOrigin();
          orgSceneX = event.getSceneX();
          orgSceneY = event.getSceneY();
        
          orgOriginX = o.getX();
          orgOriginY = o.getY();
        } else {
          if (o != null) {
            o.setX(orgOriginX + ((event.getSceneX() - orgSceneX)) / getScale().getX());
            o.setY(orgOriginY + ((orgSceneY - event.getSceneY())) / getScale().getY());
          }
        }
      }
    };
    getBasis().getChildren().stream().filter(node -> node instanceof MoIconGroup && ((MoIconGroup) node).getVariable() != null).forEach(node -> {
      node.setOnMousePressed(handler);
      node.setOnMouseDragged(handler);
      node.setOnMouseClicked(event -> {
        System.out.println(((MoIconGroup) node).getMoClass());
      });
    });
  }
  
  private void initConnections() {
    this.getMoClass().getConnections().forEach(this::initConnection);
  }
  
  private void initConnection(MoConnection connection) {
    connection.getMoGraphics().forEach(moGraphic -> {
      super.initImage(moGraphic);
    });
  }
  
}

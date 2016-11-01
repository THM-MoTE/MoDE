package de.thm.mni.mhpp11.control.icon;

import de.thm.mni.mhpp11.util.parser.models.MoClass;
import de.thm.mni.mhpp11.util.parser.models.MoConnection;

/**
 * Created by hobbypunk on 19.09.16.
 */
public class MoDiagramPane extends MoPane {
  
  public MoDiagramPane(MoClass moClass) {
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
    getBasis().getChildren().forEach(node -> {
      node.setOnMouseClicked(event -> {
        System.out.println(((MoIconPane) node).getMoClass());
      });
    });
  }
  
  private void initConnections() {
    this.getMoClass().getConnections().forEach(this::initConnection);
  }
  
  private void initConnection(MoConnection connection) {
    System.out.println(connection);
    connection.getMoGraphics().forEach(moGraphic -> {
      super.initImage(moGraphic);
    });
  }
  
}

package de.thm.mni.mote.mode.uiactor.control.modelica;

import de.thm.mni.mote.mode.modelica.MoConnection;
import de.thm.mni.mote.mode.modelica.graphics.MoGraphic;
import de.thm.mni.mote.mode.modelica.graphics.MoLine;
import de.thm.mni.mote.mode.modelica.graphics.MoText;
import de.thm.mni.mote.mode.uiactor.shape.Line;
import de.thm.mni.mote.mode.uiactor.shape.Text;
import de.thm.mni.mote.mode.uiactor.shape.interfaces.HasStrokeWidth;
import javafx.scene.Group;
import lombok.Getter;

@Getter
public class FXMoConnectionGroup extends Group {
  private FXMoDiagramMoGroup moDiagram;
  private MoConnection connection;
  
  public FXMoConnectionGroup(FXMoDiagramMoGroup moDiagram, MoConnection connection) {
    this.moDiagram = moDiagram;
    this.connection = connection;
    initImage();
  }
  
  private void initImage() {
    this.getConnection().getMoGraphics().forEach(this::initImage);
  }
  
  private void initImage(MoGraphic mg) {
    if (mg instanceof MoText) this.getChildren().add(new Text(moDiagram, (MoText) mg));
    else if (mg instanceof MoLine) this.getChildren().add(new Line(moDiagram, (MoLine) mg));
    preventScaling(1., 1.);
  }
  
  //TODO: prevent scaling of stroke!
  void preventScaling(Double scaleX, Double scaleY) {
    getChildren().forEach(node -> {
      if (node instanceof HasStrokeWidth) {
        HasStrokeWidth s = (HasStrokeWidth) node;
        Double factor = Math.max(scaleX * moDiagram.getScale().getX(), scaleY * moDiagram.getScale().getY());
        factor = (factor < 1.) ? 1. : factor; //dirty hack
        s.setOwnStrokeWidth(s.getInitialStrokeWidth() * (1 / (factor)));
      }
    });
  }
}

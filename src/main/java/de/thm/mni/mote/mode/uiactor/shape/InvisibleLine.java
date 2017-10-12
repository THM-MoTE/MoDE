package de.thm.mni.mote.mode.uiactor.shape;

import de.thm.mni.mote.mode.modelica.graphics.MoLine;
import de.thm.mni.mote.mode.uiactor.control.modelica.FXMoParentGroup;
import javafx.scene.paint.Color;
import lombok.NonNull;

/**
 * Created by hobbypunk on 16.02.17.
 */
public class InvisibleLine extends Line {
  
  public InvisibleLine(@NonNull FXMoParentGroup parent, @NonNull MoLine data) {
    super(parent, data);
  }
  
  @Override
  public void init() {
    super.init();
    this.setStroke(Color.TRANSPARENT);
  }
  
}

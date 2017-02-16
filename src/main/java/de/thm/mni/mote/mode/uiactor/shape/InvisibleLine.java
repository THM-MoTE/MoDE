package de.thm.mni.mote.mode.uiactor.shape;

import de.thm.mni.mote.mode.modelica.graphics.MoLine;
import de.thm.mni.mote.mode.uiactor.control.modelica.MoGroup;
import javafx.scene.paint.Color;
import lombok.Getter;
import lombok.NonNull;

/**
 * Created by hobbypunk on 16.02.17.
 */
@Getter
public class InvisibleLine extends Line {
  
  private Double extraWidth = 3.;
  
  public InvisibleLine(@NonNull MoGroup parent, @NonNull MoLine data) {
    super(parent, data);
  }
  
  @Override
  public void init() {
    super.init();
    this.setStroke(Color.TRANSPARENT);
  }
  
}

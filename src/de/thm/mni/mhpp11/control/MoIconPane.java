package de.thm.mni.mhpp11.control;

import de.thm.mni.mhpp11.util.config.model.Point;
import de.thm.mni.mhpp11.util.parser.models.MoIcon;
import de.thm.mni.mhpp11.util.parser.models.graphics.MoCoordinateSystem;
import de.thm.mni.mhpp11.util.parser.models.graphics.MoGraphic;
import javafx.scene.layout.Pane;

import java.util.List;

/**
 * Created by hobbypunk on 19.09.16.
 */
public class MoIconPane extends Pane {
  
  private MoIcon icon;
  
  private Double moveX = 100.0;
  private Double moveY = 100.0;
  
  private Double w = 200.0;
  private Double h = 200.0;
  
  private Double initialScale = 1.0;
  private Boolean preserveAspectRatio = true;
  
  public MoIconPane(MoIcon icon) {
    this.icon = icon;
    initCoordinateSystem();
    initImage();
  }
  
  private void initCoordinateSystem() {
    MoCoordinateSystem mcs = icon.getMoCoordinateSystem();
    if(mcs.getExtent() != null && mcs.getExtent().size() > 0) {
      Boolean minFirst = mcs.getExtent().get(0).get(0) < mcs.getExtent().get(1).get(0);
  
      Double minX = mcs.getExtent().get((minFirst) ? 0 : 1).get(0);
      Double maxX = moveX = mcs.getExtent().get((minFirst) ? 1 : 0).get(0);
  
      minFirst = mcs.getExtent().get(0).get(1) < mcs.getExtent().get(1).get(1);
  
      Double minY = mcs.getExtent().get((minFirst) ? 0 : 1).get(1);
      Double maxY = moveY = mcs.getExtent().get((minFirst) ? 1 : 0).get(1);
  
      w = Math.abs(minX - maxX);
      h = Math.abs(minY - maxY);
    }
    
    if(mcs.getPreserveAspectRatio() != null) this.preserveAspectRatio = mcs.getPreserveAspectRatio();
    if(mcs.getInitialScale() != null) this.initialScale = mcs.getInitialScale();
    
    this.setPrefWidth(w);
    this.setPrefHeight(h);
  }
  
  private void initImage() {
//    for(List<MoGraphic> mgs : icon.getMoGraphics()) {
//      initImage(mgs);
//    }
  }
  
  private void initImage(List<MoGraphic> mgs) {
    mgs = mgs;
  }
  
  private Point<Double, Double> convertTo(Point<Double, Double> point) {
    point.setX(point.getX() + moveX);
    point.setY(point.getY() + moveY);
    return point;
  }
}

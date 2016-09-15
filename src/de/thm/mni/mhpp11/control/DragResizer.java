package de.thm.mni.mhpp11.control;

import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Region;

/**
 * From <a href="https://gist.github.com/andytill/4369729">https://gist.github.com/andytill/4369729</a>
 * <p>
 * <p>
 * {@link DragResizer} can be used to add mouse listeners to a {@link Region}
 * and make it resizable by the user by clicking and dragging the border in the
 * same way as a window.
 * <p>
 * Only height resizing is currently implemented. Usage: <pre>DragResizer.makeResizable(myAnchorPane);</pre>
 *
 * @author atill
 */
public class DragResizer {
  
  /**
   * The margin around the control that a user can click in to start resizing
   * the region.
   */
  private static final int RESIZE_MARGIN = 5;
  public static final int LTR = 0;
  public static final int RTL = 1;
  
  private final Region region;
  private final Region parent;
  private final int direction;
  
  private MouseEvent prevEvent;
  
  private boolean dragging;
  
  private DragResizer(Region region, Region parent, int direction) {
    this.region = region;
    this.parent = parent;
    this.direction = direction;
  }
  
  public static void makeResizable(Region region, Region parent, int direction) {
    final DragResizer resizer = new DragResizer(region, parent, direction);
    
    region.setOnMousePressed(resizer::mousePressed);
    region.setOnMouseDragged(resizer::mouseDragged);
    region.setOnMouseReleased(resizer::mouseReleased);
  }
  
  private void mouseReleased(MouseEvent event) {
    dragging = false;
  }
  
  private void mouseDragged(MouseEvent event) {
    if (!dragging) return;

    double pos = 0.0;
    if (this.direction == LTR) {
      pos = event.getSceneX() - prevEvent.getSceneX();
    } else if (this.direction == RTL) {
      pos = prevEvent.getSceneX() - event.getSceneX();
    }
    if(this.direction == LTR || this.direction == RTL)
      parent.setPrefWidth(parent.getPrefWidth() + pos);
    prevEvent = event;
  }
  
  private void mousePressed(MouseEvent event) {
    dragging = true;
    
    prevEvent = event;
  }
}
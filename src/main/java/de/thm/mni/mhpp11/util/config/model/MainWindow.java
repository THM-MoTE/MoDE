package de.thm.mni.mhpp11.util.config.model;

import javafx.geometry.Point2D;
import lombok.Getter;
import lombok.NonNull;
import org.simpleframework.xml.Element;

/**
 * Created by hobbypunk on 15.09.16.
 */

@Getter
public class MainWindow extends MyObservable {
  
  @Element @NonNull Point2D pos = new Point2D(20, 20);
  @Element @NonNull Point2D size = new Point2D(1000, 700);
  @Element @NonNull Integer widthLeftPane = 200;
  @Element @NonNull Integer widthRightPane = 200;
  
  public void setPos(Integer x, Integer y) {
    setPos(new Point2D(x, y));
  }
  
  public void setPos(Point2D pos) {
    this.pos = pos;
    this.notifyObservers("Pos");
  }
  
  public void setSize(Integer w, Integer h) {
    setSize(new Point2D(w, h));
  }
  
  public void setSize(Point2D size) {
    this.size = size;
    this.notifyObservers("Size");
  }
  
  public void setWidthLeftPane(Integer widthLeftPane) {
    this.widthLeftPane = widthLeftPane;
    this.notifyObservers("WidthLeftPane");
  }
  
  public void setWidthRightPane(Integer widthRightPane) {
    this.widthRightPane = widthRightPane;
    this.notifyObservers("WidthRightPane");
  }
  
  @Override
  public String toString() {
    return String.format("{ pos: %s, size: %s, widthLeftPane: %d, widthRightPane: %d }", pos, size, widthLeftPane, widthRightPane);
  }
}

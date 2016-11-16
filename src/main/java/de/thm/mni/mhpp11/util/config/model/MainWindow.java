package de.thm.mni.mhpp11.util.config.model;

import de.thm.mni.mhpp11.util.Tuple;
import lombok.Getter;
import lombok.NonNull;
import org.simpleframework.xml.Element;

/**
 * Created by hobbypunk on 15.09.16.
 */

@Getter
public class MainWindow extends MyObservable {
  
  @Element @NonNull Tuple<Double, Double> pos = new Tuple<>(20., 20.);
  @Element @NonNull Tuple<Double, Double> size = new Tuple<>(1000., 700.);
  @Element @NonNull Integer widthLeftPane = 200;
  @Element @NonNull Integer widthRightPane = 200;
  
  public void setPos(Double x, Double y) {
    setPos(new Tuple<>(x, y));
  }
  
  public void setPos(Tuple<Double, Double> pos) {
    this.pos = pos;
    this.notifyObservers("Pos");
  }
  
  public void setSize(Double w, Double h) {
    setSize(new Tuple<>(w, h));
  }
  
  public void setSize(Tuple<Double, Double> size) {
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

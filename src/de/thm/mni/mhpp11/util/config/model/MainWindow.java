package de.thm.mni.mhpp11.util.config.model;

import lombok.Getter;
import lombok.NonNull;
import org.simpleframework.xml.Element;

/**
 * Created by hobbypunk on 15.09.16.
 */

@Getter
public class MainWindow extends MyObservable {
  
  @Element
  @NonNull Pair<Integer, Integer> pos = new Pair<>(20,20);
  @Element
  @NonNull Pair<Integer, Integer> size = new Pair<>(1000,700);
  @Element
  @NonNull Integer widthLeftPane = 200;
  @Element
  @NonNull Integer widthRightPane = 200;
  
  public void setPos(Integer x, Integer y) {
    setPos(new Pair<>(x, y));
  }
  
  public void setPos(Pair<Integer, Integer> pos) {
    this.pos = pos;
    this.notifyObservers("Pos");
  }
  
  public void setSize(Integer w, Integer h) {
    setSize(new Pair<>(w, h));
  }
  
  public void setSize(Pair<Integer, Integer> size) {
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
}

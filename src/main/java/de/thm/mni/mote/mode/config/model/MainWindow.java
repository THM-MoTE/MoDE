package de.thm.mni.mote.mode.config.model;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;
import org.apache.commons.lang3.tuple.MutablePair;
import org.apache.commons.lang3.tuple.Pair;
import org.simpleframework.xml.Element;

/**
 * Created by hobbypunk on 15.09.16.
 */

@Getter
@Setter
public class MainWindow {
  
  @Element @NonNull Pair<Double, Double> pos = new MutablePair<>(20., 20.);
  @Element @NonNull Pair<Double, Double> size = new MutablePair<>(1000., 700.);
  @Element @NonNull Integer widthLeftPane = 200;
  @Element @NonNull Integer widthRightPane = 200;
  @Setter(AccessLevel.PRIVATE) @Element(required = false) @NonNull Editor editor = new Editor();
  
  @Override
  public String toString() {
    return String.format("{ pos: %s, size: %s, widthLeftPane: %d, widthRightPane: %d }", pos, size, widthLeftPane, widthRightPane);
  }
}

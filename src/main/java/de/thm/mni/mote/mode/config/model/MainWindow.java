package de.thm.mni.mote.mode.config.model;

import lombok.Data;
import lombok.NonNull;
import org.apache.commons.lang3.tuple.MutablePair;
import org.apache.commons.lang3.tuple.Pair;
import org.simpleframework.xml.Element;

/**
 * Created by Marcel Hoppe on 15.09.16.
 */

@Data
@SuppressWarnings("WeakerAccess")
public class MainWindow {
  
  @Element @NonNull Pair<Double, Double> pos = new MutablePair<>(20., 20.);
  @Element @NonNull Pair<Double, Double> size = new MutablePair<>(1000., 700.);
  @Element @NonNull Integer widthLeftPane = 200;
  @Element @NonNull Integer widthRightPane = 200;
  @Element(required = false) @NonNull Editor editor = new Editor();
  
  @Override
  public String toString() {
    return String.format("{ pos: %s, size: %s, widthLeftPane: %d, widthRightPane: %d }", pos, size, widthLeftPane, widthRightPane);
  }
}

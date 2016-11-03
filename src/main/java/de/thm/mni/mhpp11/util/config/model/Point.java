package de.thm.mni.mhpp11.util.config.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NonNull;

/**
 * Created by hobbypunk on 15.09.16.
 */
@Data
@AllArgsConstructor
public class Point<X, Y> {
  @NonNull final X x;
  @NonNull final Y y;
  
  @Override
  public String toString() {
    return String.format("{ x: %s, y: %s}", x, y);
  }
}

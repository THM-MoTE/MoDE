package de.thm.mni.mhpp11.util.config.model;

import lombok.*;

/**
 * Created by hobbypunk on 15.09.16.
 */
@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
public class Point<X, Y> {
  @NonNull X x;
  @NonNull Y y;
}

package de.thm.mni.mhpp11.util;

import lombok.*;

/**
 * Created by hobbypunk on 15.11.16.
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Tuple<A, B> {
  A x;
  B y;
}

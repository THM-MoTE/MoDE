package de.thm.mni.mhpp11.util.config.model;

import lombok.*;
import org.simpleframework.xml.Element;

/**
 * Created by hobbypunk on 14.09.16.
 */
@NoArgsConstructor
@AllArgsConstructor
public class Notification {
  @Element
  @NonNull Integer seconds = 5;
}

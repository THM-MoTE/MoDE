package de.thm.mni.mote.mode.config.model;

import lombok.*;
import org.simpleframework.xml.Element;

/**
 * Created by Marcel Hoppe on 14.09.16.
 */
@Data
@SuppressWarnings("WeakerAccess")
public class Notification {
  @Element
  @NonNull Integer seconds = 5;
}

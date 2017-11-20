package de.thm.mni.mote.mode.config.model;

import lombok.Data;
import org.simpleframework.xml.Element;

/**
 * Created by Marcel Hoppe on 20.02.17.
 */
@Data
@SuppressWarnings("WeakerAccess")
public class Editor {
  @Element Boolean defaultSnap = false;
  @Element Double snapRadius = 2.5;
  @Element Double lineClickRadius = 4.;
}

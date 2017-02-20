package de.thm.mni.mote.mode.config.model;

import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;
import org.simpleframework.xml.Element;

/**
 * Created by hobbypunk on 20.02.17.
 */
@Getter
@Setter
public class Editor {
  @Element @NonNull Boolean defaultSnap = false;
  @Element @NonNull Double snapRadius = 2.5;
}

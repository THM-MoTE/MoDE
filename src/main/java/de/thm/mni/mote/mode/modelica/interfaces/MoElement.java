package de.thm.mni.mote.mode.modelica.interfaces;

import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;

import java.io.Serializable;

/**
 * Created by hobbypunk on 20.10.16.
 */
@Getter
public abstract class MoElement extends MoAnnotatable implements Serializable {
  protected String PREFIX = " ";
  @Setter private String comment = "";
  
  public MoElement(@NonNull String prefix, @NonNull String comment) {
    this.PREFIX = prefix;
    this.comment = comment;
  }
  
  public abstract String getName();
  
  public abstract String getSimpleName();
  
}

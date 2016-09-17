package de.thm.mni.mhpp11.util.parser.models;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * Created by hobbypunk on 07.09.16.
 */
@Getter
@AllArgsConstructor
public abstract class MoElement {
  private final String name;
  private final String description;
  
  protected MoElement(String name) {
    this.name = name;
    this.description = "";
  }

  public abstract String toString();
}

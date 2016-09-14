package de.thm.mni.mhpp11.model;

import lombok.AllArgsConstructor;

/**
 * Created by hobbypunk on 07.09.16.
 */
@AllArgsConstructor
public abstract class MoElement {
  public final String name;
  public final String description;
  
  protected MoElement(String name) {
    this.name = name;
    this.description = "";
  }

  public abstract String toString();
}

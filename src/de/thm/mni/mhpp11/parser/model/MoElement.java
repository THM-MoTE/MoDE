package de.thm.mni.mhpp11.parser.model;

import java.io.BufferedReader;
import java.util.regex.Matcher;


/**
 * Created by hobbypunk on 07.09.16.
 */
public abstract class MoElement {
  public final String name;
  public final String description;
  
  
  protected MoElement(String name) {
    this.name = name;
    this.description = "";
  }

  protected MoElement(String name, String description) {
    this.name = name;
    this.description = description;
  }
  
  public abstract String toString();
}

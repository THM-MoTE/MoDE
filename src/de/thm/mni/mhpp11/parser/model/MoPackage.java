package de.thm.mni.mhpp11.parser.model;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


/**
 * Created by hobbypunk on 07.09.16.
 */
public class MoPackage extends MoElement {
    
  public final List<MoElement> list;
  
  public MoPackage(String name, String description, List<MoElement> list) {
    super(name, description);
    this.list = list;
  }
  
  @Override
  public String toString() { return "p > " + this.name; }
}

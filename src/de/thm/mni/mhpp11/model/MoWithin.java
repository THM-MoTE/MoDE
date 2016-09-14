package de.thm.mni.mhpp11.model;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * Created by hobbypunk on 08.09.16.
 */
@Setter @Getter
public class MoWithin extends MoElement {
  
  final List<String> packages;
  
  public MoWithin(List<String> packages) {
    super("within");
    this.packages = packages;
  }
  
  @Override
  public String toString() {
    return "w > " + String.join(".",this.packages);
  }
}

package de.thm.mni.mhpp11.model;

/**
 * Created by hobbypunk on 08.09.16.
 */
public class MoProgramm extends MoElement {
  
  MoWithin within;
  
  public MoProgramm(String name, String description) {
    super(name, description);
  }
  
  @Override
  public String toString() {
    return null;
  }
  
  public void setWithin(MoWithin within) {
    this.within = within;
  }
}

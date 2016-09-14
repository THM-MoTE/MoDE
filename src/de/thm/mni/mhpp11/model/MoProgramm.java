package de.thm.mni.mhpp11.model;

import lombok.Getter;
import lombok.Setter;

/**
 * Created by hobbypunk on 08.09.16.
 */

public class MoProgramm extends MoElement {
  
  @Getter @Setter private MoWithin within;
  private MoPackage moPackage;
  
  public MoProgramm(String name) {
    super(name);
  }
  
  public void setPackage(MoPackage moPackage) {
    this.moPackage = moPackage;
  }
  
  public MoPackage getPackage() {
    return this.moPackage;
  }
  
  @Override
  public String toString() {
    return name + "\n\t" + this.within + "\n\t" + this.moPackage;
  }
}

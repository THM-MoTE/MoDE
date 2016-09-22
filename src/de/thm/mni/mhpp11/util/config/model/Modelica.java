package de.thm.mni.mhpp11.util.config.model;

import lombok.Getter;
import org.simpleframework.xml.Element;

import java.io.File;

/**
 * Created by hobbypunk on 22.09.16.
 */
@Getter
public class Modelica extends MyObservable {
  @Element(required = false) File modelicaBuiltIn;
  @Element(required = false) File modelicaLibrary;
  
  public void setModelicaLibrary(File modelicaLibrary) {
    this.modelicaLibrary = modelicaLibrary;
    this.notifyObservers("ModelicaLibrary");
  }
}

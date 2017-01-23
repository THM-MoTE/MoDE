package de.thm.mni.mote.mode.config.model;

import de.thm.mni.mote.mode.util.Utilities;
import lombok.Getter;
import org.simpleframework.xml.Element;

import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Created by hobbypunk on 22.09.16.
 */
@Getter
public class Modelica extends MyObservable {
  @Element(required = false) Path compiler = Paths.get(Utilities.isWin() ? "C:/omc.exe" : "/usr/bin/omc");
  @Element(required = false) Integer depth = 2;
  
  public void setCompiler(Path compiler) {
    this.compiler = compiler;
    this.notifyObservers("compiler");
  }
  
  public void setDepth(Integer depth) {
    this.depth = depth;
    this.notifyObservers("depth");
  }
  
  @Override
  public String toString() {
    return String.format("{ compiler: %s, depth: %d }", compiler, depth);
  }
}

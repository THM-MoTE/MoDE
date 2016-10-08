package de.thm.mni.mhpp11.util.config.model;

import lombok.Getter;
import org.simpleframework.xml.Element;

import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Created by hobbypunk on 22.09.16.
 */
@Getter
public class Modelica extends MyObservable {
  @Element(required = false) Path compiler = Paths.get("/usr/bin/omc");
  @Element(required = false) Path library = Paths.get("/usr/lib/omlibrary");
  @Element(required = false) Integer depth = 2;
  
  public void setCompiler(Path compiler) {
    this.compiler = compiler;
    this.notifyObservers("compiler");
  }
  
  public void setLibrary(Path library) {
    this.library = library;
    this.notifyObservers("library");
  }
  
  public void setDepth(Integer depth) {
    this.depth = depth;
    this.notifyObservers("depth");
  }
  
  @Override
  public String toString() {
    return String.format("{ compiler: %s, library: %s, depth: %d }", compiler, library, depth);
  }
}

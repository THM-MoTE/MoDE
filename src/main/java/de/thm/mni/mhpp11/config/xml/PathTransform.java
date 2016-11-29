package de.thm.mni.mhpp11.config.xml;

import org.simpleframework.xml.transform.Transform;

import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Created by hobbypunk on 08.10.16.
 */
public class PathTransform implements Transform<Path> {
  @Override
  public Path read(String value) throws Exception {
    return Paths.get(value);
  }
  
  @Override
  public String write(Path value) throws Exception {
    return value.toString();
  }
}

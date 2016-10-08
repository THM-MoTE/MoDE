package de.thm.mni.mhpp11.util.xml;

import org.simpleframework.xml.transform.Matcher;
import org.simpleframework.xml.transform.Transform;

import java.nio.file.Path;

/**
 * Created by hobbypunk on 08.10.16.
 */
public class MyMatcher implements Matcher {
  @Override
  public Transform match(Class type) throws Exception {
    return (Path.class.isAssignableFrom(type)) ? new PathTransform() : null;
  }
}

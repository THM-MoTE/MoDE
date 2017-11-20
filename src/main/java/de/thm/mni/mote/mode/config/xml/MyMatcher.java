package de.thm.mni.mote.mode.config.xml;

import org.simpleframework.xml.transform.Matcher;
import org.simpleframework.xml.transform.Transform;

import java.nio.file.Path;
import java.util.Date;

/**
 * Created by Marcel Hoppe on 08.10.16.
 */
public class MyMatcher implements Matcher {
  @Override
  public Transform match(Class type) throws Exception {
    if (Path.class.isAssignableFrom(type)) return new PathTransform();
    if (Date.class.isAssignableFrom(type)) return new ISODateTransform();
    return null;
  }
}

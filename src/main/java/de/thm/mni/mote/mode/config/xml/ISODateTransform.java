package de.thm.mni.mote.mode.config.xml;

import org.simpleframework.xml.transform.Transform;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

/**
 * Created by Marcel Hoppe on 08.10.16.
 */
class ISODateTransform implements Transform<Date> {
  private static final DateFormat df = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'");
  
  static {
    df.setTimeZone(TimeZone.getTimeZone("UTC"));
  }
  
  @Override
  public Date read(String value) throws Exception {
    return df.parse(value);
  }
  
  @Override
  public String write(Date value) throws Exception {
    return df.format(value);
  }
}

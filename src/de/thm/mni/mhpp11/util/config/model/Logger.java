package de.thm.mni.mhpp11.util.config.model;

import lombok.NonNull;
import org.simpleframework.xml.Element;

/**
 * Created by hobbypunk on 13.09.16.
 */
public class Logger {
  
  public enum LEVEL {
    NEVER,
    ERROR,
    WARNING,
    DEBUG,
    INFO,
    ALWAYS
  }
  
  
  @Element
  @NonNull LEVEL level = LEVEL.ERROR;
  @Element
  @NonNull LEVEL notifyLevel = LEVEL.ERROR;
}

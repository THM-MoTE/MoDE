package de.thm.mni.mote.mode.config.model;

import lombok.Data;
import org.simpleframework.xml.Element;
import org.slf4j.event.Level;

/**
 * Created by Marcel Hoppe on 13.09.16.
 */
@Data
@SuppressWarnings("WeakerAccess")
public class Logger {
  
  @Element Level level = Level.ERROR;
  @Element Level notifyLevel = Level.ERROR;
}
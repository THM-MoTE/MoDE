package de.thm.mni.mote.mode.config.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.simpleframework.xml.Element;
import org.slf4j.event.Level;

/**
 * Created by hobbypunk on 13.09.16.
 */
@Getter
@Setter
@ToString
public class Logger {
  
  @Element Level level = Level.ERROR;
  @Element Level notifyLevel = Level.ERROR;
}
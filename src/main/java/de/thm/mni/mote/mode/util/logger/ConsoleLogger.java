package de.thm.mni.mote.mode.util.logger;

import de.thm.mni.mote.mode.config.model.Logger;
import lombok.NoArgsConstructor;

/**
 * Created by hobbypunk on 13.09.16.
 */
@NoArgsConstructor
public class ConsoleLogger extends Logger {
  
  public ConsoleLogger(LEVEL level, LEVEL notifyLevel) {
    super(level, notifyLevel);
  }
  
  @Override
  public void log(Message message) {
    System.out.println(message);
  }
}

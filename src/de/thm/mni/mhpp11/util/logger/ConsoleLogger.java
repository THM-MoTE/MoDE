package de.thm.mni.mhpp11.util.logger;

import de.thm.mni.mhpp11.util.config.model.Logger.LEVEL;

/**
 * Created by hobbypunk on 13.09.16.
 */

public class ConsoleLogger extends Logger {
  
  protected ConsoleLogger(LEVEL level, LEVEL notifyLevel) {
    super(level, notifyLevel);
  }
  
  @Override
  public void log(Message message) {
    System.out.println(message);
  }
}

package de.thm.mni.mhpp11.util.logger;

/**
 * Created by hobbypunk on 13.09.16.
 */

public class ConsoleLogger extends Logger {
  
  protected ConsoleLogger(LOGLEVEL level, LOGLEVEL notifyLevel) {
    super(level, notifyLevel);
  }
  
  @Override
  public void log(Message message) {
    System.out.println(message);
  }
}

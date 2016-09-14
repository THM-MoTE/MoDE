package de.thm.mni.mhpp11.util.logger;

import de.thm.mni.mhpp11.util.config.model.Logger.LEVEL;

/**
 * Created by hobbypunk on 13.09.16.
 */
public class LoggerFactory {
  
  public static Logger getConsoleLogger(LEVEL level, LEVEL notifyLevel) {
    return new ConsoleLogger(level, notifyLevel);
  }
  
//  public static Logger getFileLogger(Logger.LOGLEVEL level, Logger.LOGLEVEL notifyLevel, File file) {
//    return new FileLogger(file);
//  }
}

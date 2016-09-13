package de.thm.mni.mhpp11.util.logger;

/**
 * Created by hobbypunk on 13.09.16.
 */
public class LoggerFactory {
  
  public static Logger getConsoleLogger(Logger.LOGLEVEL level, Logger.LOGLEVEL notifyLevel) {
    return new ConsoleLogger(level, notifyLevel);
  }
  
//  public static Logger getFileLogger(Logger.LOGLEVEL level, Logger.LOGLEVEL notifyLevel, File file) {
//    return new FileLogger(file);
//  }
}

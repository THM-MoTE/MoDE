package de.thm.mni.mhpp11.config.model;

import de.thm.mni.mhpp11.util.logger.Message;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.simpleframework.xml.Element;

/**
 * Created by hobbypunk on 13.09.16.
 */
@Getter
@NoArgsConstructor
@AllArgsConstructor
public abstract class Logger extends MyObservable {
  
  public enum LEVEL {
    NEVER,
    ERROR,
    WARNING,
    DEBUG,
    INFO,
    ALWAYS
  }
  
  @Element LEVEL level = LEVEL.ERROR;
  @Element LEVEL notifyLevel = LEVEL.ERROR;
  
  public void setLevel(LEVEL level) {
    this.level = level;
    this.notifyObservers("Level");
  }
  
  public void setNotifyLevel(LEVEL level) {
    this.notifyLevel = level;
    this.notifyObservers("NotifyLevel");
  }
  
  private boolean isIn(LEVEL level, Message.TYPE type) {
    return level.ordinal() > type.ordinal();
  }
  
  public abstract void log(Message message);
  
  public void debug(String head, String message) {
    send(new Message(Message.TYPE.DEBUG, head, message, false));
    
  }
  
  
  public void info(String head, String message, Boolean noNotify) {
    send(new Message(Message.TYPE.INFO, head, message, noNotify));
  }

  public void info(String head, String message) {
    info(head, message, false);
  }
  
  public void warning(String head, String message) {
    warning(head, message, false);
  }
  
  public void warning(String head, String message, Boolean noNotify) {
    send(new Message(Message.TYPE.WARNING, head, message, noNotify));
  }
  
  public void error(Exception exception) {
    StringBuilder sb = new StringBuilder();
    String seperator = "\t\t\t\t\t\t\t\t\t\t\t\t";
    
    sb.append(String.format(": %1$s\n", exception.getMessage()));
    for( StackTraceElement ste:  exception.getStackTrace()) {
      sb.append(String.format("%1$s at %2$s\n", seperator, ste));
    }
    
    String msg = String.format("Exception in thread \"%1$s\" %2$s", Thread.currentThread().getName(), exception.getClass().getCanonicalName());
    logIntern(new Message(Message.TYPE.ERROR, msg, sb.toString(), false));
    notify(new Message(Message.TYPE.ERROR, "Exception", exception.getMessage(), false));
  }
  
  public void error(String head, String message) {
    send(new Message(Message.TYPE.ERROR, head, message, false));
  }
  
  private void send(Message m) {
    logIntern(m);
    notify(m);
  }
  
  private void logIntern(Message m) {
    if(isIn(this.level, m.getType())) {
      log(m);
    }
  }
  
  private void notify(Message m) {
    if(isIn(this.notifyLevel, m.getType())) {
      this.setChanged();
      this.notifyObservers(m);
    }
  }
  
  @Override
  public String toString() {
    return String.format("{level: %s, notifyLevel: %s}", level, notifyLevel);
  }
}

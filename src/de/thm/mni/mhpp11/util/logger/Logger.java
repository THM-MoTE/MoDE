package de.thm.mni.mhpp11.util.logger;

import de.thm.mni.mhpp11.util.config.Settings;
import de.thm.mni.mhpp11.util.config.model.Logger.LEVEL;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.NonNull;
import lombok.Setter;

import java.time.Instant;
import java.util.Date;
import java.util.Observable;

/**
 * Created by hobbypunk on 13.09.16.
 */
@AllArgsConstructor(access = AccessLevel.PROTECTED)
public abstract class Logger extends Observable {
  
  
  @Setter private LEVEL level = LEVEL.ERROR;
  @Setter private LEVEL notifyLevel = LEVEL.ERROR;
  
  private boolean isIn(LEVEL level, Message.TYPE type) {
    return level.ordinal() > type.ordinal();
  }
  
  public abstract void log(Message message);
  
  public void debug(String head, String message) {
    send(new Message(Message.TYPE.DEBUG, head, message));
  
  }
  
  public void info(String head, String message) {
    send(new Message(Message.TYPE.INFO, head, message));

  }
  
  public void warning(String head, String message) {
    send(new Message(Message.TYPE.WARNING, head, message));
  }
  
  public void error(Exception exception) {
    StringBuilder sb = new StringBuilder();
    String seperator = "\t\t\t\t\t\t\t\t\t\t\t\t";
    
    sb.append(String.format(": %1$s\n", exception.getMessage()));
    for( StackTraceElement ste:  exception.getStackTrace()) {
      sb.append(String.format("%1$s at %2$s\n", seperator, ste));
    }
    
    String msg = String.format("Exception in thread \"%1$s\" %2$s", Thread.currentThread().getName(), exception.getClass().getCanonicalName());
    logIntern(new Message(Message.TYPE.ERROR, msg, sb.toString()));
    notify(new Message(Message.TYPE.ERROR, "Exception", exception.getMessage()));
  }
  public void error(String head, String message) {
    send(new Message(Message.TYPE.ERROR, head, message));
  }
  
  private void send(Message m) {
    logIntern(m);
    notify(m);
  }
  
  private void logIntern(Message m) {
    if(isIn(this.level, m.type)) {
      log(m);
    }
  }
  
  private void notify(Message m) {
    if(isIn(this.notifyLevel, m.type)) {
      this.setChanged();
      this.notifyObservers(m);
    }
  }
  
  @AllArgsConstructor
  @lombok.Getter
  public static class Message {
    public enum TYPE {
      ERROR,
      WARNING,
      DEBUG,
      INFO;
  
      public boolean isError() { return this.equals(ERROR); }
      public boolean isWarning() { return this.equals(WARNING); }
      public boolean isDebug() { return this.equals(DEBUG); }
      public boolean isInfo() { return this.equals(INFO); }
    }
    
    @NonNull private final TYPE type;
    @NonNull private final String headline;
    @NonNull private final String message;
    @NonNull private final Date date = Date.from(Instant.now());
    
    @Override
    public String toString() {
      String ret = "";
      try {
        Settings s = Settings.load();
        ret = String.format(s.getLang(), "%1$s <%2$s> %3$s: %4$s", date, type, headline, message);
      } catch (Exception e) {
        e.printStackTrace();
      }
      return ret;
    }
  }
}

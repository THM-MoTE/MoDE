package de.thm.mni.mhpp11.util.logger;

import de.thm.mni.mhpp11.util.config.Settings;
import lombok.*;

import java.time.Instant;
import java.util.Date;
import java.util.Observable;

/**
 * Created by hobbypunk on 13.09.16.
 */
@AllArgsConstructor(access = AccessLevel.PROTECTED)
public abstract class Logger extends Observable {
  public static enum LOGLEVEL{
    NEVER,
    INFO,
    DEBUG,
    ERROR,
    ALWAYS
  }
  
  @Setter private LOGLEVEL level = LOGLEVEL.ERROR;
  @Setter private LOGLEVEL notifyLevel = LOGLEVEL.ERROR;
  
  private boolean isLevel(LOGLEVEL level) {
    return this.level.compareTo(level) <= 0;
  }
  
  private boolean isNotifyLevel(LOGLEVEL level) {
    return this.notifyLevel.compareTo(level) <= 0;
  }
  
  public abstract void log(Message message);
  
  public void info(String head, String message) {
    Message m = new Message(LOGLEVEL.INFO, head, message);
    if(isLevel(m.level)) {
      log(m);
    }
    if(isNotifyLevel(m.level)) {
      this.hasChanged();
      this.notifyObservers(m);
    }
  }
  
  public void debug(String head, String message) {
    Message m = new Message(LOGLEVEL.DEBUG, head, message);
    if(isLevel(m.level)) {
      log(m);
    }
    if(isNotifyLevel(m.level)) {
      this.hasChanged();
      this.notifyObservers(m);
    }
  }
  
  public void error(String head, String message) {
    Message m = new Message(LOGLEVEL.ERROR, head, message);
    if(isLevel(m.level)) {
      log(m);
    }
    if(isNotifyLevel(m.level)) {
      this.hasChanged();
      this.notifyObservers(m);
    }
  }
  
  @AllArgsConstructor
  public static class Message {
    @NonNull public final LOGLEVEL level;
    @NonNull public final LOGLEVEL notifyLevel;
    @NonNull public final String headline;
    @NonNull public final String message;
    @NonNull public final Date date = Date.from(Instant.now());
    
    public Message(LOGLEVEL level, String headline, String message) {
      this(level, level, headline, message);
    }
    
    @Override
    public String toString() {
      String ret = "";
      try {
        Settings s = Settings.load();
        ret = String.format(s.getLang(), "%1$s <%2$s> %3$s: %4$s", date, level, headline, message);
      } catch (Exception e) {
        e.printStackTrace();
      }
      return ret;
    }
  }
}

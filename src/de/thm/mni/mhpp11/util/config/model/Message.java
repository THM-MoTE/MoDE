package de.thm.mni.mhpp11.util.config.model;

import de.thm.mni.mhpp11.util.config.Settings;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NonNull;

import java.time.Instant;
import java.util.Date;

@AllArgsConstructor
@Getter
public class Message {
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

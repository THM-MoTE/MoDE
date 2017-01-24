package de.thm.mni.mote.mode.parser;

import lombok.Getter;
import lombok.NonNull;

/**
 * Created by hobbypunk on 08.09.16.
 */
@Getter
public class ParserException extends Exception {
  
  private final String title;
  
  public ParserException(String cause) {
    this("", cause);
  }
  
  public ParserException(@NonNull String title, String cause) {
    super(cause);
    this.title = title;
  }
  
  public ParserException(Throwable cause) {
    this("", cause);
  }
  
  public ParserException(@NonNull String title, Throwable cause) {
    super(cause);
    this.title = title;
  }
  
}

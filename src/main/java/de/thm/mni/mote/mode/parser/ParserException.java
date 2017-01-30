package de.thm.mni.mote.mode.parser;

import lombok.Getter;
import lombok.NonNull;

/**
 * Created by hobbypunk on 08.09.16.
 */
@Getter
public class ParserException extends Exception {
  
  public ParserException(@NonNull String message) {
    super(message);
  }
  
  public ParserException(@NonNull String message, Throwable cause) {
    super(message, cause);
  }
  
}

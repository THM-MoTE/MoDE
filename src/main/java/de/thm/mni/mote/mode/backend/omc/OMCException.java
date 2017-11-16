package de.thm.mni.mote.mode.backend.omc;

/**
 * Created by hobbypunk on 24.01.17.
 */
public class OMCException extends Exception {
  
  public OMCException(String message) {
    super(message);
  }
  
  public OMCException(String message, Throwable throwable) {
    super(message, throwable);
  }
}

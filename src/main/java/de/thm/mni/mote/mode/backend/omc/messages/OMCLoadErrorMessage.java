package de.thm.mni.mote.mode.backend.omc.messages;

import de.thm.mni.mhpp11.smbj.logging.messages.ErrorMessage;
import lombok.NonNull;

import java.util.UUID;

/**
 * Created by hobbypunk on 28.02.17.
 */
public class OMCLoadErrorMessage extends ErrorMessage {
  public OMCLoadErrorMessage(@NonNull Class<?> cause, @NonNull Throwable throwable) {
    super(cause, throwable);
  }
  
  public OMCLoadErrorMessage(@NonNull Class<?> cause, @NonNull String title, @NonNull Throwable throwable) {
    super(cause, title, throwable);
  }
  
  public OMCLoadErrorMessage(@NonNull Class<?> cause, @NonNull UUID group, @NonNull Throwable throwable) {
    super(cause, group, throwable);
  }
  
  public OMCLoadErrorMessage(@NonNull Class<?> cause, @NonNull UUID group, @NonNull String title, @NonNull Throwable throwable) {
    super(cause, group, title, throwable);
  }
}

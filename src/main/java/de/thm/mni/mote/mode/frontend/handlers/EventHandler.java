package de.thm.mni.mote.mode.frontend.handlers;

/**
 * Created by hobbypunk on 26.01.17.
 */
public interface EventHandler<T> {
  void handle(T data);
}

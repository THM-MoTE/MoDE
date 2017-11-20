package de.thm.mni.mote.mode.frontend.editor.statemachine.interfaces;

import javafx.scene.input.ScrollEvent;

/**
 * Created by Marcel Hoppe on 15.02.17.
 */
public interface Zoomable extends HandleEvent {
  
  void zoom(ScrollEvent event);
}

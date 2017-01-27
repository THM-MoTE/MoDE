package de.thm.mni.mote.mode.uiactor.shape.interfaces;

import de.thm.mni.mote.mode.parser.ParserException;

/**
 * Created by hobbypunk on 10.11.16.
 */
public interface Focusable {
  
  void setFocus() throws ParserException;
  
  void clearFocus();
}

package de.thm.mni.mote.mode.modelica;

import de.thm.mni.mote.mode.backend.omc.OMCompiler;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

import java.nio.file.Path;

/**
 * Created by Marcel Hoppe on 20.10.16.
 */
@Getter
@AllArgsConstructor
@ToString
public class ClassInformation {
  private final OMCompiler.TYPE type;
  private final String comment;
  private final Path fileName;
  private final Boolean readOnly;
  private final Integer lineNumberStart, lineNumberEnd, columnNumberStart, columnNumberEnd;
}

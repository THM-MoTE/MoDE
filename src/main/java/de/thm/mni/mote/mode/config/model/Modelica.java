package de.thm.mni.mote.mode.config.model;

import de.thm.mni.mote.mode.util.Utilities;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.simpleframework.xml.Element;

import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Created by Marcel Hoppe on 22.09.16.
 */
@Getter
@Setter
@ToString
public class Modelica {
  @Element(required = false) Path compiler = Paths.get(Utilities.isWin() ? "C:/omc.exe" : "/usr/bin/omc");
}

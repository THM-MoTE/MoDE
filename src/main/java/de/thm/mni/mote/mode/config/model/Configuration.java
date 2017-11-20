package de.thm.mni.mote.mode.config.model;

import lombok.Data;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

import java.nio.file.Path;
import java.util.Locale;

/**
 * Created by Marcel Hoppe on 11.09.16.
 */

@Root
@Data
public class Configuration {
  
  @Element(required = false)
  Locale lang = Locale.ENGLISH;
  @Element(required = false)
  Recent recent = new Recent();
  @Element(required = false)
  Logger logger = new Logger();
  @Element(required = false)
  Notification notification = new Notification();
  @Element(required = false)
  MainWindow mainwindow = new MainWindow();
  @Element(required = false)
  Modelica modelica = new Modelica();
  
  public Path file;
  
  public void setLang(Locale lang) {
    this.lang = lang;
    Locale.setDefault(lang);
  }
  
}

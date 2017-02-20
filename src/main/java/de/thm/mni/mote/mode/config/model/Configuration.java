package de.thm.mni.mote.mode.config.model;

import lombok.Getter;
import lombok.ToString;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

import java.nio.file.Path;
import java.util.Locale;

/**
 * Created by hobbypunk on 11.09.16.
 */

@Root
@Getter
@ToString
public class Configuration {
  
  @Element(required = false)
  protected Locale lang = Locale.ENGLISH;
  @Element(required = false)
  protected Recent recent = new Recent();
  @Element(required = false)
  protected Logger logger = new Logger();
  @Element(required = false)
  protected Notification notification = new Notification();
  @Element(required = false)
  protected MainWindow mainwindow = new MainWindow();
  @Element(required = false)
  protected Modelica modelica = new Modelica();
  
  public Path file;
  
  public void setLang(Locale lang) {
    this.lang = lang;
    Locale.setDefault(lang);
  }
  
}

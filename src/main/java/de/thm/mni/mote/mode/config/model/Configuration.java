package de.thm.mni.mote.mode.config.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

import java.nio.file.Path;
import java.util.Locale;
import java.util.Observable;
import java.util.Observer;

/**
 * Created by hobbypunk on 11.09.16.
 */

@Root
@NoArgsConstructor
@Getter
public class Configuration extends MyObservable implements Observer {
  
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
    this.notifyObservers("Lang");
  }
  
  @Override
  public void init() {
    super.init();
    recent.init();
    logger.init();
    notification.init();
    mainwindow.init();
    modelica.init();
  }
  
  @Override
  public void update(Observable o, Object arg) {
    notifyObservers(arg);
  }
  
  @Override
  public String toString() {
    return String.format("{ lang: %s, recent: %s, logger: %s, notification: %s, mainwindow: %s, modelica: %s }", lang, recent, logger, notification, mainwindow, modelica);
  }
}

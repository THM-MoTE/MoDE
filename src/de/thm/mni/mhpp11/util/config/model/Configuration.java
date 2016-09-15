package de.thm.mni.mhpp11.util.config.model;

import de.thm.mni.mhpp11.util.logger.ConsoleLogger;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

import java.io.File;
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
  protected Locale lang = new Locale("en", "US");
  @Element(required = false)
  protected Recent recent = new Recent();
  @Element(required = false)
  protected Logger logger = new ConsoleLogger();
  @Element(required = false)
  protected Notification notification = new Notification();
  @Element(required = false)
  protected MainWindow mainwindow = new MainWindow();
  
  public File file;
  
  public void setLang(Locale lang) {
    this.lang = lang;
    this.notifyObservers("Lang");
  }
  
  @Override
  public void init() {
    super.init();
    recent.init();
    logger.init();
    notification.init();
    mainwindow.init();
  }
  
  @Override
  public void update(Observable o, Object arg) {
    notifyObservers(arg);
  }
}

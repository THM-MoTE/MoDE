package de.thm.mni.mote.mode.config;

import de.thm.mni.mhpp11.jActor.actors.logging.messages.ErrorMessage;
import de.thm.mni.mhpp11.jActor.actors.messagebus.MessageBus;
import de.thm.mni.mote.mode.config.model.Configuration;
import de.thm.mni.mote.mode.config.xml.MyMatcher;
import de.thm.mni.mote.mode.util.Utilities;
import org.simpleframework.xml.Serializer;
import org.simpleframework.xml.core.Persister;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Observable;
import java.util.Observer;
import java.util.Properties;


/**
 * Created by hobbypunk on 10.09.16.
 */
public class Settings extends Configuration implements Observer {
  
  public static String TITLE;
  public static String VERSION;
  public static String SUBTITLE = "The Modelica Diagram Editor";
  
  static {
    Properties props = new Properties();
    InputStream is;
    is = Settings.class.getResourceAsStream("/META-INF/maven/de.thm.mni.mhpp11/MoDE/pom.properties");
    
    try {
      if (is != null) {
        props.load(is);
        TITLE = props.getProperty("artifactId");
        VERSION = props.getProperty("version");
      } else {
        Path fileName = Paths.get("pom.xml");
        if (!Files.exists(fileName))
          fileName = Paths.get("MoDE/pom.xml");
        BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(fileName.toFile())));
        String line;
        while ((line = br.readLine()) != null) {
          if (line.contains("artifactId")) {
            TITLE = line.replaceAll("\\s*</?artifactId>", "");
          } else if (line.contains("version")) {
            VERSION = line.replaceAll("\\s*</?version>", "") + " src";
            break;
          }
        }
      }
    } catch (NullPointerException | IOException e) {
      TITLE = "MoDE";
      VERSION = "0.1";
    }
  }
  
  private static Settings INSTANCE;
  
  private Serializer serializer;
  
  public static Settings load() {
    return load(true);
  }
  
  private static Settings load(Boolean firstTime) {
    if (INSTANCE != null) return INSTANCE;
    Path f = Utilities.getConf();
    
    try {
      Serializer serializer = new Persister(new MyMatcher());
      INSTANCE = serializer.read(Settings.class, f.toFile());
      INSTANCE.file = f;
      INSTANCE.serializer = serializer;
      INSTANCE.init();
    } catch (Exception e) {
      if (!firstTime) throw new RuntimeException(e);
      try {
        Files.delete(f);
      } catch (IOException e1) {
        e1.printStackTrace();
      }
      return load(false);
    }
    return INSTANCE;
  }
  
  public void save() {
    Thread t = new Thread(() -> {
      try {
        serializer.write(this, this.file.toFile());
      } catch (Exception e) {
        MessageBus.getInstance().send(new ErrorMessage(this.getClass(), e));
      }
    });
    t.start();
  }
  
  @Override
  public void update(Observable o, Object arg) {
    if (arg instanceof String && !((String) arg).startsWith(getClass().getSimpleName())) {
      super.update(o, arg);
      this.save();
    }
  }
}

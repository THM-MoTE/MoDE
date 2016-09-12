package de.thm.mni.mhpp11.util.config;

import de.thm.mni.mhpp11.util.config.model.Configuration;
import org.simpleframework.xml.Serializer;
import org.simpleframework.xml.core.Persister;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.util.Arrays;
import java.util.List;
import java.util.Observable;
import java.util.Observer;


/**
 * Created by hobbypunk on 10.09.16.
 */
public class Settings extends Configuration implements Observer {
  
  public static String NAME = "MoDE";
  public static String VERSION = "0.1";
  
  private static Settings INSTANCE;
  
  private Serializer serializer;
  
  public static Settings load() throws Exception {
    if (INSTANCE != null) return INSTANCE;

    String os = System.getProperty("os.name").toLowerCase();
    String path;
    if (os.contains("win")) {
      path = System.getenv("APPDATA") + "/" + NAME;
    } else if (os.contains("mac")) {
      //TODO: mac settings path
      path = System.getenv("HOME") + "/.config/" + NAME;
    } else {
      path = System.getenv("HOME") + "/.config/" + NAME;
    }
    File tmp = new File(path);
    if (!tmp.exists()) {
      if (!tmp.mkdirs()) throw new Exception("cant create folders");
    }
    path += "/config.xml";
    tmp = new File(path);
    if (!tmp.exists()) {
      try {
        if (!tmp.createNewFile()) throw new Exception();
  
        try {
          String cls = Settings.class.getSimpleName().toLowerCase();
          List<String> lines = Arrays.asList("<"+cls+">", "</"+cls+">");
          Files.write(tmp.toPath(), lines, Charset.forName("UTF-8"));
        } catch (IOException e) {
          e.printStackTrace();
        }
      } catch (Exception e) {
        throw new Exception("cant create file");
      }
    }
  
    Serializer serializer = new Persister();
    INSTANCE = serializer.read(Settings.class, tmp);
    INSTANCE.file = tmp;
    INSTANCE.serializer = serializer;
    INSTANCE.addObserver(INSTANCE);
    return INSTANCE;
  }
  
  public void save()  {
    try {
      serializer.write(this, this.file);
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
  
  @Override
  public void update(Observable o, Object arg) {
    System.out.println("Settings changed");
    this.save();
  }
}

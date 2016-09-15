package de.thm.mni.mhpp11.util.config;

import de.thm.mni.mhpp11.util.Utilities;
import de.thm.mni.mhpp11.util.config.model.Configuration;
import org.simpleframework.xml.Serializer;
import org.simpleframework.xml.core.Persister;

import java.io.*;
import java.util.Observable;
import java.util.Observer;
import java.util.Properties;


/**
 * Created by hobbypunk on 10.09.16.
 */
public class Settings extends Configuration implements Observer {
  
  public static String NAME;
  public static String VERSION;
  
  static {
    Properties props = new Properties();
    InputStream is;
    is = Settings.class.getResourceAsStream("/META-INF/maven/de.thm.mni.mhpp11/MoDE/pom.properties");
    
    try {
      if(is != null) {
        props.load(is);
        NAME = props.getProperty("artifactId");
        VERSION = props.getProperty("version");
      } else {
        BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("pom.xml")));
        String line;
        while((line = br.readLine()) != null) {
          if(line.contains("artifactId")) {
            NAME = line.replaceAll("\\s*\\<\\/?artifactId>", "");
          } else if(line.contains("version")) {
            VERSION = line.replaceAll("\\s*\\<\\/?version>", "") + " src";
            break;
          }
        }
      }
    } catch (NullPointerException | IOException e) {
      NAME = "MoDE";
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
    File f = Utilities.getConf();
    
    try {
      Serializer serializer = new Persister();
      INSTANCE = serializer.read(Settings.class, f);
      INSTANCE.file = f;
      INSTANCE.serializer = serializer;
      INSTANCE.init();
    } catch (Exception e) {
      if (!firstTime) throw new RuntimeException(e);
      f.delete();
      return load(false);
    }
    return INSTANCE;
  }
  
  public void save() {
    try {
      serializer.write(this, this.file);
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
  
  @Override
  public void update(Observable o, Object arg) {
    this.save();
  }
}

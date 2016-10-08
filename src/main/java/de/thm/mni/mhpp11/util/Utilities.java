package de.thm.mni.mhpp11.util;

import de.thm.mni.mhpp11.util.config.Settings;

import java.io.IOException;
import java.net.URL;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.ResourceBundle;

/**
 * Created by hobbypunk on 14.09.16.
 */
public class Utilities {
  
  public static URL getRessources(String postfix) {
    return Utilities.class.getResource("/de/thm/mni/mhpp11/" + postfix);
  }
  
  public static URL getView(String view) {
    return Utilities.getRessources("view/" + view + ".fxml");
  }
  
  public static ResourceBundle getBundle(String bundle) {
    Settings settings = Settings.load();
    return getBundle(bundle, settings.getLang());
  }
  
  public static ResourceBundle getBundle(String bundle, Locale lang) {
    return ResourceBundle.getBundle("de/thm/mni/mhpp11/i18n/" + bundle, lang, new UTF8ResourceBundleControl());
  }
  
  public static Path getHome() {
    return Paths.get(System.getProperty("user.home"));
  }
  
  private static Path getConfDir() {
    Path f;
    if (isWin())
      f = Paths.get(System.getenv("APPDATA") + "/" + Settings.NAME);
    else
      f = Paths.get(System.getenv("HOME") + "/.config/" + Settings.NAME);
    
    if (!Files.exists(f)) {
      try {
        f = Files.createDirectories(f);
      } catch (IOException e) {
        throw new RuntimeException("can't create folders");
      }
    }
    return f;
  }
  
  public static Path getConf() {
    Path f = Paths.get(getConfDir() + "/config.xml");
    if (Files.notExists(f)) {
      try {
        Files.createFile(f);
        
        try {
          String cls = Settings.class.getSimpleName().toLowerCase();
          List<String> lines = Arrays.asList("<" + cls + ">", "</" + cls + ">");
          Files.write(f, lines, Charset.forName("UTF-8"));
        } catch (IOException e) {
          e.printStackTrace();
        }
      } catch (Exception e) {
        throw new RuntimeException("can't create file");
      }
    }
    return f;
  }
  
  public static Boolean isWin() {
    String os = System.getProperty("os.name").toLowerCase();
    return os.contains("win");
  }
  
  public static Boolean isMac() {
    String os = System.getProperty("os.name").toLowerCase();
    return os.contains("mac");
  }
  
  public static Boolean isLinux() {
    String os = System.getProperty("os.name").toLowerCase();
    return os.contains("linux");
  }
}

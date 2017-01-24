package de.thm.mni.mote.mode.util;

import de.thm.mni.mote.mode.config.Settings;
import de.thm.mni.mote.mode.uiactor.utilities.UTF8ResourceBundleControl;
import lombok.experimental.UtilityClass;

import java.io.IOException;
import java.net.URL;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.ResourceBundle;

/**
 * Created by hobbypunk on 14.09.16.
 */
@UtilityClass
public class Utilities {
  public final String BASEPATH = "de/thm/mni/mote/mode/";
  
  private final NumberFormat numberFormat;
  
  static {
    DecimalFormatSymbols symbols = new DecimalFormatSymbols(Locale.ENGLISH);
    numberFormat = new DecimalFormat("#.##", symbols);
  }
  
  private URL getRessources(String postfix) {
    return Utilities.class.getResource("/" + BASEPATH + postfix);
  }
  
  public URL getView(String view) {
    return getView("", view);
  }
  
  public URL getControlView(String view) {
    return getView("control", view);
  }
  
  private URL getView(String prefix, String view) {
    if (!prefix.isEmpty())
      prefix += "/";
    return Utilities.getRessources(prefix + "view/" + view + ".fxml");
  }
  
  public ResourceBundle getBundle(String bundle) {
    Settings settings = Settings.load();
    return getBundle(bundle, settings.getLang());
  }
  
  public ResourceBundle getBundle(String bundle, Locale lang) {
    return getBundle("", bundle, lang);
  }
  
  public ResourceBundle getControlBundle(String bundle, Locale lang) {
    return getBundle("control", bundle, lang);
  }
  
  private ResourceBundle getBundle(String prefix, String bundle, Locale lang) {
    String path = BASEPATH;
    if (!prefix.isEmpty())
      path += prefix + "/";
    
    return ResourceBundle.getBundle(path + "i18n/" + bundle, lang, new UTF8ResourceBundleControl());
  }
  
  public Path getHome() {
    return Paths.get(System.getProperty("user.home"));
  }
  
  private Path getConfDir() {
    Path f;
    if (isWin())
      f = Paths.get(System.getenv("APPDATA") + "/" + Settings.TITLE);
    else
      f = Paths.get(System.getenv("HOME") + "/.config/" + Settings.TITLE);
    
    if (!Files.exists(f)) {
      try {
        f = Files.createDirectories(f);
      } catch (IOException e) {
        throw new RuntimeException("can'actors create folders");
      }
    }
    return f;
  }
  
  public Path getConf() {
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
        throw new RuntimeException("can'actors create file");
      }
    }
    return f;
  }
  
  public Boolean isWin() {
    String os = System.getProperty("os.name").toLowerCase();
    return os.contains("win");
  }
  
  public Boolean isMac() {
    String os = System.getProperty("os.name").toLowerCase();
    return os.contains("mac");
  }
  
  public Boolean isLinux() {
    String os = System.getProperty("os.name").toLowerCase();
    return os.contains("linux");
  }
  
  public NumberFormat getFormatter() {
    return numberFormat;
  }
  
}

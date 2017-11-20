package de.thm.mni.mote.mode.util;

import de.thm.mni.mote.mode.config.Settings;
import de.thm.mni.mhpp11.smbj.ui.utilities.UTF8ResourceBundleControl;
import lombok.experimental.UtilityClass;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.util.*;

/**
 * Created by Marcel Hoppe on 14.09.16.
 */
@UtilityClass
public class Utilities {
  private final String BASEPATH = "de/thm/mni/mote/mode/";
  
  private final NumberFormat numberFormat;
  
  static {
    DecimalFormatSymbols symbols = new DecimalFormatSymbols(Locale.ENGLISH);
    numberFormat = new DecimalFormat("#.##", symbols);
  }
  
  private URL getResource(String postfix) {
    return Utilities.class.getResource("/" + BASEPATH + postfix);
  }
  
  private InputStream getResourceAsStream(String postfix) {
    return Utilities.class.getResourceAsStream("/" + BASEPATH + postfix);
  }
  
  public InputStream getTemplate(String template) {
    return getResourceAsStream("templates/" + template);
  }
  
  private URL getView(String view) {
    return getView("", view);
  }
  
  public URL getControlView(String view) {
    return getView("controls", view);
  }
  
  public URL getDialogView(String view) { return getView("dialogs/" + view);}
  
  public URL getFragmentView(String view) { return getView("fragments/" + view);}
  
  public URL getView(String prefix, String view) {
    if (!prefix.isEmpty())
      prefix += "/";
    return Utilities.getResource("frontend/" + prefix + "views/" + view + "View.fxml");
  }
  
  public static URL getCSS(String css) {
    return Utilities.getResource("frontend/" + css);
  }
  
  
  public ResourceBundle getBundle(String bundle) throws MissingResourceException {
    return getBundle("", bundle);
  }
  
  private ResourceBundle getBundle(String prefix, String bundle) throws MissingResourceException {
    Settings settings = Settings.load();
    return getBundle(prefix, bundle, settings.getLang());
  }
  
  public ResourceBundle getBundle(String bundle, Locale lang) throws MissingResourceException {
    return getBundle("", bundle, lang);
  }
  
  public ResourceBundle getControlBundle(String bundle) {
    return getBundle("controls", bundle);
  }
  
  public ResourceBundle getControlBundle(String bundle, Locale lang) {
    return getBundle("controls", bundle, lang);
  }
  
  
  private ResourceBundle getBundle(String prefix, String bundle, Locale lang) throws MissingResourceException {
    String path = BASEPATH + "frontend/";
    if (!prefix.isEmpty())
      path += prefix + "/";
    
    return ResourceBundle.getBundle(path + "bundles/" + bundle + "Bundle", lang, new UTF8ResourceBundleControl());
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
        throw new RuntimeException("can't createMove folders");
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
        throw new RuntimeException("can't create config file");
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

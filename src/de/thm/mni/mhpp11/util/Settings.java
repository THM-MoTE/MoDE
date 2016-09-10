package de.thm.mni.mhpp11.util;

import org.apache.commons.configuration2.Configuration;
import org.apache.commons.configuration2.PropertiesConfiguration;
import org.apache.commons.configuration2.builder.FileBasedConfigurationBuilder;
import org.apache.commons.configuration2.builder.fluent.Configurations;
import org.apache.commons.configuration2.ex.ConfigurationException;

import java.io.File;
import java.io.IOException;
import java.util.Locale;


/**
 * Created by hobbypunk on 10.09.16.
 */
public class Settings {
  
  public static String NAME = "MoDE";
  public static String VERSION = "0.1";
  
  private static Settings INSTANCE;
  
  private FileBasedConfigurationBuilder<PropertiesConfiguration> builder;
  private Configuration config;
  private String path;
  
  
  public static Settings load() throws ConfigurationException {
    if(INSTANCE == null) INSTANCE = new Settings();
    else INSTANCE.save();
    return INSTANCE;
  }
  
  private Settings() throws ConfigurationException {
    String os = System.getProperty("os.name").toLowerCase();
    String path;
    if(os.contains("win")) {
      path = System.getenv("APPDATA") + "/" + NAME;
    } else if(os.contains("mac")) {
      //TODO: mac settings path
      path = System.getenv("HOME") + "/.config/" + NAME;
    } else {
      path = System.getenv("HOME") + "/.config/" + NAME;
    }
    File tmp = new File(path);
    if(!tmp.exists()) {
      if(!tmp.mkdirs()) throw new ConfigurationException("cant create folders");
    }
    path +=  "/config.properties";
    tmp = new File(path);
    if(!tmp.exists()) {
      try {
        if(!tmp.createNewFile()) throw new ConfigurationException();
      } catch(Exception e) {
        throw new ConfigurationException("cant create file");
      }
    }
    Configurations configs = new Configurations();
    builder = configs.propertiesBuilder(path);
    config = builder.getConfiguration();
  }
  
  public Locale getLang() {
    String lang = config.getString("lang");
    if(lang == null) lang = "en_US";
    return new Locale(lang.split("_")[0], lang.split("_")[1]);
  }
  
  public void setLang(Locale lang) {
    config.setProperty("lang", lang);
  }
  
  public void save() throws ConfigurationException {
    builder.save();
  }
}

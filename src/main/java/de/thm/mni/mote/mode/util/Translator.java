package de.thm.mni.mote.mode.util;

import java.text.MessageFormat;
import java.util.*;

/**
 * Created by hobbypunk on 30.01.17.
 */
public final class Translator {
  private static Map<String, ResourceBundle> bundles = new HashMap<>();
  
  public static ResourceBundle getBundle(String bundle) {
    if (!bundles.containsKey(bundle)) {
      bundles.put(bundle, Utilities.getBundle(bundle));
    }
    return bundles.get(bundle);
  }
  
  public static String tr(String bundle, String key) {
    return tr(getBundle(bundle), "", key);
  }
  
  public static String tr(String bundle, String group, String key) {
    if (bundle == null) bundle = "MoDE";
    String[] keyWithParams = key.split("\\|");
    key = keyWithParams[0];
    Object[] params = new String[0];
    if (keyWithParams.length > 1)
      params = Arrays.copyOfRange(keyWithParams, 1, keyWithParams.length);
    return tr(getBundle(bundle), group, key, params);
    
  }
  
  public static String tr(String bundle, String group, String key, Object... params) {
    return tr(getBundle(bundle), group, key, params);
  }
  
  
  public static String tr(ResourceBundle bundle, String key, Object... params) {
    return tr(bundle, "", key, params);
  }
  
  public static String tr(ResourceBundle bundle, String group, String key, Object... params) {
    try {
      if (!group.isEmpty()) key = group.toLowerCase() + "." + key;
      
      if(bundle == null) throw new MissingResourceException("", "", key);
      if (params.length == 0)
        return bundle.getString(key);
      else
        return MessageFormat.format(bundle.getString(key), params);
    } catch (MissingResourceException e) {
      return '!' + key + '!';
    }
  }
}
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
    return tr(getBundle(bundle), key);
  }
  
  public static String tr(ResourceBundle bundle, String key) {
    try {
      return bundle.getString(key);
    } catch (MissingResourceException e) {
      return '!' + key + '!';
    }
  }
  
  
  public static String tr(String bundle, String key, Object... params) {
    return tr(getBundle(bundle), key, params);
  }
  
  
  public static String tr(ResourceBundle bundle, String key, Object... params) {
    try {
      return MessageFormat.format(bundle.getString(key), params);
    } catch (MissingResourceException e) {
      return '!' + key + '!';
    }
  }
  
  public static String tr(String bundle, String key, Integer splitAt, Object... params) {
    return tr(getBundle(bundle), key, splitAt, params);
  }
  
  public static String tr(ResourceBundle bundle, String key, Integer splitAt, Object... params) {
    try {
      Object[] p1 = Arrays.copyOfRange(params, 0, splitAt);
      Object[] p2 = Arrays.copyOfRange(params, splitAt, params.length);
      String k1 = key.split("|")[0];
      String k2 = key.split("|")[1];
      return MessageFormat.format(bundle.getString(k1), p1) + "|" + MessageFormat.format(bundle.getString(k2), p2);
    } catch (MissingResourceException e) {
      return '!' + key + '!';
    }
  }
}
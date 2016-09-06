package de.thm.mni.mhpp11;

import java.util.Locale;
import java.util.ResourceBundle;

/**
 * Hello world!
 *
 */
public class Main {
  
  public static void main( String[] args ) {
    String language = (args.length != 2) ? "en" : args[0];
    String country = (args.length != 2) ? "US" : args[1];;

    Locale currentLocale = new Locale(language, country);
    ResourceBundle messages = ResourceBundle.getBundle("de/thm/mni/mhpp11/i18n/Default", currentLocale);

    System.out.println(messages.getString("hello_world"));
  }
}

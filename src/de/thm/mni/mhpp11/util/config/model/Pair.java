package de.thm.mni.mhpp11.util.config.model;

import javafx.beans.NamedArg;

/**
 * Created by hobbypunk on 15.09.16.
 */
public class Pair<K, V> extends javafx.util.Pair<K, V> {
  
  public Pair() {
    super(null, null);
  }
  /**
   * Creates a new pair
   *
   * @param key   The key for this pair
   * @param value The value to use for this pair
   */
  public Pair(@NamedArg("key") K key, @NamedArg("value") V value) {
    super(key, value);
  }
}

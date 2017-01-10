package de.thm.mni.mote.mode.util;

import javafx.scene.control.TreeItem;

/**
 * Created by hobbypunk on 11.10.16.
 */
public interface TreeItemConfigurer<T> {
  void call(TreeItem<T> treeItem, T value);
}

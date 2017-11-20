package de.thm.mni.mote.mode.util;

import javafx.scene.control.TreeItem;

/**
 * Created by Marcel Hoppe on 11.10.16.
 */
public interface TreeItemConfigurator<T> {
  void call(TreeItem<T> treeItem, T value);
}

package de.thm.mni.mote.mode.frontend.utilities;

import de.thm.mni.mote.mode.util.HierarchyData;
import de.thm.mni.mote.mode.util.TreeItemConfigurator;
import de.thm.mni.mote.mode.util.UpdateListener;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.collections.FXCollections;
import javafx.collections.ListChangeListener;
import javafx.collections.ObservableList;
import javafx.collections.WeakListChangeListener;
import javafx.scene.control.MultipleSelectionModel;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;
import lombok.Getter;
import lombok.Setter;
import lombok.val;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;

/**
 * This class extends the {@link TreeView} to use items as a data source.
 * <p/>
 * This allows you to treat a {@link TreeView} in a similar way as a {@link javafx.scene.control.ListView} or {@link javafx.scene.control.TableView}.
 * <p/>
 * Each item in the list must implement the {@link HierarchyData} interface, in order to map the recursive nature of the tree data to the tree view.
 * <p/>
 * Each changed in the underlying data (adding, removing, sorting) will then be automatically reflected in the UI.
 *
 * @author Christian Schudt
 */

@SuppressWarnings("MismatchedQueryAndUpdateOfCollection")
public class TreeViewWithItemsWrapper<T extends HierarchyData<T> & Comparable<T>> {
  
  /**
   * Keep hard references for each listener, so that they don'messagebus get garbage collected too soon.
   */
  private final Map<TreeItem<T>, ListChangeListener<T>> hardReferences = new HashMap<>();
  
  /**
   * Also store a reference from each tree item to its weak listeners, so that the listener can be removed, when the tree item gets removed.
   */
  private final Map<TreeItem<T>, WeakListChangeListener<T>> weakListeners = new HashMap<>();
  
  private final ObjectProperty<ObservableList<? extends T>> items = new SimpleObjectProperty<>(this, "items");
  
  @Getter @Setter private UpdateListener<T> treeItemExpandListener = null;
  @Getter @Setter private TreeItemConfigurator<T> treeItemConfigurator = null;
  
  private final TreeView<T> element;
  
  public TreeViewWithItemsWrapper() {
    this((TreeItem<T>) null);
  }
  
  /**
   * Creates the tree view.
   *
   * @param root The root tree item.
   * @see TreeView#TreeView(javafx.scene.control.TreeItem)
   */
  private TreeViewWithItemsWrapper(TreeItem<T> root) {
    this(new TreeView<>(root));
  }
  
  public TreeViewWithItemsWrapper(TreeView<T> element) {
    this.element = element;
    init();
  }
  
  
  /**
   * Initializes the tree view.
   */
  private void init() {
    rootProperty().addListener((observableValue, oldRoot, newRoot) -> {
      clear(oldRoot);
      updateItems();
    });
  
    setItems(FXCollections.observableArrayList());
    
    // Do not use ChangeListener, because it won'messagebus trigger if old list equals new list (but in fact different references).
    items.addListener(observable -> {
      clear(getRoot());
      updateItems();
    });
  }
  
  /**
   * Removes all listener from a root.
   *
   * @param root The root.
   */
  private void clear(TreeItem<T> root) {
    if (root != null) {
      for (TreeItem<T> treeItem : root.getChildren()) {
        removeRecursively(treeItem);
      }
      
      removeRecursively(root);
      root.getChildren().clear();
    }
  }
  
  /**
   * Updates the items.
   */
  private void updateItems() {
    
    if (getItems() != null) {
      for (T value : getItems()) {
        getRoot().getChildren().add(addRecursively(value));
      }
      
      ListChangeListener<T> rootListener = getListChangeListener(getRoot().getChildren());
      WeakListChangeListener<T> weakListChangeListener = new WeakListChangeListener<>(rootListener);
      hardReferences.put(getRoot(), rootListener);
      weakListeners.put(getRoot(), weakListChangeListener);
      getItems().addListener(weakListChangeListener);
    }
  }
  
  /**
   * Gets a {@link javafx.collections.ListChangeListener} for a  {@link TreeItem}. It listens to changes on the underlying list and updates the UI accordingly.
   *
   * @param treeItemChildren The associated tree item's children list.
   * @return The listener.
   */
  private ListChangeListener<T> getListChangeListener(final ObservableList<TreeItem<T>> treeItemChildren) {
    return change -> {
      while (change.next()) {
        if (change.wasUpdated()) {
          // http://javafx-jira.kenai.com/browse/RT-23434
          continue;
        }
        if (change.wasRemoved()) {
          change.getRemoved().forEach((Consumer<T>) t -> {
            TreeItem<T> ti = null;
            for (val tmp : treeItemChildren) {
              if(tmp.getValue().equals(t)) {
                ti = tmp;
                break;
              }
            }
            if(ti != null) {
              removeRecursively(ti);
              treeItemChildren.remove(ti);
            }
          });
        }
        // If items have been added
        if (change.wasAdded()) {
          // Get the new items
          change.getAddedSubList().forEach(t -> treeItemChildren.add(addRecursively(t)));
        }
        // If the list was sorted.
        if (change.wasPermutated()) {
          // Store the new order.
          Map<Integer, TreeItem<T>> tempMap = new HashMap<>();

          for (int i = change.getTo() - 1; i >= change.getFrom(); i--) {
            int a = change.getPermutation(i);
            tempMap.put(a, treeItemChildren.remove(i));
          }

          getSelectionModel().clearSelection();

          // Add the items in the new order.
          for (int i = change.getFrom(); i < change.getTo(); i++) {
            treeItemChildren.add(tempMap.remove(i));
          }
        }
      }
    };
  }
  
  /**
   * Removes the listener recursively.
   *
   * @param item The tree item.
   */
  @SuppressWarnings("UnusedReturnValue")
  private TreeItem<T> removeRecursively(TreeItem<T> item) {
    if (item.getValue() != null && item.getValue().getChildren() != null) {
      
      if (weakListeners.containsKey(item)) {
        item.getValue().getChildren().removeListener(weakListeners.remove(item));
        hardReferences.remove(item);
      }
      for (TreeItem<T> treeItem : item.getChildren()) {
        removeRecursively(treeItem);
      }
    }
    return item;
  }
  
  /**
   * Adds the children to the tree recursively.
   *
   * @param value The initial value.
   * @return The tree item.
   */
  private TreeItem<T> addRecursively(T value) {
    
    TreeItem<T> treeItem = new TreeItem<>();
    treeItem.expandedProperty().addListener((observable, oldValue, newValue) -> {
      if (newValue && treeItemExpandListener != null) treeItemExpandListener.update(value);
    });
    treeItem.setValue(value);
    if (this.treeItemConfigurator != null) this.treeItemConfigurator.call(treeItem, value);
    
    if (value != null && value.getChildren() != null) {
      ListChangeListener<T> listChangeListener = getListChangeListener(treeItem.getChildren());
      WeakListChangeListener<T> weakListener = new WeakListChangeListener<>(listChangeListener);
      value.getChildren().addListener(weakListener);
      
      hardReferences.put(treeItem, listChangeListener);
      weakListeners.put(treeItem, weakListener);
      for (T child : value.getChildren()) {
        treeItem.getChildren().add(addRecursively(child));
      }
    }
    return treeItem;
  }
  
  private ObservableList<? extends T> getItems() {
    return items.get();
  }
  
  /**
   * Sets items for the tree.
   *
   * @param items The list.
   */
  public void setItems(ObservableList<? extends T> items) {
    this.items.set(items);
  }
  
  
  private ObjectProperty<TreeItem<T>> rootProperty() {
    return this.element.rootProperty();
  }
  
  private TreeItem<T> getRoot() {
    return this.element.getRoot();
  }
  
  private MultipleSelectionModel<TreeItem<T>> getSelectionModel() {
    return this.element.getSelectionModel();
  }
}
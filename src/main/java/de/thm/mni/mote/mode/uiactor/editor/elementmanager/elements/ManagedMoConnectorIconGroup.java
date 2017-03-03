package de.thm.mni.mote.mode.uiactor.editor.elementmanager.elements;

import de.thm.mni.mote.mode.modelica.MoVariable;
import de.thm.mni.mote.mode.uiactor.control.modelica.MoVariableIconGroup;
import de.thm.mni.mote.mode.uiactor.editor.elementmanager.interfaces.Highlightable;
import de.thm.mni.mote.mode.uiactor.editor.elementmanager.interfaces.Hoverable;
import de.thm.mni.mote.mode.uiactor.editor.elementmanager.interfaces.Selectable;
import de.thm.mni.mote.mode.uiactor.editor.statemachine.elements.ModifyableMoConnectorIconGroup;
import de.thm.mni.mote.mode.util.Translator;
import javafx.collections.FXCollections;
import javafx.collections.ListChangeListener;
import javafx.collections.ObservableList;
import javafx.geometry.Bounds;
import javafx.geometry.Insets;
import javafx.geometry.Point2D;
import javafx.scene.control.Label;
import javafx.scene.effect.DropShadow;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import lombok.Getter;
import org.controlsfx.control.PopOver;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by hobbypunk on 13.02.17.
 */
public class ManagedMoConnectorIconGroup extends ModifyableMoConnectorIconGroup implements Highlightable, Hoverable, Selectable {
  
  @Getter private final ObservableList<String> highlightExtra = FXCollections.observableArrayList();
  private final Map<String, Label> entries = new HashMap<>();
  private final PopOver popOver;
  private boolean isHighlighted = false;
  
  private static final DropShadow SELECTION = new DropShadow(10., Color.RED);
  private static final DropShadow HOVER = new DropShadow(10., Color.CORAL);
  private static final DropShadow HIGHLIGHT = new DropShadow(10., Color.LIMEGREEN);
  
  static {
    SELECTION.setSpread(.8);
    HOVER.setSpread(.8);
    HIGHLIGHT.setSpread(.8);
  }
  
  public ManagedMoConnectorIconGroup(MoVariableIconGroup moParent, MoVariable variable) {
    super(moParent, variable);
    VBox content = new VBox(5.0);
    content.setPadding(new Insets(5.));
    popOver = new PopOver(content);
    popOver.setDetachable(false);
    popOver.setDetached(false);
    popOver.setAutoHide(false);
    popOver.setArrowLocation(PopOver.ArrowLocation.LEFT_CENTER);
    highlightExtra.addListener((ListChangeListener<? super String>) c -> {
      while (c.next()) {
        c.getAddedSubList().forEach(str -> {
          if (!entries.containsKey(str)) {
            Label tmp = new Label(Translator.tr("Main", str));
            entries.put(str, tmp);
            ((Pane) popOver.getContentNode()).getChildren().add(tmp);
          }
        });
        
        c.getRemoved().forEach(str -> {
          if (entries.containsKey(str)) {
            ((Pane) popOver.getContentNode()).getChildren().remove(entries.get(str));
            entries.remove(str);
          }
        });
      }
    });
  }
  
  private Point2D calcPopOverPos() {
    Bounds b = this.localToScreen(this.getBoundsInLocal());
    return new Point2D(b.getMaxX() + 2, b.getMinY() + (b.getHeight() / 2));
  }
  
  @Override
  public void enterSelection() {
    this.setEffect(SELECTION);
  }
  
  @Override
  public void leaveSelection() {
    this.setEffect(null);
  }
  
  @Override
  public void enterHover() {
    this.setEffect(HOVER);
    if (isHighlighted && !highlightExtra.isEmpty()) {
      Point2D p = calcPopOverPos();
      popOver.show(this, p.getX(), p.getY());
    }
  }
  
  @Override
  public void leaveHover() {
    this.setEffect(null);
    if (isHighlighted && !highlightExtra.isEmpty()) {
      popOver.hide();
    }
  }
  
  @Override
  public void enterHighlight() {
    isHighlighted = true;
    if (highlightExtra.isEmpty()) {
      this.setEffect(HIGHLIGHT);
    }
  }
  
  @Override
  public void leaveHighlight() {
    this.setEffect(null);
    highlightExtra.clear();
    isHighlighted = false;
  }
}

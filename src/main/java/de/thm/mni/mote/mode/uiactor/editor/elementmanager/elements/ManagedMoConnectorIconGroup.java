package de.thm.mni.mote.mode.uiactor.editor.elementmanager.elements;

import de.thm.mni.mote.mode.modelica.MoVariable;
import de.thm.mni.mote.mode.uiactor.control.modelica.MoIconGroup;
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
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Screen;
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
  private final PopOver errorPopOver;
  private final PopOver infoPopOver;
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
    errorPopOver = configuredPopOver();
    infoPopOver = configuredInfoPopOver();
    highlightExtra.addListener((ListChangeListener<? super String>) c -> {
      while (c.next()) {
        c.getAddedSubList().forEach(str -> {
          if (!entries.containsKey(str)) {
            Label tmp = new Label(Translator.tr("MoDE", "main", str));
            entries.put(str, tmp);
            ((Pane) errorPopOver.getContentNode()).getChildren().add(tmp);
          }
        });
        
        c.getRemoved().forEach(str -> {
          if (entries.containsKey(str)) {
            ((Pane) errorPopOver.getContentNode()).getChildren().remove(entries.get(str));
            entries.remove(str);
          }
        });
      }
    });
  }
  
  private PopOver configuredInfoPopOver() {
    PopOver p = configuredPopOver();
    VBox content = (VBox) p.getContentNode();
    Label name = new Label(this.getVariable().getSimpleName());
    name.setStyle("-fx-font-weight: bold");
    Label type = new Label(this.getVariable().getType().getName());
    type.setStyle("-fx-font-style: italic");
    content.getChildren().addAll(new HBox(5., new MoIconGroup(this.getMoClass().getContainer()).scaleToSize(20., 20.), name), type, new Label(this.getVariable().getComment()));
    return p;
  }
  
  private PopOver configuredPopOver() {
    VBox content = new VBox(5.0);
    content.setPadding(new Insets(5.));
    PopOver p = new PopOver(content);
    p.setDetachable(false);
    p.setDetached(false);
    p.setAutoHide(false);
    return p;
  }
  
  private void setPopOverPos(PopOver popOver) {
    Bounds b = this.localToScreen(this.getBoundsInLocal());
    Point2D p = new Point2D(b.getMaxX() + 2, b.getMinY() + (b.getHeight() / 2));
    Screen s = null;
    for (Screen tmp : Screen.getScreens()) {
      if (tmp.getBounds().contains(p)) {
        s = tmp;
        break;
      }
    }
    if (s != null) {
      if (p.getX() + 300 > s.getBounds().getMaxX()) {
        popOver.setArrowLocation(PopOver.ArrowLocation.RIGHT_CENTER);
      } else popOver.setArrowLocation(PopOver.ArrowLocation.LEFT_CENTER);
    }
    popOver.setAnchorX(p.getX());
    popOver.setAnchorY(p.getY());
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
    PopOver popOver;
    if (isHighlighted && !highlightExtra.isEmpty()) popOver = errorPopOver;
    else popOver = infoPopOver;
  
    setPopOverPos(popOver);
    popOver.show(this, 0);
  }
  
  @Override
  public void leaveHover() {
    this.setEffect(null);
    errorPopOver.hide();
    infoPopOver.hide();
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

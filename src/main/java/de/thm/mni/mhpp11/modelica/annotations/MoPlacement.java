package de.thm.mni.mhpp11.modelica.annotations;

import de.thm.mni.mhpp11.modelica.graphics.MoTransformation;
import de.thm.mni.mhpp11.modelica.interfaces.Changeable;
import de.thm.mni.mhpp11.parser.modelica.AnnotationParser.PlacementContentContext;
import de.thm.mni.mhpp11.parser.modelica.AnnotationParser.PlacementContext;
import javafx.beans.property.BooleanProperty;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.beans.property.SimpleObjectProperty;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by hobbypunk on 21.10.16.
 */

@Getter
public class MoPlacement extends MoAnnotation implements Changeable {
  @Setter private Changeable changeParent = null;
  
  private final ObjectProperty<Change> unsavedChanges = new SimpleObjectProperty<>(Change.NONE);
  
  private BooleanProperty visible = new SimpleBooleanProperty(true);
  private MoTransformation iconTransformation;
  private MoTransformation diagramTransformation;
  
  @Builder
  public MoPlacement(Boolean visible, MoTransformation iconTransformation, MoTransformation diagramTransformation) {
    if (visible != null) this.visible.setValue(visible);
    this.iconTransformation = iconTransformation;
    this.diagramTransformation = diagramTransformation;
    initListeners();
  }
  
  private void initListeners() {
    initChangeListener();
    
    this.visible.addListener((observable, oldValue, newValue) -> changed());
    if (iconTransformation != null) this.iconTransformation.setChangeParent(this);
    if (diagramTransformation != null) this.diagramTransformation.setChangeParent(this);
  }
  
  @Override
  public List<Changeable> getChangeChildren() {
    List<Changeable> list = new ArrayList<>();
    if (this.iconTransformation != null) list.add(this.iconTransformation);
    if (this.diagramTransformation != null) list.add(this.diagramTransformation);
    return list;
  }
  
  @Override
  public String toString() {
    if (getIconTransformation() != null)
      return String.format("Placement(visible = %b, %s, %s)", visible.get(), getDiagramTransformation().toString(false), getIconTransformation().toString(true));
    else
      return String.format("Placement(visible = %b, %s)", visible.get(), getDiagramTransformation().toString(false));
  }
  
  public static MoPlacement parse(PlacementContext placement) {
    MoPlacementBuilder mb = builder();
    for (PlacementContentContext pcc : placement.placementContent()) {
      if (pcc.visible() != null) mb.visible(Boolean.parseBoolean(pcc.visible().val.getText()));
      else if (pcc.iconTransformation() != null) mb.iconTransformation(MoTransformation.parse(pcc.iconTransformation().val));
      else if (pcc.diagramTransformation() != null) mb.diagramTransformation(MoTransformation.parse(pcc.diagramTransformation().val));
    }
    return mb.build();
  }
  
}

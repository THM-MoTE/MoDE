package de.thm.mni.mhpp11.parser.models.annotations;

import de.thm.mni.mhpp11.parser.modelica.AnnotationParser.PlacementContentContext;
import de.thm.mni.mhpp11.parser.modelica.AnnotationParser.PlacementContext;
import de.thm.mni.mhpp11.parser.models.graphics.MoTransformation;
import de.thm.mni.mhpp11.parser.models.interfaces.Changeable;
import javafx.beans.property.BooleanProperty;
import javafx.beans.property.SimpleBooleanProperty;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by hobbypunk on 21.10.16.
 */

@Getter
public class MoPlacement extends MoAnnotation implements Changeable {
  
  @Setter private ChangeListener internalChangeListener = null;
  
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
  
  @Override
  public void updateChangeListeners(ChangeListener changeListener) {
    if (this.iconTransformation != null) this.iconTransformation.setChangeListener(changeListener);
    if (this.diagramTransformation != null) this.diagramTransformation.setChangeListener(changeListener);
  }
  
  private void initListeners() {
    this.visible.addListener((observable, oldValue, newValue) -> changed());
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

package de.thm.mni.mhpp11.util.parser.models.annotations;

import de.thm.mni.mhpp11.parser.modelica.AnnotationParser.PlacementContentContext;
import de.thm.mni.mhpp11.parser.modelica.AnnotationParser.PlacementContext;
import de.thm.mni.mhpp11.util.parser.models.graphics.MoTransformation;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

/**
 * Created by hobbypunk on 21.10.16.
 */

@Getter
@Builder
@AllArgsConstructor
public class MoPlacement extends MoAnnotation {
  
  private Boolean visible = true;
  private MoTransformation iconTransformation;
  private MoTransformation diagramTransformation;
  
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

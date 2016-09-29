package de.thm.mni.mhpp11.util.parser.models.annotations;

import de.thm.mni.mhpp11.util.parser.OMCompiler;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

/**
 * Created by hobbypunk on 28.09.16.
 */
@Getter
@AllArgsConstructor
@Builder
public class MoDocumentation extends MoAnnotation {
  
  private String documentation;
  
  
  public static MoDocumentation parse(OMCompiler omc, String name) {
    MoDocumentationBuilder mb = builder();
    mb.documentation(omc.getDocumentation(name));
    return mb.build();
  }
}

package de.thm.mni.mote.mode.modelica.annotations;

import de.thm.mni.mote.mode.backend.omc.OMCompiler;
import de.thm.mni.mote.mode.parser.modelica.AnnotationParser.DocumentationContentContext;
import de.thm.mni.mote.mode.parser.modelica.AnnotationParser.DocumentationContext;
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
  private String revisions;
  
  public static MoDocumentation parse(OMCompiler omc, DocumentationContext documentation) {
    MoDocumentationBuilder mb = builder();
    for (DocumentationContentContext dcc : documentation.documentationContent()) {
      if (dcc.info() != null)
        mb.documentation(dcc.info().val.getText());
      if (dcc.revisions() != null) mb.revisions(dcc.revisions().val.getText());
      
    }
    return mb.build();
  }
}

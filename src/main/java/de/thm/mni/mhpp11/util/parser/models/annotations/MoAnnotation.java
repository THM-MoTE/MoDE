package de.thm.mni.mhpp11.util.parser.models.annotations;

import de.thm.mni.mhpp11.parser.modelica.AnnotationLexer;
import de.thm.mni.mhpp11.parser.modelica.AnnotationParser;
import de.thm.mni.mhpp11.parser.modelica.AnnotationParser.AnnotationContext;
import de.thm.mni.mhpp11.parser.modelica.AnnotationParser.AnnotationElementContext;
import de.thm.mni.mhpp11.util.parser.OMCompiler;
import de.thm.mni.mhpp11.util.parser.models.MoClass;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.List;

/**
 * Created by hobbypunk on 16.09.16.
 */
public class MoAnnotation {
  public static void parse(OMCompiler omc, MoClass that) {
    List<String> annotations = omc.getAnnotationStrings(that.getName());
    ANTLRInputStream is;
    AnnotationParser p;
    for (String annotation : annotations) {
      try {
        System.out.println(annotation);
        is = new ANTLRInputStream(new ByteArrayInputStream(annotation.getBytes()));
        p = new AnnotationParser(new CommonTokenStream(new AnnotationLexer(is)));
        AnnotationContext a = p.annotation();
        for (AnnotationElementContext elem : a.annotationElement()) {
          if (elem.documentation() != null) {
            that.setDocumentation(MoDocumentation.parse(omc, elem.documentation()));
          } else if (elem.icon() != null) {
            that.setIcon(MoIcon.parse(omc, elem.icon()));
          }
        }
      } catch (IOException e) {
        e.printStackTrace();
      }
    }
  }
}

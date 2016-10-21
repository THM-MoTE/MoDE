package de.thm.mni.mhpp11.util.parser.models.annotations;

import de.thm.mni.mhpp11.parser.modelica.AnnotationLexer;
import de.thm.mni.mhpp11.parser.modelica.AnnotationParser;
import de.thm.mni.mhpp11.parser.modelica.AnnotationParser.AnnotationContext;
import de.thm.mni.mhpp11.parser.modelica.AnnotationParser.AnnotationElementContext;
import de.thm.mni.mhpp11.util.parser.OMCompiler;
import de.thm.mni.mhpp11.util.parser.models.interfaces.MoElement;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.List;

/**
 * Created by hobbypunk on 16.09.16.
 */
public class MoAnnotation {
  public static void parse(OMCompiler omc, MoElement that) {
    MoAnnotation.parse(omc, that, omc.getAnnotationStrings(that.getName()));
    
  }
  
  public static void parse(OMCompiler omc, MoElement that, List<String> annotations) {
    for (String annotation : annotations) {
      MoAnnotation.parse(omc, that, annotation);
    }
  }
  
  public static void parse(OMCompiler omc, MoElement that, String annotation) {
    ANTLRInputStream is;
    AnnotationParser p;
    try {
      is = new ANTLRInputStream(new ByteArrayInputStream(annotation.getBytes()));
      p = new AnnotationParser(new CommonTokenStream(new AnnotationLexer(is)));
      AnnotationContext a = p.annotation();
      for (AnnotationElementContext elem : a.annotationElement()) {
        if (elem.documentation() != null) {
          that.getAnnotations().add(MoDocumentation.parse(omc, elem.documentation()));
        } else if (elem.icon() != null) {
          that.getAnnotations().add(MoIcon.parse(omc, elem.icon()));
        } else if (elem.placement() != null) {
          that.getAnnotations().add(MoPlacement.parse(elem.placement()));
        }
      }
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}

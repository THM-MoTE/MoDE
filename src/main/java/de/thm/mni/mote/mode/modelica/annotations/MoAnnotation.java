package de.thm.mni.mote.mode.modelica.annotations;

import de.thm.mni.mote.mode.modelica.interfaces.MoElement;
import de.thm.mni.mote.mode.parser.OMCompiler;
import de.thm.mni.mote.mode.parser.modelica.AnnotationLexer;
import de.thm.mni.mote.mode.parser.modelica.AnnotationParser;
import de.thm.mni.mote.mode.parser.modelica.AnnotationParser.AnnotationElementContext;
import de.thm.mni.mote.mode.util.ImmutableListCollector;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by hobbypunk on 16.09.16.
 */
public abstract class MoAnnotation {
  
  public static List<MoAnnotation> parse(OMCompiler omc, MoElement parent) {
    return MoAnnotation.parse(omc, omc.getAnnotationStrings(parent.getName()));
  }
  
  public static List<MoAnnotation> parse(OMCompiler omc, List<String> annotations) {
    List<MoAnnotation> list = new ArrayList<>();
    for (String annotation : annotations) {
      list.addAll(MoAnnotation.parse(omc, annotation));
    }
    return list.stream().filter(annotation -> annotation != null).collect(ImmutableListCollector.toImmutableList());
  }
  
  public static List<MoAnnotation> parse(OMCompiler omc, String annotation) {
    List<MoAnnotation> list = new ArrayList<>();
    ANTLRInputStream is;
    AnnotationParser p;
    try {
      is = new ANTLRInputStream(new ByteArrayInputStream(annotation.getBytes()));
      p = new AnnotationParser(new CommonTokenStream(new AnnotationLexer(is)));
      for (AnnotationElementContext elem : p.annotation().annotationElement()) {
        if (elem.documentation() != null) {
          list.add(MoDocumentation.parse(omc, elem.documentation()));
        } else if (elem.icon() != null) {
          list.add(MoIcon.parse(omc, elem.icon()));
        } else if (elem.diagram() != null) {
          list.add(MoDiagram.parse(omc, elem.diagram()));
        } else if (elem.placement() != null) {
          list.add(MoPlacement.parse(elem.placement()));
        }
      }
    } catch (IOException e) {
      e.printStackTrace();
    }
    return list;
  }
  
  public static String toString(List<MoAnnotation> annotations) {
    String str = "";
    for (MoAnnotation moAnnotation : annotations) {
      str += ((str.isEmpty()) ? "" : ",") + moAnnotation.toString();
    }
    
    return str;
  }
}

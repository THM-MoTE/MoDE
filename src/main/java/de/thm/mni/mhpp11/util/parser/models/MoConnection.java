package de.thm.mni.mhpp11.util.parser.models;

import de.thm.mni.mhpp11.control.icon.MoDiagramGroup;
import de.thm.mni.mhpp11.parser.modelica.AnnotationLexer;
import de.thm.mni.mhpp11.parser.modelica.AnnotationParser;
import de.thm.mni.mhpp11.parser.modelica.AnnotationParser.ConnectAnnotationElementContext;
import de.thm.mni.mhpp11.util.ImmutableListCollector;
import de.thm.mni.mhpp11.util.parser.OMCompiler;
import de.thm.mni.mhpp11.util.parser.models.graphics.MoGraphic;
import de.thm.mni.mhpp11.util.parser.models.graphics.MoLine;
import de.thm.mni.mhpp11.util.parser.models.graphics.MoText;
import lombok.Builder;
import lombok.Getter;
import lombok.NonNull;
import lombok.Singular;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.*;

/**
 * Created by hobbypunk on 01.11.16.
 */
@Getter
public class MoConnection {
  private final MoClass parent;
  private final List<MoVariable> from;
  private final List<MoVariable> to;
  
  private final List<MoGraphic> moGraphics = new ArrayList<>();
  
  @Builder
  private MoConnection(@NonNull MoClass parent, @NonNull List<MoVariable> from, @NonNull List<MoVariable> to, @Singular List<MoGraphic> graphics) {
    this.parent = parent;
    this.from = from;
    this.to = to;
    if (graphics != null) this.moGraphics.addAll(graphics);
  }
  
  public MoLine getLine() {
    for (MoGraphic g : moGraphics)
      if (g instanceof MoLine) return (MoLine) g;
    
    return null;
  }
  
  public boolean fromContains(MoVariable var) {
    return contains(var, from);
  }
  
  public boolean toContains(MoVariable var) {
    return contains(var, to);
  }
  
  private boolean contains(MoVariable var, List<MoVariable> list) {
    for (MoVariable mv : list) if (mv.equals(var)) return true;
    return false;
  }
  
  public boolean contains(MoVariable var) {
    return fromContains(var) || toContains(var);
  }
  
  
  @Override
  public String toString() {
    return String.format("c > %s - %s", from, to);
  }
  
  public static List<MoConnection> parse(OMCompiler omc, MoClass parent) {
    return omc.getConnections(parent.getName()).stream().map(map -> parse(parent, map)).collect(ImmutableListCollector.toImmutableList());
  }
  
  public static MoConnection parse(MoClass parent, Map<String, String> values) {
    MoConnectionBuilder mb = builder();
    mb.parent(parent);
    mb.from(findVariable(parent, values.get("from")));
    mb.to(findVariable(parent, values.get("to")));
    if (values.containsKey("annotation")) MoConnection.parse(mb, values.get("annotation"));
    return mb.build();
  }
  
  private static void parse(MoConnectionBuilder mb, String annotation) {
    ANTLRInputStream is;
    AnnotationParser p;
    try {
      is = new ANTLRInputStream(new ByteArrayInputStream(annotation.getBytes()));
      p = new AnnotationParser(new CommonTokenStream(new AnnotationLexer(is)));
      for (ConnectAnnotationElementContext elem : p.connectAnnotation().connectAnnotationElement()) {
        if (elem.line() != null) mb.graphic(MoLine.parse(elem.line()));
        if (elem.text() != null) mb.graphic(MoText.parse(elem.text()));
      }
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
  
  private static List<MoVariable> findVariable(MoClass parent, String name) {
    List<MoVariable> list = new ArrayList<>();
    Optional<MoVariable> moVariable = parent.getVariables().stream().filter(mv -> name.startsWith(mv.getName())).findFirst();
    if (moVariable.isPresent()) {
      MoVariable mv = moVariable.get();
      list.add(mv);
      if (!name.endsWith(mv.getName()))
        list.addAll(findVariable(mv.getType(), name.replaceFirst(mv.getName() + "\\.", "")));
    }
    if (list.isEmpty()) throw new NoSuchElementException();
    return list;
  }
  
  public Integer getVariablePos(MoDiagramGroup diagram, MoVariable variable) {
    
    return null;
  }
}

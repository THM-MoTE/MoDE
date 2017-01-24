package de.thm.mni.mote.mode.modelica;

import de.thm.mni.mote.mode.modelica.graphics.MoGraphic;
import de.thm.mni.mote.mode.modelica.graphics.MoLine;
import de.thm.mni.mote.mode.modelica.graphics.MoText;
import de.thm.mni.mote.mode.modelica.interfaces.Changeable;
import de.thm.mni.mote.mode.omcactor.OMCompiler;
import de.thm.mni.mote.mode.parser.modelica.AnnotationLexer;
import de.thm.mni.mote.mode.parser.modelica.AnnotationParser;
import de.thm.mni.mote.mode.parser.modelica.AnnotationParser.ConnectAnnotationElementContext;
import de.thm.mni.mote.mode.uiactor.control.modelica.MoDiagramGroup;
import de.thm.mni.mote.mode.util.ImmutableListCollector;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
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
public class MoConnection implements Changeable {
  private final ObjectProperty<Change> unsavedChanges = new SimpleObjectProperty<>(Change.NONE);
  
  private final MoClass parent;
  private final List<MoVariable> from = new ArrayList<>();
  private final List<MoVariable> to = new ArrayList<>();
  
  private final ObservableList<MoGraphic> moGraphics = FXCollections.observableArrayList();
  
  @Builder
  public MoConnection(@NonNull MoClass parent, @NonNull List<MoVariable> from, @NonNull List<MoVariable> to, @Singular List<MoGraphic> graphics) {
    this.parent = parent;
    this.from.addAll(from);
    this.to.addAll(to);
    if (graphics != null) this.moGraphics.addAll(graphics);
    this.moGraphics.forEach(mg -> mg.setChangeParent(this));
    initChangeListener();
  }
  
  @Override
  public Changeable getChangeParent() {
    return getParent();
  }
  
  @Override
  public List<Changeable> getChangeChildren() {
    return new ArrayList<>(this.getMoGraphics());
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
  
  public String getIndicator() {
    StringBuilder sb = new StringBuilder("connect(");
    Boolean first = true;
    for (MoVariable mv : from) {
      if (first) first = false;
      else sb.append('.');
      sb.append(mv.getName());
    }
    sb.append(',');
    first = true;
    for (MoVariable mv : to) {
      if (first) first = false;
      else sb.append('.');
      sb.append(mv.getName());
    }
    sb.append(")");
    
    return sb.toString();
  }
  
  @Override
  public String toString() {
    return getIndicator() + " " + MoGraphic.toString(moGraphics) + ";";
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

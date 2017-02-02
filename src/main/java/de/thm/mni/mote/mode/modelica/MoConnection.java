package de.thm.mni.mote.mode.modelica;

import de.thm.mni.mhpp11.jActor.actors.logging.messages.ErrorMessage;
import de.thm.mni.mhpp11.jActor.actors.messagebus.MessageBus;
import de.thm.mni.mote.mode.modelica.graphics.MoGraphic;
import de.thm.mni.mote.mode.modelica.graphics.MoLine;
import de.thm.mni.mote.mode.modelica.graphics.MoText;
import de.thm.mni.mote.mode.modelica.interfaces.Changeable;
import de.thm.mni.mote.mode.omcactor.OMCompiler;
import de.thm.mni.mote.mode.parser.ParserException;
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

import static de.thm.mni.mote.mode.util.Translator.tr;

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
  
  String getIndicator() {
    return "connect(" + getVariablePath(from) + ',' + getVariablePath(to) + ")";
  }
  
  private String getVariablePath(List<MoVariable> list) {
    StringBuilder sb = new StringBuilder();
    list.forEach(mv -> {
      if (!sb.toString().isEmpty()) sb.append('.');
      sb.append(mv.getName());
    });
    return sb.toString();
  }
  
  @Override
  public String toString() {
    return getIndicator() + " " + MoGraphic.toString(moGraphics) + ";";
  }
  
  public static List<MoConnection> parse(OMCompiler omc, MoClass parent) {
    return omc.getConnections(parent.getName(), parent.getClassInformation()).stream().map(map -> {
      try {
        return parse(parent, map);
      } catch (ParserException e) {
        MessageBus.getInstance().send(new ErrorMessage(MoConnection.class, omc.getGroup(), e));
        return null;
      }
    }).filter(Objects::nonNull).collect(ImmutableListCollector.toImmutableList());
  }
  
  public static MoConnection parse(MoClass parent, Map<String, String> values) throws ParserException {
    try {
      MoConnectionBuilder mb = builder();
      mb.parent(parent);
      mb.from(findVariable(parent, values.get("from")));
      mb.to(findVariable(parent, values.get("to")));
      if (values.containsKey("annotation")) MoConnection.parse(mb, values.get("annotation"));
      return mb.build();
    } catch (Exception e) {
      throw new ParserException(tr("Error", "error.modelica.error_in", parent.getSimpleName()), e);
    }
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
  
  private static List<MoVariable> findVariable(MoClass parent, String name) throws ParserException {
    List<MoVariable> list = new ArrayList<>();
    Optional<MoVariable> moVariable = parent.getVariables().stream().filter(mv -> name.startsWith(mv.getName())).findFirst();
    if (moVariable.isPresent()) {
      MoVariable mv = moVariable.get();
      if (mv.getType() == null) throw new NoSuchElementException(tr("Error", "error.modelica.variable_has_null_type", name));
      list.add(mv);
      if (!name.endsWith(mv.getName()))
        list.addAll(findVariable(mv.getType().getElement(), name.replaceFirst(mv.getName() + "\\.", "")));
    }
    if (list.isEmpty()) throw new NoSuchElementException(tr("Error", "error.modelica.cant_find_variable", name));
    return list;
  }
  
  public Integer getVariablePos(MoDiagramGroup diagram, MoVariable variable) {
    
    return null;
  }
}

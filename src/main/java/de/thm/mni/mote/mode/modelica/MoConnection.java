package de.thm.mni.mote.mode.modelica;

import de.thm.mni.mhpp11.smbj.logging.messages.ErrorMessage;
import de.thm.mni.mhpp11.smbj.manager.ActorManager;
import de.thm.mni.mote.mode.backend.omc.OMCompiler;
import de.thm.mni.mote.mode.modelica.graphics.MoGraphic;
import de.thm.mni.mote.mode.modelica.graphics.MoLine;
import de.thm.mni.mote.mode.modelica.graphics.MoText;
import de.thm.mni.mote.mode.modelica.interfaces.Changeable;
import de.thm.mni.mote.mode.parser.ParserException;
import de.thm.mni.mote.mode.parser.modelica.AnnotationLexer;
import de.thm.mni.mote.mode.parser.modelica.AnnotationParser;
import de.thm.mni.mote.mode.parser.modelica.AnnotationParser.ConnectAnnotationElementContext;
import de.thm.mni.mote.mode.util.ImmutableListCollector;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Point2D;
import lombok.*;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.*;

import static de.thm.mni.mote.mode.util.Translator.tr;

/**
 * Created by Marcel Hoppe on 01.11.16.
 */
@Value
@EqualsAndHashCode(exclude = {"parent"})
public class MoConnection implements Changeable {
  ObjectProperty<Change> unsavedChanges = new SimpleObjectProperty<>(Change.NONE);
  
  MoClass parent;
  List<MoVariable> from = new ArrayList<>();
  List<MoVariable> to = new ArrayList<>();
  
  ObservableList<MoGraphic> moGraphics = FXCollections.observableArrayList();
  
  //TODO: is there a better solution?
  ObjectProperty<Point2D> startPointProperty;
  ObjectProperty<Point2D> endPointProperty;
  
  @Builder
  public MoConnection(@NonNull MoClass parent, @NonNull List<MoVariable> from, @NonNull List<MoVariable> to, @Singular List<MoGraphic> graphics) {
    this.parent = parent;
    this.from.addAll(from);
    this.to.addAll(to);
    if (graphics != null) this.moGraphics.addAll(graphics);
    
    this.startPointProperty =  this.getLine().getFirstPointProperty();
    this.endPointProperty = this.getLine().getLastPointProperty();
    
    init();
  }
  
  private void init() {
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
  
  private boolean fromContains(List<MoVariable> list) {
    return contains(list, from);
  }
  
  public boolean toContains(MoVariable var) {
    return contains(var, to);
  }
  
  private boolean toContains(List<MoVariable> list) {
    return contains(list, to);
  }
  
  private boolean contains(MoVariable var, List<MoVariable> list) {
    return list.contains(var);
  }
  
  private boolean contains(List<MoVariable> list, List<MoVariable> list2) {
    return list2.containsAll(list) && list.containsAll(list2);
  }
  
  public boolean contains(List<MoVariable> list) {
    return fromContains(list) || toContains(list);
  }
  
  public boolean contains(MoVariable var) {
    return fromContains(var) || toContains(var);
  }
  
  public String getRegex() {
    return String.format("connect\\s*\\(\\s*%s\\s*,\\s*%s\\s*\\)", getVariablePath(from), getVariablePath(to));
  }
  
  private String getIndicator() {
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
        ActorManager.getInstance().send(new ErrorMessage(MoConnection.class, omc.getID(), e));
        return null;
      }
    }).filter(Objects::nonNull).collect(ImmutableListCollector.toImmutableList());
  }
  
  private static MoConnection parse(MoClass parent, Map<String, String> values) throws ParserException {
    try {
      MoConnectionBuilder mb = builder();
      mb.parent(parent);
      mb.from(findVariable(parent, values.get("from")));
      mb.to(findVariable(parent, values.get("to")));
      if (values.containsKey("annotation"))
        MoConnection.parse(mb, values.get("annotation"));
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
  
  private static List<MoVariable> findVariable(MoClass parent, String name) {
    List<MoVariable> list = new ArrayList<>();
    Optional<MoVariable> moVariable = parent.getVariables().stream().filter(mv -> name.startsWith(mv.getName())).findFirst();
    moVariable.ifPresent(moVariable1 -> {
      if (moVariable1.getType() == null) throw new NoSuchElementException(tr("Error", "error.modelica.variable_has_null_type", name));
      list.add(moVariable1);
      if (!name.endsWith(moVariable1.getName()))
        list.addAll(findVariable(moVariable1.getType().getElement(), name.replaceFirst(moVariable1.getName() + "\\.", "")));
    });
    if (list.isEmpty()) throw new NoSuchElementException(tr("Error", "error.modelica.cant_find_variable", name));
    return list;
  }
}

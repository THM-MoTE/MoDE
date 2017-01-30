package de.thm.mni.mote.mode.modelica;

import de.thm.mni.mote.mode.modelica.annotations.MoAnnotation;
import de.thm.mni.mote.mode.modelica.annotations.MoDiagram;
import de.thm.mni.mote.mode.modelica.annotations.MoDocumentation;
import de.thm.mni.mote.mode.modelica.annotations.MoIcon;
import de.thm.mni.mote.mode.modelica.graphics.MoCoordinateSystem;
import de.thm.mni.mote.mode.modelica.graphics.MoDefaults;
import de.thm.mni.mote.mode.modelica.interfaces.Changeable;
import de.thm.mni.mote.mode.modelica.interfaces.MoElement;
import de.thm.mni.mote.mode.omcactor.OMCompiler;
import de.thm.mni.mote.mode.parser.ParserException;
import de.thm.mni.mote.mode.util.ImmutableListCollector;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.NoSuchElementException;

import static de.thm.mni.mote.mode.util.Translator.tr;

/**
 * Created by hobbypunk on 07.09.16.
 */
@Getter
public class MoClass extends MoElement implements Changeable, Comparable<MoClass> {
  
  @Getter private static final List<MoContainer> bases;
  
  static {
    bases = new ArrayList<>();
    bases.add(new MoContainer(null, null, "Real").setElement(new MoClass()));
    bases.add(new MoContainer(null, null, "Boolean").setElement(new MoClass()));
    bases.add(new MoContainer(null, null, "Integer").setElement(new MoClass()));
    bases.add(new MoContainer(null, null, "String").setElement(new MoClass()));
    bases.add(new MoContainer(null, null, "Enum").setElement(new MoClass()));
  }
  
  private ClassInformation classInformation;
  @Setter(AccessLevel.PACKAGE) private MoContainer container = null;
  private final ObjectProperty<Change> unsavedChanges = new SimpleObjectProperty<>(Change.NONE);
  private Boolean complete = false;
  
  
  private final ObservableList<MoVariable> variables = FXCollections.observableArrayList();
  @Getter(value = AccessLevel.PROTECTED) private final List<MoVariable> deletedVariables = new ArrayList<>();
  
  private final ObservableList<MoConnection> connections = FXCollections.observableArrayList();
  @Getter(value = AccessLevel.PROTECTED) private final List<MoConnection> deletedConnections = new ArrayList<>();
  
  
  MoClass() {
    this("b", "");
  }
  
  MoClass(String prefix, String comment) {
    super(prefix, comment);
  }
  
  MoClass(ClassInformation classInformation, @NonNull MoLater that) {
    super("c", "");
    this.classInformation = classInformation;
    this.container = that.getContainer();
    if (!(this instanceof MoLater)) initChangeListener();
  }
  
  @Override
  public Changeable getChangeParent() {
    return null;
  }
  
  @Override
  public List<Changeable> getChangeChildren() {
    List<Changeable> list = new ArrayList<>();
    list.addAll(this.variables);
    list.addAll(this.connections);
    return list;
  }
  
  public MoVariable findVariable(String name) throws NoSuchElementException {
    for (MoVariable mv : getVariables())
      if (mv.getName().equals(name)) return mv;
    throw new NoSuchElementException(tr("Error", "error.cant.find.variable", name));
  }
  
  public ObservableList<MoVariable> getVariables() {
  
    this.container.getInheritedClasses().forEach(inheritedClass -> {
        inheritedClass.getElement().getVariables().forEach(variable -> {
          if (!this.variables.contains(variable)) this.variables.add(variable);
        });
    });
    
    return this.variables;
  }
  
  public void addVariable(MoVariable variable) {
    this.variables.add(variable);
    variable.getUnsavedChanges().set(Change.NEW);
  }
  
  private void addAllVariables(List<MoVariable> variables) {
    this.variables.addAll(variables);
  }
  
  public void removeVariable(MoVariable variable) {
    for (MoConnection connection : variable.getConnections()) {
      this.removeConnection(connection);
    }
    this.variables.remove(variable);
    variable.getUnsavedChanges().set(Change.DELETE);
    this.deletedVariables.add(variable);
  }
  
  
  public ObservableList<MoConnection> getConnections() {
    this.container.getInheritedClasses().forEach(inheritedClass -> {
      inheritedClass.getElement().getConnections().forEach(connection -> {
        if (!this.connections.contains(connection)) this.connections.add(connection);
      });
    });
    return this.connections;
  }
  
  public void addConnection(MoConnection connection) {
    this.connections.add(connection);
    connection.getUnsavedChanges().set(Change.NEW);
  }
  
  public void removeConnection(MoConnection connection) {
    this.connections.remove(connection);
    connection.getUnsavedChanges().set(Change.DELETE);
    this.deletedConnections.add(connection);
  }
  
  private void addAllConnections(List<MoConnection> connections) {
    this.connections.addAll(connections);
  }
  
  
  public Boolean hasConnectors() throws ParserException {
    for (MoVariable mv : getVariables())
      if (mv.getType().getElement() instanceof MoConnector) return true;
    return false;
  }
  
  public List<MoVariable> getConnectorVariables() {
    return getVariables().stream().filter(moVariable -> moVariable.getType().getElement() instanceof MoConnector).collect(ImmutableListCollector.toImmutableList());
  }
  
  public List<MoAnnotation> getAnnotations() {
    List<MoAnnotation> annotations = new ArrayList<>();
    annotations.addAll(super.getAnnotations());
    this.container.getInheritedClasses().forEach(inheritedClass -> annotations.addAll(0, inheritedClass.getElement().getAnnotations()));
    
    return Collections.unmodifiableList(annotations);
  }
  
  public List<MoDocumentation> getDocumentations() {
    return getAnnotations().stream().filter(annotation -> annotation instanceof MoDocumentation).map(annotation -> (MoDocumentation) annotation).collect(ImmutableListCollector.toImmutableList());
  }
  
  public MoIcon getIcon() {
    MoIcon mi = getInternalIcon();
    if (mi != null) return mi;
    if (this instanceof MoPackage) return MoDefaults.newPackage();
    if (this instanceof MoModel) return MoDefaults.newModel();
    if (this instanceof MoFunction) return MoDefaults.newFunction();
    else {
      System.out.println(this.getClass().getSimpleName() + ": " + this.container.getName());
      return MoDefaults.newEmpty();
    }
  }
  
  public boolean hasIcon() {
    return (getInternalIcon() != null);
  }
  
  public MoCoordinateSystem getIconCoordinateSystem() {
    if (this.getIcon() != null && this.getIcon().getMoCoordinateSystem() != null)
      return this.getIcon().getMoCoordinateSystem();
    return new MoCoordinateSystem();
  }
  
  public boolean hasDiagram() {
    return !getVariables().isEmpty() || getDiagram() != null;
  }
  
  public MoDiagram getDiagram() {
    for (MoAnnotation ma : getAnnotations())
      if (ma instanceof MoDiagram)
        return (MoDiagram) ma;
    
    return null;
  }
  
  public MoCoordinateSystem getDiagramCoordinateSystem() {
    if (this.getDiagram() != null && this.getDiagram().getMoCoordinateSystem() != null)
      return this.getDiagram().getMoCoordinateSystem();
    return new MoCoordinateSystem();
  }
  
  private MoIcon getInternalIcon() {
    MoIcon mi = null;
    for (MoAnnotation ma : getAnnotations()) {
      if (ma instanceof MoIcon && !(ma instanceof MoDiagram)) {
        if (mi == null) mi = ((MoIcon) ma).copy();
        else mi.getMoGraphics().addAll(((MoIcon) ma).getMoGraphics());
      }
    }
    
    return mi;
  }
  
  
  static MoClass parse(@NonNull OMCompiler omc, MoLater that) throws ParserException {
    ClassInformation ci = omc.getClassInformation(that.getName());
    MoClass tmp = null;
    switch (ci.getType()) {
      case PACKAGE:
        tmp = new MoPackage(ci, that);
        break;
      case MODEL:
        tmp = new MoModel(ci, that);
        break;
      case CLASS:
        tmp = new MoClass(ci, that);
        break;
      case CONNECTOR:
        tmp = new MoConnector(ci, that);
        break;
    }
  
    if (tmp == null) throw new ParserException(tr("Error", "error.cant.parse", ci.getType()));

    tmp.parseExtra(omc);
    return tmp;
  }
  
  private void parseExtra(@NonNull OMCompiler omc) throws ParserException {
    if (complete) return;
    List<String> list = omc.getInheritedClasses(this.container.getName());
    Boolean classFound;
    for (String s : list) {
      classFound = false;
      for (MoContainer mc : bases) {
        MoContainer p = mc.find(s);
        if (p != null) {
          this.container.getInheritedClasses().add(p);
          classFound = true;
          break;
        }
      }
      if (!classFound) throw new ParserException(tr("Error", "error.cant.find.package", s));
    }
  
    this.addAllAnnotations(MoAnnotation.parse(omc, this));
    this.addAllVariables(MoVariable.parse(omc, this));
    this.addAllConnections(MoConnection.parse(omc, this));
    complete = true;
  }
  
  static MoContainer findClass(String s) {
    MoContainer container;
    for (MoContainer c : bases) {
      container = c.find(s);
      if (container != null) return container;
    }
    return null;
  }
  
  @Override
  public int compareTo(MoClass that) {
    return this.getName().compareTo(that.getName());
  }
  
  @Override
  public String getName() {
    return this.getContainer().getName();
  }
  
  @Override
  public String getSimpleName() {
    return this.getContainer().getSimpleName();
  }
}

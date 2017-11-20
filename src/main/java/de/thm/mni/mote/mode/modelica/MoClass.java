package de.thm.mni.mote.mode.modelica;

import de.thm.mni.mote.mode.backend.omc.OMCompiler;
import de.thm.mni.mote.mode.modelica.annotations.MoAnnotation;
import de.thm.mni.mote.mode.modelica.annotations.MoDiagram;
import de.thm.mni.mote.mode.modelica.annotations.MoDocumentation;
import de.thm.mni.mote.mode.modelica.annotations.MoIcon;
import de.thm.mni.mote.mode.modelica.graphics.MoCoordinateSystem;
import de.thm.mni.mote.mode.modelica.graphics.MoDefaults;
import de.thm.mni.mote.mode.modelica.interfaces.Changeable;
import de.thm.mni.mote.mode.modelica.interfaces.MoElement;
import de.thm.mni.mote.mode.parser.ParserException;
import de.thm.mni.mote.mode.util.ImmutableListCollector;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import lombok.*;
import lombok.experimental.FieldDefaults;
import lombok.experimental.NonFinal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.NoSuchElementException;

import static de.thm.mni.mote.mode.util.Translator.tr;

/**
 * Created by hobbypunk on 07.09.16.
 */
@SuppressWarnings("MismatchedQueryAndUpdateOfCollection")
@Data
@Getter
@EqualsAndHashCode(callSuper = true)
@FieldDefaults(makeFinal = true)
public class MoClass extends MoElement implements Changeable, Comparable<MoClass> {
  ObjectProperty<Change> unsavedChanges = new SimpleObjectProperty<>(Change.NONE);
  
  @Getter static List<MoContainer> bases;
  
  static {
    bases = new ArrayList<>();
    bases.add(new MoContainer(null, null, "Real").setElement(new MoClass()));
    bases.add(new MoContainer(null, null, "Boolean").setElement(new MoClass()));
    bases.add(new MoContainer(null, null, "Integer").setElement(new MoClass()));
    bases.add(new MoContainer(null, null, "String").setElement(new MoClass()));
    bases.add(new MoContainer(null, null, "Enum").setElement(new MoClass()));
  }
  
  @Setter(value = AccessLevel.PRIVATE) @NonFinal ClassInformation classInformation;
  @NonFinal MoContainer container;
  @Setter(value = AccessLevel.PRIVATE) @NonFinal Boolean complete = false;
  
  
  ObservableList<MoVariable> variables = FXCollections.observableArrayList();
  List<MoVariable> deletedVariables = new ArrayList<>();
  
  ObservableList<MoConnection> connections = FXCollections.observableArrayList();
  List<MoConnection> deletedConnections = new ArrayList<>();
  
  
  private MoClass() {
    this("b", "");
  }
  
  protected MoClass(String prefix, String comment) {
    super(prefix, comment);
    this.container = null;
  }
  
  protected MoClass(ClassInformation classInformation, @NonNull MoLater that) {
    super("c", "");
    this.classInformation = classInformation;
    this.container = that.getContainer();
    if (!(this instanceof MoLater)) initChangeListener();
  }
  
  public Boolean isBasisType() {
    return bases.contains(this.getContainer());
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
    throw new NoSuchElementException(tr("Error", "error.modelica.cant_find_variable", name));
  }
  
  public ObservableList<MoVariable> getVariables() {
  
    this.container.getInheritedClasses().forEach(inheritedClass ->
                                                     this.variables.addAll(inheritedClass.getElement().getVariables().filtered(variable -> !this.variables.contains(variable)))
    );
    
    return this.variables;
  }
  
  public void addVariable(MoVariable variable) {
    variable.getUnsavedChanges().set(Change.NEW);
    if (this.deletedVariables.contains(variable)) {
      variable.getUnsavedChanges().set(Change.EDIT);
      this.deletedVariables.remove(variable);
    }
    this.variables.add(variable);
  }
  
  private void addAllVariables(List<MoVariable> variables) {
    variables.forEach(this::addVariable);
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
    this.container.getInheritedClasses().forEach(inheritedClass -> inheritedClass.getElement().getConnections().forEach(connection -> {
      if (!this.connections.contains(connection)) this.connections.add(connection);
    }));
    return this.connections;
  }
  
  private void addConnection(MoConnection connection) {
    connection.getUnsavedChanges().set(Change.NEW);
    if (this.deletedConnections.contains(connection)) {
      connection.getUnsavedChanges().set(Change.EDIT);
      this.deletedConnections.remove(connection);
    }
    this.connections.add(connection);
  }
  
  private void removeConnection(MoConnection connection) {
    this.connections.remove(connection);
    connection.getUnsavedChanges().set(Change.DELETE);
    this.deletedConnections.add(connection);
  }
  
  public void removeAllConnections(MoConnection... connections) {
    for (MoConnection conn : connections) {
      this.removeConnection(conn);
    }
  }
  
  public void addAllConnections(List<MoConnection> connections) {
    connections.forEach(this::addConnection);
  }
  
  public void addAllConnections(MoConnection... connections) {
    for (MoConnection conn : connections) {
      this.addConnection(conn);
    }
  }
  
  
  public Boolean hasConnectors() {
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
    if (this instanceof MoConnector) return MoDefaults.newConnector();
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
  
    if (tmp == null) throw new ParserException(tr("Error", "error", "modelica.cant_parse", ci.getType()));
  
    tmp.parseExtra(omc);
    return tmp;
  }
  
  //TODO: richtiges "vererben" aller elemente, nicht nur verknüpfen: deepcopy.
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
    this.variables.addAll(MoVariable.parse(omc, this));
    this.connections.addAll(MoConnection.parse(omc, this));
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
    if(that == null) return 0;
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

package de.thm.mni.mhpp11.util.parser.models;

import de.thm.mni.mhpp11.util.HierarchyData;
import de.thm.mni.mhpp11.util.ImmutableListCollector;
import de.thm.mni.mhpp11.util.config.Settings;
import de.thm.mni.mhpp11.util.parser.ClassInformation;
import de.thm.mni.mhpp11.util.parser.OMCompiler;
import de.thm.mni.mhpp11.util.parser.models.annotations.MoAnnotation;
import de.thm.mni.mhpp11.util.parser.models.annotations.MoDiagram;
import de.thm.mni.mhpp11.util.parser.models.annotations.MoDocumentation;
import de.thm.mni.mhpp11.util.parser.models.annotations.MoIcon;
import de.thm.mni.mhpp11.util.parser.models.graphics.MoCoordinateSystem;
import de.thm.mni.mhpp11.util.parser.models.graphics.MoDefaults;
import de.thm.mni.mhpp11.util.parser.models.interfaces.MoElement;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import lombok.Getter;
import lombok.NonNull;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.NoSuchElementException;

/**
 * Created by hobbypunk on 07.09.16.
 */
@Getter
public class MoClass extends MoElement implements HierarchyData<MoClass> {
  
  @Getter private static final List<MoClass> bases;
  
  static {
    bases = new ArrayList<>();
    bases.add(new MoClass(null, "Real", null));
    bases.add(new MoClass(null, "Boolean", null));
    bases.add(new MoClass(null, "Integer", null));
    bases.add(new MoClass(null, "String", null));
    bases.add(new MoClass(null, "Enum", null));
  }
  
  private ClassInformation classInformation;
  private MoClass parent;
  private Boolean complete = false;
  
  private final List<MoClass> inheritedClasses = new ArrayList<>();
  
  private final ObservableList<MoVariable> variables = FXCollections.observableArrayList();
  private final ObservableList<MoConnection> connections = FXCollections.observableArrayList();
  
  private final ObservableList<MoClass> children = FXCollections.observableArrayList();
  
  
  MoClass(ClassInformation classInformation, String name, MoClass parent) {
    super("c", name, "");
    this.classInformation = classInformation;
    this.parent = parent;
    if (parent != null) parent.getChildren().add(this);
  }
  
  public synchronized void moveTo(MoClass newParent) {
    moveTo(-1, newParent);
  }
  
  private synchronized void moveTo(Integer index, MoClass newParent) {
    if (this.parent != null) this.parent.getChildren().remove(this);
    if (index > -1) newParent.getChildren().set(index, this);
    else newParent.getChildren().add(this);
    this.parent = newParent;
  }
  
  private Boolean contains(OMCompiler omc, MoClass child) {
    if (children.contains(child)) return true;
    
    this.update(omc);
    
    for (MoClass c : children)
      if (c.contains(omc, child)) return true;
    return false;
  }
  
  public MoClass find(OMCompiler omc, String s) {
    if (this.getName().equals(s)) return this;
    
    if (!s.startsWith(this.getName())) return null;
    
    this.update(omc, s);
    
    for (MoClass child : this.getChildren()) {
      MoClass result = child.find(omc, s);
      if (result != null) return result;
    }
    return null;
  }
  
  public MoVariable findVariable(String name) throws NoSuchElementException {
    for (MoVariable mv : getVariables())
      if (mv.getName().equals(name)) return mv;
    throw new NoSuchElementException(String.format("No Variable named \"%s\" found", name));
  }
  
  public String getName() {
    if (this.parent == null || this.parent instanceof MoRoot) return this.name;
    return this.parent.getName() + "." + this.name;
  }
  
  public String getSimpleName() {
    return this.name;
  }
  
  
  public ObservableList<MoVariable> getVariables() {
    inheritedClasses.forEach(inheritedClass -> inheritedClass.getVariables().forEach(variable -> {
      if (!this.variables.contains(variable)) this.variables.add(variable);
    }));
    
    return this.variables;
  }
  
  public void addVariable(MoVariable variable) {
    this.variables.add(variable);
  }
  
  public void addAllVariables(MoVariable... variables) {
    this.variables.addAll(variables);
  }
  
  public void addAllVariables(List<MoVariable> variables) {
    this.variables.addAll(variables);
  }
  
  public void removeVariable(MoVariable variable) {
    for (MoConnection connection : variable.getConnections()) {
      this.connections.remove(connection);
    }
    this.variables.remove(variable);
  }
  
  
  public ObservableList<MoConnection> getConnections() {
    inheritedClasses.forEach(inheritedClass -> inheritedClass.getConnections().forEach(connection -> {
      if (!this.connections.contains(connection)) this.connections.add(connection);
    }));
    return this.connections;
  }
  
  public void addConnection(MoConnection connection) {
    this.connections.add(connection);
  }
  
  public void addAllConnections(MoConnection... connections) {
    this.connections.addAll(connections);
  }
  
  public void addAllConnections(List<MoConnection> connections) {
    this.connections.addAll(connections);
  }
  

  public Boolean hasConnectors() {
    for (MoVariable mv : getVariables())
      if (mv.getType() instanceof MoConnector) return true;
    return false;
  }
  
  public List<MoVariable> getConnectorVariables() {
    return getVariables().stream().filter(moVariable -> moVariable.getType() instanceof MoConnector).collect(ImmutableListCollector.toImmutableList());
  }
  
  public List<MoAnnotation> getAnnotations() {
    List<MoAnnotation> annotations = new ArrayList<>();
    annotations.addAll(super.getAnnotations());
    inheritedClasses.forEach(inheritedClass -> {
      annotations.addAll(0, inheritedClass.getAnnotations());
    });
    
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
      System.out.println(this.getClass().getSimpleName() + ": " + this.getName());
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
  
  
  private void update(@NonNull OMCompiler omc, String name) {
    for (Integer i = 0; i < getChildren().size(); i++) {
      MoClass child = getChildren().get(i);
      if (name.startsWith(child.getName()) && child instanceof MoLater) {
        update(omc, i);
      }
    }
  }
  
  public void update(@NonNull OMCompiler omc) {
    for (Integer i = 0; i < getChildren().size(); i++) {
      update(omc, i);
    }
  }
  
  private void update(OMCompiler omc, Integer i) {
    MoClass child = getChildren().get(i);
    if (child instanceof MoLater) {
      MoClass c = MoClass.parse(omc, child.getSimpleName(), null, this.getName(), 1, true);
      if (c != null) {
        c.moveTo(i, this);
        c.parseExtra(omc);
      } else {
        Settings.load().getLogger().error(String.format("Error in %s", this.getName()), String.format("Can't replace Child \"%s\"", child.getSimpleName()));
      }
    }
  }
  
  private void parseExtra(@NonNull OMCompiler omc) {
    if (complete) return;
    List<String> list = omc.getInheritedClasses(this.getName());
    Boolean classFound;
    for (String s : list) {
      classFound = false;
      for (MoClass mc : bases) {
        MoClass p = mc.find(omc, s);
        if (p != null) {
          this.getInheritedClasses().add(p);
          p.parseExtra(omc);
          classFound = true;
          break;
        }
      }
      if (!classFound) {
        Settings.load().getLogger().error(String.format("Error in \"%s\"", name), String.format("Can't find package \"%s\"", s));
      }
    }
  
    this.addAllAnnotations(MoAnnotation.parse(omc, this));
    this.addAllVariables(MoVariable.parse(omc, this));
    this.addAllConnections(MoConnection.parse(omc, this));
    complete = true;
  }
  
  
  public static MoClass parse(@NonNull OMCompiler omc, @NonNull String name, @NonNull MoClass parent, Integer depth) {
    return MoClass.parse(omc, name, parent, (parent instanceof MoRoot) ? "" : parent.getName(), depth, false);
  }
  
  private static MoClass parse(@NonNull OMCompiler omc, @NonNull String name, MoClass parent, @NonNull String parentName, Integer depth, Boolean noExtra) {
    if (depth == 0) return new MoLater(name, parent);
    String n = (parentName.equals("")) ? name : parentName + "." + name;
    ClassInformation ci = omc.getClassInformation(n);
    if (parent instanceof MoLater) {
      n = parent.getName();
      parent = null;
    }
    MoClass tmp = null;
    switch (ci.getType()) {
      case PACKAGE:
        tmp = new MoPackage(ci, name, parent);
        break;
      case MODEL:
        tmp = new MoModel(ci, name, parent);
        break;
      case CLASS:
        tmp = new MoClass(ci, name, parent);
        break;
      case CONNECTOR:
        tmp = new MoConnector(ci, name, parent);
        break;
    }
    
    if (parent instanceof MoRoot && tmp != null) bases.add(tmp);
    if (tmp == null) Settings.load().getLogger().error(String.format("Error in \"%s\"", name), String.format("Can't parse Type %s", ci.getType()));
    if (tmp != null && !(tmp instanceof MoLater)) {
      parseChildren(omc, tmp, n, depth, noExtra);
      if (!noExtra) tmp.parseExtra(omc);
    }
    return tmp;
  }
  
  static List<MoClass> parseChildren(@NonNull OMCompiler omc, MoClass parent, String parentName, Integer depth, Boolean noExtra) {
    List<String> names = omc.getChildren(parentName);
    for (String name : names) {
      MoClass mc = MoClass.parse(omc, name, parent, parentName, depth - 1, noExtra);
      if (mc == null)
        continue;
    }
    return parent.getChildren();
  }
  
  public static MoClass findClass(OMCompiler omc, String s) {
    MoClass clazz;
    for (MoClass c : bases) {
      clazz = c.find(omc, s);
      if (clazz != null) return clazz;
    }
    return null;
  }
}

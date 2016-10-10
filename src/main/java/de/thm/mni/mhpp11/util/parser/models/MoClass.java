package de.thm.mni.mhpp11.util.parser.models;

import de.thm.mni.mhpp11.util.HierarchyData;
import de.thm.mni.mhpp11.util.config.Settings;
import de.thm.mni.mhpp11.util.parser.OMCompiler;
import de.thm.mni.mhpp11.util.parser.models.annotations.MoAnnotation;
import de.thm.mni.mhpp11.util.parser.models.annotations.MoDocumentation;
import de.thm.mni.mhpp11.util.parser.models.annotations.MoIcon;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by hobbypunk on 07.09.16.
 */
@Getter
public class MoClass implements HierarchyData<MoClass> {
  
  private static List<MoClass> bases = new ArrayList<>();
  
  protected String PREFIX = "c";
  private final String name;
  private MoClass parent;
  @Setter private String description;
  
  @Setter private MoDocumentation documentation;
  @Setter private MoIcon icon;
  @Getter private List<MoClass> inheritedClasses = new ArrayList<>();
  
  private final List<MoAnnotation> annotations = new ArrayList<>();
  
  private final ObservableList<MoClass> children = FXCollections.observableArrayList();
  
  
  MoClass(String name, MoClass parent) {
    this.name = name;
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
  
  public Boolean contains(OMCompiler omc, MoClass child) {
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
  
  public String getName() {
    if (this.parent == null || this.parent instanceof MoRoot) return this.name;
    return this.parent.getName() + "." + this.name;
  }
  
  public String getSimpleName() {
    return this.name;
  }
  
  public String toString() { return PREFIX + " > " + this.getName(); }
  
  public void update(@NonNull OMCompiler omc, String name) {
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
    //mm.getAnnotations().addAll(MoAnnotation.parse(omc, mm));
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
    this.setIcon(MoIcon.parse(omc, this.getName()));
    this.setDocumentation(MoDocumentation.parse(omc, this.getName()));
    for (MoClass inheritedClass : this.getInheritedClasses()) {
      if (inheritedClass.getIcon() != null) {
        if (this.getIcon() == null) this.setIcon(inheritedClass.getIcon());
        else this.getIcon().getMoGraphics().addAll(0, inheritedClass.getIcon().getMoGraphics());
      }
      if (this.getDocumentation().getDocumentation().isEmpty() && inheritedClass.getDocumentation() != null)
        this.setDocumentation(inheritedClass.getDocumentation());
    }
  }
  
  public static MoClass parse(@NonNull OMCompiler omc, @NonNull String name, @NonNull MoClass parent, Integer depth) {
    return MoClass.parse(omc, name, parent, (parent instanceof MoRoot) ? "" : parent.getName(), depth, false);
  }
  
  private static MoClass parse(@NonNull OMCompiler omc, @NonNull String name, MoClass parent, @NonNull String parentName, Integer depth, Boolean noExtra) {
    if (depth == 0) return new MoLater(name, parent);
    String n = (parentName.equals("")) ? name : parentName + "." + name;
    
    if (parent instanceof MoLater) {
      n = parent.getName();
      parent = null;
    }
    MoClass tmp = null;
    switch (omc.getType(n)) {
      case PACKAGE:
        tmp = new MoPackage(name, parent);
        break;
      case MODEL:
        tmp = new MoModel(name, parent);
        break;
      case CLASS:
        tmp = new MoClass(name, parent);
        break;
    }
    
    if (parent instanceof MoRoot && tmp != null) bases.add(tmp);
    if (tmp == null) Settings.load().getLogger().error(String.format("Error in \"%s\"", name), String.format("Can't parse Type %s", omc.getType(n)));
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
}

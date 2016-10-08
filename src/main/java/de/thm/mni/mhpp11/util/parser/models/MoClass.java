package de.thm.mni.mhpp11.util.parser.models;

import de.thm.mni.mhpp11.util.parser.OMCompiler;
import de.thm.mni.mhpp11.util.parser.models.annotations.MoAnnotation;
import de.thm.mni.mhpp11.util.parser.models.annotations.MoDocumentation;
import de.thm.mni.mhpp11.util.parser.models.annotations.MoIcon;
import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by hobbypunk on 07.09.16.
 */
@Getter
public class MoClass {
  protected String PREFIX = "c";
  private final String name;
  private MoClass parent;
  @Setter private String description;
  
  @Setter private MoDocumentation documentation;
  @Setter private MoIcon icon;
  private final List<MoAnnotation> annotations = new ArrayList<>();
  
  private final List<MoClass> children = new ArrayList<>();
  
  
  MoClass(String name, MoClass parent) {
    this.name = name;
    this.parent = parent;
  }
  
  public synchronized void moveTo(MoClass newParent) {
    this.parent.children.remove(this);
    newParent.children.add(this);
    this.parent = newParent;
  }
  
  public Boolean find(MoClass child) {
    if (children.contains(child)) return true;
    for (MoClass c : children) if (c.find(child)) return true;
    return false;
  }
  
  public String getName() {
    if (this.parent == null || this.parent instanceof MoRoot) return this.name;
    return this.parent.getName() + "." + this.name;
  }
  
  public String getSimpleName() {
    return this.name;
  }
  
  public String toString() { return PREFIX + " > " + this.getName(); }
  
  private static void parseExtra(@NonNull OMCompiler omc, @NonNull MoClass that) {
    that.setDocumentation(MoDocumentation.parse(omc, that.getName()));
    that.setIcon(MoIcon.parse(omc, that.getName()));
    //mm.getAnnotations().addAll(MoAnnotation.parse(omc, mm));
  }
  
  public static MoClass parse(@NonNull OMCompiler omc, String name, @NonNull MoClass parent, Integer depth) {
    if (depth == 0) return new MoLater(name, parent);
    String n = (parent == null || parent instanceof MoRoot) ? name : parent.getName() + "." + name;
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
    if (tmp != null && !(tmp instanceof MoLater)) {
      parseExtra(omc, tmp);
      parseChildren(omc, tmp, depth);
    }
    return tmp;
  }
  
  static List<MoClass> parseChildren(@NonNull OMCompiler omc, @NonNull MoClass parent, Integer depth) {
    List<String> names = omc.getChildren(parent.getName());
    for (String name : names) {
      MoClass mc = MoClass.parse(omc, name, parent, depth - 1);
      if (mc == null)
        continue;
      parent.getChildren().add(mc);
    }
    return parent.getChildren();
  }
}

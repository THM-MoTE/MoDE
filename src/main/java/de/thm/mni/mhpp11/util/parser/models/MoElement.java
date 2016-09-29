package de.thm.mni.mhpp11.util.parser.models;

import de.thm.mni.mhpp11.util.parser.OMCompiler;
import de.thm.mni.mhpp11.util.parser.models.annotations.MoAnnotation;
import de.thm.mni.mhpp11.util.parser.models.annotations.MoDocumentation;
import de.thm.mni.mhpp11.util.parser.models.annotations.MoIcon;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by hobbypunk on 07.09.16.
 */
@Getter
public abstract class MoElement {
  private final String name;
  private MoElement parent;
  @Setter private String description;
  
  @Setter private MoDocumentation documentation;
  @Setter private MoIcon icon;
  private final List<MoAnnotation> annotations = new ArrayList<>();
  
  
  private final List<MoElement> children = new ArrayList<>();
  
  MoElement(String name, MoElement parent) {
    this.name = name;
    this.parent = parent;
  }
  
  public synchronized void moveTo(MoElement newParent) {
    this.parent.children.remove(this);
    newParent.children.add(this);
    this.parent = newParent;
  }
  
  public String getName() {
    if (this.parent == null) return this.name;
    return this.parent.getName() + "." + this.name;
  }

  public abstract String toString();
  
  public static void parseExtra(OMCompiler omc, MoElement that) {
    that.setDocumentation(MoDocumentation.parse(omc, that.getName()));
    that.setIcon(MoIcon.parse(omc, that.getName()));
  }
  
  public static MoElement parse(OMCompiler omc, String name, MoPackage mp) {
    String n = (mp == null) ? name : mp.getName() + "." + name;
    
    switch (omc.getType(n)) {
      case PACKAGE:
        return MoPackage.parse(omc, name, mp);
      case MODEL:
        return MoModel.parse(omc, name, mp);
    }
    
    return null;
  }
}

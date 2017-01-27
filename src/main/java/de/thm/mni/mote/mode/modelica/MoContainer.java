package de.thm.mni.mote.mode.modelica;

import de.thm.mni.mote.mode.omcactor.OMCompiler;
import de.thm.mni.mote.mode.parser.ParserException;
import de.thm.mni.mote.mode.util.HierarchyData;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import lombok.Getter;
import lombok.NonNull;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by hobbypunk on 27.01.17.
 */
@Getter
public class MoContainer implements Comparable<MoContainer>, HierarchyData<MoContainer> {
  private OMCompiler omc = null;
  private MoContainer parent = null;
  protected String name = null;
  private MoClass element = null;
  
  private final List<MoContainer> inheritedClasses = new ArrayList<>();
  private final ObservableList<MoContainer> children = FXCollections.observableArrayList();
  
  public MoContainer(OMCompiler omc, MoContainer parent, @NonNull String name) {
    this.omc = omc;
    this.parent = parent;
    this.name = name;
  }
  
  public MoContainer setElement(MoClass element) {
    this.element = element;
    element.setContainer(this);
    return this;
  }
  
  public synchronized void moveTo(MoContainer newParent) {
    moveTo(-1, newParent);
  }
  
  private synchronized void moveTo(Integer index, MoContainer newParent) {
    if (this.parent != null) this.parent.getChildren().remove(this);
    if (index > -1) newParent.getChildren().set(index, this);
    else newParent.getChildren().add(this);
    this.parent = newParent;
  }
  
  public Boolean contains(MoContainer elem) throws ParserException {
    return contains(elem.getElement());
  }
  
  public Boolean contains(MoClass elem) {
    if (element.equals(elem)) return true;
    
    for (MoContainer c : children)
      if (c.contains(elem)) return true;
    
    return false;
  }
  
  public MoContainer find(String s) {
    if (this.getName().equals(s)) return this;
    
    if (!s.startsWith(this.getName())) return null;
    
    for (MoContainer child : this.getChildren()) {
      MoContainer result = child.find(s);
      if (result != null) return result;
    }
    return null;
  }
  
  public MoClass getElement() throws ParserException {
    if (this.element instanceof MoLater) {
      this.element = MoClass.parse(omc, (MoLater) this.element);
    }
    return this.element;
  }
  
  public String getName() {
    if (this.parent == null || this.parent instanceof MoRoot) return this.name;
    return this.parent.getName() + "." + this.name;
  }
  
  public String getSimpleName() {
    return this.name;
  }
  
  
  @Override
  public boolean equals(Object obj) {
    if (obj instanceof MoContainer) {
      if (this == obj) return true;
      if (this.element == ((MoContainer) obj).element) return true;
      if (this.element == null || ((MoContainer) obj).element == null) return false;
      
      return element.equals(((MoContainer) obj).element);
    }
    
    return MoClass.class.isAssignableFrom(obj.getClass()) && element.equals(obj);
  }
  
  @Override
  public int compareTo(MoContainer that) {
    return element.compareTo(that.element);
  }
  
  private void update(OMCompiler omc, int depth) throws ParserException {
    this.omc = omc;
    this.getElement();
    if (depth > 0)
      for (MoContainer child : getChildren()) {
        child.update(omc, depth - 1);
      }
  }
  
  public void update(OMCompiler omc) throws ParserException {
    update(omc, 3);
  }
}

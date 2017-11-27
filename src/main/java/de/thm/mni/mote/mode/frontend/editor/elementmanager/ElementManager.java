package de.thm.mni.mote.mode.frontend.editor.elementmanager;

import de.thm.mni.mote.mode.frontend.editor.elementmanager.interfaces.Highlightable;
import de.thm.mni.mote.mode.frontend.editor.elementmanager.interfaces.Hoverable;
import de.thm.mni.mote.mode.frontend.editor.elementmanager.interfaces.Selectable;
import de.thm.mni.mote.mode.frontend.utilities.ActiveInstance;
import de.thm.mni.mote.mode.frontend.utilities.ActiveInstanceManager;
import de.thm.mni.mote.mode.modelica.MoContainer;
import lombok.Getter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Marcel Hoppe on 13.02.17.
 */
public class ElementManager extends ActiveInstance {
  
  @Getter
  private static ActiveInstanceManager<ElementManager> instanceManager = new ActiveInstanceManager<ElementManager>() {
    @Override
    protected ElementManager createInstance(MoContainer container) {
      return new ElementManager();
    }
  };
  
  private Hoverable hoveredElement = null;
  private Selectable selectedElement = null;
  private final List<Highlightable> highlightedElements = new ArrayList<>();
  
  private ElementManager() {}
  
  public void setHoveredElement(Hoverable element) {
    if (element != null && this.selectedElement == element) return;
    if (this.hoveredElement != element) {
      if (this.hoveredElement != null) {
        this.hoveredElement.leaveHover();
        if (this.hoveredElement instanceof Highlightable && this.highlightedElements.contains(this.hoveredElement))
          ((Highlightable) this.hoveredElement).enterHighlight();
        if (this.hoveredElement == this.selectedElement) this.selectedElement.enterSelection();
      }
      this.hoveredElement = element;
      if (this.hoveredElement != null) this.hoveredElement.enterHover();
    }
  }
  
  public void clearHoveredElement() {
    setHoveredElement(null);
  }
  
  
  public void setSelectedElement(Selectable element) {
    Boolean isSelectedSameElement = this.selectedElement == element;
  
    if (this.selectedElement != null && !isSelectedSameElement)
      this.selectedElement.leaveSelection();
    this.selectedElement = element;
    if (element != null && element == this.hoveredElement) clearHoveredElement();
    if (this.selectedElement != null && !isSelectedSameElement) {
      this.selectedElement.enterSelection();
      this.selectedElement.toFront();
    }
  }
  
  public void clearSelectedElement() {
    setSelectedElement(null);
  }
  
  
  public void setHighlightedElements(Highlightable... elements) {
    this.highlightedElements.forEach(Highlightable::leaveHighlight);
    this.highlightedElements.clear();
    this.highlightedElements.addAll(Arrays.asList(elements));
    this.highlightedElements.forEach(Highlightable::enterHighlight);
  }
  
  public void clearHighlightedElements() {
    setHighlightedElements();
  }
}

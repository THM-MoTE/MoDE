package de.thm.mni.mote.mode.uiactor.editor.elementmanager;

import de.thm.mni.mote.mode.modelica.MoContainer;
import de.thm.mni.mote.mode.uiactor.editor.elementmanager.interfaces.Highlightable;
import de.thm.mni.mote.mode.uiactor.editor.elementmanager.interfaces.Hoverable;
import de.thm.mni.mote.mode.uiactor.editor.elementmanager.interfaces.Selectable;

import java.util.*;

/**
 * Created by hobbypunk on 13.02.17.
 */
public class ElementManager {
  private static Map<MoContainer, ElementManager> INSTANCES = new HashMap<>();
  
  public static ElementManager getInstance(MoContainer container) {
    if (!INSTANCES.containsKey(container)) INSTANCES.put(container, new ElementManager());
    
    return INSTANCES.get(container);
  }
  
  public static void removeInstance(MoContainer data) {
    INSTANCES.remove(data);
  }
  
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
    
    if (this.selectedElement != null) this.selectedElement.leaveSelection();
    this.selectedElement = element;
    if (element != null && element == this.hoveredElement) clearHoveredElement();
    if (this.selectedElement != null) this.selectedElement.enterSelection();
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

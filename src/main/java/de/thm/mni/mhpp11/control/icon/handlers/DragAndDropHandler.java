package de.thm.mni.mhpp11.control.icon.handlers;

import de.thm.mni.mhpp11.control.icon.MoDiagramGroup;
import de.thm.mni.mhpp11.control.icon.MoIconGroup;
import de.thm.mni.mhpp11.util.parser.models.MoClass;
import de.thm.mni.mhpp11.util.parser.models.MoVariable;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.SnapshotParameters;
import javafx.scene.control.TreeCell;
import javafx.scene.input.*;

import java.util.List;
import java.util.regex.Pattern;

/**
 * Created by hobbypunk on 08.11.16.
 */
public class DragAndDropHandler implements EventHandler<Event> {
  private static DragAndDropHandler INSTANCE = null;
  
  private MoClass moClass = null;
  
  public static DragAndDropHandler getInstance() {
    if (INSTANCE == null) INSTANCE = new DragAndDropHandler();
    return INSTANCE;
  }
  
  private DragAndDropHandler() {}
  
  @Override
  public void handle(Event event) {
    System.out.println(String.format("Source: %s, Event: %s", event.getSource(), event.getEventType()));
    if (event.getEventType().equals(MouseEvent.DRAG_DETECTED) && event.getSource() instanceof TreeCell) {
      drag((MouseEvent) event);
    } else if (event.getEventType().equals(DragEvent.DRAG_DROPPED) && event.getSource() instanceof MoDiagramGroup) {
      drop((DragEvent) event);
    }
    //event.consume();
  }
  
  private void drop(DragEvent event) {
    if (moClass != null) {
      MoDiagramGroup mdg = (MoDiagramGroup) event.getSource();
      List<MoVariable> variables = mdg.getMoClass().getVariables();
      Integer counter = 1;
      Pattern p = Pattern.compile(moClass.getSimpleName().toLowerCase() + "\\d+");
      for (MoVariable mv : variables) {
        if (mv.getType().equals(moClass) && p.matcher(mv.getName()).matches())
          counter++;
      }
      variables.add(new MoVariable(mdg.getMoClass(), moClass, moClass.getSimpleName().toLowerCase() + counter));
      
      System.out.println(mdg.getMoClass());
    }
  }
  
  private void drag(MouseEvent event) {
    TreeCell<MoClass> source = (TreeCell<MoClass>) event.getSource();
    MoClass mc = source.getTreeItem().getValue();
    if (mc.hasConnectors()) {
      moClass = mc;
      MoIconGroup dragImage = new MoIconGroup(mc, true);
      dragImage.setOpacity(0.3);
      dragImage.toFront();
      dragImage.setMouseTransparent(true);
      
      Dragboard db = source.startDragAndDrop(TransferMode.ANY);
      db.setDragView(dragImage.snapshot(new SnapshotParameters(), null));
      ClipboardContent cc = new ClipboardContent();
      cc.putString(mc.getName());
      System.out.println(cc);
      db.setContent(cc);
      event.consume();
    }
  }
}

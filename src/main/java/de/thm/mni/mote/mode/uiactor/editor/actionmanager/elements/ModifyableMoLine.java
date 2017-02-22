package de.thm.mni.mote.mode.uiactor.editor.actionmanager.elements;

import de.thm.mni.mote.mode.modelica.graphics.MoLine;
import de.thm.mni.mote.mode.uiactor.editor.actionmanager.commands.AddCommand;
import de.thm.mni.mote.mode.uiactor.editor.actionmanager.commands.Command;
import de.thm.mni.mote.mode.uiactor.editor.actionmanager.commands.DeleteCommand;
import de.thm.mni.mote.mode.uiactor.editor.actionmanager.commands.MoveCommand;
import de.thm.mni.mote.mode.uiactor.editor.actionmanager.interfaces.Addable;
import de.thm.mni.mote.mode.uiactor.editor.actionmanager.interfaces.Deletable;
import de.thm.mni.mote.mode.uiactor.editor.actionmanager.interfaces.Moveable;
import javafx.geometry.Point2D;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by hobbypunk on 21.02.17.
 */
public class ModifyableMoLine implements Addable, Deletable, Moveable {
  
  private MoLine element;
  
  public ModifyableMoLine(MoLine element) {
    this.element = element;
  }
  
  @Override
  public Command add(Object... params) {
    Integer[] poses = (Integer[]) params[0];
    Map<Integer, Point2D> points = (HashMap<Integer, Point2D>) params[1];
    
    for (Integer p : poses) {
      this.element.getPoints().add(p, points.get(p));
    }
    Arrays.sort(poses, Comparator.reverseOrder());
    
    return new DeleteCommand(this, (Object[]) poses);
  }
  
  @Override
  public Command delete(Object... params) {
    Integer[] poses = (Integer[]) params;
    
    Map<Integer, Point2D> points = new HashMap<>();
    for (Integer p : poses) {
      points.put(p, this.element.getPoints().get(p));
      this.element.getPoints().remove(p.intValue());
    }
    if (this.element.getPoints().isEmpty()) {
      
      return Command.IGNORE;
    } else {
      Arrays.sort(poses, Integer::compareTo);
      return new AddCommand(this, poses, points);
    }
  }
  
  public Command move(Object... params) {
    Integer firstPointPos = (Integer) params[0], secondPointPos = (Integer) params[2];
    Point2D firstPoint = (Point2D) params[1], secondPoint = (Point2D) params[3];
    Command c = new MoveCommand(this, firstPointPos, this.element.getPoints().get(firstPointPos), secondPointPos, (secondPointPos != null) ? this.element.getPoints().get(secondPointPos) : null);
    this.element.getPoints().set(firstPointPos, firstPoint);
    if (secondPointPos != null) this.element.getPoints().set(secondPointPos, secondPoint);
    return c;
  }
}

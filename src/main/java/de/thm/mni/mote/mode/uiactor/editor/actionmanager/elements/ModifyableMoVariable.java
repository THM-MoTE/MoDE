package de.thm.mni.mote.mode.uiactor.editor.actionmanager.elements;

import de.thm.mni.mote.mode.modelica.MoConnection;
import de.thm.mni.mote.mode.modelica.MoVariable;
import de.thm.mni.mote.mode.modelica.graphics.MoTransformation;
import de.thm.mni.mote.mode.uiactor.editor.actionmanager.commands.Command;
import de.thm.mni.mote.mode.uiactor.editor.actionmanager.commands.MoveCommand;
import de.thm.mni.mote.mode.uiactor.editor.actionmanager.commands.RotateCommand;
import de.thm.mni.mote.mode.uiactor.editor.actionmanager.interfaces.Moveable;
import de.thm.mni.mote.mode.uiactor.editor.actionmanager.interfaces.Rotateable;
import javafx.geometry.Point2D;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by hobbypunk on 22.02.17.
 */
public class ModifyableMoVariable implements Moveable, Rotateable {
  private final MoVariable element;
  
  public ModifyableMoVariable(MoVariable element) {this.element = element;}
  
  public Command createMove(Point2D startOrigin, Map<MoConnection, List<Integer>> startConnectionPointPoses, Map<MoConnection, List<Point2D>> startConnectionPoints) {
    return new MoveCommand(this, startOrigin, new HashMap<>(startConnectionPointPoses), new HashMap<>(startConnectionPoints));
  }
  
  public Command createRotation(Double rotation) {
    return new RotateCommand(this, rotation);
  }
  
  public Command move(Object... params) {
    Point2D startOrigin = (Point2D) params[0];
    Map<MoConnection, List<Integer>> startConnectionPointPoses = (HashMap<MoConnection, List<Integer>>) params[1];
    Map<MoConnection, List<Point2D>> startConnectionPoints = (HashMap<MoConnection, List<Point2D>>) params[2];
    
    startConnectionPointPoses.keySet().forEach(moConn -> {
      for (int i = 0, size = startConnectionPointPoses.get(moConn).size(); i < size; i++) {
        Integer pos = startConnectionPointPoses.get(moConn).get(i);
        Point2D point = startConnectionPoints.get(moConn).get(i);
        startConnectionPoints.get(moConn).set(i, moConn.getLine().getPoints().get(pos));
        moConn.getLine().getPoints().set(pos, point);
      }
    });
    MoTransformation mt = element.getPlacement().getIconTransformation();
    if (mt == null) mt = element.getPlacement().getDiagramTransformation();
    
    Point2D oldOrigin = mt.getOrigin().get();
    mt.getOrigin().set(startOrigin);
    
    return new MoveCommand(this, oldOrigin, startConnectionPointPoses, startConnectionPoints);
  }
  
  @Override//TODO: update connections!
  public Command rotate(Object... params) {
    Double rotation = (Double) params[0];
    MoTransformation mt = element.getPlacement().getIconTransformation();
    if (mt == null) mt = element.getPlacement().getDiagramTransformation();
    
    Double oldRotation = mt.getRotation().get();
    mt.getRotation().set(rotation);
    return new RotateCommand(this, oldRotation);
  }
}

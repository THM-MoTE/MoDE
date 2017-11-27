package de.thm.mni.mote.mode.frontend.editor.statemachine.elements;

import de.thm.mni.mote.mode.frontend.controls.modelica.FXMoConnectorIconMoGroup;
import de.thm.mni.mote.mode.frontend.controls.modelica.FXMoDiagramMoGroup;
import de.thm.mni.mote.mode.frontend.controls.modelica.FXMoVariableIconMoGroup;
import de.thm.mni.mote.mode.frontend.editor.actionmanager.commands.Command;
import de.thm.mni.mote.mode.frontend.editor.elementmanager.elements.ManagedFXMoDiagramMoGroup;
import de.thm.mni.mote.mode.frontend.editor.statemachine.StateMachine;
import de.thm.mni.mote.mode.frontend.editor.statemachine.interfaces.Actionable;
import de.thm.mni.mote.mode.frontend.editor.statemachine.interfaces.Addable;
import de.thm.mni.mote.mode.frontend.editor.statemachine.interfaces.Deletable;
import de.thm.mni.mote.mode.frontend.shape.InternalLine;
import de.thm.mni.mote.mode.modelica.MoConnection;
import de.thm.mni.mote.mode.modelica.MoVariable;
import de.thm.mni.mote.mode.modelica.graphics.MoLine;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.value.ChangeListener;
import javafx.collections.transformation.FilteredList;
import javafx.geometry.Point2D;
import javafx.scene.input.InputEvent;
import javafx.scene.input.MouseButton;
import javafx.scene.input.MouseEvent;

import java.util.Collections;
import java.util.List;

/**
 * Created by Marcel Hoppe on 16.02.17.
 */
public class ModifyableFXMoConnectorIconMoGroup extends FXMoConnectorIconMoGroup implements Actionable, Addable, Deletable {
  
  private static ConnectionBuilder builder = null;
  private static ChangeListener<Boolean> changeListener = null;
  private ModifyableFXMoConnectorIconMoGroup freezeTarget = null;
  
  
  protected ModifyableFXMoConnectorIconMoGroup(FXMoVariableIconMoGroup moParent, MoVariable variable, FilteredList<MoConnection> to, FilteredList<MoConnection> from) {
    super(moParent, variable, to, from);
  }
  
  @Override
  public Command action(StateMachine sm, InputEvent inputEvent) {
    if (!(inputEvent instanceof MouseEvent)) return null;
    
    MouseEvent event = (MouseEvent) inputEvent;
    Point2D p = this.getMoParent().getMoDiagram().convertTo(new Point2D(event.getSceneX(), event.getSceneY()));
    
    if (event.getEventType().equals(MouseEvent.MOUSE_MOVED)) {
      builder.updateLastPoint(p);
      return Command.IGNORE;
    }
    if (event.getEventType().equals(MouseEvent.MOUSE_CLICKED) && event.getButton().equals(MouseButton.SECONDARY)) {
      abort(sm);
      return Command.IGNORE;
    }
    
    if (event.getEventType().equals(MouseEvent.MOUSE_CLICKED)) {
      if (builder == null) { //first Click
        builder = new ConnectionBuilder(this.getMoParent().getMoDiagram(), this.getVariables(), this.getMoParent().getMoDiagram().convertTo(convertFrom(new Point2D(0, 0))));
        changeListener = (observable, oldValue, newValue) -> {
          if (!newValue) {
            abort(sm);
          }
        };
        sm.active.addListener(changeListener);
        sm.freeze();
        freezeTarget = this;
        ((ManagedFXMoDiagramMoGroup) this.getMoParent().getMoDiagram()).highlightConnectors(this);
      } else {
        if (freezeTarget == this) {
          builder.addPoint();
        } else {
          builder.updateLastPoint(this.getMoParent().getMoDiagram().convertTo(convertFrom(new Point2D(0, 0))));
          builder.addPoint();
          MoConnection conn = builder.build(this.getVariables());
          if (((ManagedFXMoDiagramMoGroup) this.getMoParent().getMoDiagram()).isConnectAbleTo(conn.getFrom(), conn.getTo())) {
            abort(sm);
            return this.getMoParent().getMoDiagram().getModifyableMoClass().add((Object) new MoConnection[]{conn});
          } else {
            builder.removePoint();
          }
        }
      }
    }
    return Command.IGNORE;
  }
  
  private void abort(StateMachine sm) {
    builder.abort();
    ((ManagedFXMoDiagramMoGroup) this.getMoParent().getMoDiagram()).clearHighlight();
    sm.active.removeListener(changeListener);
    builder = null;
    changeListener = null;
    this.freezeTarget = null;
    sm.unfreeze();
    sm.switchToNone();
  }
  
  @Override
  public Command add(InputEvent event) {
    return null;
  }
  
  @Override
  public Command delete(InputEvent event) {
    MoConnection[] connections = getVariable().getConnections(this.getMoParent().getMoDiagram().getMoClass()).toArray(new MoConnection[]{});
    return this.getMoParent().getMoDiagram().getModifyableMoClass().delete((Object) connections);
  }
  
  private class ConnectionBuilder {
    private final InternalLine line;
    private final List<MoVariable> startConnector;
    private final FXMoDiagramMoGroup moGroup;
    private final ObjectProperty<Point2D> lastPoint = new SimpleObjectProperty<>(null);
    
    ConnectionBuilder(FXMoDiagramMoGroup moGroup, List<MoVariable> connector, Point2D start) {
      this.moGroup = moGroup;
      this.startConnector = connector;
      line = new InternalLine(new MoLine(start));
      moGroup.add(1, line);
      lastPoint.addListener((observable, oldValue, newValue) -> {
        if (oldValue != null) line.getData().getPoints().remove(oldValue);
        if (newValue != null) line.getData().getPoints().add(newValue);
      });
    }
    
    void updateLastPoint(Point2D point) {
      lastPoint.set(point);
    }
    
    void addPoint() {
      Point2D p = lastPoint.get();
      lastPoint.set(null);
      if (p != null) line.getData().getPoints().add(p);
    }
    
    void abort() {
      moGroup.remove(line);
    }
    
    MoConnection build(List<MoVariable> endConnector) {
      return new MoConnection(moGroup.getMoClass(), startConnector, endConnector, Collections.singletonList(line.getData()));
    }
  
    void removePoint() {
      Point2D p = line.getData().getPoints().get(line.getData().getPoints().size() - 1);
      line.getData().getPoints().remove(p);
      lastPoint.set(p);
    }
  }
}

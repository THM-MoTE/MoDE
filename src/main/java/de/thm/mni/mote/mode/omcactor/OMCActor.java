package de.thm.mni.mote.mode.omcactor;

import de.thm.mni.mhpp11.jActor.actors.interfaces.AbstractActor;
import de.thm.mni.mhpp11.jActor.actors.logging.messages.ErrorMessage;
import de.thm.mni.mhpp11.jActor.actors.messagebus.messages.RegisterMessage;
import de.thm.mni.mhpp11.jActor.actors.messagebus.messages.StartMessage;
import de.thm.mni.mhpp11.jActor.actors.messagebus.messages.UnregisteredMessage;
import de.thm.mni.mhpp11.jActor.messages.ExitMessage;
import de.thm.mni.mhpp11.jActor.messages.interfaces.Message;
import de.thm.mni.mote.mode.config.Settings;
import de.thm.mni.mote.mode.config.model.Modelica;
import de.thm.mni.mote.mode.config.model.Project;
import de.thm.mni.mote.mode.modelica.MoClass;
import de.thm.mni.mote.mode.modelica.MoRoot;
import de.thm.mni.mote.mode.omcactor.messages.*;
import de.thm.mni.mote.mode.omcactor.messages.StartDataCollectionOMCMessage.TYPE;
import de.thm.mni.mote.mode.uiactor.messages.OMCDataUIMessage;
import de.thm.mni.mote.mode.uiactor.messages.OMCSetProjectUIMessage;
import de.thm.mni.mote.mode.uiactor.messages.OMCStartedMessage;
import de.thm.mni.mote.mode.util.Constants;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import lombok.Getter;

import java.io.IOException;
import java.util.UUID;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by hobbypunk on 23.01.17.
 */
@Getter
public class OMCActor extends AbstractActor {
  OMCompiler omc = null;
  Boolean started = false;
  
  private Project project;
  
  private ObservableList<MoClass> data = FXCollections.observableArrayList();
  private MoRoot mrSystemLibraries = new MoRoot("System Libraries");
  private MoRoot mrProjectLibraries = new MoRoot("Project Libraries");
  private MoRoot mrProject = new MoRoot("Project");
  
  private ExecutorService es = Executors.newSingleThreadExecutor();
  
  public OMCActor(UUID group) {
    super(group);
    data.addAll(mrSystemLibraries, mrProjectLibraries, mrProject);
  }
  
  @Override
  public Integer getID() {
    return Constants.OMC;
  }
  
  private void startOMC() {
    Settings settings = Settings.load();
    Modelica m = settings.getModelica();
    try {
      omc = new OMCompiler(m.getCompiler(), settings.getLang());
      started = true;
      omc.loadSystemLibrary();
      send(new OMCStartedMessage(getGroup(), Constants.UI));
    } catch (IOException e) {
      started = false;
      send(new ErrorMessage(OMCActor.class, getGroup(), new OMCException(e)));
    }
  }
  
  public void setProject(Project project) {
    this.project = project;
    try {
      omc.setProject(project.getFile());
      send(new OMCSetProjectUIMessage(getGroup(), this.project));
    } catch (Exception e) {
      send(new ErrorMessage(OMCActor.class, getGroup(), new OMCException(e)));
    }
  }
  
  private void updateClass(MoClass moClass) {
    try {
      moClass.update(this.omc);
    } catch (Exception e) {
      send(new ErrorMessage(OMCActor.class, getGroup(), new OMCException(e)));
    }
  }
  
  private void collectDataInBackground(TYPE type) {
    es.execute(() -> {
      switch (type) {
        case SYSTEM:
          OMCUtilities.lightCollect(this.omc, data.get(0), this.omc.getSystemLibraries());
          break;
        case PROJECTLIB:
          OMCUtilities.lightCollect(this.omc, data.get(1), this.omc.getProjectLibraries());
          break;
        case PROJECT:
          OMCUtilities.lightCollect(this.omc, data.get(2), this.omc.getProject());
          break;
      }
    });
  }
  
  
  @Override
  public void execute(Message msg) {
    if (msg instanceof StartMessage) {
      send(new RegisterMessage(getGroup(), this));
      startOMC();
    }
    if (msg instanceof ExitMessage || msg instanceof UnregisteredMessage) {
      if (omc != null) omc.disconnect();
    }
    if (OMCMessage.class.isAssignableFrom(msg.getClass())) {
      if (!started) send(new ErrorMessage(OMCActor.class, getGroup(), new OMCException("Not started")));
    
      if (msg instanceof SetProjectOMCMessage) {
        setProject(((SetProjectOMCMessage) msg).getProject());
      } else if (msg instanceof GetDataOMCMessage) {
        send(new OMCDataUIMessage(getGroup(), getData()));
      } else if (msg instanceof StartDataCollectionOMCMessage) {
        collectDataInBackground(((StartDataCollectionOMCMessage) msg).getType());
      } else if (msg instanceof UpdateClassOMCMessage) {
        updateClass(((UpdateClassOMCMessage) msg).getMoClass());
      }
    }
  }
  
  @Override
  public Boolean exitCondition(Message lastMsg) {
    return super.exitCondition(lastMsg) || lastMsg instanceof UnregisteredMessage;
  }
  
  @Override
  public void onStop(Message lastMsg) {
    super.onStop(lastMsg);
    es.shutdownNow();
  }
}

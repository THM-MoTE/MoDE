package de.thm.mni.mote.mode.backend.omc.actors;

import de.thm.mni.mhpp11.smbj.actors.AbstractActor;
import de.thm.mni.mhpp11.smbj.logging.messages.ErrorMessage;
import de.thm.mni.mhpp11.smbj.messages.ErrorExitMessage;
import de.thm.mni.mhpp11.smbj.messages.ExitMessage;
import de.thm.mni.mhpp11.smbj.messages.base.Message;
import de.thm.mni.mote.mode.backend.file.messages.FileChangedMessage;
import de.thm.mni.mote.mode.backend.messages.SetProjectMessage;
import de.thm.mni.mote.mode.backend.omc.OMCException;
import de.thm.mni.mote.mode.backend.omc.OMCUtilities;
import de.thm.mni.mote.mode.backend.omc.OMCompiler;
import de.thm.mni.mote.mode.backend.omc.messages.*;
import de.thm.mni.mote.mode.config.Settings;
import de.thm.mni.mote.mode.config.model.Modelica;
import de.thm.mni.mote.mode.config.model.Project;
import de.thm.mni.mote.mode.modelica.MoContainer;
import de.thm.mni.mote.mode.modelica.MoLater;
import de.thm.mni.mote.mode.modelica.MoRoot;
import de.thm.mni.mote.mode.parser.ParserException;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import lombok.Getter;

import java.util.UUID;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

import static de.thm.mni.mote.mode.util.Translator.tr;

/**
 * Created by hobbypunk on 23.01.17.
 */
@Getter
public class OMCActor extends AbstractActor {
  OMCompiler omc = null;
  Boolean started = false;
  
  private Project project;
  
  private ObservableList<MoContainer> data = FXCollections.observableArrayList();
  private MoRoot mrSystemLibraries = new MoRoot("system_libraries");
  private MoRoot mrProjectLibraries = new MoRoot("project_libraries");
  private MoRoot mrProject = new MoRoot("project");
  
  {
    MoContainer.getROOTS().add(mrSystemLibraries);
    MoContainer.getROOTS().add(mrProjectLibraries);
    MoContainer.getROOTS().add(mrProject);
  }
  
  private enum LOAD_TYPE {
    SYSTEMLIBS,
    PROJECTLIBS,
    PROJECT
  }
  
  private int loadStatus = 0;
  
  private ExecutorService es = Executors.newCachedThreadPool();
  
  public OMCActor(UUID id) {
    super(id);
    data.addAll(mrSystemLibraries, mrProjectLibraries, mrProject);
  }
  
  private void startOMC(StartOMCMessage msg) {
    Settings settings = Settings.load();
    Modelica m = settings.getModelica();
    try {
      omc = new OMCompiler(getID(), m.getCompiler(), settings.getLang());
      started = true;
      msg.answer(getID(), null);
    } catch (Exception e) {
      msg.error(getID(), null);
      started = false;
      send(new ErrorMessage(OMCActor.class, getID(), new OMCException(tr("Error", "error.omcactor.cant_start_omc"), e)));
    }
  }
  
  public void setProject(SetProjectMessage msg) {
    this.project = msg.getPayload();
    msg.answer(getID(), this.project);
    
    loadStatus = LoadStatusOMCMessage.STATUS.START.ordinal();
    send(new LoadStatusOMCMessage(getID(), LoadStatusOMCMessage.STATUS.START, loadStatus));
    try {
      omc.clearProject();
      
      omc.addSystemLibraries(project.getSystemLibraries());
      collectDataInBackground(LOAD_TYPE.SYSTEMLIBS);
  
      omc.loadProjectLibraries(project.getMoFile());
      collectDataInBackground(LOAD_TYPE.PROJECTLIBS);
  
      omc.setProject(project.getMoFile());
      collectDataInBackground(LOAD_TYPE.PROJECT);
      
    } catch (Exception e) {
      e = new OMCException(tr("Error", "error.omcactor.cant_load_project", project.getName()), e);
      msg.error(getID(), e);
      send(new ErrorMessage(OMCActor.class, getID(), e));
    }
  }
  
  private void updateClass(MoContainer container) {
    try {
      container.update(omc);
    } catch (Exception e) {
      send(new ErrorMessage(OMCActor.class, getID(), e));
    }
  }
  
  private void reload(MoContainer parent, String name) {
    try {
      omc.reloadProject();
      parent.getChildren().add(new MoContainer(omc, parent, name).setElement(new MoLater()));
      parent.update(omc);
    } catch (ParserException e) {
      e.printStackTrace();
    }
  }
  
  
  private void collectDataInBackground(LOAD_TYPE type) {
    es.execute(() -> {
      LoadStatusOMCMessage.STATUS status = null;
      switch (type) {
        case SYSTEMLIBS:
          data.get(0).getChildren().clear();
          OMCUtilities.lightCollect(this.omc, data.get(0), this.omc.getSystemLibraries());
          status = LoadStatusOMCMessage.STATUS.SYSTEMLIB_READY;
          break;
        case PROJECTLIBS:
          data.get(1).getChildren().clear();
          OMCUtilities.lightCollect(this.omc, data.get(1), this.omc.getProjectLibraries());
          status = LoadStatusOMCMessage.STATUS.PROJECTLIB_READY;
          break;
        case PROJECT:
          data.get(2).getChildren().clear();
          OMCUtilities.lightCollect(this.omc, data.get(2), this.omc.getProject());
          status = LoadStatusOMCMessage.STATUS.PROJECT_READY;
          break;
      }
      loadStatus += status.ordinal();
      send(new LoadStatusOMCMessage(getID(), status, loadStatus));
  
      if (LoadStatusOMCMessage.STATUS.isComplete(loadStatus)) {
        send(new LoadStatusOMCMessage(getID(), LoadStatusOMCMessage.STATUS.COMPLETE));
      }
    });
  }
  
  private void reloadProject(FileChangedMessage msg) {
    //TODO: react to file changes on filesystem
    System.out.println(msg);
  }
  
  
  @Override
  public void execute(Message msg) {
    if (msg instanceof StartOMCMessage) {
      startOMC((StartOMCMessage)msg);
    } else if (msg instanceof ExitMessage || msg instanceof ErrorExitMessage) {
      if (omc != null) {
        omc.disconnect();
        started = false;
      }
    } else if(msg instanceof SetProjectMessage || msg instanceof FileChangedMessage || msg instanceof OMCMessage) {
      if (!started) send(new ErrorMessage(OMCActor.class, getID(), new OMCException(tr("Error", "error.omcactor.omc_not_running"))));
      else {
        if (msg instanceof SetProjectMessage) {
          setProject((SetProjectMessage) msg);
        } else if(msg instanceof FileChangedMessage) {
          reloadProject((FileChangedMessage) msg);
        } else if (msg instanceof GetDataOMCMessage) {
          ((GetDataOMCMessage)msg).answer(getID(), getData());
        } else if (msg instanceof UpdateClassOMCMessage) {
          updateClass(((UpdateClassOMCMessage) msg).getPayload());
        } else if (msg instanceof GetAvailableLibsOMCMessage) {
          ((GetAvailableLibsOMCMessage) msg).answer(getID(), omc.getAvailableLibraries());
        }
      }
    }
  }
  
  @Override
  public void onStop(Message msg) {
    super.onStop(msg);
    es.shutdownNow();
    if(msg instanceof ErrorExitMessage) {
      try {
        es.awaitTermination(500, TimeUnit.MILLISECONDS);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }
  }
}

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
import de.thm.mni.mote.mode.modelica.MoContainer;
import de.thm.mni.mote.mode.modelica.MoLater;
import de.thm.mni.mote.mode.modelica.MoRoot;
import de.thm.mni.mote.mode.omcactor.messages.*;
import de.thm.mni.mote.mode.omcactor.messages.StartDataCollectionOMCMessage.TYPE;
import de.thm.mni.mote.mode.parser.ParserException;
import de.thm.mni.mote.mode.uiactor.messages.OMCAvailableLibsUIMessage;
import de.thm.mni.mote.mode.uiactor.messages.OMCDataUIMessage;
import de.thm.mni.mote.mode.uiactor.messages.OMCSetProjectUIMessage;
import de.thm.mni.mote.mode.uiactor.messages.OMCStartedMessage;
import de.thm.mni.mote.mode.util.Constants;
import de.thm.mni.mote.mode.util.Utilities;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import lombok.Getter;
import org.apache.commons.io.IOUtils;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

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
  
  private int loadStatus = 0;
  
  private ExecutorService es = Executors.newCachedThreadPool();
  
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
      omc = new OMCompiler(getGroup(), m.getCompiler(), settings.getLang());
      started = true;
      send(new OMCStartedMessage(getGroup(), Constants.UI));
    } catch (Exception e) {
      started = false;
      send(new ErrorMessage(OMCActor.class, getGroup(), new OMCException(tr("Error", "error.omcactor.cant_start_omc"), e)));
    }
  }
  
  public void setProject(Project project) {
    this.project = project;
    send(new OMCLoadStatusUIMessage(getGroup(), OMCLoadStatusUIMessage.STATUS.START));
    loadStatus = OMCLoadStatusUIMessage.STATUS.START.ordinal();
    try {
      omc.clearProject();
      
      omc.addSystemLibraries(project.getSystemLibraries());
      collectDataInBackground(TYPE.SYSTEM);
  
      omc.loadProjectLibraries(project.getMoFile());
      collectDataInBackground(TYPE.PROJECTLIB);
  
      omc.setProject(project.getMoFile());
      collectDataInBackground(TYPE.PROJECT);
  
      send(new OMCSetProjectUIMessage(getGroup(), this.project));
    } catch (Exception e) {
      send(new OMCLoadErrorMessage(OMCActor.class, getGroup(), new OMCException(tr("Error", "error.omcactor.cant_load_project", project.getName()), e)));
    }
  }
  
  private void updateClass(MoContainer container) {
    try {
      container.update(omc);
    } catch (Exception e) {
      send(new ErrorMessage(OMCActor.class, getGroup(), e));
    }
  }
  
  private void createNew(CreateNewOMCMessage msg) {
    MoContainer parent = msg.getParent();
    String type = msg.getType().toLowerCase();
    String name = msg.getData().get("name");
    System.out.println(parent + ":" + name);
    Path parentDir = parent.getElement().getClassInformation().getFileName().getParent();
    List<String> fileContent = null;
    try {
      fileContent = IOUtils.readLines(Utilities.getTemplate(type + ".mo"), StandardCharsets.UTF_8);
      for (Map.Entry<String, String> entry : msg.getData().entrySet()) {
        for (int i = 0; i < fileContent.size(); i++) {
          fileContent.set(i, fileContent.get(i).replaceAll("<" + entry.getKey() + ">", entry.getValue()));
        }
      }
      
      Path file = parentDir.resolve(name + ".mo");
      if (type.equals("package")) {
        parentDir = parentDir.resolve(name);
        Files.createDirectory(parentDir);
        file = parentDir.resolve("package.mo");
      }
      
      Files.write(file, fileContent, StandardCharsets.UTF_8, StandardOpenOption.CREATE_NEW);
      reload(parent, name);
    } catch (IOException e) {
      e.printStackTrace();
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
  
  
  private void collectDataInBackground(TYPE type) {
    es.execute(() -> {
      switch (type) {
        case SYSTEM:
          data.get(0).getChildren().clear();
          OMCUtilities.lightCollect(this.omc, data.get(0), this.omc.getSystemLibraries());
          send(new OMCLoadStatusUIMessage(getGroup(), OMCLoadStatusUIMessage.STATUS.SYSTEMLIB_READY));
          loadStatus += OMCLoadStatusUIMessage.STATUS.SYSTEMLIB_READY.ordinal();
          break;
        case PROJECTLIB:
          data.get(1).getChildren().clear();
          OMCUtilities.lightCollect(this.omc, data.get(1), this.omc.getProjectLibraries());
          send(new OMCLoadStatusUIMessage(getGroup(), OMCLoadStatusUIMessage.STATUS.PROJECTLIB_READY));
          loadStatus += OMCLoadStatusUIMessage.STATUS.PROJECTLIB_READY.ordinal();
          break;
        case PROJECT:
          data.get(2).getChildren().clear();
          OMCUtilities.lightCollect(this.omc, data.get(2), this.omc.getProject());
          send(new OMCLoadStatusUIMessage(getGroup(), OMCLoadStatusUIMessage.STATUS.PROJECT_READY));
          loadStatus += OMCLoadStatusUIMessage.STATUS.PROJECT_READY.ordinal();
          break;
      }
      if (OMCLoadStatusUIMessage.STATUS.isComplete(loadStatus)) {
        send(new OMCLoadStatusUIMessage(getGroup(), OMCLoadStatusUIMessage.STATUS.COMPLETE));
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
      if (!started) send(new ErrorMessage(OMCActor.class, getGroup(), new OMCException(tr("Error", "error.omcactor.omc_not_running"))));
  
      if (msg instanceof SetProjectOMCMessage) {
        setProject(((SetProjectOMCMessage) msg).getProject());
      } else if (msg instanceof GetDataOMCMessage) {
        send(new OMCDataUIMessage(getGroup(), getData()));
      } else if (msg instanceof UpdateClassOMCMessage) {
        updateClass(((UpdateClassOMCMessage) msg).getContainer());
      } else if (msg instanceof GetAvailableLibsOMCMessage) {
        send(new OMCAvailableLibsUIMessage(getGroup(), omc.getAvailableLibraries()));
      } else if (msg instanceof CreateNewOMCMessage) {
        createNew((CreateNewOMCMessage) msg);
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

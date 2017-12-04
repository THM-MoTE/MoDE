package de.thm.mni.mote.mode.backend.file.actors;

import de.thm.mni.mhpp11.smbj.actors.AbstractActor;
import de.thm.mni.mhpp11.smbj.logging.messages.ErrorMessage;
import de.thm.mni.mhpp11.smbj.messages.ErrorExitMessage;
import de.thm.mni.mhpp11.smbj.messages.base.Message;
import de.thm.mni.mote.mode.backend.file.messages.FileChangedMessage;
import de.thm.mni.mote.mode.backend.file.messages.FileChangedMessage.TYPE;
import de.thm.mni.mote.mode.backend.messages.SetProjectMessage;
import de.thm.mni.mote.mode.backend.messages.UnsetProjectMessage;
import de.thm.mni.mote.mode.config.model.Project;
import ews.EnhancedWatchService;
import ews.PathFilter;
import ews.WatchServiceListener;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.StandardWatchEventKinds;
import java.nio.file.WatchEvent;
import java.util.UUID;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

@Data
@EqualsAndHashCode(callSuper = true)
public class FileWatcherActor extends AbstractActor implements WatchServiceListener {
  
  Project project = null;
  
  private ExecutorService es = Executors.newFixedThreadPool(2);
  
  PathFilter filter = new PathFilter() {
    @Override
    public boolean acceptFile(Path file) {
      return file.getFileName().toString().endsWith(".mo");
    }
  
    @Override
    public boolean acceptDirectory(Path path) {
      return true;
    }
  };
  
  WatchEvent.Kind<?>[] events = new WatchEvent.Kind<?>[] {
      StandardWatchEventKinds.ENTRY_CREATE,
      StandardWatchEventKinds.ENTRY_DELETE,
      StandardWatchEventKinds.ENTRY_MODIFY };
  
  private Future<?> watcherFuture = null;
  
  public FileWatcherActor(UUID id) {
    super(id);
  }
  
  private void startWatcherService(Project project) {
    try {
      if(this.project != null) throw new IllegalStateException("Watcher already running");
      
      this.project = project;
      EnhancedWatchService ews = new EnhancedWatchService(project.getProjectPath().getParent(), true, events);
      watcherFuture = es.submit(ews.setup(this, filter));
  
    } catch (IOException | IllegalStateException e) {
      if(this.watcherFuture != null) this.watcherFuture.cancel(true);
      this.watcherFuture = null;
      this.project = null;
      send(new ErrorMessage(this.getClass(), getID(), e));
    }
  }
  
  private void stopWatcherService() {
    try {
      if (this.project == null || this.watcherFuture == null) throw new IllegalStateException("Watcher not running");
      watcherFuture.cancel(true);
  
      watcherFuture = null;
      this.project = null;
    } catch (IllegalStateException e) {
      if (this.watcherFuture != null) this.watcherFuture.cancel(true);
      this.watcherFuture = null;
      this.project = null;
      send(new ErrorMessage(this.getClass(), getID(), e));
    }
  }
  
  @Override
  public void created(Path path) {
    send(new FileChangedMessage(getID(), path, TYPE.CREATED));
  }
  
  @Override
  public void modified(Path path) {
    send(new FileChangedMessage(getID(), path, TYPE.MODIFIED));
  }
  
  @Override
  public void deleted(Path path) {
    send(new FileChangedMessage(getID(), path, TYPE.DELETED));
  }
  
  @Override
  public void execute(Message msg) {
    if (msg instanceof SetProjectMessage) {
      startWatcherService(((SetProjectMessage) msg).getPayload());
    } else if(msg instanceof UnsetProjectMessage) {
      stopWatcherService();
    }
  }
  
  @Override
  public void onStop(Message msg) {
    super.onStop(msg);
  
    es.shutdownNow();
    if(watcherFuture != null) watcherFuture.cancel(true);
    if(msg instanceof ErrorExitMessage) {
      try {
        es.awaitTermination(500, TimeUnit.MILLISECONDS);
      } catch (InterruptedException e) {
        send(new ErrorMessage(this.getClass(), getID(), e));
        e.printStackTrace();
      }
    }
  }
  
}

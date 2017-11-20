package de.thm.mni.mote.mode;

import de.thm.mni.mhpp11.smbj.logging.LogActorManagerPlugin;
import de.thm.mni.mhpp11.smbj.logging.actors.LogActor;
import de.thm.mni.mhpp11.smbj.manager.ActorManager;
import de.thm.mni.mhpp11.smbj.manager.messages.SimpleStartMessage;
import de.thm.mni.mhpp11.smbj.ui.UIActorManagerPlugin;
import de.thm.mni.mhpp11.smbj.ui.messages.StartUIMessage;
import de.thm.mni.mhpp11.smbj.ui.splashscreen.SplashActorManagerPlugin;
import de.thm.mni.mhpp11.smbj.ui.splashscreen.actors.SplashActor;
import de.thm.mni.mhpp11.smbj.ui.splashscreen.messages.InitSplashMessage;
import de.thm.mni.mhpp11.smbj.ui.splashscreen.messages.ShowSplashMessage;
import de.thm.mni.mote.mode.backend.file.actors.FileManagementActor;
import de.thm.mni.mote.mode.backend.file.actors.FileWatcherActor;
import de.thm.mni.mote.mode.backend.omc.actors.OMCActor;
import de.thm.mni.mote.mode.config.Settings;
import de.thm.mni.mote.mode.frontend.actors.WelcomeActor;
import javafx.application.Application;
import javafx.stage.Stage;

import java.util.List;

public class Main extends Application {
  
  public static void main(String[] args) {
    ActorManager bus = ActorManager.initialize(new LogActorManagerPlugin(), new UIActorManagerPlugin(), new SplashActorManagerPlugin());
    bus.send(new SimpleStartMessage(LogActor.class));
    bus.send(new SimpleStartMessage(OMCActor.class));
    bus.send(new SimpleStartMessage(FileWatcherActor.class));
    bus.send(new SimpleStartMessage(FileManagementActor.class));
  
    launch(args);
  }
  
  @Override
  public void start(Stage primaryStage) throws Exception {
    ActorManager bus = ActorManager.getInstance();
    bus.send(new StartUIMessage(SplashActor.class, new Stage()));
    InitSplashMessage.InitSplashMessageBuilder builder = InitSplashMessage.builder();
    builder.title(Settings.TITLE);
    builder.subTitle(Settings.SUBTITLE);
    builder.version(Settings.VERSION);
    bus.send(builder.build());
    bus.send(new ShowSplashMessage(null));
    
    List<?> params = getParameters().getUnnamed();
    bus.send(new StartUIMessage(WelcomeActor.class, primaryStage, params));
  }
}
